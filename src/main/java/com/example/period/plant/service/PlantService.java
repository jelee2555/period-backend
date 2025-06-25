package com.example.period.plant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.period.pest.dto.PestResDto;
import com.example.period.plant.dto.PlantCreateReqDto;
import com.example.period.plant.dto.PlantCreateResDto;
import com.example.period.plant.dto.PlantReadResDto;
import com.example.period.record.dto.RecordSummaryResDto;
import com.example.period.plant.entity.Plant;
import com.example.period.plant.repository.PlantRepository;
import com.example.period.record.repository.RecordRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PlantService {

	private final PlantRepository plantRepository;
	private final RecordRepository recordRepository;

	public PlantService(PlantRepository plantRepository, RecordRepository recordRepository) {
		this.plantRepository = plantRepository;
		this.recordRepository = recordRepository;
	}

	public PlantCreateResDto createPlant(PlantCreateReqDto plantCreateReqDto) {
		Plant plant = plantCreateReqDto.toEntity();
		plantRepository.save(plant);
		return PlantCreateResDto.fromPlant(plant);
	}

	public PlantReadResDto readPlant(Long id) {
		Plant plant = plantRepository.findById(id)
			.orElseThrow(() -> new EntityNotFoundException("해당 Id의 Plant가 존재하지 않습니다"));


		List<RecordSummaryResDto> recordSummaryList = recordRepository.findAllByPlant(plant).stream().
			map(record -> {
				List<PestResDto> pests = record.getRecordPests()
					.stream()
					.map(rp -> new PestResDto(rp.getPest().getName(), rp.getPest().getSolution())).toList();

				return new RecordSummaryResDto(record.getDate(), record.getImgUrl(), pests);
			}).toList();

		return PlantReadResDto.from(plant, recordSummaryList);
	}
}
