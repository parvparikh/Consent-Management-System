package com.example.cms_service.model;

import com.example.cms_service.entity.Consent_Comp_key;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsentMapping {
    private Consent_Comp_key cid_owning_eid;
    private String rid;
    private int active_flag;

}
