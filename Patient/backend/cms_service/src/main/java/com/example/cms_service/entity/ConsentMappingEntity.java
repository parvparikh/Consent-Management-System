package com.example.cms_service.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data //for getters and setters
@Table(name="consentmapping")
public class ConsentMappingEntity {
    @EmbeddedId
    private Consent_Comp_key cid_owning_eid;
    private String rid;
    private int active_flag;


}
