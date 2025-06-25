package com.example.period.record.dto;

import java.time.LocalDate;

import com.example.period.record.entity.Record;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RecordReadResDto {
	private long id;
	private String nickname;
	private String species;
	private String imageUrl;
	private Double temperature;
	private Double humidity;
	private Double plantWeight;
	private LocalDate harvestDate;
	private String pest;
	private String watering;
	private String solution;
	private String memo;
	private String yield;

	public static RecordReadResDto fromRecord(Record record) {
		return RecordReadResDto.builder()
			.id(record.getId())
			.nickname(record.getPlant().getNickname())
			.species(record.getPlant().getSpices())
			.imageUrl(record.getImgUrl())
			.temperature(record.getTemperature())
			.humidity(record.getHumidity())
			.plantWeight(record.getPlantWeight())
			.harvestDate(record.getHarvestDate())
			.memo(record.getMemo())
			.build();
	}
}
