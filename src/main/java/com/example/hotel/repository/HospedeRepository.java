package com.example.hotel.repository;

import com.example.hotel.model.HospedeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospedeRepository extends JpaRepository<HospedeModel, Long> {
}
