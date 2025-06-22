package com.example.period.plant.dto;

import com.example.period.plant.entity.Plant;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PlantReadResDto {
	public long id;
	public String nickname;

	public static PlantReadResDto fromPlant(Plant plant) {
		return PlantReadResDto.builder()
			.id(plant.getId())
			.nickname(plant.getNickname())
			.build();
	}
}
