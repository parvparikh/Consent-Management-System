package com.example.cms_service.otherclasses;

public class FinalRecords {
    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEtype() {
        return etype;
    }

    public void setEtype(String etype) {
        this.etype = etype;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getGen_date() {
        return gen_date;
    }

    public void setGen_date(String gen_date) {
        this.gen_date = gen_date;
    }

    public String getRec_type() {
        return rec_type;
    }

    public void setRec_type(String rec_type) {
        this.rec_type = rec_type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    private  String eid;
    private  String ename;
    private  String etype;
    private String rid;
    private String desc;
    private String gen_date;

    @Override
    public String toString() {
        return "FinalRecords{" +
                "eid='" + eid + '\'' +
                ", ename='" + ename + '\'' +
                ", etype='" + etype + '\'' +
                ", rid='" + rid + '\'' +
                ", desc='" + desc + '\'' +
                ", gen_date='" + gen_date + '\'' +
                ", rec_type='" + rec_type + '\'' +
                ", tags='" + tags + '\'' +
                ", did='" + did + '\'' +
                ", dname='" + dname + '\'' +
                '}';
    }

    private String rec_type;
    private String tags;
    private String did;
    private String dname;





}
