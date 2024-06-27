package com.example.admin_service.entity;

import com.example.admin_service.model.Patient;
import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Set;
@Entity
@Table(name="patient")
public class PatientEntity {

    @Override
    public String toString() {
        return "Patient{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", adhaar=" + adhaar +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", minor=" + minor +
                ", disabled=" + disabled +
                ", iscapable=" + iscapable +
                ", patient=" + patient +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getAdhaar() {
        return adhaar;
    }

    public void setAdhaar(BigInteger adhaar) {
        this.adhaar = adhaar;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    public int getIscapable() {
        return iscapable;
    }

    public void setIscapable(int iscapable) {
        this.iscapable = iscapable;
    }

//    public PatientEntity getPatient() {
//        return patient;
//    }
//
//    public void setPatient(PatientEntity patient) {
//        this.patient = patient;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Id
    private String pid;

    private String name;
    private BigInteger adhaar;
    private String dob;
    private int age;
    private String gender;
    private BigInteger phone;
    private String address;

    private String email;
    private int minor;
    private int disabled;
    private int iscapable;
    @OneToOne
    @JoinColumn(name="gaurdian_id")
    private PatientEntity patient;
    private String username;
    private String password;
    @ManyToMany(mappedBy = "patientIds")
    Set<EntityReg> entityIds;


}
