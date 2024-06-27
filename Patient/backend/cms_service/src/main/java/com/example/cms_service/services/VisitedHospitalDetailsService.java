package com.example.cms_service.services;
import com.example.cms_service.model.ConsentLog;
import com.example.cms_service.response.EntityResponse;
import com.example.cms_service.response.MedicalRecordResponse;
import com.example.cms_service.response.RecordResponse;

import java.util.List;
public interface VisitedHospitalDetailsService {
   public MedicalRecordResponse VisitedHospitals(String pid);

}
