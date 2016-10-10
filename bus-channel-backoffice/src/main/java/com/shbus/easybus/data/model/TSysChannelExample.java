package com.shbus.easybus.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSysChannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSysChannelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Long value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Long value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Long value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Long value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Long> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Long> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("CHANNEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("CHANNEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("CHANNEL_CODE =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("CHANNEL_CODE <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("CHANNEL_CODE >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CODE >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("CHANNEL_CODE <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CODE <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("CHANNEL_CODE like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("CHANNEL_CODE not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("CHANNEL_CODE in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("CHANNEL_CODE not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("CHANNEL_CODE between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_CODE not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("CHANNEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("CHANNEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("CHANNEL_NAME =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("CHANNEL_NAME <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("CHANNEL_NAME >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("CHANNEL_NAME <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("CHANNEL_NAME like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("CHANNEL_NAME not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("CHANNEL_NAME in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("CHANNEL_NAME not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNull() {
            addCriterion("CHANNEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNotNull() {
            addCriterion("CHANNEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeEqualTo(String value) {
            addCriterion("CHANNEL_TYPE =", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotEqualTo(String value) {
            addCriterion("CHANNEL_TYPE <>", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThan(String value) {
            addCriterion("CHANNEL_TYPE >", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TYPE >=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThan(String value) {
            addCriterion("CHANNEL_TYPE <", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TYPE <=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLike(String value) {
            addCriterion("CHANNEL_TYPE like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotLike(String value) {
            addCriterion("CHANNEL_TYPE not like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIn(List<String> values) {
            addCriterion("CHANNEL_TYPE in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotIn(List<String> values) {
            addCriterion("CHANNEL_TYPE not in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeBetween(String value1, String value2) {
            addCriterion("CHANNEL_TYPE between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_TYPE not between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIsNull() {
            addCriterion("MODIFY_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIsNotNull() {
            addCriterion("MODIFY_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeEqualTo(Date value) {
            addCriterion("MODIFY_DATETIME =", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotEqualTo(Date value) {
            addCriterion("MODIFY_DATETIME <>", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeGreaterThan(Date value) {
            addCriterion("MODIFY_DATETIME >", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATETIME >=", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeLessThan(Date value) {
            addCriterion("MODIFY_DATETIME <", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DATETIME <=", value, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeIn(List<Date> values) {
            addCriterion("MODIFY_DATETIME in", values, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotIn(List<Date> values) {
            addCriterion("MODIFY_DATETIME not in", values, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATETIME between", value1, value2, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andModifyDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DATETIME not between", value1, value2, "modifyDatetime");
            return (Criteria) this;
        }

        public Criteria andLastOpIdIsNull() {
            addCriterion("LAST_OP_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastOpIdIsNotNull() {
            addCriterion("LAST_OP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastOpIdEqualTo(Long value) {
            addCriterion("LAST_OP_ID =", value, "lastOpId");
            return (Criteria) this;
        }

        public Criteria andLastOpIdNotEqualTo(Long value) {
            addCriterion("LAST_OP_ID <>", value, "lastOpId");
            return (Criteria) this;
        }

        public Criteria andLastOpIdGreaterThan(Long value) {
            addCriterion("LAST_OP_ID >", value, "lastOpId");
            return (Criteria) this;
        }

        public Criteria andLastOpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_OP_ID >=", value, "lastOpId");
            return (Criteria) this;
        }

        public Criteria andLastOpIdLessThan(Long value) {
            addCriterion("LAST_OP_ID <", value, "lastOpId");
            return (Criteria) this;
        }

        public Criteria andLastOpIdLessThanOrEqualTo(Long value) {
            addCriterion("LAST_OP_ID <=", value, "lastOpId");
            return (Criteria) this;
        }

        public Criteria andLastOpIdIn(List<Long> values) {
            addCriterion("LAST_OP_ID in", values, "lastOpId");
            return (Criteria) this;
        }

        public Criteria andLastOpIdNotIn(List<Long> values) {
            addCriterion("LAST_OP_ID not in", values, "lastOpId");
            return (Criteria) this;
        }

        public Criteria andLastOpIdBetween(Long value1, Long value2) {
            addCriterion("LAST_OP_ID between", value1, value2, "lastOpId");
            return (Criteria) this;
        }

        public Criteria andLastOpIdNotBetween(Long value1, Long value2) {
            addCriterion("LAST_OP_ID not between", value1, value2, "lastOpId");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("VALID is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("VALID is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(String value) {
            addCriterion("VALID =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(String value) {
            addCriterion("VALID <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(String value) {
            addCriterion("VALID >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(String value) {
            addCriterion("VALID >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(String value) {
            addCriterion("VALID <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(String value) {
            addCriterion("VALID <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLike(String value) {
            addCriterion("VALID like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotLike(String value) {
            addCriterion("VALID not like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<String> values) {
            addCriterion("VALID in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<String> values) {
            addCriterion("VALID not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(String value1, String value2) {
            addCriterion("VALID between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(String value1, String value2) {
            addCriterion("VALID not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdIsNull() {
            addCriterion("SUPPLIERINFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdIsNotNull() {
            addCriterion("SUPPLIERINFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdEqualTo(String value) {
            addCriterion("SUPPLIERINFO_ID =", value, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdNotEqualTo(String value) {
            addCriterion("SUPPLIERINFO_ID <>", value, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdGreaterThan(String value) {
            addCriterion("SUPPLIERINFO_ID >", value, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIERINFO_ID >=", value, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdLessThan(String value) {
            addCriterion("SUPPLIERINFO_ID <", value, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIERINFO_ID <=", value, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdLike(String value) {
            addCriterion("SUPPLIERINFO_ID like", value, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdNotLike(String value) {
            addCriterion("SUPPLIERINFO_ID not like", value, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdIn(List<String> values) {
            addCriterion("SUPPLIERINFO_ID in", values, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdNotIn(List<String> values) {
            addCriterion("SUPPLIERINFO_ID not in", values, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdBetween(String value1, String value2) {
            addCriterion("SUPPLIERINFO_ID between", value1, value2, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLIERINFO_ID not between", value1, value2, "supplierinfoId");
            return (Criteria) this;
        }

        public Criteria andChannelLevelIsNull() {
            addCriterion("CHANNEL_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelLevelIsNotNull() {
            addCriterion("CHANNEL_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelLevelEqualTo(Long value) {
            addCriterion("CHANNEL_LEVEL =", value, "channelLevel");
            return (Criteria) this;
        }

        public Criteria andChannelLevelNotEqualTo(Long value) {
            addCriterion("CHANNEL_LEVEL <>", value, "channelLevel");
            return (Criteria) this;
        }

        public Criteria andChannelLevelGreaterThan(Long value) {
            addCriterion("CHANNEL_LEVEL >", value, "channelLevel");
            return (Criteria) this;
        }

        public Criteria andChannelLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_LEVEL >=", value, "channelLevel");
            return (Criteria) this;
        }

        public Criteria andChannelLevelLessThan(Long value) {
            addCriterion("CHANNEL_LEVEL <", value, "channelLevel");
            return (Criteria) this;
        }

        public Criteria andChannelLevelLessThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_LEVEL <=", value, "channelLevel");
            return (Criteria) this;
        }

        public Criteria andChannelLevelIn(List<Long> values) {
            addCriterion("CHANNEL_LEVEL in", values, "channelLevel");
            return (Criteria) this;
        }

        public Criteria andChannelLevelNotIn(List<Long> values) {
            addCriterion("CHANNEL_LEVEL not in", values, "channelLevel");
            return (Criteria) this;
        }

        public Criteria andChannelLevelBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_LEVEL between", value1, value2, "channelLevel");
            return (Criteria) this;
        }

        public Criteria andChannelLevelNotBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_LEVEL not between", value1, value2, "channelLevel");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeIsNull() {
            addCriterion("CHANNEL_CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeIsNotNull() {
            addCriterion("CHANNEL_CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeEqualTo(String value) {
            addCriterion("CHANNEL_CITY_CODE =", value, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeNotEqualTo(String value) {
            addCriterion("CHANNEL_CITY_CODE <>", value, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeGreaterThan(String value) {
            addCriterion("CHANNEL_CITY_CODE >", value, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CITY_CODE >=", value, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeLessThan(String value) {
            addCriterion("CHANNEL_CITY_CODE <", value, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CITY_CODE <=", value, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeLike(String value) {
            addCriterion("CHANNEL_CITY_CODE like", value, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeNotLike(String value) {
            addCriterion("CHANNEL_CITY_CODE not like", value, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeIn(List<String> values) {
            addCriterion("CHANNEL_CITY_CODE in", values, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeNotIn(List<String> values) {
            addCriterion("CHANNEL_CITY_CODE not in", values, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeBetween(String value1, String value2) {
            addCriterion("CHANNEL_CITY_CODE between", value1, value2, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelCityCodeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_CITY_CODE not between", value1, value2, "channelCityCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeIsNull() {
            addCriterion("CHANNEL_PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeIsNotNull() {
            addCriterion("CHANNEL_PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeEqualTo(String value) {
            addCriterion("CHANNEL_PROVINCE_CODE =", value, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeNotEqualTo(String value) {
            addCriterion("CHANNEL_PROVINCE_CODE <>", value, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeGreaterThan(String value) {
            addCriterion("CHANNEL_PROVINCE_CODE >", value, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_PROVINCE_CODE >=", value, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeLessThan(String value) {
            addCriterion("CHANNEL_PROVINCE_CODE <", value, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_PROVINCE_CODE <=", value, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeLike(String value) {
            addCriterion("CHANNEL_PROVINCE_CODE like", value, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeNotLike(String value) {
            addCriterion("CHANNEL_PROVINCE_CODE not like", value, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeIn(List<String> values) {
            addCriterion("CHANNEL_PROVINCE_CODE in", values, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeNotIn(List<String> values) {
            addCriterion("CHANNEL_PROVINCE_CODE not in", values, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeBetween(String value1, String value2) {
            addCriterion("CHANNEL_PROVINCE_CODE between", value1, value2, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andChannelProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_PROVINCE_CODE not between", value1, value2, "channelProvinceCode");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrIsNull() {
            addCriterion("MSG_NOTIFY_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrIsNotNull() {
            addCriterion("MSG_NOTIFY_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrEqualTo(String value) {
            addCriterion("MSG_NOTIFY_ADDR =", value, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrNotEqualTo(String value) {
            addCriterion("MSG_NOTIFY_ADDR <>", value, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrGreaterThan(String value) {
            addCriterion("MSG_NOTIFY_ADDR >", value, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_NOTIFY_ADDR >=", value, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrLessThan(String value) {
            addCriterion("MSG_NOTIFY_ADDR <", value, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrLessThanOrEqualTo(String value) {
            addCriterion("MSG_NOTIFY_ADDR <=", value, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrLike(String value) {
            addCriterion("MSG_NOTIFY_ADDR like", value, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrNotLike(String value) {
            addCriterion("MSG_NOTIFY_ADDR not like", value, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrIn(List<String> values) {
            addCriterion("MSG_NOTIFY_ADDR in", values, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrNotIn(List<String> values) {
            addCriterion("MSG_NOTIFY_ADDR not in", values, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrBetween(String value1, String value2) {
            addCriterion("MSG_NOTIFY_ADDR between", value1, value2, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyAddrNotBetween(String value1, String value2) {
            addCriterion("MSG_NOTIFY_ADDR not between", value1, value2, "msgNotifyAddr");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractIsNull() {
            addCriterion("SELF_SIGN_CONTRACT is null");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractIsNotNull() {
            addCriterion("SELF_SIGN_CONTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractEqualTo(String value) {
            addCriterion("SELF_SIGN_CONTRACT =", value, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractNotEqualTo(String value) {
            addCriterion("SELF_SIGN_CONTRACT <>", value, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractGreaterThan(String value) {
            addCriterion("SELF_SIGN_CONTRACT >", value, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_SIGN_CONTRACT >=", value, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractLessThan(String value) {
            addCriterion("SELF_SIGN_CONTRACT <", value, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractLessThanOrEqualTo(String value) {
            addCriterion("SELF_SIGN_CONTRACT <=", value, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractLike(String value) {
            addCriterion("SELF_SIGN_CONTRACT like", value, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractNotLike(String value) {
            addCriterion("SELF_SIGN_CONTRACT not like", value, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractIn(List<String> values) {
            addCriterion("SELF_SIGN_CONTRACT in", values, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractNotIn(List<String> values) {
            addCriterion("SELF_SIGN_CONTRACT not in", values, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractBetween(String value1, String value2) {
            addCriterion("SELF_SIGN_CONTRACT between", value1, value2, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andSelfSignContractNotBetween(String value1, String value2) {
            addCriterion("SELF_SIGN_CONTRACT not between", value1, value2, "selfSignContract");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIsNull() {
            addCriterion("CHANNEL_SALE_DEPTMENT is null");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIsNotNull() {
            addCriterion("CHANNEL_SALE_DEPTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentEqualTo(String value) {
            addCriterion("CHANNEL_SALE_DEPTMENT =", value, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentNotEqualTo(String value) {
            addCriterion("CHANNEL_SALE_DEPTMENT <>", value, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentGreaterThan(String value) {
            addCriterion("CHANNEL_SALE_DEPTMENT >", value, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_SALE_DEPTMENT >=", value, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentLessThan(String value) {
            addCriterion("CHANNEL_SALE_DEPTMENT <", value, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_SALE_DEPTMENT <=", value, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentLike(String value) {
            addCriterion("CHANNEL_SALE_DEPTMENT like", value, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentNotLike(String value) {
            addCriterion("CHANNEL_SALE_DEPTMENT not like", value, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIn(List<String> values) {
            addCriterion("CHANNEL_SALE_DEPTMENT in", values, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentNotIn(List<String> values) {
            addCriterion("CHANNEL_SALE_DEPTMENT not in", values, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentBetween(String value1, String value2) {
            addCriterion("CHANNEL_SALE_DEPTMENT between", value1, value2, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_SALE_DEPTMENT not between", value1, value2, "channelSaleDeptment");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdIsNull() {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdIsNotNull() {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdEqualTo(Long value) {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID =", value, "channelSaleDeptmentId");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdNotEqualTo(Long value) {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID <>", value, "channelSaleDeptmentId");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdGreaterThan(Long value) {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID >", value, "channelSaleDeptmentId");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID >=", value, "channelSaleDeptmentId");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdLessThan(Long value) {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID <", value, "channelSaleDeptmentId");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdLessThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID <=", value, "channelSaleDeptmentId");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdIn(List<Long> values) {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID in", values, "channelSaleDeptmentId");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdNotIn(List<Long> values) {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID not in", values, "channelSaleDeptmentId");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID between", value1, value2, "channelSaleDeptmentId");
            return (Criteria) this;
        }

        public Criteria andChannelSaleDeptmentIdNotBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_SALE_DEPTMENT_ID not between", value1, value2, "channelSaleDeptmentId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdIsNull() {
            addCriterion("OLD_SYS_CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdIsNotNull() {
            addCriterion("OLD_SYS_CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdEqualTo(String value) {
            addCriterion("OLD_SYS_CHANNEL_ID =", value, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdNotEqualTo(String value) {
            addCriterion("OLD_SYS_CHANNEL_ID <>", value, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdGreaterThan(String value) {
            addCriterion("OLD_SYS_CHANNEL_ID >", value, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_SYS_CHANNEL_ID >=", value, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdLessThan(String value) {
            addCriterion("OLD_SYS_CHANNEL_ID <", value, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdLessThanOrEqualTo(String value) {
            addCriterion("OLD_SYS_CHANNEL_ID <=", value, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdLike(String value) {
            addCriterion("OLD_SYS_CHANNEL_ID like", value, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdNotLike(String value) {
            addCriterion("OLD_SYS_CHANNEL_ID not like", value, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdIn(List<String> values) {
            addCriterion("OLD_SYS_CHANNEL_ID in", values, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdNotIn(List<String> values) {
            addCriterion("OLD_SYS_CHANNEL_ID not in", values, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdBetween(String value1, String value2) {
            addCriterion("OLD_SYS_CHANNEL_ID between", value1, value2, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andOldSysChannelIdNotBetween(String value1, String value2) {
            addCriterion("OLD_SYS_CHANNEL_ID not between", value1, value2, "oldSysChannelId");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("REMARK1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("REMARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("REMARK1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("REMARK1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("REMARK1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("REMARK1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("REMARK1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("REMARK1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("REMARK1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("REMARK1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("REMARK1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("REMARK1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("REMARK1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("REMARK2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("REMARK2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("REMARK2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("REMARK2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("REMARK2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("REMARK2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("REMARK2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("REMARK2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("REMARK2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("REMARK2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("REMARK2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("REMARK2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("REMARK2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("REMARK3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("REMARK3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("REMARK3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("REMARK3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("REMARK3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("REMARK3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("REMARK3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("REMARK3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("REMARK3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("REMARK3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("REMARK3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("REMARK3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("REMARK3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("REMARK3 not between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdIsNull() {
            addCriterion("U_TREE_NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdIsNotNull() {
            addCriterion("U_TREE_NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdEqualTo(Long value) {
            addCriterion("U_TREE_NODE_ID =", value, "uTreeNodeId");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdNotEqualTo(Long value) {
            addCriterion("U_TREE_NODE_ID <>", value, "uTreeNodeId");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdGreaterThan(Long value) {
            addCriterion("U_TREE_NODE_ID >", value, "uTreeNodeId");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("U_TREE_NODE_ID >=", value, "uTreeNodeId");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdLessThan(Long value) {
            addCriterion("U_TREE_NODE_ID <", value, "uTreeNodeId");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("U_TREE_NODE_ID <=", value, "uTreeNodeId");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdIn(List<Long> values) {
            addCriterion("U_TREE_NODE_ID in", values, "uTreeNodeId");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdNotIn(List<Long> values) {
            addCriterion("U_TREE_NODE_ID not in", values, "uTreeNodeId");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdBetween(Long value1, Long value2) {
            addCriterion("U_TREE_NODE_ID between", value1, value2, "uTreeNodeId");
            return (Criteria) this;
        }

        public Criteria andUTreeNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("U_TREE_NODE_ID not between", value1, value2, "uTreeNodeId");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdIsNull() {
            addCriterion("SALE_OP_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdIsNotNull() {
            addCriterion("SALE_OP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdEqualTo(Long value) {
            addCriterion("SALE_OP_ID =", value, "saleOpId");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdNotEqualTo(Long value) {
            addCriterion("SALE_OP_ID <>", value, "saleOpId");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdGreaterThan(Long value) {
            addCriterion("SALE_OP_ID >", value, "saleOpId");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE_OP_ID >=", value, "saleOpId");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdLessThan(Long value) {
            addCriterion("SALE_OP_ID <", value, "saleOpId");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdLessThanOrEqualTo(Long value) {
            addCriterion("SALE_OP_ID <=", value, "saleOpId");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdIn(List<Long> values) {
            addCriterion("SALE_OP_ID in", values, "saleOpId");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdNotIn(List<Long> values) {
            addCriterion("SALE_OP_ID not in", values, "saleOpId");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdBetween(Long value1, Long value2) {
            addCriterion("SALE_OP_ID between", value1, value2, "saleOpId");
            return (Criteria) this;
        }

        public Criteria andSaleOpIdNotBetween(Long value1, Long value2) {
            addCriterion("SALE_OP_ID not between", value1, value2, "saleOpId");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameIsNull() {
            addCriterion("SALE_OP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameIsNotNull() {
            addCriterion("SALE_OP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameEqualTo(String value) {
            addCriterion("SALE_OP_NAME =", value, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameNotEqualTo(String value) {
            addCriterion("SALE_OP_NAME <>", value, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameGreaterThan(String value) {
            addCriterion("SALE_OP_NAME >", value, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_OP_NAME >=", value, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameLessThan(String value) {
            addCriterion("SALE_OP_NAME <", value, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameLessThanOrEqualTo(String value) {
            addCriterion("SALE_OP_NAME <=", value, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameLike(String value) {
            addCriterion("SALE_OP_NAME like", value, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameNotLike(String value) {
            addCriterion("SALE_OP_NAME not like", value, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameIn(List<String> values) {
            addCriterion("SALE_OP_NAME in", values, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameNotIn(List<String> values) {
            addCriterion("SALE_OP_NAME not in", values, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameBetween(String value1, String value2) {
            addCriterion("SALE_OP_NAME between", value1, value2, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpNameNotBetween(String value1, String value2) {
            addCriterion("SALE_OP_NAME not between", value1, value2, "saleOpName");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdIsNull() {
            addCriterion("SALE_OP_DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdIsNotNull() {
            addCriterion("SALE_OP_DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdEqualTo(Long value) {
            addCriterion("SALE_OP_DEPART_ID =", value, "saleOpDepartId");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdNotEqualTo(Long value) {
            addCriterion("SALE_OP_DEPART_ID <>", value, "saleOpDepartId");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdGreaterThan(Long value) {
            addCriterion("SALE_OP_DEPART_ID >", value, "saleOpDepartId");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE_OP_DEPART_ID >=", value, "saleOpDepartId");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdLessThan(Long value) {
            addCriterion("SALE_OP_DEPART_ID <", value, "saleOpDepartId");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdLessThanOrEqualTo(Long value) {
            addCriterion("SALE_OP_DEPART_ID <=", value, "saleOpDepartId");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdIn(List<Long> values) {
            addCriterion("SALE_OP_DEPART_ID in", values, "saleOpDepartId");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdNotIn(List<Long> values) {
            addCriterion("SALE_OP_DEPART_ID not in", values, "saleOpDepartId");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdBetween(Long value1, Long value2) {
            addCriterion("SALE_OP_DEPART_ID between", value1, value2, "saleOpDepartId");
            return (Criteria) this;
        }

        public Criteria andSaleOpDepartIdNotBetween(Long value1, Long value2) {
            addCriterion("SALE_OP_DEPART_ID not between", value1, value2, "saleOpDepartId");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateIsNull() {
            addCriterion("CONTRACT_BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateIsNotNull() {
            addCriterion("CONTRACT_BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateEqualTo(Long value) {
            addCriterion("CONTRACT_BEGIN_DATE =", value, "contractBeginDate");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateNotEqualTo(Long value) {
            addCriterion("CONTRACT_BEGIN_DATE <>", value, "contractBeginDate");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateGreaterThan(Long value) {
            addCriterion("CONTRACT_BEGIN_DATE >", value, "contractBeginDate");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_BEGIN_DATE >=", value, "contractBeginDate");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateLessThan(Long value) {
            addCriterion("CONTRACT_BEGIN_DATE <", value, "contractBeginDate");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateLessThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_BEGIN_DATE <=", value, "contractBeginDate");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateIn(List<Long> values) {
            addCriterion("CONTRACT_BEGIN_DATE in", values, "contractBeginDate");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateNotIn(List<Long> values) {
            addCriterion("CONTRACT_BEGIN_DATE not in", values, "contractBeginDate");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_BEGIN_DATE between", value1, value2, "contractBeginDate");
            return (Criteria) this;
        }

        public Criteria andContractBeginDateNotBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_BEGIN_DATE not between", value1, value2, "contractBeginDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIsNull() {
            addCriterion("CONTRACT_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIsNotNull() {
            addCriterion("CONTRACT_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractEndDateEqualTo(Long value) {
            addCriterion("CONTRACT_END_DATE =", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotEqualTo(Long value) {
            addCriterion("CONTRACT_END_DATE <>", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateGreaterThan(Long value) {
            addCriterion("CONTRACT_END_DATE >", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_END_DATE >=", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateLessThan(Long value) {
            addCriterion("CONTRACT_END_DATE <", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateLessThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_END_DATE <=", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIn(List<Long> values) {
            addCriterion("CONTRACT_END_DATE in", values, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotIn(List<Long> values) {
            addCriterion("CONTRACT_END_DATE not in", values, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_END_DATE between", value1, value2, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_END_DATE not between", value1, value2, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescIsNull() {
            addCriterion("F_SETTLEMENT_TYPE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescIsNotNull() {
            addCriterion("F_SETTLEMENT_TYPE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescEqualTo(String value) {
            addCriterion("F_SETTLEMENT_TYPE_DESC =", value, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescNotEqualTo(String value) {
            addCriterion("F_SETTLEMENT_TYPE_DESC <>", value, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescGreaterThan(String value) {
            addCriterion("F_SETTLEMENT_TYPE_DESC >", value, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("F_SETTLEMENT_TYPE_DESC >=", value, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescLessThan(String value) {
            addCriterion("F_SETTLEMENT_TYPE_DESC <", value, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescLessThanOrEqualTo(String value) {
            addCriterion("F_SETTLEMENT_TYPE_DESC <=", value, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescLike(String value) {
            addCriterion("F_SETTLEMENT_TYPE_DESC like", value, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescNotLike(String value) {
            addCriterion("F_SETTLEMENT_TYPE_DESC not like", value, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescIn(List<String> values) {
            addCriterion("F_SETTLEMENT_TYPE_DESC in", values, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescNotIn(List<String> values) {
            addCriterion("F_SETTLEMENT_TYPE_DESC not in", values, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescBetween(String value1, String value2) {
            addCriterion("F_SETTLEMENT_TYPE_DESC between", value1, value2, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andFSettlementTypeDescNotBetween(String value1, String value2) {
            addCriterion("F_SETTLEMENT_TYPE_DESC not between", value1, value2, "fSettlementTypeDesc");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("CONTACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("CONTACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("CONTACT_NAME =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("CONTACT_NAME <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("CONTACT_NAME >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_NAME >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("CONTACT_NAME <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_NAME <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("CONTACT_NAME like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("CONTACT_NAME not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("CONTACT_NAME in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("CONTACT_NAME not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("CONTACT_NAME between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("CONTACT_NAME not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNull() {
            addCriterion("CONTACT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("CONTACT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("CONTACT_TEL =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("CONTACT_TEL <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("CONTACT_TEL >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_TEL >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("CONTACT_TEL <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_TEL <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("CONTACT_TEL like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("CONTACT_TEL not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("CONTACT_TEL in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("CONTACT_TEL not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("CONTACT_TEL between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("CONTACT_TEL not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactFaxIsNull() {
            addCriterion("CONTACT_FAX is null");
            return (Criteria) this;
        }

        public Criteria andContactFaxIsNotNull() {
            addCriterion("CONTACT_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andContactFaxEqualTo(String value) {
            addCriterion("CONTACT_FAX =", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxNotEqualTo(String value) {
            addCriterion("CONTACT_FAX <>", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxGreaterThan(String value) {
            addCriterion("CONTACT_FAX >", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_FAX >=", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxLessThan(String value) {
            addCriterion("CONTACT_FAX <", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_FAX <=", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxLike(String value) {
            addCriterion("CONTACT_FAX like", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxNotLike(String value) {
            addCriterion("CONTACT_FAX not like", value, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxIn(List<String> values) {
            addCriterion("CONTACT_FAX in", values, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxNotIn(List<String> values) {
            addCriterion("CONTACT_FAX not in", values, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxBetween(String value1, String value2) {
            addCriterion("CONTACT_FAX between", value1, value2, "contactFax");
            return (Criteria) this;
        }

        public Criteria andContactFaxNotBetween(String value1, String value2) {
            addCriterion("CONTACT_FAX not between", value1, value2, "contactFax");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysIsNull() {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS is null");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysIsNotNull() {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS is not null");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysEqualTo(String value) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS =", value, "msgNotifyTypeAlways");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysNotEqualTo(String value) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS <>", value, "msgNotifyTypeAlways");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysGreaterThan(String value) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS >", value, "msgNotifyTypeAlways");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS >=", value, "msgNotifyTypeAlways");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysLessThan(String value) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS <", value, "msgNotifyTypeAlways");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysLessThanOrEqualTo(String value) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS <=", value, "msgNotifyTypeAlways");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysLike(String value) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS like", value, "msgNotifyTypeAlways");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysNotLike(String value) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS not like", value, "msgNotifyTypeAlways");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysIn(List<String> values) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS in", values, "msgNotifyTypeAlways");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysNotIn(List<String> values) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS not in", values, "msgNotifyTypeAlways");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysBetween(String value1, String value2) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS between", value1, value2, "msgNotifyTypeAlways");
            return (Criteria) this;
        }

        public Criteria andMsgNotifyTypeAlwaysNotBetween(String value1, String value2) {
            addCriterion("MSG_NOTIFY_TYPE_ALWAYS not between", value1, value2, "msgNotifyTypeAlways");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}