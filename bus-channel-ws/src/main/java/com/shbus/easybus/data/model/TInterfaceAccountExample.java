package com.shbus.easybus.data.model;

import java.util.ArrayList;
import java.util.List;

public class TInterfaceAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInterfaceAccountExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
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

        public Criteria andPwdIsNull() {
            addCriterion("PWD is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("PWD is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("PWD =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("PWD <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("PWD >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("PWD >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("PWD <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("PWD <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("PWD like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("PWD not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("PWD in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("PWD not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("PWD between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("PWD not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andIpListIsNull() {
            addCriterion("IP_LIST is null");
            return (Criteria) this;
        }

        public Criteria andIpListIsNotNull() {
            addCriterion("IP_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andIpListEqualTo(String value) {
            addCriterion("IP_LIST =", value, "ipList");
            return (Criteria) this;
        }

        public Criteria andIpListNotEqualTo(String value) {
            addCriterion("IP_LIST <>", value, "ipList");
            return (Criteria) this;
        }

        public Criteria andIpListGreaterThan(String value) {
            addCriterion("IP_LIST >", value, "ipList");
            return (Criteria) this;
        }

        public Criteria andIpListGreaterThanOrEqualTo(String value) {
            addCriterion("IP_LIST >=", value, "ipList");
            return (Criteria) this;
        }

        public Criteria andIpListLessThan(String value) {
            addCriterion("IP_LIST <", value, "ipList");
            return (Criteria) this;
        }

        public Criteria andIpListLessThanOrEqualTo(String value) {
            addCriterion("IP_LIST <=", value, "ipList");
            return (Criteria) this;
        }

        public Criteria andIpListLike(String value) {
            addCriterion("IP_LIST like", value, "ipList");
            return (Criteria) this;
        }

        public Criteria andIpListNotLike(String value) {
            addCriterion("IP_LIST not like", value, "ipList");
            return (Criteria) this;
        }

        public Criteria andIpListIn(List<String> values) {
            addCriterion("IP_LIST in", values, "ipList");
            return (Criteria) this;
        }

        public Criteria andIpListNotIn(List<String> values) {
            addCriterion("IP_LIST not in", values, "ipList");
            return (Criteria) this;
        }

        public Criteria andIpListBetween(String value1, String value2) {
            addCriterion("IP_LIST between", value1, value2, "ipList");
            return (Criteria) this;
        }

        public Criteria andIpListNotBetween(String value1, String value2) {
            addCriterion("IP_LIST not between", value1, value2, "ipList");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsNull() {
            addCriterion("USER_INFO is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsNotNull() {
            addCriterion("USER_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoEqualTo(String value) {
            addCriterion("USER_INFO =", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotEqualTo(String value) {
            addCriterion("USER_INFO <>", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoGreaterThan(String value) {
            addCriterion("USER_INFO >", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_INFO >=", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoLessThan(String value) {
            addCriterion("USER_INFO <", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoLessThanOrEqualTo(String value) {
            addCriterion("USER_INFO <=", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoLike(String value) {
            addCriterion("USER_INFO like", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotLike(String value) {
            addCriterion("USER_INFO not like", value, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoIn(List<String> values) {
            addCriterion("USER_INFO in", values, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotIn(List<String> values) {
            addCriterion("USER_INFO not in", values, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoBetween(String value1, String value2) {
            addCriterion("USER_INFO between", value1, value2, "userInfo");
            return (Criteria) this;
        }

        public Criteria andUserInfoNotBetween(String value1, String value2) {
            addCriterion("USER_INFO not between", value1, value2, "userInfo");
            return (Criteria) this;
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