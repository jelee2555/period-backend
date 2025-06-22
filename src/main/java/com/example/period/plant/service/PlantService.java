package com.example.period.plant.service;

import org.springframework.stereotype.Service;

import com.example.period.plant.dto.PlantCreateReqDto;
import com.example.period.plant.dto.PlantCreateResDto;
import com.example.period.plant.dto.PlantReadResDto;
import com.example.period.plant.entity.Plant;
import com.example.period.plant.repository.PlantRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PlantService {

	private final PlantRepository plantRepository;

	public PlantService(PlantRepository plantRepository) {
		this.plantRepository = plantRepository;
	}

	public PlantCreateResDto createPlant(PlantCreateReqDto plantCreateReqDto) {
		Plant plant = plantCreateReqDto.toEntity();
		plantRepository.save(plant);
		return PlantCreateResDto.fromPlant(plant);
	}

	public PlantReadResDto readPlant(Long id) {
		Plant plant = plantRepository.findById(id)
			.orElseThrow(() -> new EntityNotFoundException("해당 Id의 Plant가 존재하지 않습니다"));
		return PlantReadResDto.fromPlant(plant);
	}




}
