package com.example.period.plant.entity;

import java.time.LocalDate;

import com.example.period.auth.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class Plant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Column(nullable = false)
	private String species;

	@Column(nullable = false)
	private String nickname;

	@Column(nullable = false)
	private LocalDate plantedDate;

	@Column(nullable = false)
	private String plantType;

	public Plant() {
	}

	public Plant(String species, String nickname, LocalDate plantedDate, String plantType) {
		this.species = species;
		this.nickname = nickname;
		this.plantedDate = plantedDate;
		this.plantType = plantType;
	}
}
