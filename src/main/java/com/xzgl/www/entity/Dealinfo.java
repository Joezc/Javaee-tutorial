package com.xzgl.www.entity;

public class Dealinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dealinfo.HandleID
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    private String handleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dealinfo.CaseNumber
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    private String casenumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dealinfo.Adepartment
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    private String adepartment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dealinfo.Steps
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    private String steps;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dealinfo.HandleID
     *
     * @return the value of dealinfo.HandleID
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public String getHandleid() {
        return handleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dealinfo.HandleID
     *
     * @param handleid the value for dealinfo.HandleID
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public void setHandleid(String handleid) {
        this.handleid = handleid == null ? null : handleid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dealinfo.CaseNumber
     *
     * @return the value of dealinfo.CaseNumber
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public String getCasenumber() {
        return casenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dealinfo.CaseNumber
     *
     * @param casenumber the value for dealinfo.CaseNumber
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber == null ? null : casenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dealinfo.Adepartment
     *
     * @return the value of dealinfo.Adepartment
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public String getAdepartment() {
        return adepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dealinfo.Adepartment
     *
     * @param adepartment the value for dealinfo.Adepartment
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public void setAdepartment(String adepartment) {
        this.adepartment = adepartment == null ? null : adepartment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dealinfo.Steps
     *
     * @return the value of dealinfo.Steps
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public String getSteps() {
        return steps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dealinfo.Steps
     *
     * @param steps the value for dealinfo.Steps
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public void setSteps(String steps) {
        this.steps = steps == null ? null : steps.trim();
    }
}