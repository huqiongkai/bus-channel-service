package com.shbus.easybus.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSysChinaRegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSysChinaRegionExample() {
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

        public Criteria andRegionCode6IsNull() {
            addCriterion("REGION_CODE6 is null");
            return (Criteria) this;
        }

        public Criteria andRegionCode6IsNotNull() {
            addCriterion("REGION_CODE6 is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCode6EqualTo(String value) {
            addCriterion("REGION_CODE6 =", value, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode6NotEqualTo(String value) {
            addCriterion("REGION_CODE6 <>", value, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode6GreaterThan(String value) {
            addCriterion("REGION_CODE6 >", value, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode6GreaterThanOrEqualTo(String value) {
            addCriterion("REGION_CODE6 >=", value, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode6LessThan(String value) {
            addCriterion("REGION_CODE6 <", value, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode6LessThanOrEqualTo(String value) {
            addCriterion("REGION_CODE6 <=", value, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode6Like(String value) {
            addCriterion("REGION_CODE6 like", value, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode6NotLike(String value) {
            addCriterion("REGION_CODE6 not like", value, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode6In(List<String> values) {
            addCriterion("REGION_CODE6 in", values, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode6NotIn(List<String> values) {
            addCriterion("REGION_CODE6 not in", values, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode6Between(String value1, String value2) {
            addCriterion("REGION_CODE6 between", value1, value2, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode6NotBetween(String value1, String value2) {
            addCriterion("REGION_CODE6 not between", value1, value2, "regionCode6");
            return (Criteria) this;
        }

        public Criteria andRegionCode3IsNull() {
            addCriterion("REGION_CODE3 is null");
            return (Criteria) this;
        }

        public Criteria andRegionCode3IsNotNull() {
            addCriterion("REGION_CODE3 is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCode3EqualTo(String value) {
            addCriterion("REGION_CODE3 =", value, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCode3NotEqualTo(String value) {
            addCriterion("REGION_CODE3 <>", value, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCode3GreaterThan(String value) {
            addCriterion("REGION_CODE3 >", value, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCode3GreaterThanOrEqualTo(String value) {
            addCriterion("REGION_CODE3 >=", value, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCode3LessThan(String value) {
            addCriterion("REGION_CODE3 <", value, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCode3LessThanOrEqualTo(String value) {
            addCriterion("REGION_CODE3 <=", value, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCode3Like(String value) {
            addCriterion("REGION_CODE3 like", value, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCode3NotLike(String value) {
            addCriterion("REGION_CODE3 not like", value, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCode3In(List<String> values) {
            addCriterion("REGION_CODE3 in", values, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCode3NotIn(List<String> values) {
            addCriterion("REGION_CODE3 not in", values, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCode3Between(String value1, String value2) {
            addCriterion("REGION_CODE3 between", value1, value2, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCode3NotBetween(String value1, String value2) {
            addCriterion("REGION_CODE3 not between", value1, value2, "regionCode3");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameIsNull() {
            addCriterion("REGION_CNNAME is null");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameIsNotNull() {
            addCriterion("REGION_CNNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameEqualTo(String value) {
            addCriterion("REGION_CNNAME =", value, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameNotEqualTo(String value) {
            addCriterion("REGION_CNNAME <>", value, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameGreaterThan(String value) {
            addCriterion("REGION_CNNAME >", value, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_CNNAME >=", value, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameLessThan(String value) {
            addCriterion("REGION_CNNAME <", value, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameLessThanOrEqualTo(String value) {
            addCriterion("REGION_CNNAME <=", value, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameLike(String value) {
            addCriterion("REGION_CNNAME like", value, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameNotLike(String value) {
            addCriterion("REGION_CNNAME not like", value, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameIn(List<String> values) {
            addCriterion("REGION_CNNAME in", values, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameNotIn(List<String> values) {
            addCriterion("REGION_CNNAME not in", values, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameBetween(String value1, String value2) {
            addCriterion("REGION_CNNAME between", value1, value2, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionCnnameNotBetween(String value1, String value2) {
            addCriterion("REGION_CNNAME not between", value1, value2, "regionCnname");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinIsNull() {
            addCriterion("REGION_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinIsNotNull() {
            addCriterion("REGION_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinEqualTo(String value) {
            addCriterion("REGION_PINYIN =", value, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinNotEqualTo(String value) {
            addCriterion("REGION_PINYIN <>", value, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinGreaterThan(String value) {
            addCriterion("REGION_PINYIN >", value, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_PINYIN >=", value, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinLessThan(String value) {
            addCriterion("REGION_PINYIN <", value, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinLessThanOrEqualTo(String value) {
            addCriterion("REGION_PINYIN <=", value, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinLike(String value) {
            addCriterion("REGION_PINYIN like", value, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinNotLike(String value) {
            addCriterion("REGION_PINYIN not like", value, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinIn(List<String> values) {
            addCriterion("REGION_PINYIN in", values, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinNotIn(List<String> values) {
            addCriterion("REGION_PINYIN not in", values, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinBetween(String value1, String value2) {
            addCriterion("REGION_PINYIN between", value1, value2, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andRegionPinyinNotBetween(String value1, String value2) {
            addCriterion("REGION_PINYIN not between", value1, value2, "regionPinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameIsNull() {
            addCriterion("PARENT_PROVINCE_CNNAME is null");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameIsNotNull() {
            addCriterion("PARENT_PROVINCE_CNNAME is not null");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameEqualTo(String value) {
            addCriterion("PARENT_PROVINCE_CNNAME =", value, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameNotEqualTo(String value) {
            addCriterion("PARENT_PROVINCE_CNNAME <>", value, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameGreaterThan(String value) {
            addCriterion("PARENT_PROVINCE_CNNAME >", value, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_PROVINCE_CNNAME >=", value, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameLessThan(String value) {
            addCriterion("PARENT_PROVINCE_CNNAME <", value, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameLessThanOrEqualTo(String value) {
            addCriterion("PARENT_PROVINCE_CNNAME <=", value, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameLike(String value) {
            addCriterion("PARENT_PROVINCE_CNNAME like", value, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameNotLike(String value) {
            addCriterion("PARENT_PROVINCE_CNNAME not like", value, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameIn(List<String> values) {
            addCriterion("PARENT_PROVINCE_CNNAME in", values, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameNotIn(List<String> values) {
            addCriterion("PARENT_PROVINCE_CNNAME not in", values, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameBetween(String value1, String value2) {
            addCriterion("PARENT_PROVINCE_CNNAME between", value1, value2, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCnnameNotBetween(String value1, String value2) {
            addCriterion("PARENT_PROVINCE_CNNAME not between", value1, value2, "parentProvinceCnname");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinIsNull() {
            addCriterion("PARENT_PROVINCE_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinIsNotNull() {
            addCriterion("PARENT_PROVINCE_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinEqualTo(String value) {
            addCriterion("PARENT_PROVINCE_PINYIN =", value, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinNotEqualTo(String value) {
            addCriterion("PARENT_PROVINCE_PINYIN <>", value, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinGreaterThan(String value) {
            addCriterion("PARENT_PROVINCE_PINYIN >", value, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_PROVINCE_PINYIN >=", value, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinLessThan(String value) {
            addCriterion("PARENT_PROVINCE_PINYIN <", value, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinLessThanOrEqualTo(String value) {
            addCriterion("PARENT_PROVINCE_PINYIN <=", value, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinLike(String value) {
            addCriterion("PARENT_PROVINCE_PINYIN like", value, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinNotLike(String value) {
            addCriterion("PARENT_PROVINCE_PINYIN not like", value, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinIn(List<String> values) {
            addCriterion("PARENT_PROVINCE_PINYIN in", values, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinNotIn(List<String> values) {
            addCriterion("PARENT_PROVINCE_PINYIN not in", values, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinBetween(String value1, String value2) {
            addCriterion("PARENT_PROVINCE_PINYIN between", value1, value2, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvincePinyinNotBetween(String value1, String value2) {
            addCriterion("PARENT_PROVINCE_PINYIN not between", value1, value2, "parentProvincePinyin");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6IsNull() {
            addCriterion("PARENT_PROVINCE_CODE6 is null");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6IsNotNull() {
            addCriterion("PARENT_PROVINCE_CODE6 is not null");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6EqualTo(String value) {
            addCriterion("PARENT_PROVINCE_CODE6 =", value, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6NotEqualTo(String value) {
            addCriterion("PARENT_PROVINCE_CODE6 <>", value, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6GreaterThan(String value) {
            addCriterion("PARENT_PROVINCE_CODE6 >", value, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_PROVINCE_CODE6 >=", value, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6LessThan(String value) {
            addCriterion("PARENT_PROVINCE_CODE6 <", value, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6LessThanOrEqualTo(String value) {
            addCriterion("PARENT_PROVINCE_CODE6 <=", value, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6Like(String value) {
            addCriterion("PARENT_PROVINCE_CODE6 like", value, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6NotLike(String value) {
            addCriterion("PARENT_PROVINCE_CODE6 not like", value, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6In(List<String> values) {
            addCriterion("PARENT_PROVINCE_CODE6 in", values, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6NotIn(List<String> values) {
            addCriterion("PARENT_PROVINCE_CODE6 not in", values, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6Between(String value1, String value2) {
            addCriterion("PARENT_PROVINCE_CODE6 between", value1, value2, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentProvinceCode6NotBetween(String value1, String value2) {
            addCriterion("PARENT_PROVINCE_CODE6 not between", value1, value2, "parentProvinceCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameIsNull() {
            addCriterion("PARENT_CITY_CNNAME is null");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameIsNotNull() {
            addCriterion("PARENT_CITY_CNNAME is not null");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameEqualTo(String value) {
            addCriterion("PARENT_CITY_CNNAME =", value, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameNotEqualTo(String value) {
            addCriterion("PARENT_CITY_CNNAME <>", value, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameGreaterThan(String value) {
            addCriterion("PARENT_CITY_CNNAME >", value, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CITY_CNNAME >=", value, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameLessThan(String value) {
            addCriterion("PARENT_CITY_CNNAME <", value, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameLessThanOrEqualTo(String value) {
            addCriterion("PARENT_CITY_CNNAME <=", value, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameLike(String value) {
            addCriterion("PARENT_CITY_CNNAME like", value, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameNotLike(String value) {
            addCriterion("PARENT_CITY_CNNAME not like", value, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameIn(List<String> values) {
            addCriterion("PARENT_CITY_CNNAME in", values, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameNotIn(List<String> values) {
            addCriterion("PARENT_CITY_CNNAME not in", values, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameBetween(String value1, String value2) {
            addCriterion("PARENT_CITY_CNNAME between", value1, value2, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityCnnameNotBetween(String value1, String value2) {
            addCriterion("PARENT_CITY_CNNAME not between", value1, value2, "parentCityCnname");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinIsNull() {
            addCriterion("PARENT_CITY_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinIsNotNull() {
            addCriterion("PARENT_CITY_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinEqualTo(String value) {
            addCriterion("PARENT_CITY_PINYIN =", value, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinNotEqualTo(String value) {
            addCriterion("PARENT_CITY_PINYIN <>", value, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinGreaterThan(String value) {
            addCriterion("PARENT_CITY_PINYIN >", value, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CITY_PINYIN >=", value, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinLessThan(String value) {
            addCriterion("PARENT_CITY_PINYIN <", value, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinLessThanOrEqualTo(String value) {
            addCriterion("PARENT_CITY_PINYIN <=", value, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinLike(String value) {
            addCriterion("PARENT_CITY_PINYIN like", value, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinNotLike(String value) {
            addCriterion("PARENT_CITY_PINYIN not like", value, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinIn(List<String> values) {
            addCriterion("PARENT_CITY_PINYIN in", values, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinNotIn(List<String> values) {
            addCriterion("PARENT_CITY_PINYIN not in", values, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinBetween(String value1, String value2) {
            addCriterion("PARENT_CITY_PINYIN between", value1, value2, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityPinyinNotBetween(String value1, String value2) {
            addCriterion("PARENT_CITY_PINYIN not between", value1, value2, "parentCityPinyin");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6IsNull() {
            addCriterion("PARENT_CITY_CODE6 is null");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6IsNotNull() {
            addCriterion("PARENT_CITY_CODE6 is not null");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6EqualTo(String value) {
            addCriterion("PARENT_CITY_CODE6 =", value, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6NotEqualTo(String value) {
            addCriterion("PARENT_CITY_CODE6 <>", value, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6GreaterThan(String value) {
            addCriterion("PARENT_CITY_CODE6 >", value, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CITY_CODE6 >=", value, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6LessThan(String value) {
            addCriterion("PARENT_CITY_CODE6 <", value, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6LessThanOrEqualTo(String value) {
            addCriterion("PARENT_CITY_CODE6 <=", value, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6Like(String value) {
            addCriterion("PARENT_CITY_CODE6 like", value, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6NotLike(String value) {
            addCriterion("PARENT_CITY_CODE6 not like", value, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6In(List<String> values) {
            addCriterion("PARENT_CITY_CODE6 in", values, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6NotIn(List<String> values) {
            addCriterion("PARENT_CITY_CODE6 not in", values, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6Between(String value1, String value2) {
            addCriterion("PARENT_CITY_CODE6 between", value1, value2, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode6NotBetween(String value1, String value2) {
            addCriterion("PARENT_CITY_CODE6 not between", value1, value2, "parentCityCode6");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3IsNull() {
            addCriterion("PARENT_CITY_CODE3 is null");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3IsNotNull() {
            addCriterion("PARENT_CITY_CODE3 is not null");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3EqualTo(String value) {
            addCriterion("PARENT_CITY_CODE3 =", value, "parentCityCode3");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3NotEqualTo(String value) {
            addCriterion("PARENT_CITY_CODE3 <>", value, "parentCityCode3");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3GreaterThan(String value) {
            addCriterion("PARENT_CITY_CODE3 >", value, "parentCityCode3");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CITY_CODE3 >=", value, "parentCityCode3");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3LessThan(String value) {
            addCriterion("PARENT_CITY_CODE3 <", value, "parentCityCode3");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3LessThanOrEqualTo(String value) {
            addCriterion("PARENT_CITY_CODE3 <=", value, "parentCityCode3");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3Like(String value) {
            addCriterion("PARENT_CITY_CODE3 like", value, "parentCityCode3");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3NotLike(String value) {
            addCriterion("PARENT_CITY_CODE3 not like", value, "parentCityCode3");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3In(List<String> values) {
            addCriterion("PARENT_CITY_CODE3 in", values, "parentCityCode3");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3NotIn(List<String> values) {
            addCriterion("PARENT_CITY_CODE3 not in", values, "parentCityCode3");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3Between(String value1, String value2) {
            addCriterion("PARENT_CITY_CODE3 between", value1, value2, "parentCityCode3");
            return (Criteria) this;
        }

        public Criteria andParentCityCode3NotBetween(String value1, String value2) {
            addCriterion("PARENT_CITY_CODE3 not between", value1, value2, "parentCityCode3");
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

        public Criteria andLastModifyDateIsNull() {
            addCriterion("LAST_MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNotNull() {
            addCriterion("LAST_MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE =", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <>", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_DATE >", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE >=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThan(Date value) {
            addCriterion("LAST_MODIFY_DATE <", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE not in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE not between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdIsNull() {
            addCriterion("LAST_MODIFY_OP_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdIsNotNull() {
            addCriterion("LAST_MODIFY_OP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdEqualTo(Long value) {
            addCriterion("LAST_MODIFY_OP_ID =", value, "lastModifyOpId");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdNotEqualTo(Long value) {
            addCriterion("LAST_MODIFY_OP_ID <>", value, "lastModifyOpId");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdGreaterThan(Long value) {
            addCriterion("LAST_MODIFY_OP_ID >", value, "lastModifyOpId");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_MODIFY_OP_ID >=", value, "lastModifyOpId");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdLessThan(Long value) {
            addCriterion("LAST_MODIFY_OP_ID <", value, "lastModifyOpId");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdLessThanOrEqualTo(Long value) {
            addCriterion("LAST_MODIFY_OP_ID <=", value, "lastModifyOpId");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdIn(List<Long> values) {
            addCriterion("LAST_MODIFY_OP_ID in", values, "lastModifyOpId");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdNotIn(List<Long> values) {
            addCriterion("LAST_MODIFY_OP_ID not in", values, "lastModifyOpId");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdBetween(Long value1, Long value2) {
            addCriterion("LAST_MODIFY_OP_ID between", value1, value2, "lastModifyOpId");
            return (Criteria) this;
        }

        public Criteria andLastModifyOpIdNotBetween(Long value1, Long value2) {
            addCriterion("LAST_MODIFY_OP_ID not between", value1, value2, "lastModifyOpId");
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

        public Criteria andRegionPyszIsNull() {
            addCriterion("REGION_PYSZ is null");
            return (Criteria) this;
        }

        public Criteria andRegionPyszIsNotNull() {
            addCriterion("REGION_PYSZ is not null");
            return (Criteria) this;
        }

        public Criteria andRegionPyszEqualTo(String value) {
            addCriterion("REGION_PYSZ =", value, "regionPysz");
            return (Criteria) this;
        }

        public Criteria andRegionPyszNotEqualTo(String value) {
            addCriterion("REGION_PYSZ <>", value, "regionPysz");
            return (Criteria) this;
        }

        public Criteria andRegionPyszGreaterThan(String value) {
            addCriterion("REGION_PYSZ >", value, "regionPysz");
            return (Criteria) this;
        }

        public Criteria andRegionPyszGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_PYSZ >=", value, "regionPysz");
            return (Criteria) this;
        }

        public Criteria andRegionPyszLessThan(String value) {
            addCriterion("REGION_PYSZ <", value, "regionPysz");
            return (Criteria) this;
        }

        public Criteria andRegionPyszLessThanOrEqualTo(String value) {
            addCriterion("REGION_PYSZ <=", value, "regionPysz");
            return (Criteria) this;
        }

        public Criteria andRegionPyszLike(String value) {
            addCriterion("REGION_PYSZ like", value, "regionPysz");
            return (Criteria) this;
        }

        public Criteria andRegionPyszNotLike(String value) {
            addCriterion("REGION_PYSZ not like", value, "regionPysz");
            return (Criteria) this;
        }

        public Criteria andRegionPyszIn(List<String> values) {
            addCriterion("REGION_PYSZ in", values, "regionPysz");
            return (Criteria) this;
        }

        public Criteria andRegionPyszNotIn(List<String> values) {
            addCriterion("REGION_PYSZ not in", values, "regionPysz");
            return (Criteria) this;
        }

        public Criteria andRegionPyszBetween(String value1, String value2) {
            addCriterion("REGION_PYSZ between", value1, value2, "regionPysz");
            return (Criteria) this;
        }

        public Criteria andRegionPyszNotBetween(String value1, String value2) {
            addCriterion("REGION_PYSZ not between", value1, value2, "regionPysz");
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