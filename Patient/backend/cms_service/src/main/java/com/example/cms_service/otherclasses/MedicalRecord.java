package com.example.cms_service.otherclasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalRecord {
    @Override
    public String toString() {
        return "MedicalRecord{" +
                "rid='" + rid + '\'' +
                ", pid='" + pid + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", gen_date='" + gen_date + '\'' +
                ", tags='" + tags + '\'' +
                ", doctorEntity=" + doctorEntity +
                '}';
    }

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
    public DoctorEntity getDoctorEntity() {
        return doctorEntity;
    }

    public void setDoctorEntity(DoctorEntity doctorEntity) {
        this.doctorEntity = doctorEntity;
    }
    public String getGen_date() {
        return gen_date;
    }
    public void setGen_date(String gen_date) {
        this.gen_date = gen_date;
    }
    private String rid;
    private String pid;
    private String description;
    private String type;
    private String gen_date;
    private String tags;
    private DoctorEntity doctorEntity;
}
