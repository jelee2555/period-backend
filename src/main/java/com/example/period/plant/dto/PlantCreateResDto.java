package com.example.period.plant.dto;

import java.time.LocalDate;

import com.example.period.plant.entity.Plant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Getter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlantCreateResDto {
	private long id;
	private String plantType;
	private String nickname;
	private LocalDate plantedDate;
	private String species;

	public static PlantCreateResDto fromPlant(Plant plant) {
		return PlantCreateResDto.builder()
			.id(plant.getId())
			.nickname(plant.getNickname())
			.plantType(plant.getPlantType())
			.plantedDate(plant.getPlantedDate())
			.species(plant.getSpecies()).build();
	}
}
