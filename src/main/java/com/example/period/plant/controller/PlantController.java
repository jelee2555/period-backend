package com.example.period.plant.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.period.plant.dto.PlantCreateReqDto;
import com.example.period.plant.dto.PlantCreateResDto;
import com.example.period.plant.dto.PlantReadResDto;
import com.example.period.plant.service.PlantService;

@RestController
@RequestMapping("/api/plant")
public class PlantController {

	public final PlantService plantService;

	public PlantController(PlantService plantService) {
		this.plantService = plantService;
	}

	@PostMapping
	public ResponseEntity<PlantCreateResDto> createPlant(@RequestBody PlantCreateReqDto reqDto) {
		PlantCreateResDto resDto = plantService.createPlant(reqDto);
		return ResponseEntity.created(URI.create("/api/plant/" + resDto.getId())).body(resDto);
	}

	@GetMapping("/{id}")
	public ResponseEntity<PlantReadResDto> readPlant(@PathVariable Long id) {
		PlantReadResDto resDto = plantService.readPlant(id);
		return ResponseEntity.ok(resDto);
	}
}
