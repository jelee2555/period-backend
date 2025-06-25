package com.example.period.pest.dto;

import lombok.Getter;

@Getter
public class PestResDto {
	private String pest;
	private String solution;

	public PestResDto(String pest, String solution) {
		this.pest = pest;
		this.solution = solution;
	}
}
