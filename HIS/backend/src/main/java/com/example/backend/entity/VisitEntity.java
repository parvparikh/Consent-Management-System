package com.example.backend.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data //for getters and setters
@Table(name="visit")
public class VisitEntity {


    public String getLastVisited() {
        return lastVisited;
    }

    public Doctor_Patient_Comp_key getDid_pid() {
        return did_pid;
    }

    public void setDid_pid(Doctor_Patient_Comp_key did_pid) {
        this.did_pid = did_pid;
    }

    public void setLastVisited(String lastVisited) {
        this.lastVisited = lastVisited;
    }
    @EmbeddedId
    private Doctor_Patient_Comp_key did_pid;

    private String lastVisited;
}
