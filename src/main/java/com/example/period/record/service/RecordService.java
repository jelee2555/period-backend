package com.example.period.record.service;

import org.springframework.stereotype.Service;

import com.example.period.plant.entity.Plant;
import com.example.period.plant.repository.PlantRepository;
import com.example.period.record.dto.RecordCreateReqDto;
import com.example.period.record.dto.RecordCreateResDto;
import com.example.period.record.repository.RecordRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class RecordService {
	private final RecordRepository recordRepository;
	private final PlantRepository plantRepository;

	public RecordService(RecordRepository recordRepository, PlantRepository plantRepository) {
		this.recordRepository = recordRepository;
		this.plantRepository = plantRepository;
	}

	// public RecordCreateResDto createRecord(RecordCreateReqDto reqDto){
	// 	Plant plant = plantRepository.findById(reqDto.getPlantId())
	// 		.orElseThrow(()-> new EntityNotFoundException("존재하지 않는 plant 입니다"));
	//
	//
	// }
}
