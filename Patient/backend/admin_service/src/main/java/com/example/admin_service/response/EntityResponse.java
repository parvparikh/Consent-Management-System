package com.example.admin_service.response;

import com.example.admin_service.entity.EntityReg;

import java.util.List;

public class EntityResponse {
    public List<EntityReg> getEntityRegs() {
        return entityRegs;
    }

    public void setEntityRegs(List<EntityReg> entityRegs) {
        this.entityRegs = entityRegs;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    List<EntityReg> entityRegs;
    private String pid;

}
