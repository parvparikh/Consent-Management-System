package com.example.admin_service.model;

import com.example.admin_service.entity.PatientEntity;

import java.util.Set;

public class EntityRegModel {
    private String eid;
    private  String ename;
    private  String etype;
    private String eip;
    private int port;
    Set<PatientEntity> patientIds;
}
