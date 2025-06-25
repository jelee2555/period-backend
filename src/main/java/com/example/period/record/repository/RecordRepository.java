package com.example.period.record.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.period.plant.entity.Plant;

public interface RecordRepository extends JpaRepository<Plant, Long> {
}
