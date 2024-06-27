package com.example.admin_service.repository;

import com.example.admin_service.entity.PatientEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<PatientEntity,String> {
}