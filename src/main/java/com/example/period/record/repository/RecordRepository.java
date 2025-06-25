package com.example.period.record.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.period.plant.entity.Plant;
import com.example.period.record.entity.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
	List<Record> findAllByPlant(Plant plant);
}
