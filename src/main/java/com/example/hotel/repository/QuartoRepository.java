package com.example.hotel.repository;

import com.example.hotel.model.QuartoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface QuartoRepository extends JpaRepository<QuartoModel, Long> {
}
