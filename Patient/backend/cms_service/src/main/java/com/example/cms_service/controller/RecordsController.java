package com.example.cms_service.controller;

import com.example.cms_service.response.EntityResponse;
import com.example.cms_service.response.MedicalRecordResponse;
import com.example.cms_service.response.RecordResponse;
import com.example.cms_service.services.VisitedHospitalDetailsService;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.desktop.SystemEventListener;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/")
public class RecordsController {

   VisitedHospitalDetailsService visitedHospitalDetailsService;
    public RecordsController(VisitedHospitalDetailsService visitedHospitalDetailsService) {
        this.visitedHospitalDetailsService = visitedHospitalDetailsService;
    }

    @GetMapping("/getMedicalRecords/{pid}")
//    ResponseEntity<EntityResponse> getMedicalRecords(@PathVariable String pid) {
    ResponseEntity<MedicalRecordResponse> getMedicalRecords(@PathVariable String pid) {
//        Object obj= JSONValue.parse(s);
//
//        JSONObject jsonObject = (JSONObject) obj;
//        String pid = (String) jsonObject.get("pid");

//        EntityResponse entityResponse =visitedHospitalDetailsService.VisitedHospitals(pid);
        MedicalRecordResponse recordResponse =visitedHospitalDetailsService.VisitedHospitals(pid);


        return ResponseEntity.status(HttpStatus.OK).body(recordResponse);
    }
}
