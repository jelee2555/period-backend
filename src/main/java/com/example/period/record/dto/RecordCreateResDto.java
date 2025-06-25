package com.example.period.record.dto;

import java.time.LocalDate;

public class RecordCreateResDto {
	private long id;
	private Long plantId;
	private Double temperature;
	private Double humidity;
	private Double plantWeight;
	private LocalDate harvestDate;
	private String pest;
	private String watering;
	private String solution;
}
