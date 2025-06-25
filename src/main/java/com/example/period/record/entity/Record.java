package com.example.period.record.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.period.pest.entity.Pest;
import com.example.period.plant.entity.Plant;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;

@Entity
@Getter
public class Record {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "plant_id")
	private Plant plant;

	private LocalDate date;
	private String imgUrl;
	private Double temperature;
	private Double humidity;
	private Double plantWeight;
	private LocalDate harvestDate;
	private String memo;

	@Enumerated(EnumType.STRING)
	private Watering watering;

	public enum Watering {
		충분, 부족, 과다
	}

	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<RecordPest> recordPests = new ArrayList<>();

	public Record() {
	}
}
