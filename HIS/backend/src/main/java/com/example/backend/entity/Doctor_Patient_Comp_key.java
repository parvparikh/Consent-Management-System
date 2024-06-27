package com.example.backend.entity;

import java.io.Serializable;

public class Doctor_Patient_Comp_key implements Serializable {

    public String getDid() {
        return did;
    }

    public Doctor_Patient_Comp_key(String did, String pid) {
        this.did = did;
        this.pid = pid;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    private String did;
    private String pid;
}
