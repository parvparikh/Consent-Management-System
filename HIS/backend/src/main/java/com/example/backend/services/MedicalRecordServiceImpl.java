package com.example.backend.services;

import com.example.backend.entity.MedicalRecordEntity;
import com.example.backend.repository.MedicalRecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class MedicalRecordServiceImpl implements MedicalRecordService{
    @Autowired
    private MedicalRecordsRepository medicalRecordsRepository;
    public List<MedicalRecordEntity> getRecords(String pid) {
        List<MedicalRecordEntity> records=null;

//        String q="select e from entity_reg  e JOIN entity_patient_mapping em on e.eid=em.eid  where em.pid="+pid;
        records= medicalRecordsRepository.getRecords(pid);
        System.out.println(records);
        return records;
    }
}
