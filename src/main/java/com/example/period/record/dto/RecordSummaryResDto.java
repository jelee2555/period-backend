package com.example.period.record.dto;

import java.time.LocalDate;
import java.util.List;

import com.example.period.pest.dto.PestResDto;

import lombok.Getter;

@Getter
public class RecordSummaryResDto {

	private LocalDate date;
	private String imgUrl;
	private List<PestResDto> pests;

	public RecordSummaryResDto(LocalDate date, String imgUrl, List<PestResDto> pests) {
		this.date = date;
		this.imgUrl = imgUrl;
		this.pests = pests;
	}
}
