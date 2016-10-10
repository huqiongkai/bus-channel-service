package com.shbus.easybus.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TExBusOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TExBusOrderExample() {
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("SUPPLIER_ID =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("SUPPLIER_ID <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("SUPPLIER_ID >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ID >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("SUPPLIER_ID <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ID <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("SUPPLIER_ID like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("SUPPLIER_ID not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("SUPPLIER_ID in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("SUPPLIER_ID not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ID between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ID not between", value1, value2, "supplierId");
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

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdIsNull() {
            addCriterion("CREATE_OP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdIsNotNull() {
            addCriterion("CREATE_OP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdEqualTo(Long value) {
            addCriterion("CREATE_OP_ID =", value, "createOpId");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdNotEqualTo(Long value) {
            addCriterion("CREATE_OP_ID <>", value, "createOpId");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdGreaterThan(Long value) {
            addCriterion("CREATE_OP_ID >", value, "createOpId");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_OP_ID >=", value, "createOpId");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdLessThan(Long value) {
            addCriterion("CREATE_OP_ID <", value, "createOpId");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_OP_ID <=", value, "createOpId");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdIn(List<Long> values) {
            addCriterion("CREATE_OP_ID in", values, "createOpId");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdNotIn(List<Long> values) {
            addCriterion("CREATE_OP_ID not in", values, "createOpId");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdBetween(Long value1, Long value2) {
            addCriterion("CREATE_OP_ID between", value1, value2, "createOpId");
            return (Criteria) this;
        }

        public Criteria andCreateOpIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_OP_ID not between", value1, value2, "createOpId");
            return (Criteria) this;
        }

        public Criteria andTeamNoIsNull() {
            addCriterion("TEAM_NO is null");
            return (Criteria) this;
        }

        public Criteria andTeamNoIsNotNull() {
            addCriterion("TEAM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNoEqualTo(String value) {
            addCriterion("TEAM_NO =", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoNotEqualTo(String value) {
            addCriterion("TEAM_NO <>", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoGreaterThan(String value) {
            addCriterion("TEAM_NO >", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_NO >=", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoLessThan(String value) {
            addCriterion("TEAM_NO <", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoLessThanOrEqualTo(String value) {
            addCriterion("TEAM_NO <=", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoLike(String value) {
            addCriterion("TEAM_NO like", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoNotLike(String value) {
            addCriterion("TEAM_NO not like", value, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoIn(List<String> values) {
            addCriterion("TEAM_NO in", values, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoNotIn(List<String> values) {
            addCriterion("TEAM_NO not in", values, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoBetween(String value1, String value2) {
            addCriterion("TEAM_NO between", value1, value2, "teamNo");
            return (Criteria) this;
        }

        public Criteria andTeamNoNotBetween(String value1, String value2) {
            addCriterion("TEAM_NO not between", value1, value2, "teamNo");
            return (Criteria) this;
        }

        public Criteria andPProductIdIsNull() {
            addCriterion("P_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPProductIdIsNotNull() {
            addCriterion("P_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPProductIdEqualTo(Long value) {
            addCriterion("P_PRODUCT_ID =", value, "pProductId");
            return (Criteria) this;
        }

        public Criteria andPProductIdNotEqualTo(Long value) {
            addCriterion("P_PRODUCT_ID <>", value, "pProductId");
            return (Criteria) this;
        }

        public Criteria andPProductIdGreaterThan(Long value) {
            addCriterion("P_PRODUCT_ID >", value, "pProductId");
            return (Criteria) this;
        }

        public Criteria andPProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("P_PRODUCT_ID >=", value, "pProductId");
            return (Criteria) this;
        }

        public Criteria andPProductIdLessThan(Long value) {
            addCriterion("P_PRODUCT_ID <", value, "pProductId");
            return (Criteria) this;
        }

        public Criteria andPProductIdLessThanOrEqualTo(Long value) {
            addCriterion("P_PRODUCT_ID <=", value, "pProductId");
            return (Criteria) this;
        }

        public Criteria andPProductIdIn(List<Long> values) {
            addCriterion("P_PRODUCT_ID in", values, "pProductId");
            return (Criteria) this;
        }

        public Criteria andPProductIdNotIn(List<Long> values) {
            addCriterion("P_PRODUCT_ID not in", values, "pProductId");
            return (Criteria) this;
        }

        public Criteria andPProductIdBetween(Long value1, Long value2) {
            addCriterion("P_PRODUCT_ID between", value1, value2, "pProductId");
            return (Criteria) this;
        }

        public Criteria andPProductIdNotBetween(Long value1, Long value2) {
            addCriterion("P_PRODUCT_ID not between", value1, value2, "pProductId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexIsNull() {
            addCriterion("EX_ORDER_ID_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexIsNotNull() {
            addCriterion("EX_ORDER_ID_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexEqualTo(Long value) {
            addCriterion("EX_ORDER_ID_INDEX =", value, "exOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexNotEqualTo(Long value) {
            addCriterion("EX_ORDER_ID_INDEX <>", value, "exOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexGreaterThan(Long value) {
            addCriterion("EX_ORDER_ID_INDEX >", value, "exOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexGreaterThanOrEqualTo(Long value) {
            addCriterion("EX_ORDER_ID_INDEX >=", value, "exOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexLessThan(Long value) {
            addCriterion("EX_ORDER_ID_INDEX <", value, "exOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexLessThanOrEqualTo(Long value) {
            addCriterion("EX_ORDER_ID_INDEX <=", value, "exOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexIn(List<Long> values) {
            addCriterion("EX_ORDER_ID_INDEX in", values, "exOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexNotIn(List<Long> values) {
            addCriterion("EX_ORDER_ID_INDEX not in", values, "exOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexBetween(Long value1, Long value2) {
            addCriterion("EX_ORDER_ID_INDEX between", value1, value2, "exOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIndexNotBetween(Long value1, Long value2) {
            addCriterion("EX_ORDER_ID_INDEX not between", value1, value2, "exOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIsNull() {
            addCriterion("EX_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIsNotNull() {
            addCriterion("EX_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExOrderIdEqualTo(String value) {
            addCriterion("EX_ORDER_ID =", value, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdNotEqualTo(String value) {
            addCriterion("EX_ORDER_ID <>", value, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdGreaterThan(String value) {
            addCriterion("EX_ORDER_ID >", value, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("EX_ORDER_ID >=", value, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdLessThan(String value) {
            addCriterion("EX_ORDER_ID <", value, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdLessThanOrEqualTo(String value) {
            addCriterion("EX_ORDER_ID <=", value, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdLike(String value) {
            addCriterion("EX_ORDER_ID like", value, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdNotLike(String value) {
            addCriterion("EX_ORDER_ID not like", value, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdIn(List<String> values) {
            addCriterion("EX_ORDER_ID in", values, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdNotIn(List<String> values) {
            addCriterion("EX_ORDER_ID not in", values, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdBetween(String value1, String value2) {
            addCriterion("EX_ORDER_ID between", value1, value2, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andExOrderIdNotBetween(String value1, String value2) {
            addCriterion("EX_ORDER_ID not between", value1, value2, "exOrderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdIsNull() {
            addCriterion("RTORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andRtorderIdIsNotNull() {
            addCriterion("RTORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRtorderIdEqualTo(String value) {
            addCriterion("RTORDER_ID =", value, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdNotEqualTo(String value) {
            addCriterion("RTORDER_ID <>", value, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdGreaterThan(String value) {
            addCriterion("RTORDER_ID >", value, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdGreaterThanOrEqualTo(String value) {
            addCriterion("RTORDER_ID >=", value, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdLessThan(String value) {
            addCriterion("RTORDER_ID <", value, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdLessThanOrEqualTo(String value) {
            addCriterion("RTORDER_ID <=", value, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdLike(String value) {
            addCriterion("RTORDER_ID like", value, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdNotLike(String value) {
            addCriterion("RTORDER_ID not like", value, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdIn(List<String> values) {
            addCriterion("RTORDER_ID in", values, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdNotIn(List<String> values) {
            addCriterion("RTORDER_ID not in", values, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdBetween(String value1, String value2) {
            addCriterion("RTORDER_ID between", value1, value2, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderIdNotBetween(String value1, String value2) {
            addCriterion("RTORDER_ID not between", value1, value2, "rtorderId");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeIsNull() {
            addCriterion("RTORDER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeIsNotNull() {
            addCriterion("RTORDER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeEqualTo(String value) {
            addCriterion("RTORDER_CODE =", value, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeNotEqualTo(String value) {
            addCriterion("RTORDER_CODE <>", value, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeGreaterThan(String value) {
            addCriterion("RTORDER_CODE >", value, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RTORDER_CODE >=", value, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeLessThan(String value) {
            addCriterion("RTORDER_CODE <", value, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeLessThanOrEqualTo(String value) {
            addCriterion("RTORDER_CODE <=", value, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeLike(String value) {
            addCriterion("RTORDER_CODE like", value, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeNotLike(String value) {
            addCriterion("RTORDER_CODE not like", value, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeIn(List<String> values) {
            addCriterion("RTORDER_CODE in", values, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeNotIn(List<String> values) {
            addCriterion("RTORDER_CODE not in", values, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeBetween(String value1, String value2) {
            addCriterion("RTORDER_CODE between", value1, value2, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andRtorderCodeNotBetween(String value1, String value2) {
            addCriterion("RTORDER_CODE not between", value1, value2, "rtorderCode");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("UNIT_ID =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("UNIT_ID <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("UNIT_ID >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_ID >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("UNIT_ID <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("UNIT_ID <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("UNIT_ID like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("UNIT_ID not like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("UNIT_ID in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("UNIT_ID not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("UNIT_ID between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("UNIT_ID not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andToStationIdIsNull() {
            addCriterion("TO_STATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andToStationIdIsNotNull() {
            addCriterion("TO_STATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andToStationIdEqualTo(String value) {
            addCriterion("TO_STATION_ID =", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdNotEqualTo(String value) {
            addCriterion("TO_STATION_ID <>", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdGreaterThan(String value) {
            addCriterion("TO_STATION_ID >", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdGreaterThanOrEqualTo(String value) {
            addCriterion("TO_STATION_ID >=", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdLessThan(String value) {
            addCriterion("TO_STATION_ID <", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdLessThanOrEqualTo(String value) {
            addCriterion("TO_STATION_ID <=", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdLike(String value) {
            addCriterion("TO_STATION_ID like", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdNotLike(String value) {
            addCriterion("TO_STATION_ID not like", value, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdIn(List<String> values) {
            addCriterion("TO_STATION_ID in", values, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdNotIn(List<String> values) {
            addCriterion("TO_STATION_ID not in", values, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdBetween(String value1, String value2) {
            addCriterion("TO_STATION_ID between", value1, value2, "toStationId");
            return (Criteria) this;
        }

        public Criteria andToStationIdNotBetween(String value1, String value2) {
            addCriterion("TO_STATION_ID not between", value1, value2, "toStationId");
            return (Criteria) this;
        }

        public Criteria andPleaveDtIsNull() {
            addCriterion("PLEAVE_DT is null");
            return (Criteria) this;
        }

        public Criteria andPleaveDtIsNotNull() {
            addCriterion("PLEAVE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andPleaveDtEqualTo(Date value) {
            addCriterion("PLEAVE_DT =", value, "pleaveDt");
            return (Criteria) this;
        }

        public Criteria andPleaveDtNotEqualTo(Date value) {
            addCriterion("PLEAVE_DT <>", value, "pleaveDt");
            return (Criteria) this;
        }

        public Criteria andPleaveDtGreaterThan(Date value) {
            addCriterion("PLEAVE_DT >", value, "pleaveDt");
            return (Criteria) this;
        }

        public Criteria andPleaveDtGreaterThanOrEqualTo(Date value) {
            addCriterion("PLEAVE_DT >=", value, "pleaveDt");
            return (Criteria) this;
        }

        public Criteria andPleaveDtLessThan(Date value) {
            addCriterion("PLEAVE_DT <", value, "pleaveDt");
            return (Criteria) this;
        }

        public Criteria andPleaveDtLessThanOrEqualTo(Date value) {
            addCriterion("PLEAVE_DT <=", value, "pleaveDt");
            return (Criteria) this;
        }

        public Criteria andPleaveDtIn(List<Date> values) {
            addCriterion("PLEAVE_DT in", values, "pleaveDt");
            return (Criteria) this;
        }

        public Criteria andPleaveDtNotIn(List<Date> values) {
            addCriterion("PLEAVE_DT not in", values, "pleaveDt");
            return (Criteria) this;
        }

        public Criteria andPleaveDtBetween(Date value1, Date value2) {
            addCriterion("PLEAVE_DT between", value1, value2, "pleaveDt");
            return (Criteria) this;
        }

        public Criteria andPleaveDtNotBetween(Date value1, Date value2) {
            addCriterion("PLEAVE_DT not between", value1, value2, "pleaveDt");
            return (Criteria) this;
        }

        public Criteria andToStationNameIsNull() {
            addCriterion("TO_STATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andToStationNameIsNotNull() {
            addCriterion("TO_STATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andToStationNameEqualTo(String value) {
            addCriterion("TO_STATION_NAME =", value, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStationNameNotEqualTo(String value) {
            addCriterion("TO_STATION_NAME <>", value, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStationNameGreaterThan(String value) {
            addCriterion("TO_STATION_NAME >", value, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("TO_STATION_NAME >=", value, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStationNameLessThan(String value) {
            addCriterion("TO_STATION_NAME <", value, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStationNameLessThanOrEqualTo(String value) {
            addCriterion("TO_STATION_NAME <=", value, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStationNameLike(String value) {
            addCriterion("TO_STATION_NAME like", value, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStationNameNotLike(String value) {
            addCriterion("TO_STATION_NAME not like", value, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStationNameIn(List<String> values) {
            addCriterion("TO_STATION_NAME in", values, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStationNameNotIn(List<String> values) {
            addCriterion("TO_STATION_NAME not in", values, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStationNameBetween(String value1, String value2) {
            addCriterion("TO_STATION_NAME between", value1, value2, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStationNameNotBetween(String value1, String value2) {
            addCriterion("TO_STATION_NAME not between", value1, value2, "toStationName");
            return (Criteria) this;
        }

        public Criteria andToStation6codeIsNull() {
            addCriterion("TO_STATION_6CODE is null");
            return (Criteria) this;
        }

        public Criteria andToStation6codeIsNotNull() {
            addCriterion("TO_STATION_6CODE is not null");
            return (Criteria) this;
        }

        public Criteria andToStation6codeEqualTo(String value) {
            addCriterion("TO_STATION_6CODE =", value, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andToStation6codeNotEqualTo(String value) {
            addCriterion("TO_STATION_6CODE <>", value, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andToStation6codeGreaterThan(String value) {
            addCriterion("TO_STATION_6CODE >", value, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andToStation6codeGreaterThanOrEqualTo(String value) {
            addCriterion("TO_STATION_6CODE >=", value, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andToStation6codeLessThan(String value) {
            addCriterion("TO_STATION_6CODE <", value, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andToStation6codeLessThanOrEqualTo(String value) {
            addCriterion("TO_STATION_6CODE <=", value, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andToStation6codeLike(String value) {
            addCriterion("TO_STATION_6CODE like", value, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andToStation6codeNotLike(String value) {
            addCriterion("TO_STATION_6CODE not like", value, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andToStation6codeIn(List<String> values) {
            addCriterion("TO_STATION_6CODE in", values, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andToStation6codeNotIn(List<String> values) {
            addCriterion("TO_STATION_6CODE not in", values, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andToStation6codeBetween(String value1, String value2) {
            addCriterion("TO_STATION_6CODE between", value1, value2, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andToStation6codeNotBetween(String value1, String value2) {
            addCriterion("TO_STATION_6CODE not between", value1, value2, "toStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStationNameIsNull() {
            addCriterion("FROM_STATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFromStationNameIsNotNull() {
            addCriterion("FROM_STATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFromStationNameEqualTo(String value) {
            addCriterion("FROM_STATION_NAME =", value, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStationNameNotEqualTo(String value) {
            addCriterion("FROM_STATION_NAME <>", value, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStationNameGreaterThan(String value) {
            addCriterion("FROM_STATION_NAME >", value, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_STATION_NAME >=", value, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStationNameLessThan(String value) {
            addCriterion("FROM_STATION_NAME <", value, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStationNameLessThanOrEqualTo(String value) {
            addCriterion("FROM_STATION_NAME <=", value, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStationNameLike(String value) {
            addCriterion("FROM_STATION_NAME like", value, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStationNameNotLike(String value) {
            addCriterion("FROM_STATION_NAME not like", value, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStationNameIn(List<String> values) {
            addCriterion("FROM_STATION_NAME in", values, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStationNameNotIn(List<String> values) {
            addCriterion("FROM_STATION_NAME not in", values, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStationNameBetween(String value1, String value2) {
            addCriterion("FROM_STATION_NAME between", value1, value2, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStationNameNotBetween(String value1, String value2) {
            addCriterion("FROM_STATION_NAME not between", value1, value2, "fromStationName");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeIsNull() {
            addCriterion("FROM_STATION_6CODE is null");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeIsNotNull() {
            addCriterion("FROM_STATION_6CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeEqualTo(String value) {
            addCriterion("FROM_STATION_6CODE =", value, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeNotEqualTo(String value) {
            addCriterion("FROM_STATION_6CODE <>", value, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeGreaterThan(String value) {
            addCriterion("FROM_STATION_6CODE >", value, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_STATION_6CODE >=", value, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeLessThan(String value) {
            addCriterion("FROM_STATION_6CODE <", value, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeLessThanOrEqualTo(String value) {
            addCriterion("FROM_STATION_6CODE <=", value, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeLike(String value) {
            addCriterion("FROM_STATION_6CODE like", value, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeNotLike(String value) {
            addCriterion("FROM_STATION_6CODE not like", value, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeIn(List<String> values) {
            addCriterion("FROM_STATION_6CODE in", values, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeNotIn(List<String> values) {
            addCriterion("FROM_STATION_6CODE not in", values, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeBetween(String value1, String value2) {
            addCriterion("FROM_STATION_6CODE between", value1, value2, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andFromStation6codeNotBetween(String value1, String value2) {
            addCriterion("FROM_STATION_6CODE not between", value1, value2, "fromStation6code");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameIsNull() {
            addCriterion("TO_PROVINCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameIsNotNull() {
            addCriterion("TO_PROVINCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameEqualTo(String value) {
            addCriterion("TO_PROVINCE_NAME =", value, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameNotEqualTo(String value) {
            addCriterion("TO_PROVINCE_NAME <>", value, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameGreaterThan(String value) {
            addCriterion("TO_PROVINCE_NAME >", value, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("TO_PROVINCE_NAME >=", value, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameLessThan(String value) {
            addCriterion("TO_PROVINCE_NAME <", value, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("TO_PROVINCE_NAME <=", value, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameLike(String value) {
            addCriterion("TO_PROVINCE_NAME like", value, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameNotLike(String value) {
            addCriterion("TO_PROVINCE_NAME not like", value, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameIn(List<String> values) {
            addCriterion("TO_PROVINCE_NAME in", values, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameNotIn(List<String> values) {
            addCriterion("TO_PROVINCE_NAME not in", values, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameBetween(String value1, String value2) {
            addCriterion("TO_PROVINCE_NAME between", value1, value2, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvinceNameNotBetween(String value1, String value2) {
            addCriterion("TO_PROVINCE_NAME not between", value1, value2, "toProvinceName");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeIsNull() {
            addCriterion("TO_PROVINCE_6CODE is null");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeIsNotNull() {
            addCriterion("TO_PROVINCE_6CODE is not null");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeEqualTo(String value) {
            addCriterion("TO_PROVINCE_6CODE =", value, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeNotEqualTo(String value) {
            addCriterion("TO_PROVINCE_6CODE <>", value, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeGreaterThan(String value) {
            addCriterion("TO_PROVINCE_6CODE >", value, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeGreaterThanOrEqualTo(String value) {
            addCriterion("TO_PROVINCE_6CODE >=", value, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeLessThan(String value) {
            addCriterion("TO_PROVINCE_6CODE <", value, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeLessThanOrEqualTo(String value) {
            addCriterion("TO_PROVINCE_6CODE <=", value, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeLike(String value) {
            addCriterion("TO_PROVINCE_6CODE like", value, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeNotLike(String value) {
            addCriterion("TO_PROVINCE_6CODE not like", value, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeIn(List<String> values) {
            addCriterion("TO_PROVINCE_6CODE in", values, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeNotIn(List<String> values) {
            addCriterion("TO_PROVINCE_6CODE not in", values, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeBetween(String value1, String value2) {
            addCriterion("TO_PROVINCE_6CODE between", value1, value2, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andToProvince6codeNotBetween(String value1, String value2) {
            addCriterion("TO_PROVINCE_6CODE not between", value1, value2, "toProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameIsNull() {
            addCriterion("FROM_PROVINCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameIsNotNull() {
            addCriterion("FROM_PROVINCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameEqualTo(String value) {
            addCriterion("FROM_PROVINCE_NAME =", value, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameNotEqualTo(String value) {
            addCriterion("FROM_PROVINCE_NAME <>", value, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameGreaterThan(String value) {
            addCriterion("FROM_PROVINCE_NAME >", value, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_PROVINCE_NAME >=", value, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameLessThan(String value) {
            addCriterion("FROM_PROVINCE_NAME <", value, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("FROM_PROVINCE_NAME <=", value, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameLike(String value) {
            addCriterion("FROM_PROVINCE_NAME like", value, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameNotLike(String value) {
            addCriterion("FROM_PROVINCE_NAME not like", value, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameIn(List<String> values) {
            addCriterion("FROM_PROVINCE_NAME in", values, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameNotIn(List<String> values) {
            addCriterion("FROM_PROVINCE_NAME not in", values, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameBetween(String value1, String value2) {
            addCriterion("FROM_PROVINCE_NAME between", value1, value2, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNameNotBetween(String value1, String value2) {
            addCriterion("FROM_PROVINCE_NAME not between", value1, value2, "fromProvinceName");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeIsNull() {
            addCriterion("FROM_PROVINCE_6CODE is null");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeIsNotNull() {
            addCriterion("FROM_PROVINCE_6CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeEqualTo(String value) {
            addCriterion("FROM_PROVINCE_6CODE =", value, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeNotEqualTo(String value) {
            addCriterion("FROM_PROVINCE_6CODE <>", value, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeGreaterThan(String value) {
            addCriterion("FROM_PROVINCE_6CODE >", value, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_PROVINCE_6CODE >=", value, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeLessThan(String value) {
            addCriterion("FROM_PROVINCE_6CODE <", value, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeLessThanOrEqualTo(String value) {
            addCriterion("FROM_PROVINCE_6CODE <=", value, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeLike(String value) {
            addCriterion("FROM_PROVINCE_6CODE like", value, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeNotLike(String value) {
            addCriterion("FROM_PROVINCE_6CODE not like", value, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeIn(List<String> values) {
            addCriterion("FROM_PROVINCE_6CODE in", values, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeNotIn(List<String> values) {
            addCriterion("FROM_PROVINCE_6CODE not in", values, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeBetween(String value1, String value2) {
            addCriterion("FROM_PROVINCE_6CODE between", value1, value2, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andFromProvince6codeNotBetween(String value1, String value2) {
            addCriterion("FROM_PROVINCE_6CODE not between", value1, value2, "fromProvince6code");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoIsNull() {
            addCriterion("BUS_TICKET_NO is null");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoIsNotNull() {
            addCriterion("BUS_TICKET_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoEqualTo(String value) {
            addCriterion("BUS_TICKET_NO =", value, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoNotEqualTo(String value) {
            addCriterion("BUS_TICKET_NO <>", value, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoGreaterThan(String value) {
            addCriterion("BUS_TICKET_NO >", value, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoGreaterThanOrEqualTo(String value) {
            addCriterion("BUS_TICKET_NO >=", value, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoLessThan(String value) {
            addCriterion("BUS_TICKET_NO <", value, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoLessThanOrEqualTo(String value) {
            addCriterion("BUS_TICKET_NO <=", value, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoLike(String value) {
            addCriterion("BUS_TICKET_NO like", value, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoNotLike(String value) {
            addCriterion("BUS_TICKET_NO not like", value, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoIn(List<String> values) {
            addCriterion("BUS_TICKET_NO in", values, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoNotIn(List<String> values) {
            addCriterion("BUS_TICKET_NO not in", values, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoBetween(String value1, String value2) {
            addCriterion("BUS_TICKET_NO between", value1, value2, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andBusTicketNoNotBetween(String value1, String value2) {
            addCriterion("BUS_TICKET_NO not between", value1, value2, "busTicketNo");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonIsNull() {
            addCriterion("TICKET_FAIL_REASON is null");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonIsNotNull() {
            addCriterion("TICKET_FAIL_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonEqualTo(String value) {
            addCriterion("TICKET_FAIL_REASON =", value, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonNotEqualTo(String value) {
            addCriterion("TICKET_FAIL_REASON <>", value, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonGreaterThan(String value) {
            addCriterion("TICKET_FAIL_REASON >", value, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_FAIL_REASON >=", value, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonLessThan(String value) {
            addCriterion("TICKET_FAIL_REASON <", value, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonLessThanOrEqualTo(String value) {
            addCriterion("TICKET_FAIL_REASON <=", value, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonLike(String value) {
            addCriterion("TICKET_FAIL_REASON like", value, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonNotLike(String value) {
            addCriterion("TICKET_FAIL_REASON not like", value, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonIn(List<String> values) {
            addCriterion("TICKET_FAIL_REASON in", values, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonNotIn(List<String> values) {
            addCriterion("TICKET_FAIL_REASON not in", values, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonBetween(String value1, String value2) {
            addCriterion("TICKET_FAIL_REASON between", value1, value2, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketFailReasonNotBetween(String value1, String value2) {
            addCriterion("TICKET_FAIL_REASON not between", value1, value2, "ticketFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonIsNull() {
            addCriterion("TICKET_REFUND_FAIL_REASON is null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonIsNotNull() {
            addCriterion("TICKET_REFUND_FAIL_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonEqualTo(String value) {
            addCriterion("TICKET_REFUND_FAIL_REASON =", value, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonNotEqualTo(String value) {
            addCriterion("TICKET_REFUND_FAIL_REASON <>", value, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonGreaterThan(String value) {
            addCriterion("TICKET_REFUND_FAIL_REASON >", value, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_REFUND_FAIL_REASON >=", value, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonLessThan(String value) {
            addCriterion("TICKET_REFUND_FAIL_REASON <", value, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonLessThanOrEqualTo(String value) {
            addCriterion("TICKET_REFUND_FAIL_REASON <=", value, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonLike(String value) {
            addCriterion("TICKET_REFUND_FAIL_REASON like", value, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonNotLike(String value) {
            addCriterion("TICKET_REFUND_FAIL_REASON not like", value, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonIn(List<String> values) {
            addCriterion("TICKET_REFUND_FAIL_REASON in", values, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonNotIn(List<String> values) {
            addCriterion("TICKET_REFUND_FAIL_REASON not in", values, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonBetween(String value1, String value2) {
            addCriterion("TICKET_REFUND_FAIL_REASON between", value1, value2, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFailReasonNotBetween(String value1, String value2) {
            addCriterion("TICKET_REFUND_FAIL_REASON not between", value1, value2, "ticketRefundFailReason");
            return (Criteria) this;
        }

        public Criteria andTicketStatusIsNull() {
            addCriterion("TICKET_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTicketStatusIsNotNull() {
            addCriterion("TICKET_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTicketStatusEqualTo(String value) {
            addCriterion("TICKET_STATUS =", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusNotEqualTo(String value) {
            addCriterion("TICKET_STATUS <>", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusGreaterThan(String value) {
            addCriterion("TICKET_STATUS >", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_STATUS >=", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusLessThan(String value) {
            addCriterion("TICKET_STATUS <", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusLessThanOrEqualTo(String value) {
            addCriterion("TICKET_STATUS <=", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusLike(String value) {
            addCriterion("TICKET_STATUS like", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusNotLike(String value) {
            addCriterion("TICKET_STATUS not like", value, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusIn(List<String> values) {
            addCriterion("TICKET_STATUS in", values, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusNotIn(List<String> values) {
            addCriterion("TICKET_STATUS not in", values, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusBetween(String value1, String value2) {
            addCriterion("TICKET_STATUS between", value1, value2, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketStatusNotBetween(String value1, String value2) {
            addCriterion("TICKET_STATUS not between", value1, value2, "ticketStatus");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateIsNull() {
            addCriterion("TICKET_APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateIsNotNull() {
            addCriterion("TICKET_APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateEqualTo(Date value) {
            addCriterion("TICKET_APPLY_DATE =", value, "ticketApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateNotEqualTo(Date value) {
            addCriterion("TICKET_APPLY_DATE <>", value, "ticketApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateGreaterThan(Date value) {
            addCriterion("TICKET_APPLY_DATE >", value, "ticketApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_APPLY_DATE >=", value, "ticketApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateLessThan(Date value) {
            addCriterion("TICKET_APPLY_DATE <", value, "ticketApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_APPLY_DATE <=", value, "ticketApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateIn(List<Date> values) {
            addCriterion("TICKET_APPLY_DATE in", values, "ticketApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateNotIn(List<Date> values) {
            addCriterion("TICKET_APPLY_DATE not in", values, "ticketApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateBetween(Date value1, Date value2) {
            addCriterion("TICKET_APPLY_DATE between", value1, value2, "ticketApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_APPLY_DATE not between", value1, value2, "ticketApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateIsNull() {
            addCriterion("TICKET_CONFIRM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateIsNotNull() {
            addCriterion("TICKET_CONFIRM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateEqualTo(Date value) {
            addCriterion("TICKET_CONFIRM_DATE =", value, "ticketConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateNotEqualTo(Date value) {
            addCriterion("TICKET_CONFIRM_DATE <>", value, "ticketConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateGreaterThan(Date value) {
            addCriterion("TICKET_CONFIRM_DATE >", value, "ticketConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_CONFIRM_DATE >=", value, "ticketConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateLessThan(Date value) {
            addCriterion("TICKET_CONFIRM_DATE <", value, "ticketConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_CONFIRM_DATE <=", value, "ticketConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateIn(List<Date> values) {
            addCriterion("TICKET_CONFIRM_DATE in", values, "ticketConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateNotIn(List<Date> values) {
            addCriterion("TICKET_CONFIRM_DATE not in", values, "ticketConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateBetween(Date value1, Date value2) {
            addCriterion("TICKET_CONFIRM_DATE between", value1, value2, "ticketConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketConfirmDateNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_CONFIRM_DATE not between", value1, value2, "ticketConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusIsNull() {
            addCriterion("TICKET_REC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusIsNotNull() {
            addCriterion("TICKET_REC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusEqualTo(String value) {
            addCriterion("TICKET_REC_STATUS =", value, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusNotEqualTo(String value) {
            addCriterion("TICKET_REC_STATUS <>", value, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusGreaterThan(String value) {
            addCriterion("TICKET_REC_STATUS >", value, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_REC_STATUS >=", value, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusLessThan(String value) {
            addCriterion("TICKET_REC_STATUS <", value, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusLessThanOrEqualTo(String value) {
            addCriterion("TICKET_REC_STATUS <=", value, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusLike(String value) {
            addCriterion("TICKET_REC_STATUS like", value, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusNotLike(String value) {
            addCriterion("TICKET_REC_STATUS not like", value, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusIn(List<String> values) {
            addCriterion("TICKET_REC_STATUS in", values, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusNotIn(List<String> values) {
            addCriterion("TICKET_REC_STATUS not in", values, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusBetween(String value1, String value2) {
            addCriterion("TICKET_REC_STATUS between", value1, value2, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecStatusNotBetween(String value1, String value2) {
            addCriterion("TICKET_REC_STATUS not between", value1, value2, "ticketRecStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateIsNull() {
            addCriterion("TICKET_REC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateIsNotNull() {
            addCriterion("TICKET_REC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateEqualTo(Date value) {
            addCriterion("TICKET_REC_DATE =", value, "ticketRecDate");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateNotEqualTo(Date value) {
            addCriterion("TICKET_REC_DATE <>", value, "ticketRecDate");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateGreaterThan(Date value) {
            addCriterion("TICKET_REC_DATE >", value, "ticketRecDate");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_REC_DATE >=", value, "ticketRecDate");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateLessThan(Date value) {
            addCriterion("TICKET_REC_DATE <", value, "ticketRecDate");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_REC_DATE <=", value, "ticketRecDate");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateIn(List<Date> values) {
            addCriterion("TICKET_REC_DATE in", values, "ticketRecDate");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateNotIn(List<Date> values) {
            addCriterion("TICKET_REC_DATE not in", values, "ticketRecDate");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateBetween(Date value1, Date value2) {
            addCriterion("TICKET_REC_DATE between", value1, value2, "ticketRecDate");
            return (Criteria) this;
        }

        public Criteria andTicketRecDateNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_REC_DATE not between", value1, value2, "ticketRecDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusIsNull() {
            addCriterion("TICKET_REFUND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusIsNotNull() {
            addCriterion("TICKET_REFUND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusEqualTo(String value) {
            addCriterion("TICKET_REFUND_STATUS =", value, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusNotEqualTo(String value) {
            addCriterion("TICKET_REFUND_STATUS <>", value, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusGreaterThan(String value) {
            addCriterion("TICKET_REFUND_STATUS >", value, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_REFUND_STATUS >=", value, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusLessThan(String value) {
            addCriterion("TICKET_REFUND_STATUS <", value, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("TICKET_REFUND_STATUS <=", value, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusLike(String value) {
            addCriterion("TICKET_REFUND_STATUS like", value, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusNotLike(String value) {
            addCriterion("TICKET_REFUND_STATUS not like", value, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusIn(List<String> values) {
            addCriterion("TICKET_REFUND_STATUS in", values, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusNotIn(List<String> values) {
            addCriterion("TICKET_REFUND_STATUS not in", values, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusBetween(String value1, String value2) {
            addCriterion("TICKET_REFUND_STATUS between", value1, value2, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundStatusNotBetween(String value1, String value2) {
            addCriterion("TICKET_REFUND_STATUS not between", value1, value2, "ticketRefundStatus");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateIsNull() {
            addCriterion("TICKET_REFUND_APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateIsNotNull() {
            addCriterion("TICKET_REFUND_APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateEqualTo(Date value) {
            addCriterion("TICKET_REFUND_APPLY_DATE =", value, "ticketRefundApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateNotEqualTo(Date value) {
            addCriterion("TICKET_REFUND_APPLY_DATE <>", value, "ticketRefundApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateGreaterThan(Date value) {
            addCriterion("TICKET_REFUND_APPLY_DATE >", value, "ticketRefundApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_REFUND_APPLY_DATE >=", value, "ticketRefundApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateLessThan(Date value) {
            addCriterion("TICKET_REFUND_APPLY_DATE <", value, "ticketRefundApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_REFUND_APPLY_DATE <=", value, "ticketRefundApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateIn(List<Date> values) {
            addCriterion("TICKET_REFUND_APPLY_DATE in", values, "ticketRefundApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateNotIn(List<Date> values) {
            addCriterion("TICKET_REFUND_APPLY_DATE not in", values, "ticketRefundApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateBetween(Date value1, Date value2) {
            addCriterion("TICKET_REFUND_APPLY_DATE between", value1, value2, "ticketRefundApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_REFUND_APPLY_DATE not between", value1, value2, "ticketRefundApplyDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateIsNull() {
            addCriterion("TICKET_REFUND_CONFIRM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateIsNotNull() {
            addCriterion("TICKET_REFUND_CONFIRM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateEqualTo(Date value) {
            addCriterion("TICKET_REFUND_CONFIRM_DATE =", value, "ticketRefundConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateNotEqualTo(Date value) {
            addCriterion("TICKET_REFUND_CONFIRM_DATE <>", value, "ticketRefundConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateGreaterThan(Date value) {
            addCriterion("TICKET_REFUND_CONFIRM_DATE >", value, "ticketRefundConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_REFUND_CONFIRM_DATE >=", value, "ticketRefundConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateLessThan(Date value) {
            addCriterion("TICKET_REFUND_CONFIRM_DATE <", value, "ticketRefundConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_REFUND_CONFIRM_DATE <=", value, "ticketRefundConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateIn(List<Date> values) {
            addCriterion("TICKET_REFUND_CONFIRM_DATE in", values, "ticketRefundConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateNotIn(List<Date> values) {
            addCriterion("TICKET_REFUND_CONFIRM_DATE not in", values, "ticketRefundConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateBetween(Date value1, Date value2) {
            addCriterion("TICKET_REFUND_CONFIRM_DATE between", value1, value2, "ticketRefundConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundConfirmDateNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_REFUND_CONFIRM_DATE not between", value1, value2, "ticketRefundConfirmDate");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountIsNull() {
            addCriterion("TICKET_REFUND_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountIsNotNull() {
            addCriterion("TICKET_REFUND_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountEqualTo(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT =", value, "ticketRefundAmount");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountNotEqualTo(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT <>", value, "ticketRefundAmount");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountGreaterThan(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT >", value, "ticketRefundAmount");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT >=", value, "ticketRefundAmount");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountLessThan(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT <", value, "ticketRefundAmount");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountLessThanOrEqualTo(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT <=", value, "ticketRefundAmount");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountIn(List<Double> values) {
            addCriterion("TICKET_REFUND_AMOUNT in", values, "ticketRefundAmount");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountNotIn(List<Double> values) {
            addCriterion("TICKET_REFUND_AMOUNT not in", values, "ticketRefundAmount");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountBetween(Double value1, Double value2) {
            addCriterion("TICKET_REFUND_AMOUNT between", value1, value2, "ticketRefundAmount");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountNotBetween(Double value1, Double value2) {
            addCriterion("TICKET_REFUND_AMOUNT not between", value1, value2, "ticketRefundAmount");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNull() {
            addCriterion("TICKET_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNotNull() {
            addCriterion("TICKET_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceEqualTo(Double value) {
            addCriterion("TICKET_PRICE =", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotEqualTo(Double value) {
            addCriterion("TICKET_PRICE <>", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThan(Double value) {
            addCriterion("TICKET_PRICE >", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("TICKET_PRICE >=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThan(Double value) {
            addCriterion("TICKET_PRICE <", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThanOrEqualTo(Double value) {
            addCriterion("TICKET_PRICE <=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIn(List<Double> values) {
            addCriterion("TICKET_PRICE in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotIn(List<Double> values) {
            addCriterion("TICKET_PRICE not in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceBetween(Double value1, Double value2) {
            addCriterion("TICKET_PRICE between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotBetween(Double value1, Double value2) {
            addCriterion("TICKET_PRICE not between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountIsNull() {
            addCriterion("TICKET_PRICE_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountIsNotNull() {
            addCriterion("TICKET_PRICE_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountEqualTo(Double value) {
            addCriterion("TICKET_PRICE_DISCOUNT =", value, "ticketPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountNotEqualTo(Double value) {
            addCriterion("TICKET_PRICE_DISCOUNT <>", value, "ticketPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountGreaterThan(Double value) {
            addCriterion("TICKET_PRICE_DISCOUNT >", value, "ticketPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("TICKET_PRICE_DISCOUNT >=", value, "ticketPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountLessThan(Double value) {
            addCriterion("TICKET_PRICE_DISCOUNT <", value, "ticketPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountLessThanOrEqualTo(Double value) {
            addCriterion("TICKET_PRICE_DISCOUNT <=", value, "ticketPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountIn(List<Double> values) {
            addCriterion("TICKET_PRICE_DISCOUNT in", values, "ticketPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountNotIn(List<Double> values) {
            addCriterion("TICKET_PRICE_DISCOUNT not in", values, "ticketPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountBetween(Double value1, Double value2) {
            addCriterion("TICKET_PRICE_DISCOUNT between", value1, value2, "ticketPriceDiscount");
            return (Criteria) this;
        }

        public Criteria andTicketPriceDiscountNotBetween(Double value1, Double value2) {
            addCriterion("TICKET_PRICE_DISCOUNT not between", value1, value2, "ticketPriceDiscount");
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

        public Criteria andTicketRecRandomCodeIsNull() {
            addCriterion("TICKET_REC_RANDOM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeIsNotNull() {
            addCriterion("TICKET_REC_RANDOM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeEqualTo(String value) {
            addCriterion("TICKET_REC_RANDOM_CODE =", value, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeNotEqualTo(String value) {
            addCriterion("TICKET_REC_RANDOM_CODE <>", value, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeGreaterThan(String value) {
            addCriterion("TICKET_REC_RANDOM_CODE >", value, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_REC_RANDOM_CODE >=", value, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeLessThan(String value) {
            addCriterion("TICKET_REC_RANDOM_CODE <", value, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeLessThanOrEqualTo(String value) {
            addCriterion("TICKET_REC_RANDOM_CODE <=", value, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeLike(String value) {
            addCriterion("TICKET_REC_RANDOM_CODE like", value, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeNotLike(String value) {
            addCriterion("TICKET_REC_RANDOM_CODE not like", value, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeIn(List<String> values) {
            addCriterion("TICKET_REC_RANDOM_CODE in", values, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeNotIn(List<String> values) {
            addCriterion("TICKET_REC_RANDOM_CODE not in", values, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeBetween(String value1, String value2) {
            addCriterion("TICKET_REC_RANDOM_CODE between", value1, value2, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andTicketRecRandomCodeNotBetween(String value1, String value2) {
            addCriterion("TICKET_REC_RANDOM_CODE not between", value1, value2, "ticketRecRandomCode");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdIsNull() {
            addCriterion("ORDER_PACKAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdIsNotNull() {
            addCriterion("ORDER_PACKAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdEqualTo(String value) {
            addCriterion("ORDER_PACKAGE_ID =", value, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdNotEqualTo(String value) {
            addCriterion("ORDER_PACKAGE_ID <>", value, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdGreaterThan(String value) {
            addCriterion("ORDER_PACKAGE_ID >", value, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PACKAGE_ID >=", value, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdLessThan(String value) {
            addCriterion("ORDER_PACKAGE_ID <", value, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PACKAGE_ID <=", value, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdLike(String value) {
            addCriterion("ORDER_PACKAGE_ID like", value, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdNotLike(String value) {
            addCriterion("ORDER_PACKAGE_ID not like", value, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdIn(List<String> values) {
            addCriterion("ORDER_PACKAGE_ID in", values, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdNotIn(List<String> values) {
            addCriterion("ORDER_PACKAGE_ID not in", values, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdBetween(String value1, String value2) {
            addCriterion("ORDER_PACKAGE_ID between", value1, value2, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andOrderPackageIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_PACKAGE_ID not between", value1, value2, "orderPackageId");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecIsNull() {
            addCriterion("FACT_AMOUNT_REC is null");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecIsNotNull() {
            addCriterion("FACT_AMOUNT_REC is not null");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecEqualTo(Double value) {
            addCriterion("FACT_AMOUNT_REC =", value, "factAmountRec");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecNotEqualTo(Double value) {
            addCriterion("FACT_AMOUNT_REC <>", value, "factAmountRec");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecGreaterThan(Double value) {
            addCriterion("FACT_AMOUNT_REC >", value, "factAmountRec");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecGreaterThanOrEqualTo(Double value) {
            addCriterion("FACT_AMOUNT_REC >=", value, "factAmountRec");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecLessThan(Double value) {
            addCriterion("FACT_AMOUNT_REC <", value, "factAmountRec");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecLessThanOrEqualTo(Double value) {
            addCriterion("FACT_AMOUNT_REC <=", value, "factAmountRec");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecIn(List<Double> values) {
            addCriterion("FACT_AMOUNT_REC in", values, "factAmountRec");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecNotIn(List<Double> values) {
            addCriterion("FACT_AMOUNT_REC not in", values, "factAmountRec");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecBetween(Double value1, Double value2) {
            addCriterion("FACT_AMOUNT_REC between", value1, value2, "factAmountRec");
            return (Criteria) this;
        }

        public Criteria andFactAmountRecNotBetween(Double value1, Double value2) {
            addCriterion("FACT_AMOUNT_REC not between", value1, value2, "factAmountRec");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundIsNull() {
            addCriterion("FACT_AMOUNT_REFUND is null");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundIsNotNull() {
            addCriterion("FACT_AMOUNT_REFUND is not null");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundEqualTo(Double value) {
            addCriterion("FACT_AMOUNT_REFUND =", value, "factAmountRefund");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundNotEqualTo(Double value) {
            addCriterion("FACT_AMOUNT_REFUND <>", value, "factAmountRefund");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundGreaterThan(Double value) {
            addCriterion("FACT_AMOUNT_REFUND >", value, "factAmountRefund");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundGreaterThanOrEqualTo(Double value) {
            addCriterion("FACT_AMOUNT_REFUND >=", value, "factAmountRefund");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundLessThan(Double value) {
            addCriterion("FACT_AMOUNT_REFUND <", value, "factAmountRefund");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundLessThanOrEqualTo(Double value) {
            addCriterion("FACT_AMOUNT_REFUND <=", value, "factAmountRefund");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundIn(List<Double> values) {
            addCriterion("FACT_AMOUNT_REFUND in", values, "factAmountRefund");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundNotIn(List<Double> values) {
            addCriterion("FACT_AMOUNT_REFUND not in", values, "factAmountRefund");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundBetween(Double value1, Double value2) {
            addCriterion("FACT_AMOUNT_REFUND between", value1, value2, "factAmountRefund");
            return (Criteria) this;
        }

        public Criteria andFactAmountRefundNotBetween(Double value1, Double value2) {
            addCriterion("FACT_AMOUNT_REFUND not between", value1, value2, "factAmountRefund");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountIsNull() {
            addCriterion("EX_ORDER_TICKET_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountIsNotNull() {
            addCriterion("EX_ORDER_TICKET_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountEqualTo(Long value) {
            addCriterion("EX_ORDER_TICKET_COUNT =", value, "exOrderTicketCount");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountNotEqualTo(Long value) {
            addCriterion("EX_ORDER_TICKET_COUNT <>", value, "exOrderTicketCount");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountGreaterThan(Long value) {
            addCriterion("EX_ORDER_TICKET_COUNT >", value, "exOrderTicketCount");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountGreaterThanOrEqualTo(Long value) {
            addCriterion("EX_ORDER_TICKET_COUNT >=", value, "exOrderTicketCount");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountLessThan(Long value) {
            addCriterion("EX_ORDER_TICKET_COUNT <", value, "exOrderTicketCount");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountLessThanOrEqualTo(Long value) {
            addCriterion("EX_ORDER_TICKET_COUNT <=", value, "exOrderTicketCount");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountIn(List<Long> values) {
            addCriterion("EX_ORDER_TICKET_COUNT in", values, "exOrderTicketCount");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountNotIn(List<Long> values) {
            addCriterion("EX_ORDER_TICKET_COUNT not in", values, "exOrderTicketCount");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountBetween(Long value1, Long value2) {
            addCriterion("EX_ORDER_TICKET_COUNT between", value1, value2, "exOrderTicketCount");
            return (Criteria) this;
        }

        public Criteria andExOrderTicketCountNotBetween(Long value1, Long value2) {
            addCriterion("EX_ORDER_TICKET_COUNT not between", value1, value2, "exOrderTicketCount");
            return (Criteria) this;
        }

        public Criteria andPsgNameIsNull() {
            addCriterion("PSG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPsgNameIsNotNull() {
            addCriterion("PSG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPsgNameEqualTo(String value) {
            addCriterion("PSG_NAME =", value, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgNameNotEqualTo(String value) {
            addCriterion("PSG_NAME <>", value, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgNameGreaterThan(String value) {
            addCriterion("PSG_NAME >", value, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgNameGreaterThanOrEqualTo(String value) {
            addCriterion("PSG_NAME >=", value, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgNameLessThan(String value) {
            addCriterion("PSG_NAME <", value, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgNameLessThanOrEqualTo(String value) {
            addCriterion("PSG_NAME <=", value, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgNameLike(String value) {
            addCriterion("PSG_NAME like", value, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgNameNotLike(String value) {
            addCriterion("PSG_NAME not like", value, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgNameIn(List<String> values) {
            addCriterion("PSG_NAME in", values, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgNameNotIn(List<String> values) {
            addCriterion("PSG_NAME not in", values, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgNameBetween(String value1, String value2) {
            addCriterion("PSG_NAME between", value1, value2, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgNameNotBetween(String value1, String value2) {
            addCriterion("PSG_NAME not between", value1, value2, "psgName");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeIsNull() {
            addCriterion("PSG_CERTIFICATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeIsNotNull() {
            addCriterion("PSG_CERTIFICATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeEqualTo(String value) {
            addCriterion("PSG_CERTIFICATE_TYPE =", value, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeNotEqualTo(String value) {
            addCriterion("PSG_CERTIFICATE_TYPE <>", value, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeGreaterThan(String value) {
            addCriterion("PSG_CERTIFICATE_TYPE >", value, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PSG_CERTIFICATE_TYPE >=", value, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeLessThan(String value) {
            addCriterion("PSG_CERTIFICATE_TYPE <", value, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("PSG_CERTIFICATE_TYPE <=", value, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeLike(String value) {
            addCriterion("PSG_CERTIFICATE_TYPE like", value, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeNotLike(String value) {
            addCriterion("PSG_CERTIFICATE_TYPE not like", value, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeIn(List<String> values) {
            addCriterion("PSG_CERTIFICATE_TYPE in", values, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeNotIn(List<String> values) {
            addCriterion("PSG_CERTIFICATE_TYPE not in", values, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeBetween(String value1, String value2) {
            addCriterion("PSG_CERTIFICATE_TYPE between", value1, value2, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("PSG_CERTIFICATE_TYPE not between", value1, value2, "psgCertificateType");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoIsNull() {
            addCriterion("PSG_CERTIFICATE_NO is null");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoIsNotNull() {
            addCriterion("PSG_CERTIFICATE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoEqualTo(String value) {
            addCriterion("PSG_CERTIFICATE_NO =", value, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoNotEqualTo(String value) {
            addCriterion("PSG_CERTIFICATE_NO <>", value, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoGreaterThan(String value) {
            addCriterion("PSG_CERTIFICATE_NO >", value, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("PSG_CERTIFICATE_NO >=", value, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoLessThan(String value) {
            addCriterion("PSG_CERTIFICATE_NO <", value, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("PSG_CERTIFICATE_NO <=", value, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoLike(String value) {
            addCriterion("PSG_CERTIFICATE_NO like", value, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoNotLike(String value) {
            addCriterion("PSG_CERTIFICATE_NO not like", value, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoIn(List<String> values) {
            addCriterion("PSG_CERTIFICATE_NO in", values, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoNotIn(List<String> values) {
            addCriterion("PSG_CERTIFICATE_NO not in", values, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoBetween(String value1, String value2) {
            addCriterion("PSG_CERTIFICATE_NO between", value1, value2, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgCertificateNoNotBetween(String value1, String value2) {
            addCriterion("PSG_CERTIFICATE_NO not between", value1, value2, "psgCertificateNo");
            return (Criteria) this;
        }

        public Criteria andPsgMobileIsNull() {
            addCriterion("PSG_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andPsgMobileIsNotNull() {
            addCriterion("PSG_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andPsgMobileEqualTo(String value) {
            addCriterion("PSG_MOBILE =", value, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andPsgMobileNotEqualTo(String value) {
            addCriterion("PSG_MOBILE <>", value, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andPsgMobileGreaterThan(String value) {
            addCriterion("PSG_MOBILE >", value, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andPsgMobileGreaterThanOrEqualTo(String value) {
            addCriterion("PSG_MOBILE >=", value, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andPsgMobileLessThan(String value) {
            addCriterion("PSG_MOBILE <", value, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andPsgMobileLessThanOrEqualTo(String value) {
            addCriterion("PSG_MOBILE <=", value, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andPsgMobileLike(String value) {
            addCriterion("PSG_MOBILE like", value, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andPsgMobileNotLike(String value) {
            addCriterion("PSG_MOBILE not like", value, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andPsgMobileIn(List<String> values) {
            addCriterion("PSG_MOBILE in", values, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andPsgMobileNotIn(List<String> values) {
            addCriterion("PSG_MOBILE not in", values, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andPsgMobileBetween(String value1, String value2) {
            addCriterion("PSG_MOBILE between", value1, value2, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andPsgMobileNotBetween(String value1, String value2) {
            addCriterion("PSG_MOBILE not between", value1, value2, "psgMobile");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderIsNull() {
            addCriterion("IS_TEST_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderIsNotNull() {
            addCriterion("IS_TEST_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderEqualTo(String value) {
            addCriterion("IS_TEST_ORDER =", value, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderNotEqualTo(String value) {
            addCriterion("IS_TEST_ORDER <>", value, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderGreaterThan(String value) {
            addCriterion("IS_TEST_ORDER >", value, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TEST_ORDER >=", value, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderLessThan(String value) {
            addCriterion("IS_TEST_ORDER <", value, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderLessThanOrEqualTo(String value) {
            addCriterion("IS_TEST_ORDER <=", value, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderLike(String value) {
            addCriterion("IS_TEST_ORDER like", value, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderNotLike(String value) {
            addCriterion("IS_TEST_ORDER not like", value, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderIn(List<String> values) {
            addCriterion("IS_TEST_ORDER in", values, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderNotIn(List<String> values) {
            addCriterion("IS_TEST_ORDER not in", values, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderBetween(String value1, String value2) {
            addCriterion("IS_TEST_ORDER between", value1, value2, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andIsTestOrderNotBetween(String value1, String value2) {
            addCriterion("IS_TEST_ORDER not between", value1, value2, "isTestOrder");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameIsNull() {
            addCriterion("REC_TICKET_CHANEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameIsNotNull() {
            addCriterion("REC_TICKET_CHANEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameEqualTo(String value) {
            addCriterion("REC_TICKET_CHANEL_NAME =", value, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameNotEqualTo(String value) {
            addCriterion("REC_TICKET_CHANEL_NAME <>", value, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameGreaterThan(String value) {
            addCriterion("REC_TICKET_CHANEL_NAME >", value, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameGreaterThanOrEqualTo(String value) {
            addCriterion("REC_TICKET_CHANEL_NAME >=", value, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameLessThan(String value) {
            addCriterion("REC_TICKET_CHANEL_NAME <", value, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameLessThanOrEqualTo(String value) {
            addCriterion("REC_TICKET_CHANEL_NAME <=", value, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameLike(String value) {
            addCriterion("REC_TICKET_CHANEL_NAME like", value, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameNotLike(String value) {
            addCriterion("REC_TICKET_CHANEL_NAME not like", value, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameIn(List<String> values) {
            addCriterion("REC_TICKET_CHANEL_NAME in", values, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameNotIn(List<String> values) {
            addCriterion("REC_TICKET_CHANEL_NAME not in", values, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameBetween(String value1, String value2) {
            addCriterion("REC_TICKET_CHANEL_NAME between", value1, value2, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelNameNotBetween(String value1, String value2) {
            addCriterion("REC_TICKET_CHANEL_NAME not between", value1, value2, "recTicketChanelName");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdIsNull() {
            addCriterion("REC_TICKET_CHANEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdIsNotNull() {
            addCriterion("REC_TICKET_CHANEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdEqualTo(Long value) {
            addCriterion("REC_TICKET_CHANEL_ID =", value, "recTicketChanelId");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdNotEqualTo(Long value) {
            addCriterion("REC_TICKET_CHANEL_ID <>", value, "recTicketChanelId");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdGreaterThan(Long value) {
            addCriterion("REC_TICKET_CHANEL_ID >", value, "recTicketChanelId");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REC_TICKET_CHANEL_ID >=", value, "recTicketChanelId");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdLessThan(Long value) {
            addCriterion("REC_TICKET_CHANEL_ID <", value, "recTicketChanelId");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdLessThanOrEqualTo(Long value) {
            addCriterion("REC_TICKET_CHANEL_ID <=", value, "recTicketChanelId");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdIn(List<Long> values) {
            addCriterion("REC_TICKET_CHANEL_ID in", values, "recTicketChanelId");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdNotIn(List<Long> values) {
            addCriterion("REC_TICKET_CHANEL_ID not in", values, "recTicketChanelId");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdBetween(Long value1, Long value2) {
            addCriterion("REC_TICKET_CHANEL_ID between", value1, value2, "recTicketChanelId");
            return (Criteria) this;
        }

        public Criteria andRecTicketChanelIdNotBetween(Long value1, Long value2) {
            addCriterion("REC_TICKET_CHANEL_ID not between", value1, value2, "recTicketChanelId");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameIsNull() {
            addCriterion("TICKET_GATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameIsNotNull() {
            addCriterion("TICKET_GATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameEqualTo(String value) {
            addCriterion("TICKET_GATE_NAME =", value, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameNotEqualTo(String value) {
            addCriterion("TICKET_GATE_NAME <>", value, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameGreaterThan(String value) {
            addCriterion("TICKET_GATE_NAME >", value, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_GATE_NAME >=", value, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameLessThan(String value) {
            addCriterion("TICKET_GATE_NAME <", value, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameLessThanOrEqualTo(String value) {
            addCriterion("TICKET_GATE_NAME <=", value, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameLike(String value) {
            addCriterion("TICKET_GATE_NAME like", value, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameNotLike(String value) {
            addCriterion("TICKET_GATE_NAME not like", value, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameIn(List<String> values) {
            addCriterion("TICKET_GATE_NAME in", values, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameNotIn(List<String> values) {
            addCriterion("TICKET_GATE_NAME not in", values, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameBetween(String value1, String value2) {
            addCriterion("TICKET_GATE_NAME between", value1, value2, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketGateNameNotBetween(String value1, String value2) {
            addCriterion("TICKET_GATE_NAME not between", value1, value2, "ticketGateName");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqIsNull() {
            addCriterion("TICKET_SEAT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqIsNotNull() {
            addCriterion("TICKET_SEAT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqEqualTo(String value) {
            addCriterion("TICKET_SEAT_SEQ =", value, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqNotEqualTo(String value) {
            addCriterion("TICKET_SEAT_SEQ <>", value, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqGreaterThan(String value) {
            addCriterion("TICKET_SEAT_SEQ >", value, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_SEAT_SEQ >=", value, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqLessThan(String value) {
            addCriterion("TICKET_SEAT_SEQ <", value, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqLessThanOrEqualTo(String value) {
            addCriterion("TICKET_SEAT_SEQ <=", value, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqLike(String value) {
            addCriterion("TICKET_SEAT_SEQ like", value, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqNotLike(String value) {
            addCriterion("TICKET_SEAT_SEQ not like", value, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqIn(List<String> values) {
            addCriterion("TICKET_SEAT_SEQ in", values, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqNotIn(List<String> values) {
            addCriterion("TICKET_SEAT_SEQ not in", values, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqBetween(String value1, String value2) {
            addCriterion("TICKET_SEAT_SEQ between", value1, value2, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketSeatSeqNotBetween(String value1, String value2) {
            addCriterion("TICKET_SEAT_SEQ not between", value1, value2, "ticketSeatSeq");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameIsNull() {
            addCriterion("TICKET_USER_DISPLAY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameIsNotNull() {
            addCriterion("TICKET_USER_DISPLAY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameEqualTo(String value) {
            addCriterion("TICKET_USER_DISPLAY_NAME =", value, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameNotEqualTo(String value) {
            addCriterion("TICKET_USER_DISPLAY_NAME <>", value, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameGreaterThan(String value) {
            addCriterion("TICKET_USER_DISPLAY_NAME >", value, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_USER_DISPLAY_NAME >=", value, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameLessThan(String value) {
            addCriterion("TICKET_USER_DISPLAY_NAME <", value, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("TICKET_USER_DISPLAY_NAME <=", value, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameLike(String value) {
            addCriterion("TICKET_USER_DISPLAY_NAME like", value, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameNotLike(String value) {
            addCriterion("TICKET_USER_DISPLAY_NAME not like", value, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameIn(List<String> values) {
            addCriterion("TICKET_USER_DISPLAY_NAME in", values, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameNotIn(List<String> values) {
            addCriterion("TICKET_USER_DISPLAY_NAME not in", values, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameBetween(String value1, String value2) {
            addCriterion("TICKET_USER_DISPLAY_NAME between", value1, value2, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserDisplayNameNotBetween(String value1, String value2) {
            addCriterion("TICKET_USER_DISPLAY_NAME not between", value1, value2, "ticketUserDisplayName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameIsNull() {
            addCriterion("TICKET_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameIsNotNull() {
            addCriterion("TICKET_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameEqualTo(String value) {
            addCriterion("TICKET_USER_NAME =", value, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameNotEqualTo(String value) {
            addCriterion("TICKET_USER_NAME <>", value, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameGreaterThan(String value) {
            addCriterion("TICKET_USER_NAME >", value, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_USER_NAME >=", value, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameLessThan(String value) {
            addCriterion("TICKET_USER_NAME <", value, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameLessThanOrEqualTo(String value) {
            addCriterion("TICKET_USER_NAME <=", value, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameLike(String value) {
            addCriterion("TICKET_USER_NAME like", value, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameNotLike(String value) {
            addCriterion("TICKET_USER_NAME not like", value, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameIn(List<String> values) {
            addCriterion("TICKET_USER_NAME in", values, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameNotIn(List<String> values) {
            addCriterion("TICKET_USER_NAME not in", values, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameBetween(String value1, String value2) {
            addCriterion("TICKET_USER_NAME between", value1, value2, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketUserNameNotBetween(String value1, String value2) {
            addCriterion("TICKET_USER_NAME not between", value1, value2, "ticketUserName");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpIsNull() {
            addCriterion("TICKET_SALE_CORP is null");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpIsNotNull() {
            addCriterion("TICKET_SALE_CORP is not null");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpEqualTo(String value) {
            addCriterion("TICKET_SALE_CORP =", value, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpNotEqualTo(String value) {
            addCriterion("TICKET_SALE_CORP <>", value, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpGreaterThan(String value) {
            addCriterion("TICKET_SALE_CORP >", value, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_SALE_CORP >=", value, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpLessThan(String value) {
            addCriterion("TICKET_SALE_CORP <", value, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpLessThanOrEqualTo(String value) {
            addCriterion("TICKET_SALE_CORP <=", value, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpLike(String value) {
            addCriterion("TICKET_SALE_CORP like", value, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpNotLike(String value) {
            addCriterion("TICKET_SALE_CORP not like", value, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpIn(List<String> values) {
            addCriterion("TICKET_SALE_CORP in", values, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpNotIn(List<String> values) {
            addCriterion("TICKET_SALE_CORP not in", values, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpBetween(String value1, String value2) {
            addCriterion("TICKET_SALE_CORP between", value1, value2, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketSaleCorpNotBetween(String value1, String value2) {
            addCriterion("TICKET_SALE_CORP not between", value1, value2, "ticketSaleCorp");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrIsNull() {
            addCriterion("TICKET_STATION_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrIsNotNull() {
            addCriterion("TICKET_STATION_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrEqualTo(String value) {
            addCriterion("TICKET_STATION_ADDR =", value, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrNotEqualTo(String value) {
            addCriterion("TICKET_STATION_ADDR <>", value, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrGreaterThan(String value) {
            addCriterion("TICKET_STATION_ADDR >", value, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_STATION_ADDR >=", value, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrLessThan(String value) {
            addCriterion("TICKET_STATION_ADDR <", value, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrLessThanOrEqualTo(String value) {
            addCriterion("TICKET_STATION_ADDR <=", value, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrLike(String value) {
            addCriterion("TICKET_STATION_ADDR like", value, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrNotLike(String value) {
            addCriterion("TICKET_STATION_ADDR not like", value, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrIn(List<String> values) {
            addCriterion("TICKET_STATION_ADDR in", values, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrNotIn(List<String> values) {
            addCriterion("TICKET_STATION_ADDR not in", values, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrBetween(String value1, String value2) {
            addCriterion("TICKET_STATION_ADDR between", value1, value2, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketStationAddrNotBetween(String value1, String value2) {
            addCriterion("TICKET_STATION_ADDR not between", value1, value2, "ticketStationAddr");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNull() {
            addCriterion("TICKET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNotNull() {
            addCriterion("TICKET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeEqualTo(String value) {
            addCriterion("TICKET_TYPE =", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotEqualTo(String value) {
            addCriterion("TICKET_TYPE <>", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThan(String value) {
            addCriterion("TICKET_TYPE >", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_TYPE >=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThan(String value) {
            addCriterion("TICKET_TYPE <", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThanOrEqualTo(String value) {
            addCriterion("TICKET_TYPE <=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLike(String value) {
            addCriterion("TICKET_TYPE like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotLike(String value) {
            addCriterion("TICKET_TYPE not like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIn(List<String> values) {
            addCriterion("TICKET_TYPE in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotIn(List<String> values) {
            addCriterion("TICKET_TYPE not in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeBetween(String value1, String value2) {
            addCriterion("TICKET_TYPE between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotBetween(String value1, String value2) {
            addCriterion("TICKET_TYPE not between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeIsNull() {
            addCriterion("TICKET_SALE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeIsNotNull() {
            addCriterion("TICKET_SALE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeEqualTo(String value) {
            addCriterion("TICKET_SALE_TIME =", value, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeNotEqualTo(String value) {
            addCriterion("TICKET_SALE_TIME <>", value, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeGreaterThan(String value) {
            addCriterion("TICKET_SALE_TIME >", value, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_SALE_TIME >=", value, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeLessThan(String value) {
            addCriterion("TICKET_SALE_TIME <", value, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeLessThanOrEqualTo(String value) {
            addCriterion("TICKET_SALE_TIME <=", value, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeLike(String value) {
            addCriterion("TICKET_SALE_TIME like", value, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeNotLike(String value) {
            addCriterion("TICKET_SALE_TIME not like", value, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeIn(List<String> values) {
            addCriterion("TICKET_SALE_TIME in", values, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeNotIn(List<String> values) {
            addCriterion("TICKET_SALE_TIME not in", values, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeBetween(String value1, String value2) {
            addCriterion("TICKET_SALE_TIME between", value1, value2, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andTicketSaleTimeNotBetween(String value1, String value2) {
            addCriterion("TICKET_SALE_TIME not between", value1, value2, "ticketSaleTime");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdIsNull() {
            addCriterion("REC_TICKET_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdIsNotNull() {
            addCriterion("REC_TICKET_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdEqualTo(Long value) {
            addCriterion("REC_TICKET_USER_ID =", value, "recTicketUserId");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdNotEqualTo(Long value) {
            addCriterion("REC_TICKET_USER_ID <>", value, "recTicketUserId");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdGreaterThan(Long value) {
            addCriterion("REC_TICKET_USER_ID >", value, "recTicketUserId");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REC_TICKET_USER_ID >=", value, "recTicketUserId");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdLessThan(Long value) {
            addCriterion("REC_TICKET_USER_ID <", value, "recTicketUserId");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdLessThanOrEqualTo(Long value) {
            addCriterion("REC_TICKET_USER_ID <=", value, "recTicketUserId");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdIn(List<Long> values) {
            addCriterion("REC_TICKET_USER_ID in", values, "recTicketUserId");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdNotIn(List<Long> values) {
            addCriterion("REC_TICKET_USER_ID not in", values, "recTicketUserId");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdBetween(Long value1, Long value2) {
            addCriterion("REC_TICKET_USER_ID between", value1, value2, "recTicketUserId");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserIdNotBetween(Long value1, Long value2) {
            addCriterion("REC_TICKET_USER_ID not between", value1, value2, "recTicketUserId");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameIsNull() {
            addCriterion("REC_TICKET_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameIsNotNull() {
            addCriterion("REC_TICKET_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameEqualTo(String value) {
            addCriterion("REC_TICKET_USER_NAME =", value, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameNotEqualTo(String value) {
            addCriterion("REC_TICKET_USER_NAME <>", value, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameGreaterThan(String value) {
            addCriterion("REC_TICKET_USER_NAME >", value, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("REC_TICKET_USER_NAME >=", value, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameLessThan(String value) {
            addCriterion("REC_TICKET_USER_NAME <", value, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameLessThanOrEqualTo(String value) {
            addCriterion("REC_TICKET_USER_NAME <=", value, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameLike(String value) {
            addCriterion("REC_TICKET_USER_NAME like", value, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameNotLike(String value) {
            addCriterion("REC_TICKET_USER_NAME not like", value, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameIn(List<String> values) {
            addCriterion("REC_TICKET_USER_NAME in", values, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameNotIn(List<String> values) {
            addCriterion("REC_TICKET_USER_NAME not in", values, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameBetween(String value1, String value2) {
            addCriterion("REC_TICKET_USER_NAME between", value1, value2, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andRecTicketUserNameNotBetween(String value1, String value2) {
            addCriterion("REC_TICKET_USER_NAME not between", value1, value2, "recTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdIsNull() {
            addCriterion("CONFIRM_TICKET_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdIsNotNull() {
            addCriterion("CONFIRM_TICKET_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdEqualTo(Long value) {
            addCriterion("CONFIRM_TICKET_USER_ID =", value, "confirmTicketUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdNotEqualTo(Long value) {
            addCriterion("CONFIRM_TICKET_USER_ID <>", value, "confirmTicketUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdGreaterThan(Long value) {
            addCriterion("CONFIRM_TICKET_USER_ID >", value, "confirmTicketUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONFIRM_TICKET_USER_ID >=", value, "confirmTicketUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdLessThan(Long value) {
            addCriterion("CONFIRM_TICKET_USER_ID <", value, "confirmTicketUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdLessThanOrEqualTo(Long value) {
            addCriterion("CONFIRM_TICKET_USER_ID <=", value, "confirmTicketUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdIn(List<Long> values) {
            addCriterion("CONFIRM_TICKET_USER_ID in", values, "confirmTicketUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdNotIn(List<Long> values) {
            addCriterion("CONFIRM_TICKET_USER_ID not in", values, "confirmTicketUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdBetween(Long value1, Long value2) {
            addCriterion("CONFIRM_TICKET_USER_ID between", value1, value2, "confirmTicketUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserIdNotBetween(Long value1, Long value2) {
            addCriterion("CONFIRM_TICKET_USER_ID not between", value1, value2, "confirmTicketUserId");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameIsNull() {
            addCriterion("CONFIRM_TICKET_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameIsNotNull() {
            addCriterion("CONFIRM_TICKET_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameEqualTo(String value) {
            addCriterion("CONFIRM_TICKET_USER_NAME =", value, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameNotEqualTo(String value) {
            addCriterion("CONFIRM_TICKET_USER_NAME <>", value, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameGreaterThan(String value) {
            addCriterion("CONFIRM_TICKET_USER_NAME >", value, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_TICKET_USER_NAME >=", value, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameLessThan(String value) {
            addCriterion("CONFIRM_TICKET_USER_NAME <", value, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_TICKET_USER_NAME <=", value, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameLike(String value) {
            addCriterion("CONFIRM_TICKET_USER_NAME like", value, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameNotLike(String value) {
            addCriterion("CONFIRM_TICKET_USER_NAME not like", value, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameIn(List<String> values) {
            addCriterion("CONFIRM_TICKET_USER_NAME in", values, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameNotIn(List<String> values) {
            addCriterion("CONFIRM_TICKET_USER_NAME not in", values, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameBetween(String value1, String value2) {
            addCriterion("CONFIRM_TICKET_USER_NAME between", value1, value2, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andConfirmTicketUserNameNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_TICKET_USER_NAME not between", value1, value2, "confirmTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdIsNull() {
            addCriterion("FAIL_TICKET_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdIsNotNull() {
            addCriterion("FAIL_TICKET_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdEqualTo(Long value) {
            addCriterion("FAIL_TICKET_USER_ID =", value, "failTicketUserId");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdNotEqualTo(Long value) {
            addCriterion("FAIL_TICKET_USER_ID <>", value, "failTicketUserId");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdGreaterThan(Long value) {
            addCriterion("FAIL_TICKET_USER_ID >", value, "failTicketUserId");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FAIL_TICKET_USER_ID >=", value, "failTicketUserId");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdLessThan(Long value) {
            addCriterion("FAIL_TICKET_USER_ID <", value, "failTicketUserId");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdLessThanOrEqualTo(Long value) {
            addCriterion("FAIL_TICKET_USER_ID <=", value, "failTicketUserId");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdIn(List<Long> values) {
            addCriterion("FAIL_TICKET_USER_ID in", values, "failTicketUserId");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdNotIn(List<Long> values) {
            addCriterion("FAIL_TICKET_USER_ID not in", values, "failTicketUserId");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdBetween(Long value1, Long value2) {
            addCriterion("FAIL_TICKET_USER_ID between", value1, value2, "failTicketUserId");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserIdNotBetween(Long value1, Long value2) {
            addCriterion("FAIL_TICKET_USER_ID not between", value1, value2, "failTicketUserId");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameIsNull() {
            addCriterion("FAIL_TICKET_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameIsNotNull() {
            addCriterion("FAIL_TICKET_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameEqualTo(String value) {
            addCriterion("FAIL_TICKET_USER_NAME =", value, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameNotEqualTo(String value) {
            addCriterion("FAIL_TICKET_USER_NAME <>", value, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameGreaterThan(String value) {
            addCriterion("FAIL_TICKET_USER_NAME >", value, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("FAIL_TICKET_USER_NAME >=", value, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameLessThan(String value) {
            addCriterion("FAIL_TICKET_USER_NAME <", value, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameLessThanOrEqualTo(String value) {
            addCriterion("FAIL_TICKET_USER_NAME <=", value, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameLike(String value) {
            addCriterion("FAIL_TICKET_USER_NAME like", value, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameNotLike(String value) {
            addCriterion("FAIL_TICKET_USER_NAME not like", value, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameIn(List<String> values) {
            addCriterion("FAIL_TICKET_USER_NAME in", values, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameNotIn(List<String> values) {
            addCriterion("FAIL_TICKET_USER_NAME not in", values, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameBetween(String value1, String value2) {
            addCriterion("FAIL_TICKET_USER_NAME between", value1, value2, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andFailTicketUserNameNotBetween(String value1, String value2) {
            addCriterion("FAIL_TICKET_USER_NAME not between", value1, value2, "failTicketUserName");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountIsNull() {
            addCriterion("INVALID_PRINT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountIsNotNull() {
            addCriterion("INVALID_PRINT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountEqualTo(Long value) {
            addCriterion("INVALID_PRINT_COUNT =", value, "invalidPrintCount");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountNotEqualTo(Long value) {
            addCriterion("INVALID_PRINT_COUNT <>", value, "invalidPrintCount");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountGreaterThan(Long value) {
            addCriterion("INVALID_PRINT_COUNT >", value, "invalidPrintCount");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountGreaterThanOrEqualTo(Long value) {
            addCriterion("INVALID_PRINT_COUNT >=", value, "invalidPrintCount");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountLessThan(Long value) {
            addCriterion("INVALID_PRINT_COUNT <", value, "invalidPrintCount");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountLessThanOrEqualTo(Long value) {
            addCriterion("INVALID_PRINT_COUNT <=", value, "invalidPrintCount");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountIn(List<Long> values) {
            addCriterion("INVALID_PRINT_COUNT in", values, "invalidPrintCount");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountNotIn(List<Long> values) {
            addCriterion("INVALID_PRINT_COUNT not in", values, "invalidPrintCount");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountBetween(Long value1, Long value2) {
            addCriterion("INVALID_PRINT_COUNT between", value1, value2, "invalidPrintCount");
            return (Criteria) this;
        }

        public Criteria andInvalidPrintCountNotBetween(Long value1, Long value2) {
            addCriterion("INVALID_PRINT_COUNT not between", value1, value2, "invalidPrintCount");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameIsNull() {
            addCriterion("SYS_CODE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameIsNotNull() {
            addCriterion("SYS_CODE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameEqualTo(String value) {
            addCriterion("SYS_CODE_NAME =", value, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameNotEqualTo(String value) {
            addCriterion("SYS_CODE_NAME <>", value, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameGreaterThan(String value) {
            addCriterion("SYS_CODE_NAME >", value, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_CODE_NAME >=", value, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameLessThan(String value) {
            addCriterion("SYS_CODE_NAME <", value, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_CODE_NAME <=", value, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameLike(String value) {
            addCriterion("SYS_CODE_NAME like", value, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameNotLike(String value) {
            addCriterion("SYS_CODE_NAME not like", value, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameIn(List<String> values) {
            addCriterion("SYS_CODE_NAME in", values, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameNotIn(List<String> values) {
            addCriterion("SYS_CODE_NAME not in", values, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameBetween(String value1, String value2) {
            addCriterion("SYS_CODE_NAME between", value1, value2, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeNameNotBetween(String value1, String value2) {
            addCriterion("SYS_CODE_NAME not between", value1, value2, "sysCodeName");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNull() {
            addCriterion("SYS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNotNull() {
            addCriterion("SYS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSysCodeEqualTo(String value) {
            addCriterion("SYS_CODE =", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotEqualTo(String value) {
            addCriterion("SYS_CODE <>", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThan(String value) {
            addCriterion("SYS_CODE >", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_CODE >=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThan(String value) {
            addCriterion("SYS_CODE <", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_CODE <=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLike(String value) {
            addCriterion("SYS_CODE like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotLike(String value) {
            addCriterion("SYS_CODE not like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeIn(List<String> values) {
            addCriterion("SYS_CODE in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotIn(List<String> values) {
            addCriterion("SYS_CODE not in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeBetween(String value1, String value2) {
            addCriterion("SYS_CODE between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_CODE not between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdIsNull() {
            addCriterion("RAW_TO_STATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdIsNotNull() {
            addCriterion("RAW_TO_STATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdEqualTo(String value) {
            addCriterion("RAW_TO_STATION_ID =", value, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdNotEqualTo(String value) {
            addCriterion("RAW_TO_STATION_ID <>", value, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdGreaterThan(String value) {
            addCriterion("RAW_TO_STATION_ID >", value, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdGreaterThanOrEqualTo(String value) {
            addCriterion("RAW_TO_STATION_ID >=", value, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdLessThan(String value) {
            addCriterion("RAW_TO_STATION_ID <", value, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdLessThanOrEqualTo(String value) {
            addCriterion("RAW_TO_STATION_ID <=", value, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdLike(String value) {
            addCriterion("RAW_TO_STATION_ID like", value, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdNotLike(String value) {
            addCriterion("RAW_TO_STATION_ID not like", value, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdIn(List<String> values) {
            addCriterion("RAW_TO_STATION_ID in", values, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdNotIn(List<String> values) {
            addCriterion("RAW_TO_STATION_ID not in", values, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdBetween(String value1, String value2) {
            addCriterion("RAW_TO_STATION_ID between", value1, value2, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationIdNotBetween(String value1, String value2) {
            addCriterion("RAW_TO_STATION_ID not between", value1, value2, "rawToStationId");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameIsNull() {
            addCriterion("RAW_TO_STATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameIsNotNull() {
            addCriterion("RAW_TO_STATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameEqualTo(String value) {
            addCriterion("RAW_TO_STATION_NAME =", value, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameNotEqualTo(String value) {
            addCriterion("RAW_TO_STATION_NAME <>", value, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameGreaterThan(String value) {
            addCriterion("RAW_TO_STATION_NAME >", value, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("RAW_TO_STATION_NAME >=", value, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameLessThan(String value) {
            addCriterion("RAW_TO_STATION_NAME <", value, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameLessThanOrEqualTo(String value) {
            addCriterion("RAW_TO_STATION_NAME <=", value, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameLike(String value) {
            addCriterion("RAW_TO_STATION_NAME like", value, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameNotLike(String value) {
            addCriterion("RAW_TO_STATION_NAME not like", value, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameIn(List<String> values) {
            addCriterion("RAW_TO_STATION_NAME in", values, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameNotIn(List<String> values) {
            addCriterion("RAW_TO_STATION_NAME not in", values, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameBetween(String value1, String value2) {
            addCriterion("RAW_TO_STATION_NAME between", value1, value2, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawToStationNameNotBetween(String value1, String value2) {
            addCriterion("RAW_TO_STATION_NAME not between", value1, value2, "rawToStationName");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdIsNull() {
            addCriterion("RAW_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdIsNotNull() {
            addCriterion("RAW_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdEqualTo(String value) {
            addCriterion("RAW_UNIT_ID =", value, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdNotEqualTo(String value) {
            addCriterion("RAW_UNIT_ID <>", value, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdGreaterThan(String value) {
            addCriterion("RAW_UNIT_ID >", value, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("RAW_UNIT_ID >=", value, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdLessThan(String value) {
            addCriterion("RAW_UNIT_ID <", value, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdLessThanOrEqualTo(String value) {
            addCriterion("RAW_UNIT_ID <=", value, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdLike(String value) {
            addCriterion("RAW_UNIT_ID like", value, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdNotLike(String value) {
            addCriterion("RAW_UNIT_ID not like", value, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdIn(List<String> values) {
            addCriterion("RAW_UNIT_ID in", values, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdNotIn(List<String> values) {
            addCriterion("RAW_UNIT_ID not in", values, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdBetween(String value1, String value2) {
            addCriterion("RAW_UNIT_ID between", value1, value2, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitIdNotBetween(String value1, String value2) {
            addCriterion("RAW_UNIT_ID not between", value1, value2, "rawUnitId");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameIsNull() {
            addCriterion("RAW_UNIT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameIsNotNull() {
            addCriterion("RAW_UNIT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameEqualTo(String value) {
            addCriterion("RAW_UNIT_NAME =", value, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameNotEqualTo(String value) {
            addCriterion("RAW_UNIT_NAME <>", value, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameGreaterThan(String value) {
            addCriterion("RAW_UNIT_NAME >", value, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("RAW_UNIT_NAME >=", value, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameLessThan(String value) {
            addCriterion("RAW_UNIT_NAME <", value, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameLessThanOrEqualTo(String value) {
            addCriterion("RAW_UNIT_NAME <=", value, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameLike(String value) {
            addCriterion("RAW_UNIT_NAME like", value, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameNotLike(String value) {
            addCriterion("RAW_UNIT_NAME not like", value, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameIn(List<String> values) {
            addCriterion("RAW_UNIT_NAME in", values, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameNotIn(List<String> values) {
            addCriterion("RAW_UNIT_NAME not in", values, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameBetween(String value1, String value2) {
            addCriterion("RAW_UNIT_NAME between", value1, value2, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andRawUnitNameNotBetween(String value1, String value2) {
            addCriterion("RAW_UNIT_NAME not between", value1, value2, "rawUnitName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusIsNull() {
            addCriterion("PKG_ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusIsNotNull() {
            addCriterion("PKG_ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusEqualTo(String value) {
            addCriterion("PKG_ORDER_STATUS =", value, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNotEqualTo(String value) {
            addCriterion("PKG_ORDER_STATUS <>", value, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusGreaterThan(String value) {
            addCriterion("PKG_ORDER_STATUS >", value, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PKG_ORDER_STATUS >=", value, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusLessThan(String value) {
            addCriterion("PKG_ORDER_STATUS <", value, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("PKG_ORDER_STATUS <=", value, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusLike(String value) {
            addCriterion("PKG_ORDER_STATUS like", value, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNotLike(String value) {
            addCriterion("PKG_ORDER_STATUS not like", value, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusIn(List<String> values) {
            addCriterion("PKG_ORDER_STATUS in", values, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNotIn(List<String> values) {
            addCriterion("PKG_ORDER_STATUS not in", values, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusBetween(String value1, String value2) {
            addCriterion("PKG_ORDER_STATUS between", value1, value2, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNotBetween(String value1, String value2) {
            addCriterion("PKG_ORDER_STATUS not between", value1, value2, "pkgOrderStatus");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateIsNull() {
            addCriterion("PKG_CONFIRM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateIsNotNull() {
            addCriterion("PKG_CONFIRM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateEqualTo(Date value) {
            addCriterion("PKG_CONFIRM_DATE =", value, "pkgConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateNotEqualTo(Date value) {
            addCriterion("PKG_CONFIRM_DATE <>", value, "pkgConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateGreaterThan(Date value) {
            addCriterion("PKG_CONFIRM_DATE >", value, "pkgConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PKG_CONFIRM_DATE >=", value, "pkgConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateLessThan(Date value) {
            addCriterion("PKG_CONFIRM_DATE <", value, "pkgConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateLessThanOrEqualTo(Date value) {
            addCriterion("PKG_CONFIRM_DATE <=", value, "pkgConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateIn(List<Date> values) {
            addCriterion("PKG_CONFIRM_DATE in", values, "pkgConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateNotIn(List<Date> values) {
            addCriterion("PKG_CONFIRM_DATE not in", values, "pkgConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateBetween(Date value1, Date value2) {
            addCriterion("PKG_CONFIRM_DATE between", value1, value2, "pkgConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPkgConfirmDateNotBetween(Date value1, Date value2) {
            addCriterion("PKG_CONFIRM_DATE not between", value1, value2, "pkgConfirmDate");
            return (Criteria) this;
        }

        public Criteria andPkgNameIsNull() {
            addCriterion("PKG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPkgNameIsNotNull() {
            addCriterion("PKG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPkgNameEqualTo(String value) {
            addCriterion("PKG_NAME =", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotEqualTo(String value) {
            addCriterion("PKG_NAME <>", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameGreaterThan(String value) {
            addCriterion("PKG_NAME >", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameGreaterThanOrEqualTo(String value) {
            addCriterion("PKG_NAME >=", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLessThan(String value) {
            addCriterion("PKG_NAME <", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLessThanOrEqualTo(String value) {
            addCriterion("PKG_NAME <=", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLike(String value) {
            addCriterion("PKG_NAME like", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotLike(String value) {
            addCriterion("PKG_NAME not like", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameIn(List<String> values) {
            addCriterion("PKG_NAME in", values, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotIn(List<String> values) {
            addCriterion("PKG_NAME not in", values, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameBetween(String value1, String value2) {
            addCriterion("PKG_NAME between", value1, value2, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotBetween(String value1, String value2) {
            addCriterion("PKG_NAME not between", value1, value2, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgDescIsNull() {
            addCriterion("PKG_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPkgDescIsNotNull() {
            addCriterion("PKG_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPkgDescEqualTo(String value) {
            addCriterion("PKG_DESC =", value, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescNotEqualTo(String value) {
            addCriterion("PKG_DESC <>", value, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescGreaterThan(String value) {
            addCriterion("PKG_DESC >", value, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescGreaterThanOrEqualTo(String value) {
            addCriterion("PKG_DESC >=", value, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescLessThan(String value) {
            addCriterion("PKG_DESC <", value, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescLessThanOrEqualTo(String value) {
            addCriterion("PKG_DESC <=", value, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescLike(String value) {
            addCriterion("PKG_DESC like", value, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescNotLike(String value) {
            addCriterion("PKG_DESC not like", value, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescIn(List<String> values) {
            addCriterion("PKG_DESC in", values, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescNotIn(List<String> values) {
            addCriterion("PKG_DESC not in", values, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescBetween(String value1, String value2) {
            addCriterion("PKG_DESC between", value1, value2, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescNotBetween(String value1, String value2) {
            addCriterion("PKG_DESC not between", value1, value2, "pkgDesc");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalIsNull() {
            addCriterion("PKG_DESC_INTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalIsNotNull() {
            addCriterion("PKG_DESC_INTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalEqualTo(String value) {
            addCriterion("PKG_DESC_INTERNAL =", value, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalNotEqualTo(String value) {
            addCriterion("PKG_DESC_INTERNAL <>", value, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalGreaterThan(String value) {
            addCriterion("PKG_DESC_INTERNAL >", value, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalGreaterThanOrEqualTo(String value) {
            addCriterion("PKG_DESC_INTERNAL >=", value, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalLessThan(String value) {
            addCriterion("PKG_DESC_INTERNAL <", value, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalLessThanOrEqualTo(String value) {
            addCriterion("PKG_DESC_INTERNAL <=", value, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalLike(String value) {
            addCriterion("PKG_DESC_INTERNAL like", value, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalNotLike(String value) {
            addCriterion("PKG_DESC_INTERNAL not like", value, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalIn(List<String> values) {
            addCriterion("PKG_DESC_INTERNAL in", values, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalNotIn(List<String> values) {
            addCriterion("PKG_DESC_INTERNAL not in", values, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalBetween(String value1, String value2) {
            addCriterion("PKG_DESC_INTERNAL between", value1, value2, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgDescInternalNotBetween(String value1, String value2) {
            addCriterion("PKG_DESC_INTERNAL not between", value1, value2, "pkgDescInternal");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescIsNull() {
            addCriterion("PKG_REFUND_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescIsNotNull() {
            addCriterion("PKG_REFUND_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescEqualTo(String value) {
            addCriterion("PKG_REFUND_DESC =", value, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescNotEqualTo(String value) {
            addCriterion("PKG_REFUND_DESC <>", value, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescGreaterThan(String value) {
            addCriterion("PKG_REFUND_DESC >", value, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescGreaterThanOrEqualTo(String value) {
            addCriterion("PKG_REFUND_DESC >=", value, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescLessThan(String value) {
            addCriterion("PKG_REFUND_DESC <", value, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescLessThanOrEqualTo(String value) {
            addCriterion("PKG_REFUND_DESC <=", value, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescLike(String value) {
            addCriterion("PKG_REFUND_DESC like", value, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescNotLike(String value) {
            addCriterion("PKG_REFUND_DESC not like", value, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescIn(List<String> values) {
            addCriterion("PKG_REFUND_DESC in", values, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescNotIn(List<String> values) {
            addCriterion("PKG_REFUND_DESC not in", values, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescBetween(String value1, String value2) {
            addCriterion("PKG_REFUND_DESC between", value1, value2, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgRefundDescNotBetween(String value1, String value2) {
            addCriterion("PKG_REFUND_DESC not between", value1, value2, "pkgRefundDesc");
            return (Criteria) this;
        }

        public Criteria andPkgTypeIsNull() {
            addCriterion("PKG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkgTypeIsNotNull() {
            addCriterion("PKG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkgTypeEqualTo(String value) {
            addCriterion("PKG_TYPE =", value, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNotEqualTo(String value) {
            addCriterion("PKG_TYPE <>", value, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgTypeGreaterThan(String value) {
            addCriterion("PKG_TYPE >", value, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PKG_TYPE >=", value, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgTypeLessThan(String value) {
            addCriterion("PKG_TYPE <", value, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgTypeLessThanOrEqualTo(String value) {
            addCriterion("PKG_TYPE <=", value, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgTypeLike(String value) {
            addCriterion("PKG_TYPE like", value, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNotLike(String value) {
            addCriterion("PKG_TYPE not like", value, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgTypeIn(List<String> values) {
            addCriterion("PKG_TYPE in", values, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNotIn(List<String> values) {
            addCriterion("PKG_TYPE not in", values, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgTypeBetween(String value1, String value2) {
            addCriterion("PKG_TYPE between", value1, value2, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNotBetween(String value1, String value2) {
            addCriterion("PKG_TYPE not between", value1, value2, "pkgType");
            return (Criteria) this;
        }

        public Criteria andPkgSmsIsNull() {
            addCriterion("PKG_SMS is null");
            return (Criteria) this;
        }

        public Criteria andPkgSmsIsNotNull() {
            addCriterion("PKG_SMS is not null");
            return (Criteria) this;
        }

        public Criteria andPkgSmsEqualTo(String value) {
            addCriterion("PKG_SMS =", value, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andPkgSmsNotEqualTo(String value) {
            addCriterion("PKG_SMS <>", value, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andPkgSmsGreaterThan(String value) {
            addCriterion("PKG_SMS >", value, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andPkgSmsGreaterThanOrEqualTo(String value) {
            addCriterion("PKG_SMS >=", value, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andPkgSmsLessThan(String value) {
            addCriterion("PKG_SMS <", value, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andPkgSmsLessThanOrEqualTo(String value) {
            addCriterion("PKG_SMS <=", value, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andPkgSmsLike(String value) {
            addCriterion("PKG_SMS like", value, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andPkgSmsNotLike(String value) {
            addCriterion("PKG_SMS not like", value, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andPkgSmsIn(List<String> values) {
            addCriterion("PKG_SMS in", values, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andPkgSmsNotIn(List<String> values) {
            addCriterion("PKG_SMS not in", values, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andPkgSmsBetween(String value1, String value2) {
            addCriterion("PKG_SMS between", value1, value2, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andPkgSmsNotBetween(String value1, String value2) {
            addCriterion("PKG_SMS not between", value1, value2, "pkgSms");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusIsNull() {
            addCriterion("TICKET_USE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusIsNotNull() {
            addCriterion("TICKET_USE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS =", value, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNotEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS <>", value, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusGreaterThan(String value) {
            addCriterion("TICKET_USE_STATUS >", value, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS >=", value, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusLessThan(String value) {
            addCriterion("TICKET_USE_STATUS <", value, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusLessThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS <=", value, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusLike(String value) {
            addCriterion("TICKET_USE_STATUS like", value, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNotLike(String value) {
            addCriterion("TICKET_USE_STATUS not like", value, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS in", values, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNotIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS not in", values, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS between", value1, value2, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNotBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS not between", value1, value2, "ticketUseStatus");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexIsNull() {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexIsNotNull() {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexEqualTo(Long value) {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX =", value, "originExOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexNotEqualTo(Long value) {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX <>", value, "originExOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexGreaterThan(Long value) {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX >", value, "originExOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexGreaterThanOrEqualTo(Long value) {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX >=", value, "originExOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexLessThan(Long value) {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX <", value, "originExOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexLessThanOrEqualTo(Long value) {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX <=", value, "originExOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexIn(List<Long> values) {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX in", values, "originExOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexNotIn(List<Long> values) {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX not in", values, "originExOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexBetween(Long value1, Long value2) {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX between", value1, value2, "originExOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIndexNotBetween(Long value1, Long value2) {
            addCriterion("ORIGIN_EX_ORDER_ID_INDEX not between", value1, value2, "originExOrderIdIndex");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIsNull() {
            addCriterion("ORIGIN_EX_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIsNotNull() {
            addCriterion("ORIGIN_EX_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdEqualTo(String value) {
            addCriterion("ORIGIN_EX_ORDER_ID =", value, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdNotEqualTo(String value) {
            addCriterion("ORIGIN_EX_ORDER_ID <>", value, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdGreaterThan(String value) {
            addCriterion("ORIGIN_EX_ORDER_ID >", value, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN_EX_ORDER_ID >=", value, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdLessThan(String value) {
            addCriterion("ORIGIN_EX_ORDER_ID <", value, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN_EX_ORDER_ID <=", value, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdLike(String value) {
            addCriterion("ORIGIN_EX_ORDER_ID like", value, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdNotLike(String value) {
            addCriterion("ORIGIN_EX_ORDER_ID not like", value, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdIn(List<String> values) {
            addCriterion("ORIGIN_EX_ORDER_ID in", values, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdNotIn(List<String> values) {
            addCriterion("ORIGIN_EX_ORDER_ID not in", values, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdBetween(String value1, String value2) {
            addCriterion("ORIGIN_EX_ORDER_ID between", value1, value2, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andOriginExOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORIGIN_EX_ORDER_ID not between", value1, value2, "originExOrderId");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIsNull() {
            addCriterion("SETTLEMENT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIsNotNull() {
            addCriterion("SETTLEMENT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceEqualTo(Double value) {
            addCriterion("SETTLEMENT_PRICE =", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotEqualTo(Double value) {
            addCriterion("SETTLEMENT_PRICE <>", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceGreaterThan(Double value) {
            addCriterion("SETTLEMENT_PRICE >", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("SETTLEMENT_PRICE >=", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceLessThan(Double value) {
            addCriterion("SETTLEMENT_PRICE <", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceLessThanOrEqualTo(Double value) {
            addCriterion("SETTLEMENT_PRICE <=", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIn(List<Double> values) {
            addCriterion("SETTLEMENT_PRICE in", values, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotIn(List<Double> values) {
            addCriterion("SETTLEMENT_PRICE not in", values, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceBetween(Double value1, Double value2) {
            addCriterion("SETTLEMENT_PRICE between", value1, value2, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotBetween(Double value1, Double value2) {
            addCriterion("SETTLEMENT_PRICE not between", value1, value2, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateIsNull() {
            addCriterion("SETTLEMENT_REBATE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateIsNotNull() {
            addCriterion("SETTLEMENT_REBATE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateEqualTo(Double value) {
            addCriterion("SETTLEMENT_REBATE =", value, "settlementRebate");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateNotEqualTo(Double value) {
            addCriterion("SETTLEMENT_REBATE <>", value, "settlementRebate");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateGreaterThan(Double value) {
            addCriterion("SETTLEMENT_REBATE >", value, "settlementRebate");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateGreaterThanOrEqualTo(Double value) {
            addCriterion("SETTLEMENT_REBATE >=", value, "settlementRebate");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateLessThan(Double value) {
            addCriterion("SETTLEMENT_REBATE <", value, "settlementRebate");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateLessThanOrEqualTo(Double value) {
            addCriterion("SETTLEMENT_REBATE <=", value, "settlementRebate");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateIn(List<Double> values) {
            addCriterion("SETTLEMENT_REBATE in", values, "settlementRebate");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateNotIn(List<Double> values) {
            addCriterion("SETTLEMENT_REBATE not in", values, "settlementRebate");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateBetween(Double value1, Double value2) {
            addCriterion("SETTLEMENT_REBATE between", value1, value2, "settlementRebate");
            return (Criteria) this;
        }

        public Criteria andSettlementRebateNotBetween(Double value1, Double value2) {
            addCriterion("SETTLEMENT_REBATE not between", value1, value2, "settlementRebate");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeIsNull() {
            addCriterion("SALE_PRICE_CAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeIsNotNull() {
            addCriterion("SALE_PRICE_CAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeEqualTo(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE =", value, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNotEqualTo(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE <>", value, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeGreaterThan(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE >", value, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE >=", value, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeLessThan(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE <", value, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeLessThanOrEqualTo(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE <=", value, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeLike(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE like", value, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNotLike(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE not like", value, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeIn(List<String> values) {
            addCriterion("SALE_PRICE_CAL_TYPE in", values, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNotIn(List<String> values) {
            addCriterion("SALE_PRICE_CAL_TYPE not in", values, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeBetween(String value1, String value2) {
            addCriterion("SALE_PRICE_CAL_TYPE between", value1, value2, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNotBetween(String value1, String value2) {
            addCriterion("SALE_PRICE_CAL_TYPE not between", value1, value2, "salePriceCalType");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceIsNull() {
            addCriterion("PKG_SALE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceIsNotNull() {
            addCriterion("PKG_SALE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceEqualTo(Double value) {
            addCriterion("PKG_SALE_PRICE =", value, "pkgSalePrice");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceNotEqualTo(Double value) {
            addCriterion("PKG_SALE_PRICE <>", value, "pkgSalePrice");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceGreaterThan(Double value) {
            addCriterion("PKG_SALE_PRICE >", value, "pkgSalePrice");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("PKG_SALE_PRICE >=", value, "pkgSalePrice");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceLessThan(Double value) {
            addCriterion("PKG_SALE_PRICE <", value, "pkgSalePrice");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceLessThanOrEqualTo(Double value) {
            addCriterion("PKG_SALE_PRICE <=", value, "pkgSalePrice");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceIn(List<Double> values) {
            addCriterion("PKG_SALE_PRICE in", values, "pkgSalePrice");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceNotIn(List<Double> values) {
            addCriterion("PKG_SALE_PRICE not in", values, "pkgSalePrice");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceBetween(Double value1, Double value2) {
            addCriterion("PKG_SALE_PRICE between", value1, value2, "pkgSalePrice");
            return (Criteria) this;
        }

        public Criteria andPkgSalePriceNotBetween(Double value1, Double value2) {
            addCriterion("PKG_SALE_PRICE not between", value1, value2, "pkgSalePrice");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameIsNull() {
            addCriterion("PKG_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameIsNotNull() {
            addCriterion("PKG_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameEqualTo(String value) {
            addCriterion("PKG_TYPE_NAME =", value, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameNotEqualTo(String value) {
            addCriterion("PKG_TYPE_NAME <>", value, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameGreaterThan(String value) {
            addCriterion("PKG_TYPE_NAME >", value, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("PKG_TYPE_NAME >=", value, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameLessThan(String value) {
            addCriterion("PKG_TYPE_NAME <", value, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameLessThanOrEqualTo(String value) {
            addCriterion("PKG_TYPE_NAME <=", value, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameLike(String value) {
            addCriterion("PKG_TYPE_NAME like", value, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameNotLike(String value) {
            addCriterion("PKG_TYPE_NAME not like", value, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameIn(List<String> values) {
            addCriterion("PKG_TYPE_NAME in", values, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameNotIn(List<String> values) {
            addCriterion("PKG_TYPE_NAME not in", values, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameBetween(String value1, String value2) {
            addCriterion("PKG_TYPE_NAME between", value1, value2, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andPkgTypeNameNotBetween(String value1, String value2) {
            addCriterion("PKG_TYPE_NAME not between", value1, value2, "pkgTypeName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameIsNull() {
            addCriterion("TICKET_USE_STATUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameIsNotNull() {
            addCriterion("TICKET_USE_STATUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_NAME =", value, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameNotEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_NAME <>", value, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameGreaterThan(String value) {
            addCriterion("TICKET_USE_STATUS_NAME >", value, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_NAME >=", value, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameLessThan(String value) {
            addCriterion("TICKET_USE_STATUS_NAME <", value, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameLessThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_NAME <=", value, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameLike(String value) {
            addCriterion("TICKET_USE_STATUS_NAME like", value, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameNotLike(String value) {
            addCriterion("TICKET_USE_STATUS_NAME not like", value, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_NAME in", values, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameNotIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_NAME not in", values, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_NAME between", value1, value2, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusNameNotBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_NAME not between", value1, value2, "ticketUseStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameIsNull() {
            addCriterion("PKG_ORDER_STATUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameIsNotNull() {
            addCriterion("PKG_ORDER_STATUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameEqualTo(String value) {
            addCriterion("PKG_ORDER_STATUS_NAME =", value, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameNotEqualTo(String value) {
            addCriterion("PKG_ORDER_STATUS_NAME <>", value, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameGreaterThan(String value) {
            addCriterion("PKG_ORDER_STATUS_NAME >", value, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("PKG_ORDER_STATUS_NAME >=", value, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameLessThan(String value) {
            addCriterion("PKG_ORDER_STATUS_NAME <", value, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameLessThanOrEqualTo(String value) {
            addCriterion("PKG_ORDER_STATUS_NAME <=", value, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameLike(String value) {
            addCriterion("PKG_ORDER_STATUS_NAME like", value, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameNotLike(String value) {
            addCriterion("PKG_ORDER_STATUS_NAME not like", value, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameIn(List<String> values) {
            addCriterion("PKG_ORDER_STATUS_NAME in", values, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameNotIn(List<String> values) {
            addCriterion("PKG_ORDER_STATUS_NAME not in", values, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameBetween(String value1, String value2) {
            addCriterion("PKG_ORDER_STATUS_NAME between", value1, value2, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andPkgOrderStatusNameNotBetween(String value1, String value2) {
            addCriterion("PKG_ORDER_STATUS_NAME not between", value1, value2, "pkgOrderStatusName");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdIsNull() {
            addCriterion("EX_BUS_ORDER_PKG_ID is null");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdIsNotNull() {
            addCriterion("EX_BUS_ORDER_PKG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdEqualTo(Long value) {
            addCriterion("EX_BUS_ORDER_PKG_ID =", value, "exBusOrderPkgId");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdNotEqualTo(Long value) {
            addCriterion("EX_BUS_ORDER_PKG_ID <>", value, "exBusOrderPkgId");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdGreaterThan(Long value) {
            addCriterion("EX_BUS_ORDER_PKG_ID >", value, "exBusOrderPkgId");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EX_BUS_ORDER_PKG_ID >=", value, "exBusOrderPkgId");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdLessThan(Long value) {
            addCriterion("EX_BUS_ORDER_PKG_ID <", value, "exBusOrderPkgId");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdLessThanOrEqualTo(Long value) {
            addCriterion("EX_BUS_ORDER_PKG_ID <=", value, "exBusOrderPkgId");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdIn(List<Long> values) {
            addCriterion("EX_BUS_ORDER_PKG_ID in", values, "exBusOrderPkgId");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdNotIn(List<Long> values) {
            addCriterion("EX_BUS_ORDER_PKG_ID not in", values, "exBusOrderPkgId");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdBetween(Long value1, Long value2) {
            addCriterion("EX_BUS_ORDER_PKG_ID between", value1, value2, "exBusOrderPkgId");
            return (Criteria) this;
        }

        public Criteria andExBusOrderPkgIdNotBetween(Long value1, Long value2) {
            addCriterion("EX_BUS_ORDER_PKG_ID not between", value1, value2, "exBusOrderPkgId");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIsNull() {
            addCriterion("CARRIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIsNotNull() {
            addCriterion("CARRIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameEqualTo(String value) {
            addCriterion("CARRIER_NAME =", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotEqualTo(String value) {
            addCriterion("CARRIER_NAME <>", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThan(String value) {
            addCriterion("CARRIER_NAME >", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThanOrEqualTo(String value) {
            addCriterion("CARRIER_NAME >=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThan(String value) {
            addCriterion("CARRIER_NAME <", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThanOrEqualTo(String value) {
            addCriterion("CARRIER_NAME <=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLike(String value) {
            addCriterion("CARRIER_NAME like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotLike(String value) {
            addCriterion("CARRIER_NAME not like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIn(List<String> values) {
            addCriterion("CARRIER_NAME in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotIn(List<String> values) {
            addCriterion("CARRIER_NAME not in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameBetween(String value1, String value2) {
            addCriterion("CARRIER_NAME between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotBetween(String value1, String value2) {
            addCriterion("CARRIER_NAME not between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameIsNull() {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameIsNotNull() {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameEqualTo(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME =", value, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameNotEqualTo(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME <>", value, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameGreaterThan(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME >", value, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME >=", value, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameLessThan(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME <", value, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameLessThanOrEqualTo(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME <=", value, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameLike(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME like", value, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameNotLike(String value) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME not like", value, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameIn(List<String> values) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME in", values, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameNotIn(List<String> values) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME not in", values, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameBetween(String value1, String value2) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME between", value1, value2, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andSalePriceCalTypeNameNotBetween(String value1, String value2) {
            addCriterion("SALE_PRICE_CAL_TYPE_NAME not between", value1, value2, "salePriceCalTypeName");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdIsNull() {
            addCriterion("EX_BUS_STOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdIsNotNull() {
            addCriterion("EX_BUS_STOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdEqualTo(Long value) {
            addCriterion("EX_BUS_STOCK_ID =", value, "exBusStockId");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdNotEqualTo(Long value) {
            addCriterion("EX_BUS_STOCK_ID <>", value, "exBusStockId");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdGreaterThan(Long value) {
            addCriterion("EX_BUS_STOCK_ID >", value, "exBusStockId");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EX_BUS_STOCK_ID >=", value, "exBusStockId");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdLessThan(Long value) {
            addCriterion("EX_BUS_STOCK_ID <", value, "exBusStockId");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdLessThanOrEqualTo(Long value) {
            addCriterion("EX_BUS_STOCK_ID <=", value, "exBusStockId");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdIn(List<Long> values) {
            addCriterion("EX_BUS_STOCK_ID in", values, "exBusStockId");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdNotIn(List<Long> values) {
            addCriterion("EX_BUS_STOCK_ID not in", values, "exBusStockId");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdBetween(Long value1, Long value2) {
            addCriterion("EX_BUS_STOCK_ID between", value1, value2, "exBusStockId");
            return (Criteria) this;
        }

        public Criteria andExBusStockIdNotBetween(Long value1, Long value2) {
            addCriterion("EX_BUS_STOCK_ID not between", value1, value2, "exBusStockId");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountIsNull() {
            addCriterion("PKG_SALE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountIsNotNull() {
            addCriterion("PKG_SALE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountEqualTo(Long value) {
            addCriterion("PKG_SALE_COUNT =", value, "pkgSaleCount");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountNotEqualTo(Long value) {
            addCriterion("PKG_SALE_COUNT <>", value, "pkgSaleCount");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountGreaterThan(Long value) {
            addCriterion("PKG_SALE_COUNT >", value, "pkgSaleCount");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountGreaterThanOrEqualTo(Long value) {
            addCriterion("PKG_SALE_COUNT >=", value, "pkgSaleCount");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountLessThan(Long value) {
            addCriterion("PKG_SALE_COUNT <", value, "pkgSaleCount");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountLessThanOrEqualTo(Long value) {
            addCriterion("PKG_SALE_COUNT <=", value, "pkgSaleCount");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountIn(List<Long> values) {
            addCriterion("PKG_SALE_COUNT in", values, "pkgSaleCount");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountNotIn(List<Long> values) {
            addCriterion("PKG_SALE_COUNT not in", values, "pkgSaleCount");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountBetween(Long value1, Long value2) {
            addCriterion("PKG_SALE_COUNT between", value1, value2, "pkgSaleCount");
            return (Criteria) this;
        }

        public Criteria andPkgSaleCountNotBetween(Long value1, Long value2) {
            addCriterion("PKG_SALE_COUNT not between", value1, value2, "pkgSaleCount");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdIsNull() {
            addCriterion("ELE_SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdIsNotNull() {
            addCriterion("ELE_SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdEqualTo(Long value) {
            addCriterion("ELE_SUPPLIER_ID =", value, "eleSupplierId");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdNotEqualTo(Long value) {
            addCriterion("ELE_SUPPLIER_ID <>", value, "eleSupplierId");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdGreaterThan(Long value) {
            addCriterion("ELE_SUPPLIER_ID >", value, "eleSupplierId");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ELE_SUPPLIER_ID >=", value, "eleSupplierId");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdLessThan(Long value) {
            addCriterion("ELE_SUPPLIER_ID <", value, "eleSupplierId");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("ELE_SUPPLIER_ID <=", value, "eleSupplierId");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdIn(List<Long> values) {
            addCriterion("ELE_SUPPLIER_ID in", values, "eleSupplierId");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdNotIn(List<Long> values) {
            addCriterion("ELE_SUPPLIER_ID not in", values, "eleSupplierId");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdBetween(Long value1, Long value2) {
            addCriterion("ELE_SUPPLIER_ID between", value1, value2, "eleSupplierId");
            return (Criteria) this;
        }

        public Criteria andEleSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("ELE_SUPPLIER_ID not between", value1, value2, "eleSupplierId");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeIsNull() {
            addCriterion("ELE_SUPPLIER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeIsNotNull() {
            addCriterion("ELE_SUPPLIER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeEqualTo(String value) {
            addCriterion("ELE_SUPPLIER_CODE =", value, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeNotEqualTo(String value) {
            addCriterion("ELE_SUPPLIER_CODE <>", value, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeGreaterThan(String value) {
            addCriterion("ELE_SUPPLIER_CODE >", value, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ELE_SUPPLIER_CODE >=", value, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeLessThan(String value) {
            addCriterion("ELE_SUPPLIER_CODE <", value, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeLessThanOrEqualTo(String value) {
            addCriterion("ELE_SUPPLIER_CODE <=", value, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeLike(String value) {
            addCriterion("ELE_SUPPLIER_CODE like", value, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeNotLike(String value) {
            addCriterion("ELE_SUPPLIER_CODE not like", value, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeIn(List<String> values) {
            addCriterion("ELE_SUPPLIER_CODE in", values, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeNotIn(List<String> values) {
            addCriterion("ELE_SUPPLIER_CODE not in", values, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeBetween(String value1, String value2) {
            addCriterion("ELE_SUPPLIER_CODE between", value1, value2, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierCodeNotBetween(String value1, String value2) {
            addCriterion("ELE_SUPPLIER_CODE not between", value1, value2, "eleSupplierCode");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameIsNull() {
            addCriterion("ELE_SUPPLIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameIsNotNull() {
            addCriterion("ELE_SUPPLIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameEqualTo(String value) {
            addCriterion("ELE_SUPPLIER_NAME =", value, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameNotEqualTo(String value) {
            addCriterion("ELE_SUPPLIER_NAME <>", value, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameGreaterThan(String value) {
            addCriterion("ELE_SUPPLIER_NAME >", value, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("ELE_SUPPLIER_NAME >=", value, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameLessThan(String value) {
            addCriterion("ELE_SUPPLIER_NAME <", value, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("ELE_SUPPLIER_NAME <=", value, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameLike(String value) {
            addCriterion("ELE_SUPPLIER_NAME like", value, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameNotLike(String value) {
            addCriterion("ELE_SUPPLIER_NAME not like", value, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameIn(List<String> values) {
            addCriterion("ELE_SUPPLIER_NAME in", values, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameNotIn(List<String> values) {
            addCriterion("ELE_SUPPLIER_NAME not in", values, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameBetween(String value1, String value2) {
            addCriterion("ELE_SUPPLIER_NAME between", value1, value2, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andEleSupplierNameNotBetween(String value1, String value2) {
            addCriterion("ELE_SUPPLIER_NAME not between", value1, value2, "eleSupplierName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNull() {
            addCriterion("SETTLEMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNotNull() {
            addCriterion("SETTLEMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE =", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE <>", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThan(String value) {
            addCriterion("SETTLEMENT_TYPE >", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE >=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThan(String value) {
            addCriterion("SETTLEMENT_TYPE <", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE <=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLike(String value) {
            addCriterion("SETTLEMENT_TYPE like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotLike(String value) {
            addCriterion("SETTLEMENT_TYPE not like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIn(List<String> values) {
            addCriterion("SETTLEMENT_TYPE in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotIn(List<String> values) {
            addCriterion("SETTLEMENT_TYPE not in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_TYPE between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_TYPE not between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameIsNull() {
            addCriterion("SETTLEMENT_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameIsNotNull() {
            addCriterion("SETTLEMENT_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE_NAME =", value, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameNotEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE_NAME <>", value, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameGreaterThan(String value) {
            addCriterion("SETTLEMENT_TYPE_NAME >", value, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE_NAME >=", value, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameLessThan(String value) {
            addCriterion("SETTLEMENT_TYPE_NAME <", value, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_TYPE_NAME <=", value, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameLike(String value) {
            addCriterion("SETTLEMENT_TYPE_NAME like", value, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameNotLike(String value) {
            addCriterion("SETTLEMENT_TYPE_NAME not like", value, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameIn(List<String> values) {
            addCriterion("SETTLEMENT_TYPE_NAME in", values, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameNotIn(List<String> values) {
            addCriterion("SETTLEMENT_TYPE_NAME not in", values, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_TYPE_NAME between", value1, value2, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNameNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_TYPE_NAME not between", value1, value2, "settlementTypeName");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusIsNull() {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusIsNotNull() {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS =", value, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNotEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS <>", value, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusGreaterThan(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS >", value, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS >=", value, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusLessThan(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS <", value, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusLessThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS <=", value, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusLike(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS like", value, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNotLike(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS not like", value, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS in", values, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNotIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS not in", values, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS between", value1, value2, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNotBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS not between", value1, value2, "ticketUseStatusSynStatus");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateIsNull() {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateIsNotNull() {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE =", value, "ticketUseStatusCheckedDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateNotEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE <>", value, "ticketUseStatusCheckedDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateGreaterThan(Date value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE >", value, "ticketUseStatusCheckedDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE >=", value, "ticketUseStatusCheckedDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateLessThan(Date value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE <", value, "ticketUseStatusCheckedDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE <=", value, "ticketUseStatusCheckedDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateIn(List<Date> values) {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE in", values, "ticketUseStatusCheckedDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateNotIn(List<Date> values) {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE not in", values, "ticketUseStatusCheckedDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateBetween(Date value1, Date value2) {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE between", value1, value2, "ticketUseStatusCheckedDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedDateNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_USE_STATUS_CHECKED_DATE not between", value1, value2, "ticketUseStatusCheckedDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateIsNull() {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateIsNotNull() {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE =", value, "ticketUseStatusRefundDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateNotEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE <>", value, "ticketUseStatusRefundDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateGreaterThan(Date value) {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE >", value, "ticketUseStatusRefundDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE >=", value, "ticketUseStatusRefundDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateLessThan(Date value) {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE <", value, "ticketUseStatusRefundDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE <=", value, "ticketUseStatusRefundDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateIn(List<Date> values) {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE in", values, "ticketUseStatusRefundDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateNotIn(List<Date> values) {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE not in", values, "ticketUseStatusRefundDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateBetween(Date value1, Date value2) {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE between", value1, value2, "ticketUseStatusRefundDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundDateNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_USE_STATUS_REFUND_DATE not between", value1, value2, "ticketUseStatusRefundDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateIsNull() {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateIsNotNull() {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE =", value, "ticketUseStatusInvalidDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateNotEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE <>", value, "ticketUseStatusInvalidDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateGreaterThan(Date value) {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE >", value, "ticketUseStatusInvalidDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE >=", value, "ticketUseStatusInvalidDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateLessThan(Date value) {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE <", value, "ticketUseStatusInvalidDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateLessThanOrEqualTo(Date value) {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE <=", value, "ticketUseStatusInvalidDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateIn(List<Date> values) {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE in", values, "ticketUseStatusInvalidDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateNotIn(List<Date> values) {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE not in", values, "ticketUseStatusInvalidDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateBetween(Date value1, Date value2) {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE between", value1, value2, "ticketUseStatusInvalidDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidDateNotBetween(Date value1, Date value2) {
            addCriterion("TICKET_USE_STATUS_INVALID_DATE not between", value1, value2, "ticketUseStatusInvalidDate");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpIsNull() {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP is null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpIsNotNull() {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP =", value, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpNotEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP <>", value, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpGreaterThan(String value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP >", value, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP >=", value, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpLessThan(String value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP <", value, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpLessThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP <=", value, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpLike(String value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP like", value, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpNotLike(String value) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP not like", value, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP in", values, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpNotIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP not in", values, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP between", value1, value2, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusCheckedOpNotBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_CHECKED_OP not between", value1, value2, "ticketUseStatusCheckedOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpIsNull() {
            addCriterion("TICKET_USE_STATUS_REFUND_OP is null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpIsNotNull() {
            addCriterion("TICKET_USE_STATUS_REFUND_OP is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP =", value, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpNotEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP <>", value, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpGreaterThan(String value) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP >", value, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP >=", value, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpLessThan(String value) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP <", value, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpLessThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP <=", value, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpLike(String value) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP like", value, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpNotLike(String value) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP not like", value, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP in", values, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpNotIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP not in", values, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP between", value1, value2, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusRefundOpNotBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_REFUND_OP not between", value1, value2, "ticketUseStatusRefundOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpIsNull() {
            addCriterion("TICKET_USE_STATUS_INVALID_OP is null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpIsNotNull() {
            addCriterion("TICKET_USE_STATUS_INVALID_OP is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP =", value, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpNotEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP <>", value, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpGreaterThan(String value) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP >", value, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP >=", value, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpLessThan(String value) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP <", value, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpLessThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP <=", value, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpLike(String value) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP like", value, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpNotLike(String value) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP not like", value, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP in", values, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpNotIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP not in", values, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP between", value1, value2, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusInvalidOpNotBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_INVALID_OP not between", value1, value2, "ticketUseStatusInvalidOp");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysIsNull() {
            addCriterion("TICKET_REFUND_AMOUNT_SYS is null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysIsNotNull() {
            addCriterion("TICKET_REFUND_AMOUNT_SYS is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysEqualTo(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT_SYS =", value, "ticketRefundAmountSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysNotEqualTo(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT_SYS <>", value, "ticketRefundAmountSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysGreaterThan(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT_SYS >", value, "ticketRefundAmountSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysGreaterThanOrEqualTo(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT_SYS >=", value, "ticketRefundAmountSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysLessThan(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT_SYS <", value, "ticketRefundAmountSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysLessThanOrEqualTo(Double value) {
            addCriterion("TICKET_REFUND_AMOUNT_SYS <=", value, "ticketRefundAmountSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysIn(List<Double> values) {
            addCriterion("TICKET_REFUND_AMOUNT_SYS in", values, "ticketRefundAmountSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysNotIn(List<Double> values) {
            addCriterion("TICKET_REFUND_AMOUNT_SYS not in", values, "ticketRefundAmountSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysBetween(Double value1, Double value2) {
            addCriterion("TICKET_REFUND_AMOUNT_SYS between", value1, value2, "ticketRefundAmountSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundAmountSysNotBetween(Double value1, Double value2) {
            addCriterion("TICKET_REFUND_AMOUNT_SYS not between", value1, value2, "ticketRefundAmountSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysIsNull() {
            addCriterion("TICKET_REFUND_FEE_SYS is null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysIsNotNull() {
            addCriterion("TICKET_REFUND_FEE_SYS is not null");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysEqualTo(Double value) {
            addCriterion("TICKET_REFUND_FEE_SYS =", value, "ticketRefundFeeSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysNotEqualTo(Double value) {
            addCriterion("TICKET_REFUND_FEE_SYS <>", value, "ticketRefundFeeSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysGreaterThan(Double value) {
            addCriterion("TICKET_REFUND_FEE_SYS >", value, "ticketRefundFeeSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysGreaterThanOrEqualTo(Double value) {
            addCriterion("TICKET_REFUND_FEE_SYS >=", value, "ticketRefundFeeSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysLessThan(Double value) {
            addCriterion("TICKET_REFUND_FEE_SYS <", value, "ticketRefundFeeSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysLessThanOrEqualTo(Double value) {
            addCriterion("TICKET_REFUND_FEE_SYS <=", value, "ticketRefundFeeSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysIn(List<Double> values) {
            addCriterion("TICKET_REFUND_FEE_SYS in", values, "ticketRefundFeeSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysNotIn(List<Double> values) {
            addCriterion("TICKET_REFUND_FEE_SYS not in", values, "ticketRefundFeeSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysBetween(Double value1, Double value2) {
            addCriterion("TICKET_REFUND_FEE_SYS between", value1, value2, "ticketRefundFeeSys");
            return (Criteria) this;
        }

        public Criteria andTicketRefundFeeSysNotBetween(Double value1, Double value2) {
            addCriterion("TICKET_REFUND_FEE_SYS not between", value1, value2, "ticketRefundFeeSys");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNIsNull() {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N is null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNIsNotNull() {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N is not null");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N =", value, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNNotEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N <>", value, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNGreaterThan(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N >", value, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N >=", value, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNLessThan(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N <", value, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNLessThanOrEqualTo(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N <=", value, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNLike(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N like", value, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNNotLike(String value) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N not like", value, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N in", values, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNNotIn(List<String> values) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N not in", values, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N between", value1, value2, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }

        public Criteria andTicketUseStatusSynStatusNNotBetween(String value1, String value2) {
            addCriterion("TICKET_USE_STATUS_SYN_STATUS_N not between", value1, value2, "ticketUseStatusSynStatusN");
            return (Criteria) this;
        }
        
        // ------------------------------- customerized condition support ---------------------------------------
        public Criteria andORCLRowNumIsNull() {
            addCriterion("ROWNUM is null");
            return (Criteria) this;
        }

        public Criteria andORCLRowNumIsNotNull() {
            addCriterion("ROWNUM is not null");
            return (Criteria) this;
        }

        public Criteria andORCLRowNumEqualTo(Long value) {
            addCriterion("ROWNUM =", value, "ROWNUM");
            return (Criteria) this;
        }

        public Criteria andORCLRowNumNotEqualTo(Long value) {
            addCriterion("ROWNUM <>", value, "ROWNUM");
            return (Criteria) this;
        }

        public Criteria andORCLRowNumGreaterThan(Long value) {
            addCriterion("ROWNUM >", value, "ROWNUM");
            return (Criteria) this;
        }

        public Criteria andORCLRowNumGreaterThanOrEqualTo(Long value) {
            addCriterion("ROWNUM >=", value, "ROWNUM");
            return (Criteria) this;
        }

        public Criteria andORCLRowNumLessThan(Long value) {
            addCriterion("ROWNUM <", value, "ROWNUM");
            return (Criteria) this;
        }

        public Criteria andORCLRowNumLessThanOrEqualTo(Long value) {
            addCriterion("ROWNUM <=", value, "ROWNUM");
            return (Criteria) this;
        }

        public Criteria andORCLRowNumIn(List<Long> values) {
            addCriterion("ROWNUM in", values, "ROWNUM");
            return (Criteria) this;
        }

        public Criteria andORCLRowNumNotIn(List<Long> values) {
            addCriterion("ROWNUM not in", values, "ROWNUM");
            return (Criteria) this;
        }

        public Criteria andORCLRowNumBetween(Long value1, Long value2) {
            addCriterion("ROWNUM between", value1, value2, "ROWNUM");
            return (Criteria) this;
        }

        public Criteria andORCLRowNumNotBetween(Long value1, Long value2) {
            addCriterion("ROWNUM not between", value1, value2, "ROWNUM");
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