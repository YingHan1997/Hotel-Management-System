package com.spawpaw.ssm.entity;

import java.util.Date;

public class Masterinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column masterinfo.id
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column masterinfo.name
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column masterinfo.phone
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column masterinfo.sex
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column masterinfo.fid
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    private Integer fid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column masterinfo.time
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column masterinfo.id
     *
     * @return the value of masterinfo.id
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column masterinfo.id
     *
     * @param id the value for masterinfo.id
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column masterinfo.name
     *
     * @return the value of masterinfo.name
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column masterinfo.name
     *
     * @param name the value for masterinfo.name
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column masterinfo.phone
     *
     * @return the value of masterinfo.phone
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column masterinfo.phone
     *
     * @param phone the value for masterinfo.phone
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column masterinfo.sex
     *
     * @return the value of masterinfo.sex
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column masterinfo.sex
     *
     * @param sex the value for masterinfo.sex
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column masterinfo.fid
     *
     * @return the value of masterinfo.fid
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column masterinfo.fid
     *
     * @param fid the value for masterinfo.fid
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column masterinfo.time
     *
     * @return the value of masterinfo.time
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column masterinfo.time
     *
     * @param time the value for masterinfo.time
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    public void setTime(Date time) {
        this.time = time;
    }
}