package com.example.backend.entity;

import com.example.backend.entity.DoctorEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data //for getters and setters
@Table(name="medicalrecords")
public class MedicalRecordEntity {
    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Id
    private String rid;
    private String pid;
    @Column(length = 1000)
    private String description;

    private String type;

    public String getGen_date() {
        return gen_date;
    }

    public void setGen_date(String gen_date) {
        this.gen_date = gen_date;
    }

    private String gen_date;
    private String tags;

    public DoctorEntity getDoctorEntity() {
        return doctorEntity;
    }

    public void setDoctorEntity(DoctorEntity doctorEntity) {
        this.doctorEntity = doctorEntity;
    }

    @ManyToOne
    @JoinColumn(name="gen_did")
    private DoctorEntity doctorEntity;

}
