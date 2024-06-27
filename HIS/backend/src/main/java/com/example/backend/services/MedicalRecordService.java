package com.example.backend.services;

import com.example.backend.entity.MedicalRecordEntity;

import java.util.List;

public interface MedicalRecordService {
    List<MedicalRecordEntity> getRecords(String pid);
}
