package com.example.backend.repository;

import com.example.backend.entity.MedicalRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MedicalRecordsRepository extends JpaRepository<MedicalRecordEntity,String> {
    @Query("select  t from MedicalRecordEntity  t  where t.pid =:pid")
    public List<MedicalRecordEntity> getRecords(@Param("pid") String pid);
}