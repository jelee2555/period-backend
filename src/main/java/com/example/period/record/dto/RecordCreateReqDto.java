package com.example.period.record.dto;

import java.time.LocalDate;

import com.example.period.plant.entity.Plant;
import com.example.period.record.entity.Record;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RecordCreateReqDto {
	private Long plantId;
	private double temperature;
	private double humidity;
	private String imgUrl;
}
