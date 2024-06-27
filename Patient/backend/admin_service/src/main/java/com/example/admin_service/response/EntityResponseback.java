package com.example.admin_service.response;

import com.example.admin_service.entity.EntityReg;
import com.example.admin_service.entity.EntityRes;

import java.util.List;

public class EntityResponseback {
    public List<EntityRes> getEntityRegs() {
        return entityRegs;
    }

    public void setEntityRegs(List<EntityRes> entityRegs) {
        this.entityRegs = entityRegs;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    List<EntityRes> entityRegs;
    private String pid;

}
