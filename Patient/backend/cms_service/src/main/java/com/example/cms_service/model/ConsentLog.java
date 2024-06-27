package com.example.cms_service.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsentLog {

    private String cid;
    private String pid;
    private String accessing_eid;
    private String last_update;

    private String status;
    private String expiry;
    private String tags;
    private String reason;
}
