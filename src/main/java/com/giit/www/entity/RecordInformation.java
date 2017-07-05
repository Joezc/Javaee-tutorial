package com.giit.www.entity;

import java.util.Date;

public class RecordInformation {
    private String casenumber;

    private String userid;

    private String casetitle;

    private String parties;

    private String casesource;

    private String casename;

    private Date recordtime;

    private String crimereports;

    private String according;

    private String fileupload;

    private String casemold;

    private String cutnumber;

    private String dpno;

    private String currentstauis;

    public String getCasenumber() {
        return casenumber;
    }

    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber == null ? null : casenumber.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getCasetitle() {
        return casetitle;
    }

    public void setCasetitle(String casetitle) {
        this.casetitle = casetitle == null ? null : casetitle.trim();
    }

    public String getParties() {
        return parties;
    }

    public void setParties(String parties) {
        this.parties = parties == null ? null : parties.trim();
    }

    public String getCasesource() {
        return casesource;
    }

    public void setCasesource(String casesource) {
        this.casesource = casesource == null ? null : casesource.trim();
    }

    public String getCasename() {
        return casename;
    }

    public void setCasename(String casename) {
        this.casename = casename == null ? null : casename.trim();
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public String getCrimereports() {
        return crimereports;
    }

    public void setCrimereports(String crimereports) {
        this.crimereports = crimereports == null ? null : crimereports.trim();
    }

    public String getAccording() {
        return according;
    }

    public void setAccording(String according) {
        this.according = according == null ? null : according.trim();
    }

    public String getFileupload() {
        return fileupload;
    }

    public void setFileupload(String fileupload) {
        this.fileupload = fileupload == null ? null : fileupload.trim();
    }

    public String getCasemold() {
        return casemold;
    }

    public void setCasemold(String casemold) {
        this.casemold = casemold == null ? null : casemold.trim();
    }

    public String getCutnumber() {
        return cutnumber;
    }

    public void setCutnumber(String cutnumber) {
        this.cutnumber = cutnumber == null ? null : cutnumber.trim();
    }

    public String getDpno() {
        return dpno;
    }

    public void setDpno(String dpno) {
        this.dpno = dpno == null ? null : dpno.trim();
    }

    public String getCurrentstauis() {
        return currentstauis;
    }

    public void setCurrentstauis(String currentstauis) {
        this.currentstauis = currentstauis == null ? null : currentstauis.trim();
    }
}