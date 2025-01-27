package com.example.admin_service.entity;

import jakarta.persistence.*;

import java.util.Set;
@Entity
public class EntityReg implements java.io.Serializable {
    public EntityReg() {
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEtype() {
        return etype;
    }

    public void setEtype(String etype) {
        this.etype = etype;
    }

    public String getEip() {
        return eip;
    }

    public void setEip(String eip) {
        this.eip = eip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Set<PatientEntity> getPatientIds() {
        return patientIds;
    }

    public void setPatientIds(Set<PatientEntity> patientIds) {
        this.patientIds = patientIds;
    }

    public EntityReg(String eid, String ename, String etype, String eip, int port) {
        this.eid = eid;
        this.ename = ename;
        this.etype = etype;
        this.eip = eip;
        this.port = port;
    }

    @Id
    private String eid;
    private  String ename;
    private  String etype;
    private String eip;
    private int port;

    @ManyToMany
    @JoinTable(
            name = "entity_patient_mapping",
            joinColumns = @JoinColumn(name = "eid"),
            inverseJoinColumns = @JoinColumn(name = "pid"))
             Set<PatientEntity> patientIds;

}

