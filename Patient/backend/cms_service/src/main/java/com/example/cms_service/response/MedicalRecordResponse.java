package com.example.cms_service.response;

import com.example.cms_service.otherclasses.FinalRecords;

import java.util.List;

public class MedicalRecordResponse {


    public List<FinalRecords> getFinalRecordsList() {
        return finalRecordsList;
    }

    @Override
    public String toString() {
        return "MedicalRecordResponse{" +
                "finalRecordsList=" + finalRecordsList +
                '}';
    }

    public void setFinalRecordsList(List<FinalRecords> finalRecordsList) {
        this.finalRecordsList = finalRecordsList;
    }

    List<FinalRecords> finalRecordsList;



}
