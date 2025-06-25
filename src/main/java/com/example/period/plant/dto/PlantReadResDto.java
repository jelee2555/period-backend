package com.example.period.plant.dto;

import java.util.List;

import com.example.period.plant.entity.Plant;
import com.example.period.record.dto.RecordSummaryResDto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PlantReadResDto {
	private long id;
	private String nickname;

	private Integer pestOccurrencesLast7Days;
	private String mostFrequentPest;
	private String watering;

	private List<RecordSummaryResDto> recordSummaryList;

	public static PlantReadResDto from(Plant plant, List<RecordSummaryResDto> recordSummaryList) {
		return PlantReadResDto.builder()
			.id(plant.getId())
			.nickname(plant.getNickname())
			.pestOccurrencesLast7Days(2)
			.mostFrequentPest("진딧물")
			.watering("보통")
			.recordSummaryList(recordSummaryList)
			.build();
	}
}