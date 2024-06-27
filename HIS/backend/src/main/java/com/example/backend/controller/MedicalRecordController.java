package com.example.backend.controller;

import com.example.backend.response.MedicalRecordResponse;
import com.example.backend.services.MedicalRecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/")
public class MedicalRecordController {
    private final MedicalRecordService medicalRecordService;
    public MedicalRecordController(MedicalRecordService medicalRecordService) {
        this.medicalRecordService = medicalRecordService;
    }
    @GetMapping("/getRecords/{pid}")
    public ResponseEntity<MedicalRecordResponse> getEntityById(@PathVariable String pid ) {
        MedicalRecordResponse medicalRecordResponse =new MedicalRecordResponse();
        medicalRecordResponse.setMedicalRecordEntities(medicalRecordService.getRecords(pid));
//        medicalRecordResponse.setPid(pid);
        return ResponseEntity.ok(medicalRecordResponse);
    }
}
