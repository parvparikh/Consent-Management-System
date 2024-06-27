package com.example.cms_service.response;

import java.util.List;

public class EntityResponse {

    public List<AdminResponse> getEntityRegs() {
        return entityRegs;
    }

    public void setEntityRegs(List<AdminResponse> entityRegs) {
        this.entityRegs = entityRegs;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    List<AdminResponse> entityRegs;
    private String pid;
}
