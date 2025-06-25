package com.example.period.plant.dto;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class RecordSummaryResDto {

	private LocalDate date;
	private String imgUrl;
	private String pest;
	private String solution;

	public RecordSummaryResDto(LocalDate date, String imgUrl, String pest, String solution) {
		this.date = date;
		this.imgUrl = imgUrl;
		this.pest = pest;
		this.solution = solution;
	}
}
