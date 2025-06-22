package com.example.period.plant.dto;

import java.time.LocalDate;

import com.example.period.plant.entity.Plant;

import lombok.NoArgsConstructor;
import lombok.Getter;

@Getter
@NoArgsConstructor
public class PlantCreateReqDto {
	private String plantType;
	private String nickname;
	private LocalDate plantedDate;
	private String species;

	public Plant toEntity() {
		return new Plant(species, nickname, plantedDate, plantType);
	}
}
