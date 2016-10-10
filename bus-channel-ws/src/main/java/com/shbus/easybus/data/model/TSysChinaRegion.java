package com.shbus.easybus.data.model;

import java.util.Date;

public class TSysChinaRegion {
    private String regionCode6;

    private String regionCode3;

    private String regionCnname;

    private String regionPinyin;

    private String parentProvinceCnname;

    private String parentProvincePinyin;

    private String parentProvinceCode6;

    private String parentCityCnname;

    private String parentCityPinyin;

    private String parentCityCode6;

    private String parentCityCode3;

    private String remark;

    private Date createDate;

    private Long createOpId;

    private Date lastModifyDate;

    private Long lastModifyOpId;

    private String valid;

    private String regionPysz;

    public String getRegionCode6() {
        return regionCode6;
    }

    public void setRegionCode6(String regionCode6) {
        this.regionCode6 = regionCode6 == null ? null : regionCode6.trim();
    }

    public String getRegionCode3() {
        return regionCode3;
    }

    public void setRegionCode3(String regionCode3) {
        this.regionCode3 = regionCode3 == null ? null : regionCode3.trim();
    }

    public String getRegionCnname() {
        return regionCnname;
    }

    public void setRegionCnname(String regionCnname) {
        this.regionCnname = regionCnname == null ? null : regionCnname.trim();
    }

    public String getRegionPinyin() {
        return regionPinyin;
    }

    public void setRegionPinyin(String regionPinyin) {
        this.regionPinyin = regionPinyin == null ? null : regionPinyin.trim();
    }

    public String getParentProvinceCnname() {
        return parentProvinceCnname;
    }

    public void setParentProvinceCnname(String parentProvinceCnname) {
        this.parentProvinceCnname = parentProvinceCnname == null ? null : parentProvinceCnname.trim();
    }

    public String getParentProvincePinyin() {
        return parentProvincePinyin;
    }

    public void setParentProvincePinyin(String parentProvincePinyin) {
        this.parentProvincePinyin = parentProvincePinyin == null ? null : parentProvincePinyin.trim();
    }

    public String getParentProvinceCode6() {
        return parentProvinceCode6;
    }

    public void setParentProvinceCode6(String parentProvinceCode6) {
        this.parentProvinceCode6 = parentProvinceCode6 == null ? null : parentProvinceCode6.trim();
    }

    public String getParentCityCnname() {
        return parentCityCnname;
    }

    public void setParentCityCnname(String parentCityCnname) {
        this.parentCityCnname = parentCityCnname == null ? null : parentCityCnname.trim();
    }

    public String getParentCityPinyin() {
        return parentCityPinyin;
    }

    public void setParentCityPinyin(String parentCityPinyin) {
        this.parentCityPinyin = parentCityPinyin == null ? null : parentCityPinyin.trim();
    }

    public String getParentCityCode6() {
        return parentCityCode6;
    }

    public void setParentCityCode6(String parentCityCode6) {
        this.parentCityCode6 = parentCityCode6 == null ? null : parentCityCode6.trim();
    }

    public String getParentCityCode3() {
        return parentCityCode3;
    }

    public void setParentCityCode3(String parentCityCode3) {
        this.parentCityCode3 = parentCityCode3 == null ? null : parentCityCode3.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateOpId() {
        return createOpId;
    }

    public void setCreateOpId(Long createOpId) {
        this.createOpId = createOpId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public Long getLastModifyOpId() {
        return lastModifyOpId;
    }

    public void setLastModifyOpId(Long lastModifyOpId) {
        this.lastModifyOpId = lastModifyOpId;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    public String getRegionPysz() {
        return regionPysz;
    }

    public void setRegionPysz(String regionPysz) {
        this.regionPysz = regionPysz == null ? null : regionPysz.trim();
    }
}