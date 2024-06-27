package com.example.cms_service.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class Consent_Comp_key implements Serializable {
    public Consent_Comp_key(String cid, String owning_eid) {
        this.cid = cid;
        this.owning_eid = owning_eid;
    }
//    SongId songId = new SongId("test_name", "test_album", "test_artist");
//    Song song = new Song(songId, 23, null, null, 4, "http://download.this.song");
    public Consent_Comp_key(){
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getOwning_eid() {
        return owning_eid;
    }

    public void setOwning_eid(String owning_eid) {
        this.owning_eid = owning_eid;
    }

    private String cid;
    private String owning_eid;


}

