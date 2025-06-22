package com.example.period.plant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.period.plant.entity.Plant;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}
