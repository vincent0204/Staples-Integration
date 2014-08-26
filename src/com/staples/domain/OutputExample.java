package com.staples.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OutputExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutputExample() {
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

        public Criteria andSapRefNoIsNull() {
            addCriterion("SAP_REF_NO is null");
            return (Criteria) this;
        }

        public Criteria andSapRefNoIsNotNull() {
            addCriterion("SAP_REF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSapRefNoEqualTo(String value) {
            addCriterion("SAP_REF_NO =", value, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andSapRefNoNotEqualTo(String value) {
            addCriterion("SAP_REF_NO <>", value, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andSapRefNoGreaterThan(String value) {
            addCriterion("SAP_REF_NO >", value, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andSapRefNoGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_REF_NO >=", value, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andSapRefNoLessThan(String value) {
            addCriterion("SAP_REF_NO <", value, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andSapRefNoLessThanOrEqualTo(String value) {
            addCriterion("SAP_REF_NO <=", value, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andSapRefNoLike(String value) {
            addCriterion("SAP_REF_NO like", value, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andSapRefNoNotLike(String value) {
            addCriterion("SAP_REF_NO not like", value, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andSapRefNoIn(List<String> values) {
            addCriterion("SAP_REF_NO in", values, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andSapRefNoNotIn(List<String> values) {
            addCriterion("SAP_REF_NO not in", values, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andSapRefNoBetween(String value1, String value2) {
            addCriterion("SAP_REF_NO between", value1, value2, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andSapRefNoNotBetween(String value1, String value2) {
            addCriterion("SAP_REF_NO not between", value1, value2, "sapRefNo");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("ACCOUNT_NAME =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("ACCOUNT_NAME >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("ACCOUNT_NAME <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("ACCOUNT_NAME like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("ACCOUNT_NAME not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("ACCOUNT_NAME in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("ACCOUNT_NAME not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentIsNull() {
            addCriterion("PROVINCE_SEGMENT is null");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentIsNotNull() {
            addCriterion("PROVINCE_SEGMENT is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentEqualTo(String value) {
            addCriterion("PROVINCE_SEGMENT =", value, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentNotEqualTo(String value) {
            addCriterion("PROVINCE_SEGMENT <>", value, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentGreaterThan(String value) {
            addCriterion("PROVINCE_SEGMENT >", value, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_SEGMENT >=", value, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentLessThan(String value) {
            addCriterion("PROVINCE_SEGMENT <", value, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_SEGMENT <=", value, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentLike(String value) {
            addCriterion("PROVINCE_SEGMENT like", value, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentNotLike(String value) {
            addCriterion("PROVINCE_SEGMENT not like", value, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentIn(List<String> values) {
            addCriterion("PROVINCE_SEGMENT in", values, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentNotIn(List<String> values) {
            addCriterion("PROVINCE_SEGMENT not in", values, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentBetween(String value1, String value2) {
            addCriterion("PROVINCE_SEGMENT between", value1, value2, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andProvinceSegmentNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_SEGMENT not between", value1, value2, "provinceSegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentIsNull() {
            addCriterion("CITY_SEGMENT is null");
            return (Criteria) this;
        }

        public Criteria andCitySegmentIsNotNull() {
            addCriterion("CITY_SEGMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCitySegmentEqualTo(String value) {
            addCriterion("CITY_SEGMENT =", value, "citySegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentNotEqualTo(String value) {
            addCriterion("CITY_SEGMENT <>", value, "citySegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentGreaterThan(String value) {
            addCriterion("CITY_SEGMENT >", value, "citySegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_SEGMENT >=", value, "citySegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentLessThan(String value) {
            addCriterion("CITY_SEGMENT <", value, "citySegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentLessThanOrEqualTo(String value) {
            addCriterion("CITY_SEGMENT <=", value, "citySegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentLike(String value) {
            addCriterion("CITY_SEGMENT like", value, "citySegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentNotLike(String value) {
            addCriterion("CITY_SEGMENT not like", value, "citySegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentIn(List<String> values) {
            addCriterion("CITY_SEGMENT in", values, "citySegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentNotIn(List<String> values) {
            addCriterion("CITY_SEGMENT not in", values, "citySegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentBetween(String value1, String value2) {
            addCriterion("CITY_SEGMENT between", value1, value2, "citySegment");
            return (Criteria) this;
        }

        public Criteria andCitySegmentNotBetween(String value1, String value2) {
            addCriterion("CITY_SEGMENT not between", value1, value2, "citySegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentIsNull() {
            addCriterion("DISTRICT_SEGMENT is null");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentIsNotNull() {
            addCriterion("DISTRICT_SEGMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentEqualTo(String value) {
            addCriterion("DISTRICT_SEGMENT =", value, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentNotEqualTo(String value) {
            addCriterion("DISTRICT_SEGMENT <>", value, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentGreaterThan(String value) {
            addCriterion("DISTRICT_SEGMENT >", value, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT_SEGMENT >=", value, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentLessThan(String value) {
            addCriterion("DISTRICT_SEGMENT <", value, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT_SEGMENT <=", value, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentLike(String value) {
            addCriterion("DISTRICT_SEGMENT like", value, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentNotLike(String value) {
            addCriterion("DISTRICT_SEGMENT not like", value, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentIn(List<String> values) {
            addCriterion("DISTRICT_SEGMENT in", values, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentNotIn(List<String> values) {
            addCriterion("DISTRICT_SEGMENT not in", values, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentBetween(String value1, String value2) {
            addCriterion("DISTRICT_SEGMENT between", value1, value2, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andDistrictSegmentNotBetween(String value1, String value2) {
            addCriterion("DISTRICT_SEGMENT not between", value1, value2, "districtSegment");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNull() {
            addCriterion("PHONE2 is null");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNotNull() {
            addCriterion("PHONE2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone2EqualTo(String value) {
            addCriterion("PHONE2 =", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotEqualTo(String value) {
            addCriterion("PHONE2 <>", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThan(String value) {
            addCriterion("PHONE2 >", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("PHONE2 >=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThan(String value) {
            addCriterion("PHONE2 <", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThanOrEqualTo(String value) {
            addCriterion("PHONE2 <=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Like(String value) {
            addCriterion("PHONE2 like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotLike(String value) {
            addCriterion("PHONE2 not like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2In(List<String> values) {
            addCriterion("PHONE2 in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotIn(List<String> values) {
            addCriterion("PHONE2 not in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Between(String value1, String value2) {
            addCriterion("PHONE2 between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotBetween(String value1, String value2) {
            addCriterion("PHONE2 not between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andStaffIsNull() {
            addCriterion("STAFF is null");
            return (Criteria) this;
        }

        public Criteria andStaffIsNotNull() {
            addCriterion("STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEqualTo(BigDecimal value) {
            addCriterion("STAFF =", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotEqualTo(BigDecimal value) {
            addCriterion("STAFF <>", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffGreaterThan(BigDecimal value) {
            addCriterion("STAFF >", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STAFF >=", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffLessThan(BigDecimal value) {
            addCriterion("STAFF <", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STAFF <=", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffIn(List<BigDecimal> values) {
            addCriterion("STAFF in", values, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotIn(List<BigDecimal> values) {
            addCriterion("STAFF not in", values, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STAFF between", value1, value2, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STAFF not between", value1, value2, "staff");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("INDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("INDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("INDUSTRY =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("INDUSTRY <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("INDUSTRY >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("INDUSTRY <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("INDUSTRY like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("INDUSTRY not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("INDUSTRY in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("INDUSTRY not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("INDUSTRY between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andAccountSourceIsNull() {
            addCriterion("ACCOUNT_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andAccountSourceIsNotNull() {
            addCriterion("ACCOUNT_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSourceEqualTo(String value) {
            addCriterion("ACCOUNT_SOURCE =", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceNotEqualTo(String value) {
            addCriterion("ACCOUNT_SOURCE <>", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceGreaterThan(String value) {
            addCriterion("ACCOUNT_SOURCE >", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_SOURCE >=", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceLessThan(String value) {
            addCriterion("ACCOUNT_SOURCE <", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_SOURCE <=", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceLike(String value) {
            addCriterion("ACCOUNT_SOURCE like", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceNotLike(String value) {
            addCriterion("ACCOUNT_SOURCE not like", value, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceIn(List<String> values) {
            addCriterion("ACCOUNT_SOURCE in", values, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceNotIn(List<String> values) {
            addCriterion("ACCOUNT_SOURCE not in", values, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceBetween(String value1, String value2) {
            addCriterion("ACCOUNT_SOURCE between", value1, value2, "accountSource");
            return (Criteria) this;
        }

        public Criteria andAccountSourceNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_SOURCE not between", value1, value2, "accountSource");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNull() {
            addCriterion("PURCHASE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNotNull() {
            addCriterion("PURCHASE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEqualTo(String value) {
            addCriterion("PURCHASE_TYPE =", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotEqualTo(String value) {
            addCriterion("PURCHASE_TYPE <>", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThan(String value) {
            addCriterion("PURCHASE_TYPE >", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_TYPE >=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThan(String value) {
            addCriterion("PURCHASE_TYPE <", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_TYPE <=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLike(String value) {
            addCriterion("PURCHASE_TYPE like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotLike(String value) {
            addCriterion("PURCHASE_TYPE not like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIn(List<String> values) {
            addCriterion("PURCHASE_TYPE in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotIn(List<String> values) {
            addCriterion("PURCHASE_TYPE not in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeBetween(String value1, String value2) {
            addCriterion("PURCHASE_TYPE between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_TYPE not between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("CUSTOMER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("CUSTOMER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("CUSTOMER_TYPE >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("CUSTOMER_TYPE <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("CUSTOMER_TYPE like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("CUSTOMER_TYPE not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andBdSalesIsNull() {
            addCriterion("BD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andBdSalesIsNotNull() {
            addCriterion("BD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andBdSalesEqualTo(String value) {
            addCriterion("BD_SALES =", value, "bdSales");
            return (Criteria) this;
        }

        public Criteria andBdSalesNotEqualTo(String value) {
            addCriterion("BD_SALES <>", value, "bdSales");
            return (Criteria) this;
        }

        public Criteria andBdSalesGreaterThan(String value) {
            addCriterion("BD_SALES >", value, "bdSales");
            return (Criteria) this;
        }

        public Criteria andBdSalesGreaterThanOrEqualTo(String value) {
            addCriterion("BD_SALES >=", value, "bdSales");
            return (Criteria) this;
        }

        public Criteria andBdSalesLessThan(String value) {
            addCriterion("BD_SALES <", value, "bdSales");
            return (Criteria) this;
        }

        public Criteria andBdSalesLessThanOrEqualTo(String value) {
            addCriterion("BD_SALES <=", value, "bdSales");
            return (Criteria) this;
        }

        public Criteria andBdSalesLike(String value) {
            addCriterion("BD_SALES like", value, "bdSales");
            return (Criteria) this;
        }

        public Criteria andBdSalesNotLike(String value) {
            addCriterion("BD_SALES not like", value, "bdSales");
            return (Criteria) this;
        }

        public Criteria andBdSalesIn(List<String> values) {
            addCriterion("BD_SALES in", values, "bdSales");
            return (Criteria) this;
        }

        public Criteria andBdSalesNotIn(List<String> values) {
            addCriterion("BD_SALES not in", values, "bdSales");
            return (Criteria) this;
        }

        public Criteria andBdSalesBetween(String value1, String value2) {
            addCriterion("BD_SALES between", value1, value2, "bdSales");
            return (Criteria) this;
        }

        public Criteria andBdSalesNotBetween(String value1, String value2) {
            addCriterion("BD_SALES not between", value1, value2, "bdSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesIsNull() {
            addCriterion("AM_SALES is null");
            return (Criteria) this;
        }

        public Criteria andAmSalesIsNotNull() {
            addCriterion("AM_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andAmSalesEqualTo(String value) {
            addCriterion("AM_SALES =", value, "amSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesNotEqualTo(String value) {
            addCriterion("AM_SALES <>", value, "amSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesGreaterThan(String value) {
            addCriterion("AM_SALES >", value, "amSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesGreaterThanOrEqualTo(String value) {
            addCriterion("AM_SALES >=", value, "amSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesLessThan(String value) {
            addCriterion("AM_SALES <", value, "amSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesLessThanOrEqualTo(String value) {
            addCriterion("AM_SALES <=", value, "amSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesLike(String value) {
            addCriterion("AM_SALES like", value, "amSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesNotLike(String value) {
            addCriterion("AM_SALES not like", value, "amSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesIn(List<String> values) {
            addCriterion("AM_SALES in", values, "amSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesNotIn(List<String> values) {
            addCriterion("AM_SALES not in", values, "amSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesBetween(String value1, String value2) {
            addCriterion("AM_SALES between", value1, value2, "amSales");
            return (Criteria) this;
        }

        public Criteria andAmSalesNotBetween(String value1, String value2) {
            addCriterion("AM_SALES not between", value1, value2, "amSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesIsNull() {
            addCriterion("SAM_SALES is null");
            return (Criteria) this;
        }

        public Criteria andSamSalesIsNotNull() {
            addCriterion("SAM_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andSamSalesEqualTo(String value) {
            addCriterion("SAM_SALES =", value, "samSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesNotEqualTo(String value) {
            addCriterion("SAM_SALES <>", value, "samSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesGreaterThan(String value) {
            addCriterion("SAM_SALES >", value, "samSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesGreaterThanOrEqualTo(String value) {
            addCriterion("SAM_SALES >=", value, "samSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesLessThan(String value) {
            addCriterion("SAM_SALES <", value, "samSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesLessThanOrEqualTo(String value) {
            addCriterion("SAM_SALES <=", value, "samSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesLike(String value) {
            addCriterion("SAM_SALES like", value, "samSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesNotLike(String value) {
            addCriterion("SAM_SALES not like", value, "samSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesIn(List<String> values) {
            addCriterion("SAM_SALES in", values, "samSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesNotIn(List<String> values) {
            addCriterion("SAM_SALES not in", values, "samSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesBetween(String value1, String value2) {
            addCriterion("SAM_SALES between", value1, value2, "samSales");
            return (Criteria) this;
        }

        public Criteria andSamSalesNotBetween(String value1, String value2) {
            addCriterion("SAM_SALES not between", value1, value2, "samSales");
            return (Criteria) this;
        }

        public Criteria andTelephonistIsNull() {
            addCriterion("TELEPHONIST is null");
            return (Criteria) this;
        }

        public Criteria andTelephonistIsNotNull() {
            addCriterion("TELEPHONIST is not null");
            return (Criteria) this;
        }

        public Criteria andTelephonistEqualTo(String value) {
            addCriterion("TELEPHONIST =", value, "telephonist");
            return (Criteria) this;
        }

        public Criteria andTelephonistNotEqualTo(String value) {
            addCriterion("TELEPHONIST <>", value, "telephonist");
            return (Criteria) this;
        }

        public Criteria andTelephonistGreaterThan(String value) {
            addCriterion("TELEPHONIST >", value, "telephonist");
            return (Criteria) this;
        }

        public Criteria andTelephonistGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONIST >=", value, "telephonist");
            return (Criteria) this;
        }

        public Criteria andTelephonistLessThan(String value) {
            addCriterion("TELEPHONIST <", value, "telephonist");
            return (Criteria) this;
        }

        public Criteria andTelephonistLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONIST <=", value, "telephonist");
            return (Criteria) this;
        }

        public Criteria andTelephonistLike(String value) {
            addCriterion("TELEPHONIST like", value, "telephonist");
            return (Criteria) this;
        }

        public Criteria andTelephonistNotLike(String value) {
            addCriterion("TELEPHONIST not like", value, "telephonist");
            return (Criteria) this;
        }

        public Criteria andTelephonistIn(List<String> values) {
            addCriterion("TELEPHONIST in", values, "telephonist");
            return (Criteria) this;
        }

        public Criteria andTelephonistNotIn(List<String> values) {
            addCriterion("TELEPHONIST not in", values, "telephonist");
            return (Criteria) this;
        }

        public Criteria andTelephonistBetween(String value1, String value2) {
            addCriterion("TELEPHONIST between", value1, value2, "telephonist");
            return (Criteria) this;
        }

        public Criteria andTelephonistNotBetween(String value1, String value2) {
            addCriterion("TELEPHONIST not between", value1, value2, "telephonist");
            return (Criteria) this;
        }

        public Criteria andStatementPersonIsNull() {
            addCriterion("STATEMENT_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andStatementPersonIsNotNull() {
            addCriterion("STATEMENT_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andStatementPersonEqualTo(String value) {
            addCriterion("STATEMENT_PERSON =", value, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andStatementPersonNotEqualTo(String value) {
            addCriterion("STATEMENT_PERSON <>", value, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andStatementPersonGreaterThan(String value) {
            addCriterion("STATEMENT_PERSON >", value, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andStatementPersonGreaterThanOrEqualTo(String value) {
            addCriterion("STATEMENT_PERSON >=", value, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andStatementPersonLessThan(String value) {
            addCriterion("STATEMENT_PERSON <", value, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andStatementPersonLessThanOrEqualTo(String value) {
            addCriterion("STATEMENT_PERSON <=", value, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andStatementPersonLike(String value) {
            addCriterion("STATEMENT_PERSON like", value, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andStatementPersonNotLike(String value) {
            addCriterion("STATEMENT_PERSON not like", value, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andStatementPersonIn(List<String> values) {
            addCriterion("STATEMENT_PERSON in", values, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andStatementPersonNotIn(List<String> values) {
            addCriterion("STATEMENT_PERSON not in", values, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andStatementPersonBetween(String value1, String value2) {
            addCriterion("STATEMENT_PERSON between", value1, value2, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andStatementPersonNotBetween(String value1, String value2) {
            addCriterion("STATEMENT_PERSON not between", value1, value2, "statementPerson");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteIsNull() {
            addCriterion("IS_OBSOLETE is null");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteIsNotNull() {
            addCriterion("IS_OBSOLETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteEqualTo(String value) {
            addCriterion("IS_OBSOLETE =", value, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteNotEqualTo(String value) {
            addCriterion("IS_OBSOLETE <>", value, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteGreaterThan(String value) {
            addCriterion("IS_OBSOLETE >", value, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OBSOLETE >=", value, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteLessThan(String value) {
            addCriterion("IS_OBSOLETE <", value, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteLessThanOrEqualTo(String value) {
            addCriterion("IS_OBSOLETE <=", value, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteLike(String value) {
            addCriterion("IS_OBSOLETE like", value, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteNotLike(String value) {
            addCriterion("IS_OBSOLETE not like", value, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteIn(List<String> values) {
            addCriterion("IS_OBSOLETE in", values, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteNotIn(List<String> values) {
            addCriterion("IS_OBSOLETE not in", values, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteBetween(String value1, String value2) {
            addCriterion("IS_OBSOLETE between", value1, value2, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andIsObsoleteNotBetween(String value1, String value2) {
            addCriterion("IS_OBSOLETE not between", value1, value2, "isObsolete");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateIsNull() {
            addCriterion("FIRST_ORDER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateIsNotNull() {
            addCriterion("FIRST_ORDER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateEqualTo(String value) {
            addCriterion("FIRST_ORDER_DATE =", value, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateNotEqualTo(String value) {
            addCriterion("FIRST_ORDER_DATE <>", value, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateGreaterThan(String value) {
            addCriterion("FIRST_ORDER_DATE >", value, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_ORDER_DATE >=", value, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateLessThan(String value) {
            addCriterion("FIRST_ORDER_DATE <", value, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateLessThanOrEqualTo(String value) {
            addCriterion("FIRST_ORDER_DATE <=", value, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateLike(String value) {
            addCriterion("FIRST_ORDER_DATE like", value, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateNotLike(String value) {
            addCriterion("FIRST_ORDER_DATE not like", value, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateIn(List<String> values) {
            addCriterion("FIRST_ORDER_DATE in", values, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateNotIn(List<String> values) {
            addCriterion("FIRST_ORDER_DATE not in", values, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateBetween(String value1, String value2) {
            addCriterion("FIRST_ORDER_DATE between", value1, value2, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andFirstOrderDateNotBetween(String value1, String value2) {
            addCriterion("FIRST_ORDER_DATE not between", value1, value2, "firstOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateIsNull() {
            addCriterion("LAST_ORDER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateIsNotNull() {
            addCriterion("LAST_ORDER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateEqualTo(String value) {
            addCriterion("LAST_ORDER_DATE =", value, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateNotEqualTo(String value) {
            addCriterion("LAST_ORDER_DATE <>", value, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateGreaterThan(String value) {
            addCriterion("LAST_ORDER_DATE >", value, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_ORDER_DATE >=", value, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateLessThan(String value) {
            addCriterion("LAST_ORDER_DATE <", value, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateLessThanOrEqualTo(String value) {
            addCriterion("LAST_ORDER_DATE <=", value, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateLike(String value) {
            addCriterion("LAST_ORDER_DATE like", value, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateNotLike(String value) {
            addCriterion("LAST_ORDER_DATE not like", value, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateIn(List<String> values) {
            addCriterion("LAST_ORDER_DATE in", values, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateNotIn(List<String> values) {
            addCriterion("LAST_ORDER_DATE not in", values, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateBetween(String value1, String value2) {
            addCriterion("LAST_ORDER_DATE between", value1, value2, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLastOrderDateNotBetween(String value1, String value2) {
            addCriterion("LAST_ORDER_DATE not between", value1, value2, "lastOrderDate");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoIsNull() {
            addCriterion("SAP_GROUP_NO is null");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoIsNotNull() {
            addCriterion("SAP_GROUP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoEqualTo(String value) {
            addCriterion("SAP_GROUP_NO =", value, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoNotEqualTo(String value) {
            addCriterion("SAP_GROUP_NO <>", value, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoGreaterThan(String value) {
            addCriterion("SAP_GROUP_NO >", value, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoGreaterThanOrEqualTo(String value) {
            addCriterion("SAP_GROUP_NO >=", value, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoLessThan(String value) {
            addCriterion("SAP_GROUP_NO <", value, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoLessThanOrEqualTo(String value) {
            addCriterion("SAP_GROUP_NO <=", value, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoLike(String value) {
            addCriterion("SAP_GROUP_NO like", value, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoNotLike(String value) {
            addCriterion("SAP_GROUP_NO not like", value, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoIn(List<String> values) {
            addCriterion("SAP_GROUP_NO in", values, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoNotIn(List<String> values) {
            addCriterion("SAP_GROUP_NO not in", values, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoBetween(String value1, String value2) {
            addCriterion("SAP_GROUP_NO between", value1, value2, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andSapGroupNoNotBetween(String value1, String value2) {
            addCriterion("SAP_GROUP_NO not between", value1, value2, "sapGroupNo");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginIsNull() {
            addCriterion("TY_YTD_MARGIN is null");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginIsNotNull() {
            addCriterion("TY_YTD_MARGIN is not null");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_MARGIN =", value, "tyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginNotEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_MARGIN <>", value, "tyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginGreaterThan(BigDecimal value) {
            addCriterion("TY_YTD_MARGIN >", value, "tyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_MARGIN >=", value, "tyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginLessThan(BigDecimal value) {
            addCriterion("TY_YTD_MARGIN <", value, "tyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_MARGIN <=", value, "tyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginIn(List<BigDecimal> values) {
            addCriterion("TY_YTD_MARGIN in", values, "tyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginNotIn(List<BigDecimal> values) {
            addCriterion("TY_YTD_MARGIN not in", values, "tyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_YTD_MARGIN between", value1, value2, "tyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyYtdMarginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_YTD_MARGIN not between", value1, value2, "tyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesIsNull() {
            addCriterion("TY_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesIsNotNull() {
            addCriterion("TY_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_SALES =", value, "tyYtdSales");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_SALES <>", value, "tyYtdSales");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("TY_YTD_SALES >", value, "tyYtdSales");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_SALES >=", value, "tyYtdSales");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesLessThan(BigDecimal value) {
            addCriterion("TY_YTD_SALES <", value, "tyYtdSales");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_SALES <=", value, "tyYtdSales");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesIn(List<BigDecimal> values) {
            addCriterion("TY_YTD_SALES in", values, "tyYtdSales");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("TY_YTD_SALES not in", values, "tyYtdSales");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_YTD_SALES between", value1, value2, "tyYtdSales");
            return (Criteria) this;
        }

        public Criteria andTyYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_YTD_SALES not between", value1, value2, "tyYtdSales");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountIsNull() {
            addCriterion("TY_YTD_ORDER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountIsNotNull() {
            addCriterion("TY_YTD_ORDER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_ORDER_COUNT =", value, "tyYtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountNotEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_ORDER_COUNT <>", value, "tyYtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountGreaterThan(BigDecimal value) {
            addCriterion("TY_YTD_ORDER_COUNT >", value, "tyYtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_ORDER_COUNT >=", value, "tyYtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountLessThan(BigDecimal value) {
            addCriterion("TY_YTD_ORDER_COUNT <", value, "tyYtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_ORDER_COUNT <=", value, "tyYtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountIn(List<BigDecimal> values) {
            addCriterion("TY_YTD_ORDER_COUNT in", values, "tyYtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountNotIn(List<BigDecimal> values) {
            addCriterion("TY_YTD_ORDER_COUNT not in", values, "tyYtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_YTD_ORDER_COUNT between", value1, value2, "tyYtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdOrderCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_YTD_ORDER_COUNT not between", value1, value2, "tyYtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountIsNull() {
            addCriterion("TY_YTD_MONTH_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountIsNotNull() {
            addCriterion("TY_YTD_MONTH_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_MONTH_COUNT =", value, "tyYtdMonthCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountNotEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_MONTH_COUNT <>", value, "tyYtdMonthCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountGreaterThan(BigDecimal value) {
            addCriterion("TY_YTD_MONTH_COUNT >", value, "tyYtdMonthCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_MONTH_COUNT >=", value, "tyYtdMonthCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountLessThan(BigDecimal value) {
            addCriterion("TY_YTD_MONTH_COUNT <", value, "tyYtdMonthCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_YTD_MONTH_COUNT <=", value, "tyYtdMonthCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountIn(List<BigDecimal> values) {
            addCriterion("TY_YTD_MONTH_COUNT in", values, "tyYtdMonthCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountNotIn(List<BigDecimal> values) {
            addCriterion("TY_YTD_MONTH_COUNT not in", values, "tyYtdMonthCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_YTD_MONTH_COUNT between", value1, value2, "tyYtdMonthCount");
            return (Criteria) this;
        }

        public Criteria andTyYtdMonthCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_YTD_MONTH_COUNT not between", value1, value2, "tyYtdMonthCount");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginIsNull() {
            addCriterion("TY_MTD_MARGIN is null");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginIsNotNull() {
            addCriterion("TY_MTD_MARGIN is not null");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_MARGIN =", value, "tyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginNotEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_MARGIN <>", value, "tyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginGreaterThan(BigDecimal value) {
            addCriterion("TY_MTD_MARGIN >", value, "tyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_MARGIN >=", value, "tyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginLessThan(BigDecimal value) {
            addCriterion("TY_MTD_MARGIN <", value, "tyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_MARGIN <=", value, "tyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginIn(List<BigDecimal> values) {
            addCriterion("TY_MTD_MARGIN in", values, "tyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginNotIn(List<BigDecimal> values) {
            addCriterion("TY_MTD_MARGIN not in", values, "tyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_MTD_MARGIN between", value1, value2, "tyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyMtdMarginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_MTD_MARGIN not between", value1, value2, "tyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesIsNull() {
            addCriterion("TY_MTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesIsNotNull() {
            addCriterion("TY_MTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_SALES =", value, "tyMtdSales");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_SALES <>", value, "tyMtdSales");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesGreaterThan(BigDecimal value) {
            addCriterion("TY_MTD_SALES >", value, "tyMtdSales");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_SALES >=", value, "tyMtdSales");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesLessThan(BigDecimal value) {
            addCriterion("TY_MTD_SALES <", value, "tyMtdSales");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_SALES <=", value, "tyMtdSales");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesIn(List<BigDecimal> values) {
            addCriterion("TY_MTD_SALES in", values, "tyMtdSales");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("TY_MTD_SALES not in", values, "tyMtdSales");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_MTD_SALES between", value1, value2, "tyMtdSales");
            return (Criteria) this;
        }

        public Criteria andTyMtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_MTD_SALES not between", value1, value2, "tyMtdSales");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountIsNull() {
            addCriterion("TY_MTD_ORDER_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountIsNotNull() {
            addCriterion("TY_MTD_ORDER_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_ORDER_COUNT =", value, "tyMtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountNotEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_ORDER_COUNT <>", value, "tyMtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountGreaterThan(BigDecimal value) {
            addCriterion("TY_MTD_ORDER_COUNT >", value, "tyMtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_ORDER_COUNT >=", value, "tyMtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountLessThan(BigDecimal value) {
            addCriterion("TY_MTD_ORDER_COUNT <", value, "tyMtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TY_MTD_ORDER_COUNT <=", value, "tyMtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountIn(List<BigDecimal> values) {
            addCriterion("TY_MTD_ORDER_COUNT in", values, "tyMtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountNotIn(List<BigDecimal> values) {
            addCriterion("TY_MTD_ORDER_COUNT not in", values, "tyMtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_MTD_ORDER_COUNT between", value1, value2, "tyMtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andTyMtdOrderCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TY_MTD_ORDER_COUNT not between", value1, value2, "tyMtdOrderCount");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesIsNull() {
            addCriterion("LY_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesIsNotNull() {
            addCriterion("LY_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesEqualTo(BigDecimal value) {
            addCriterion("LY_YTD_SALES =", value, "lyYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("LY_YTD_SALES <>", value, "lyYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("LY_YTD_SALES >", value, "lyYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_YTD_SALES >=", value, "lyYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesLessThan(BigDecimal value) {
            addCriterion("LY_YTD_SALES <", value, "lyYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_YTD_SALES <=", value, "lyYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesIn(List<BigDecimal> values) {
            addCriterion("LY_YTD_SALES in", values, "lyYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("LY_YTD_SALES not in", values, "lyYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_YTD_SALES between", value1, value2, "lyYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_YTD_SALES not between", value1, value2, "lyYtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesIsNull() {
            addCriterion("BLY_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesIsNotNull() {
            addCriterion("BLY_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesEqualTo(BigDecimal value) {
            addCriterion("BLY_YTD_SALES =", value, "blyYtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("BLY_YTD_SALES <>", value, "blyYtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("BLY_YTD_SALES >", value, "blyYtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BLY_YTD_SALES >=", value, "blyYtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesLessThan(BigDecimal value) {
            addCriterion("BLY_YTD_SALES <", value, "blyYtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BLY_YTD_SALES <=", value, "blyYtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesIn(List<BigDecimal> values) {
            addCriterion("BLY_YTD_SALES in", values, "blyYtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("BLY_YTD_SALES not in", values, "blyYtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLY_YTD_SALES between", value1, value2, "blyYtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLY_YTD_SALES not between", value1, value2, "blyYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginIsNull() {
            addCriterion("LY_YTD_MARGIN is null");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginIsNotNull() {
            addCriterion("LY_YTD_MARGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginEqualTo(BigDecimal value) {
            addCriterion("LY_YTD_MARGIN =", value, "lyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginNotEqualTo(BigDecimal value) {
            addCriterion("LY_YTD_MARGIN <>", value, "lyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginGreaterThan(BigDecimal value) {
            addCriterion("LY_YTD_MARGIN >", value, "lyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_YTD_MARGIN >=", value, "lyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginLessThan(BigDecimal value) {
            addCriterion("LY_YTD_MARGIN <", value, "lyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_YTD_MARGIN <=", value, "lyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginIn(List<BigDecimal> values) {
            addCriterion("LY_YTD_MARGIN in", values, "lyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginNotIn(List<BigDecimal> values) {
            addCriterion("LY_YTD_MARGIN not in", values, "lyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_YTD_MARGIN between", value1, value2, "lyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyYtdMarginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_YTD_MARGIN not between", value1, value2, "lyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginIsNull() {
            addCriterion("BLY_YTD_MARGIN is null");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginIsNotNull() {
            addCriterion("BLY_YTD_MARGIN is not null");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginEqualTo(BigDecimal value) {
            addCriterion("BLY_YTD_MARGIN =", value, "blyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginNotEqualTo(BigDecimal value) {
            addCriterion("BLY_YTD_MARGIN <>", value, "blyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginGreaterThan(BigDecimal value) {
            addCriterion("BLY_YTD_MARGIN >", value, "blyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BLY_YTD_MARGIN >=", value, "blyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginLessThan(BigDecimal value) {
            addCriterion("BLY_YTD_MARGIN <", value, "blyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BLY_YTD_MARGIN <=", value, "blyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginIn(List<BigDecimal> values) {
            addCriterion("BLY_YTD_MARGIN in", values, "blyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginNotIn(List<BigDecimal> values) {
            addCriterion("BLY_YTD_MARGIN not in", values, "blyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLY_YTD_MARGIN between", value1, value2, "blyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyYtdMarginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLY_YTD_MARGIN not between", value1, value2, "blyYtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesIsNull() {
            addCriterion("LY_MTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesIsNotNull() {
            addCriterion("LY_MTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesEqualTo(BigDecimal value) {
            addCriterion("LY_MTD_SALES =", value, "lyMtdSales");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("LY_MTD_SALES <>", value, "lyMtdSales");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesGreaterThan(BigDecimal value) {
            addCriterion("LY_MTD_SALES >", value, "lyMtdSales");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_MTD_SALES >=", value, "lyMtdSales");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesLessThan(BigDecimal value) {
            addCriterion("LY_MTD_SALES <", value, "lyMtdSales");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_MTD_SALES <=", value, "lyMtdSales");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesIn(List<BigDecimal> values) {
            addCriterion("LY_MTD_SALES in", values, "lyMtdSales");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("LY_MTD_SALES not in", values, "lyMtdSales");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_MTD_SALES between", value1, value2, "lyMtdSales");
            return (Criteria) this;
        }

        public Criteria andLyMtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_MTD_SALES not between", value1, value2, "lyMtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesIsNull() {
            addCriterion("BLY_MTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesIsNotNull() {
            addCriterion("BLY_MTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesEqualTo(BigDecimal value) {
            addCriterion("BLY_MTD_SALES =", value, "blyMtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("BLY_MTD_SALES <>", value, "blyMtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesGreaterThan(BigDecimal value) {
            addCriterion("BLY_MTD_SALES >", value, "blyMtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BLY_MTD_SALES >=", value, "blyMtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesLessThan(BigDecimal value) {
            addCriterion("BLY_MTD_SALES <", value, "blyMtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BLY_MTD_SALES <=", value, "blyMtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesIn(List<BigDecimal> values) {
            addCriterion("BLY_MTD_SALES in", values, "blyMtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("BLY_MTD_SALES not in", values, "blyMtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLY_MTD_SALES between", value1, value2, "blyMtdSales");
            return (Criteria) this;
        }

        public Criteria andBlyMtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLY_MTD_SALES not between", value1, value2, "blyMtdSales");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginIsNull() {
            addCriterion("LY_MTD_MARGIN is null");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginIsNotNull() {
            addCriterion("LY_MTD_MARGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginEqualTo(BigDecimal value) {
            addCriterion("LY_MTD_MARGIN =", value, "lyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginNotEqualTo(BigDecimal value) {
            addCriterion("LY_MTD_MARGIN <>", value, "lyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginGreaterThan(BigDecimal value) {
            addCriterion("LY_MTD_MARGIN >", value, "lyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_MTD_MARGIN >=", value, "lyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginLessThan(BigDecimal value) {
            addCriterion("LY_MTD_MARGIN <", value, "lyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_MTD_MARGIN <=", value, "lyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginIn(List<BigDecimal> values) {
            addCriterion("LY_MTD_MARGIN in", values, "lyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginNotIn(List<BigDecimal> values) {
            addCriterion("LY_MTD_MARGIN not in", values, "lyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_MTD_MARGIN between", value1, value2, "lyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andLyMtdMarginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_MTD_MARGIN not between", value1, value2, "lyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginIsNull() {
            addCriterion("BLY_MTD_MARGIN is null");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginIsNotNull() {
            addCriterion("BLY_MTD_MARGIN is not null");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginEqualTo(BigDecimal value) {
            addCriterion("BLY_MTD_MARGIN =", value, "blyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginNotEqualTo(BigDecimal value) {
            addCriterion("BLY_MTD_MARGIN <>", value, "blyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginGreaterThan(BigDecimal value) {
            addCriterion("BLY_MTD_MARGIN >", value, "blyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BLY_MTD_MARGIN >=", value, "blyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginLessThan(BigDecimal value) {
            addCriterion("BLY_MTD_MARGIN <", value, "blyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BLY_MTD_MARGIN <=", value, "blyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginIn(List<BigDecimal> values) {
            addCriterion("BLY_MTD_MARGIN in", values, "blyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginNotIn(List<BigDecimal> values) {
            addCriterion("BLY_MTD_MARGIN not in", values, "blyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLY_MTD_MARGIN between", value1, value2, "blyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andBlyMtdMarginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLY_MTD_MARGIN not between", value1, value2, "blyMtdMargin");
            return (Criteria) this;
        }

        public Criteria andTotalArIsNull() {
            addCriterion("TOTAL_AR is null");
            return (Criteria) this;
        }

        public Criteria andTotalArIsNotNull() {
            addCriterion("TOTAL_AR is not null");
            return (Criteria) this;
        }

        public Criteria andTotalArEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AR =", value, "totalAr");
            return (Criteria) this;
        }

        public Criteria andTotalArNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AR <>", value, "totalAr");
            return (Criteria) this;
        }

        public Criteria andTotalArGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_AR >", value, "totalAr");
            return (Criteria) this;
        }

        public Criteria andTotalArGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AR >=", value, "totalAr");
            return (Criteria) this;
        }

        public Criteria andTotalArLessThan(BigDecimal value) {
            addCriterion("TOTAL_AR <", value, "totalAr");
            return (Criteria) this;
        }

        public Criteria andTotalArLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AR <=", value, "totalAr");
            return (Criteria) this;
        }

        public Criteria andTotalArIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AR in", values, "totalAr");
            return (Criteria) this;
        }

        public Criteria andTotalArNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AR not in", values, "totalAr");
            return (Criteria) this;
        }

        public Criteria andTotalArBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AR between", value1, value2, "totalAr");
            return (Criteria) this;
        }

        public Criteria andTotalArNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AR not between", value1, value2, "totalAr");
            return (Criteria) this;
        }

        public Criteria andInvoicedArIsNull() {
            addCriterion("INVOICED_AR is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedArIsNotNull() {
            addCriterion("INVOICED_AR is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedArEqualTo(BigDecimal value) {
            addCriterion("INVOICED_AR =", value, "invoicedAr");
            return (Criteria) this;
        }

        public Criteria andInvoicedArNotEqualTo(BigDecimal value) {
            addCriterion("INVOICED_AR <>", value, "invoicedAr");
            return (Criteria) this;
        }

        public Criteria andInvoicedArGreaterThan(BigDecimal value) {
            addCriterion("INVOICED_AR >", value, "invoicedAr");
            return (Criteria) this;
        }

        public Criteria andInvoicedArGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICED_AR >=", value, "invoicedAr");
            return (Criteria) this;
        }

        public Criteria andInvoicedArLessThan(BigDecimal value) {
            addCriterion("INVOICED_AR <", value, "invoicedAr");
            return (Criteria) this;
        }

        public Criteria andInvoicedArLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICED_AR <=", value, "invoicedAr");
            return (Criteria) this;
        }

        public Criteria andInvoicedArIn(List<BigDecimal> values) {
            addCriterion("INVOICED_AR in", values, "invoicedAr");
            return (Criteria) this;
        }

        public Criteria andInvoicedArNotIn(List<BigDecimal> values) {
            addCriterion("INVOICED_AR not in", values, "invoicedAr");
            return (Criteria) this;
        }

        public Criteria andInvoicedArBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICED_AR between", value1, value2, "invoicedAr");
            return (Criteria) this;
        }

        public Criteria andInvoicedArNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICED_AR not between", value1, value2, "invoicedAr");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArIsNull() {
            addCriterion("UNINVOICED_AR is null");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArIsNotNull() {
            addCriterion("UNINVOICED_AR is not null");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArEqualTo(BigDecimal value) {
            addCriterion("UNINVOICED_AR =", value, "uninvoicedAr");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArNotEqualTo(BigDecimal value) {
            addCriterion("UNINVOICED_AR <>", value, "uninvoicedAr");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArGreaterThan(BigDecimal value) {
            addCriterion("UNINVOICED_AR >", value, "uninvoicedAr");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNINVOICED_AR >=", value, "uninvoicedAr");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArLessThan(BigDecimal value) {
            addCriterion("UNINVOICED_AR <", value, "uninvoicedAr");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNINVOICED_AR <=", value, "uninvoicedAr");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArIn(List<BigDecimal> values) {
            addCriterion("UNINVOICED_AR in", values, "uninvoicedAr");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArNotIn(List<BigDecimal> values) {
            addCriterion("UNINVOICED_AR not in", values, "uninvoicedAr");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNINVOICED_AR between", value1, value2, "uninvoicedAr");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNINVOICED_AR not between", value1, value2, "uninvoicedAr");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueIsNull() {
            addCriterion("TOTAL_AR_OVERDUE is null");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueIsNotNull() {
            addCriterion("TOTAL_AR_OVERDUE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AR_OVERDUE =", value, "totalArOverdue");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AR_OVERDUE <>", value, "totalArOverdue");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_AR_OVERDUE >", value, "totalArOverdue");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AR_OVERDUE >=", value, "totalArOverdue");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueLessThan(BigDecimal value) {
            addCriterion("TOTAL_AR_OVERDUE <", value, "totalArOverdue");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AR_OVERDUE <=", value, "totalArOverdue");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AR_OVERDUE in", values, "totalArOverdue");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AR_OVERDUE not in", values, "totalArOverdue");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AR_OVERDUE between", value1, value2, "totalArOverdue");
            return (Criteria) this;
        }

        public Criteria andTotalArOverdueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AR_OVERDUE not between", value1, value2, "totalArOverdue");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueIsNull() {
            addCriterion("INVOICED_AR_OVERDUE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueIsNotNull() {
            addCriterion("INVOICED_AR_OVERDUE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueEqualTo(BigDecimal value) {
            addCriterion("INVOICED_AR_OVERDUE =", value, "invoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueNotEqualTo(BigDecimal value) {
            addCriterion("INVOICED_AR_OVERDUE <>", value, "invoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueGreaterThan(BigDecimal value) {
            addCriterion("INVOICED_AR_OVERDUE >", value, "invoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICED_AR_OVERDUE >=", value, "invoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueLessThan(BigDecimal value) {
            addCriterion("INVOICED_AR_OVERDUE <", value, "invoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICED_AR_OVERDUE <=", value, "invoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueIn(List<BigDecimal> values) {
            addCriterion("INVOICED_AR_OVERDUE in", values, "invoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueNotIn(List<BigDecimal> values) {
            addCriterion("INVOICED_AR_OVERDUE not in", values, "invoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICED_AR_OVERDUE between", value1, value2, "invoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andInvoicedArOverdueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICED_AR_OVERDUE not between", value1, value2, "invoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueIsNull() {
            addCriterion("UNINVOICED_AR_OVERDUE is null");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueIsNotNull() {
            addCriterion("UNINVOICED_AR_OVERDUE is not null");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueEqualTo(BigDecimal value) {
            addCriterion("UNINVOICED_AR_OVERDUE =", value, "uninvoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueNotEqualTo(BigDecimal value) {
            addCriterion("UNINVOICED_AR_OVERDUE <>", value, "uninvoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueGreaterThan(BigDecimal value) {
            addCriterion("UNINVOICED_AR_OVERDUE >", value, "uninvoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNINVOICED_AR_OVERDUE >=", value, "uninvoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueLessThan(BigDecimal value) {
            addCriterion("UNINVOICED_AR_OVERDUE <", value, "uninvoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNINVOICED_AR_OVERDUE <=", value, "uninvoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueIn(List<BigDecimal> values) {
            addCriterion("UNINVOICED_AR_OVERDUE in", values, "uninvoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueNotIn(List<BigDecimal> values) {
            addCriterion("UNINVOICED_AR_OVERDUE not in", values, "uninvoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNINVOICED_AR_OVERDUE between", value1, value2, "uninvoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andUninvoicedArOverdueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNINVOICED_AR_OVERDUE not between", value1, value2, "uninvoicedArOverdue");
            return (Criteria) this;
        }

        public Criteria andTotalCreditIsNull() {
            addCriterion("TOTAL_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andTotalCreditIsNotNull() {
            addCriterion("TOTAL_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCreditEqualTo(BigDecimal value) {
            addCriterion("TOTAL_CREDIT =", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_CREDIT <>", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_CREDIT >", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_CREDIT >=", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditLessThan(BigDecimal value) {
            addCriterion("TOTAL_CREDIT <", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_CREDIT <=", value, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditIn(List<BigDecimal> values) {
            addCriterion("TOTAL_CREDIT in", values, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_CREDIT not in", values, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_CREDIT between", value1, value2, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalCreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_CREDIT not between", value1, value2, "totalCredit");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationIsNull() {
            addCriterion("STATEMENT_IDENTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationIsNotNull() {
            addCriterion("STATEMENT_IDENTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION =", value, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationNotEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION <>", value, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationGreaterThan(String value) {
            addCriterion("STATEMENT_IDENTIFICATION >", value, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationGreaterThanOrEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION >=", value, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationLessThan(String value) {
            addCriterion("STATEMENT_IDENTIFICATION <", value, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationLessThanOrEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION <=", value, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationLike(String value) {
            addCriterion("STATEMENT_IDENTIFICATION like", value, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationNotLike(String value) {
            addCriterion("STATEMENT_IDENTIFICATION not like", value, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationIn(List<String> values) {
            addCriterion("STATEMENT_IDENTIFICATION in", values, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationNotIn(List<String> values) {
            addCriterion("STATEMENT_IDENTIFICATION not in", values, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationBetween(String value1, String value2) {
            addCriterion("STATEMENT_IDENTIFICATION between", value1, value2, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationNotBetween(String value1, String value2) {
            addCriterion("STATEMENT_IDENTIFICATION not between", value1, value2, "statementIdentification");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromIsNull() {
            addCriterion("STATEMENT_IDENTIFICATION_FROM is null");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromIsNotNull() {
            addCriterion("STATEMENT_IDENTIFICATION_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM =", value, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromNotEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM <>", value, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromGreaterThan(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM >", value, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromGreaterThanOrEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM >=", value, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromLessThan(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM <", value, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromLessThanOrEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM <=", value, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromLike(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM like", value, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromNotLike(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM not like", value, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromIn(List<String> values) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM in", values, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromNotIn(List<String> values) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM not in", values, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromBetween(String value1, String value2) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM between", value1, value2, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationFromNotBetween(String value1, String value2) {
            addCriterion("STATEMENT_IDENTIFICATION_FROM not between", value1, value2, "statementIdentificationFrom");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToIsNull() {
            addCriterion("STATEMENT_IDENTIFICATION_TO is null");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToIsNotNull() {
            addCriterion("STATEMENT_IDENTIFICATION_TO is not null");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_TO =", value, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToNotEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_TO <>", value, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToGreaterThan(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_TO >", value, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToGreaterThanOrEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_TO >=", value, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToLessThan(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_TO <", value, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToLessThanOrEqualTo(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_TO <=", value, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToLike(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_TO like", value, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToNotLike(String value) {
            addCriterion("STATEMENT_IDENTIFICATION_TO not like", value, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToIn(List<String> values) {
            addCriterion("STATEMENT_IDENTIFICATION_TO in", values, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToNotIn(List<String> values) {
            addCriterion("STATEMENT_IDENTIFICATION_TO not in", values, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToBetween(String value1, String value2) {
            addCriterion("STATEMENT_IDENTIFICATION_TO between", value1, value2, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andStatementIdentificationToNotBetween(String value1, String value2) {
            addCriterion("STATEMENT_IDENTIFICATION_TO not between", value1, value2, "statementIdentificationTo");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationIsNull() {
            addCriterion("INVOICE_IDENTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationIsNotNull() {
            addCriterion("INVOICE_IDENTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationEqualTo(String value) {
            addCriterion("INVOICE_IDENTIFICATION =", value, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationNotEqualTo(String value) {
            addCriterion("INVOICE_IDENTIFICATION <>", value, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationGreaterThan(String value) {
            addCriterion("INVOICE_IDENTIFICATION >", value, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_IDENTIFICATION >=", value, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationLessThan(String value) {
            addCriterion("INVOICE_IDENTIFICATION <", value, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_IDENTIFICATION <=", value, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationLike(String value) {
            addCriterion("INVOICE_IDENTIFICATION like", value, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationNotLike(String value) {
            addCriterion("INVOICE_IDENTIFICATION not like", value, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationIn(List<String> values) {
            addCriterion("INVOICE_IDENTIFICATION in", values, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationNotIn(List<String> values) {
            addCriterion("INVOICE_IDENTIFICATION not in", values, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationBetween(String value1, String value2) {
            addCriterion("INVOICE_IDENTIFICATION between", value1, value2, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdentificationNotBetween(String value1, String value2) {
            addCriterion("INVOICE_IDENTIFICATION not between", value1, value2, "invoiceIdentification");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionIsNull() {
            addCriterion("PAYMENT_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionIsNotNull() {
            addCriterion("PAYMENT_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionEqualTo(String value) {
            addCriterion("PAYMENT_CONDITION =", value, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionNotEqualTo(String value) {
            addCriterion("PAYMENT_CONDITION <>", value, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionGreaterThan(String value) {
            addCriterion("PAYMENT_CONDITION >", value, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CONDITION >=", value, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionLessThan(String value) {
            addCriterion("PAYMENT_CONDITION <", value, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_CONDITION <=", value, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionLike(String value) {
            addCriterion("PAYMENT_CONDITION like", value, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionNotLike(String value) {
            addCriterion("PAYMENT_CONDITION not like", value, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionIn(List<String> values) {
            addCriterion("PAYMENT_CONDITION in", values, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionNotIn(List<String> values) {
            addCriterion("PAYMENT_CONDITION not in", values, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionBetween(String value1, String value2) {
            addCriterion("PAYMENT_CONDITION between", value1, value2, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andPaymentConditionNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_CONDITION not between", value1, value2, "paymentCondition");
            return (Criteria) this;
        }

        public Criteria andStatementDayIsNull() {
            addCriterion("STATEMENT_DAY is null");
            return (Criteria) this;
        }

        public Criteria andStatementDayIsNotNull() {
            addCriterion("STATEMENT_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andStatementDayEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY =", value, "statementDay");
            return (Criteria) this;
        }

        public Criteria andStatementDayNotEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY <>", value, "statementDay");
            return (Criteria) this;
        }

        public Criteria andStatementDayGreaterThan(BigDecimal value) {
            addCriterion("STATEMENT_DAY >", value, "statementDay");
            return (Criteria) this;
        }

        public Criteria andStatementDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY >=", value, "statementDay");
            return (Criteria) this;
        }

        public Criteria andStatementDayLessThan(BigDecimal value) {
            addCriterion("STATEMENT_DAY <", value, "statementDay");
            return (Criteria) this;
        }

        public Criteria andStatementDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY <=", value, "statementDay");
            return (Criteria) this;
        }

        public Criteria andStatementDayIn(List<BigDecimal> values) {
            addCriterion("STATEMENT_DAY in", values, "statementDay");
            return (Criteria) this;
        }

        public Criteria andStatementDayNotIn(List<BigDecimal> values) {
            addCriterion("STATEMENT_DAY not in", values, "statementDay");
            return (Criteria) this;
        }

        public Criteria andStatementDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATEMENT_DAY between", value1, value2, "statementDay");
            return (Criteria) this;
        }

        public Criteria andStatementDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATEMENT_DAY not between", value1, value2, "statementDay");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromIsNull() {
            addCriterion("STATEMENT_DAY_FROM is null");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromIsNotNull() {
            addCriterion("STATEMENT_DAY_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY_FROM =", value, "statementDayFrom");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromNotEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY_FROM <>", value, "statementDayFrom");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromGreaterThan(BigDecimal value) {
            addCriterion("STATEMENT_DAY_FROM >", value, "statementDayFrom");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY_FROM >=", value, "statementDayFrom");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromLessThan(BigDecimal value) {
            addCriterion("STATEMENT_DAY_FROM <", value, "statementDayFrom");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY_FROM <=", value, "statementDayFrom");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromIn(List<BigDecimal> values) {
            addCriterion("STATEMENT_DAY_FROM in", values, "statementDayFrom");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromNotIn(List<BigDecimal> values) {
            addCriterion("STATEMENT_DAY_FROM not in", values, "statementDayFrom");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATEMENT_DAY_FROM between", value1, value2, "statementDayFrom");
            return (Criteria) this;
        }

        public Criteria andStatementDayFromNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATEMENT_DAY_FROM not between", value1, value2, "statementDayFrom");
            return (Criteria) this;
        }

        public Criteria andStatementDayToIsNull() {
            addCriterion("STATEMENT_DAY_TO is null");
            return (Criteria) this;
        }

        public Criteria andStatementDayToIsNotNull() {
            addCriterion("STATEMENT_DAY_TO is not null");
            return (Criteria) this;
        }

        public Criteria andStatementDayToEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY_TO =", value, "statementDayTo");
            return (Criteria) this;
        }

        public Criteria andStatementDayToNotEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY_TO <>", value, "statementDayTo");
            return (Criteria) this;
        }

        public Criteria andStatementDayToGreaterThan(BigDecimal value) {
            addCriterion("STATEMENT_DAY_TO >", value, "statementDayTo");
            return (Criteria) this;
        }

        public Criteria andStatementDayToGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY_TO >=", value, "statementDayTo");
            return (Criteria) this;
        }

        public Criteria andStatementDayToLessThan(BigDecimal value) {
            addCriterion("STATEMENT_DAY_TO <", value, "statementDayTo");
            return (Criteria) this;
        }

        public Criteria andStatementDayToLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STATEMENT_DAY_TO <=", value, "statementDayTo");
            return (Criteria) this;
        }

        public Criteria andStatementDayToIn(List<BigDecimal> values) {
            addCriterion("STATEMENT_DAY_TO in", values, "statementDayTo");
            return (Criteria) this;
        }

        public Criteria andStatementDayToNotIn(List<BigDecimal> values) {
            addCriterion("STATEMENT_DAY_TO not in", values, "statementDayTo");
            return (Criteria) this;
        }

        public Criteria andStatementDayToBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATEMENT_DAY_TO between", value1, value2, "statementDayTo");
            return (Criteria) this;
        }

        public Criteria andStatementDayToNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATEMENT_DAY_TO not between", value1, value2, "statementDayTo");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayIsNull() {
            addCriterion("INVOICE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayIsNotNull() {
            addCriterion("INVOICE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayEqualTo(BigDecimal value) {
            addCriterion("INVOICE_DAY =", value, "invoiceDay");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayNotEqualTo(BigDecimal value) {
            addCriterion("INVOICE_DAY <>", value, "invoiceDay");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayGreaterThan(BigDecimal value) {
            addCriterion("INVOICE_DAY >", value, "invoiceDay");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE_DAY >=", value, "invoiceDay");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayLessThan(BigDecimal value) {
            addCriterion("INVOICE_DAY <", value, "invoiceDay");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE_DAY <=", value, "invoiceDay");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayIn(List<BigDecimal> values) {
            addCriterion("INVOICE_DAY in", values, "invoiceDay");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayNotIn(List<BigDecimal> values) {
            addCriterion("INVOICE_DAY not in", values, "invoiceDay");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE_DAY between", value1, value2, "invoiceDay");
            return (Criteria) this;
        }

        public Criteria andInvoiceDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE_DAY not between", value1, value2, "invoiceDay");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesIsNull() {
            addCriterion("INSTA_AND_WARR_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesIsNotNull() {
            addCriterion("INSTA_AND_WARR_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesEqualTo(BigDecimal value) {
            addCriterion("INSTA_AND_WARR_YTD_SALES =", value, "instaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("INSTA_AND_WARR_YTD_SALES <>", value, "instaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("INSTA_AND_WARR_YTD_SALES >", value, "instaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSTA_AND_WARR_YTD_SALES >=", value, "instaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesLessThan(BigDecimal value) {
            addCriterion("INSTA_AND_WARR_YTD_SALES <", value, "instaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSTA_AND_WARR_YTD_SALES <=", value, "instaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesIn(List<BigDecimal> values) {
            addCriterion("INSTA_AND_WARR_YTD_SALES in", values, "instaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("INSTA_AND_WARR_YTD_SALES not in", values, "instaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSTA_AND_WARR_YTD_SALES between", value1, value2, "instaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andInstaAndWarrYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSTA_AND_WARR_YTD_SALES not between", value1, value2, "instaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesIsNull() {
            addCriterion("OFFI_FURNI_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesIsNotNull() {
            addCriterion("OFFI_FURNI_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesEqualTo(BigDecimal value) {
            addCriterion("OFFI_FURNI_YTD_SALES =", value, "offiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("OFFI_FURNI_YTD_SALES <>", value, "offiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("OFFI_FURNI_YTD_SALES >", value, "offiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OFFI_FURNI_YTD_SALES >=", value, "offiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesLessThan(BigDecimal value) {
            addCriterion("OFFI_FURNI_YTD_SALES <", value, "offiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OFFI_FURNI_YTD_SALES <=", value, "offiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesIn(List<BigDecimal> values) {
            addCriterion("OFFI_FURNI_YTD_SALES in", values, "offiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("OFFI_FURNI_YTD_SALES not in", values, "offiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OFFI_FURNI_YTD_SALES between", value1, value2, "offiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiFurniYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OFFI_FURNI_YTD_SALES not between", value1, value2, "offiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesIsNull() {
            addCriterion("OFFI_STATIO_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesIsNotNull() {
            addCriterion("OFFI_STATIO_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesEqualTo(BigDecimal value) {
            addCriterion("OFFI_STATIO_YTD_SALES =", value, "offiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("OFFI_STATIO_YTD_SALES <>", value, "offiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("OFFI_STATIO_YTD_SALES >", value, "offiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OFFI_STATIO_YTD_SALES >=", value, "offiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesLessThan(BigDecimal value) {
            addCriterion("OFFI_STATIO_YTD_SALES <", value, "offiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OFFI_STATIO_YTD_SALES <=", value, "offiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesIn(List<BigDecimal> values) {
            addCriterion("OFFI_STATIO_YTD_SALES in", values, "offiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("OFFI_STATIO_YTD_SALES not in", values, "offiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OFFI_STATIO_YTD_SALES between", value1, value2, "offiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andOffiStatioYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OFFI_STATIO_YTD_SALES not between", value1, value2, "offiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesIsNull() {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesIsNotNull() {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesEqualTo(BigDecimal value) {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES =", value, "computAndAccessYtdSales");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES <>", value, "computAndAccessYtdSales");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES >", value, "computAndAccessYtdSales");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES >=", value, "computAndAccessYtdSales");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesLessThan(BigDecimal value) {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES <", value, "computAndAccessYtdSales");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES <=", value, "computAndAccessYtdSales");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesIn(List<BigDecimal> values) {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES in", values, "computAndAccessYtdSales");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES not in", values, "computAndAccessYtdSales");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES between", value1, value2, "computAndAccessYtdSales");
            return (Criteria) this;
        }

        public Criteria andComputAndAccessYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPUT_AND_ACCESS_YTD_SALES not between", value1, value2, "computAndAccessYtdSales");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplIsNull() {
            addCriterion("RETAIL_STORES_AND_SUPPL is null");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplIsNotNull() {
            addCriterion("RETAIL_STORES_AND_SUPPL is not null");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplEqualTo(BigDecimal value) {
            addCriterion("RETAIL_STORES_AND_SUPPL =", value, "retailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplNotEqualTo(BigDecimal value) {
            addCriterion("RETAIL_STORES_AND_SUPPL <>", value, "retailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplGreaterThan(BigDecimal value) {
            addCriterion("RETAIL_STORES_AND_SUPPL >", value, "retailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETAIL_STORES_AND_SUPPL >=", value, "retailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplLessThan(BigDecimal value) {
            addCriterion("RETAIL_STORES_AND_SUPPL <", value, "retailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETAIL_STORES_AND_SUPPL <=", value, "retailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplIn(List<BigDecimal> values) {
            addCriterion("RETAIL_STORES_AND_SUPPL in", values, "retailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplNotIn(List<BigDecimal> values) {
            addCriterion("RETAIL_STORES_AND_SUPPL not in", values, "retailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETAIL_STORES_AND_SUPPL between", value1, value2, "retailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andRetailStoresAndSupplNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETAIL_STORES_AND_SUPPL not between", value1, value2, "retailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesIsNull() {
            addCriterion("BUSINESS_SERV_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesIsNotNull() {
            addCriterion("BUSINESS_SERV_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_SERV_YTD_SALES =", value, "businessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_SERV_YTD_SALES <>", value, "businessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("BUSINESS_SERV_YTD_SALES >", value, "businessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_SERV_YTD_SALES >=", value, "businessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesLessThan(BigDecimal value) {
            addCriterion("BUSINESS_SERV_YTD_SALES <", value, "businessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_SERV_YTD_SALES <=", value, "businessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesIn(List<BigDecimal> values) {
            addCriterion("BUSINESS_SERV_YTD_SALES in", values, "businessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("BUSINESS_SERV_YTD_SALES not in", values, "businessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESS_SERV_YTD_SALES between", value1, value2, "businessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andBusinessServYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESS_SERV_YTD_SALES not between", value1, value2, "businessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesIsNull() {
            addCriterion("COMMERC_EQUIP_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesIsNotNull() {
            addCriterion("COMMERC_EQUIP_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesEqualTo(BigDecimal value) {
            addCriterion("COMMERC_EQUIP_YTD_SALES =", value, "commercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("COMMERC_EQUIP_YTD_SALES <>", value, "commercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("COMMERC_EQUIP_YTD_SALES >", value, "commercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMERC_EQUIP_YTD_SALES >=", value, "commercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesLessThan(BigDecimal value) {
            addCriterion("COMMERC_EQUIP_YTD_SALES <", value, "commercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMERC_EQUIP_YTD_SALES <=", value, "commercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesIn(List<BigDecimal> values) {
            addCriterion("COMMERC_EQUIP_YTD_SALES in", values, "commercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("COMMERC_EQUIP_YTD_SALES not in", values, "commercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMERC_EQUIP_YTD_SALES between", value1, value2, "commercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andCommercEquipYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMERC_EQUIP_YTD_SALES not between", value1, value2, "commercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesIsNull() {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesIsNotNull() {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesEqualTo(BigDecimal value) {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES =", value, "ppFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES <>", value, "ppFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES >", value, "ppFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES >=", value, "ppFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesLessThan(BigDecimal value) {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES <", value, "ppFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES <=", value, "ppFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesIn(List<BigDecimal> values) {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES in", values, "ppFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES not in", values, "ppFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES between", value1, value2, "ppFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andPpFooandhousgsYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PP_FOOANDHOUSGS_YTD_SALES not between", value1, value2, "ppFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesIsNull() {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesIsNotNull() {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesEqualTo(BigDecimal value) {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES =", value, "specNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES <>", value, "specNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES >", value, "specNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES >=", value, "specNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesLessThan(BigDecimal value) {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES <", value, "specNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES <=", value, "specNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesIn(List<BigDecimal> values) {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES in", values, "specNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES not in", values, "specNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES between", value1, value2, "specNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andSpecNocodsupplYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPEC_NOCODSUPPL_YTD_SALES not between", value1, value2, "specNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesIsNull() {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesIsNotNull() {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesEqualTo(BigDecimal value) {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES =", value, "lyInstaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES <>", value, "lyInstaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES >", value, "lyInstaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES >=", value, "lyInstaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesLessThan(BigDecimal value) {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES <", value, "lyInstaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES <=", value, "lyInstaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesIn(List<BigDecimal> values) {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES in", values, "lyInstaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES not in", values, "lyInstaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES between", value1, value2, "lyInstaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyInstaAndWarrYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_INSTA_AND_WARR_YTD_SALES not between", value1, value2, "lyInstaAndWarrYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesIsNull() {
            addCriterion("LY_OFFI_FURNI_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesIsNotNull() {
            addCriterion("LY_OFFI_FURNI_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesEqualTo(BigDecimal value) {
            addCriterion("LY_OFFI_FURNI_YTD_SALES =", value, "lyOffiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("LY_OFFI_FURNI_YTD_SALES <>", value, "lyOffiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("LY_OFFI_FURNI_YTD_SALES >", value, "lyOffiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_OFFI_FURNI_YTD_SALES >=", value, "lyOffiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesLessThan(BigDecimal value) {
            addCriterion("LY_OFFI_FURNI_YTD_SALES <", value, "lyOffiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_OFFI_FURNI_YTD_SALES <=", value, "lyOffiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesIn(List<BigDecimal> values) {
            addCriterion("LY_OFFI_FURNI_YTD_SALES in", values, "lyOffiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("LY_OFFI_FURNI_YTD_SALES not in", values, "lyOffiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_OFFI_FURNI_YTD_SALES between", value1, value2, "lyOffiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiFurniYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_OFFI_FURNI_YTD_SALES not between", value1, value2, "lyOffiFurniYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesIsNull() {
            addCriterion("LY_OFFI_STATIO_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesIsNotNull() {
            addCriterion("LY_OFFI_STATIO_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesEqualTo(BigDecimal value) {
            addCriterion("LY_OFFI_STATIO_YTD_SALES =", value, "lyOffiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("LY_OFFI_STATIO_YTD_SALES <>", value, "lyOffiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("LY_OFFI_STATIO_YTD_SALES >", value, "lyOffiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_OFFI_STATIO_YTD_SALES >=", value, "lyOffiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesLessThan(BigDecimal value) {
            addCriterion("LY_OFFI_STATIO_YTD_SALES <", value, "lyOffiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_OFFI_STATIO_YTD_SALES <=", value, "lyOffiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesIn(List<BigDecimal> values) {
            addCriterion("LY_OFFI_STATIO_YTD_SALES in", values, "lyOffiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("LY_OFFI_STATIO_YTD_SALES not in", values, "lyOffiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_OFFI_STATIO_YTD_SALES between", value1, value2, "lyOffiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyOffiStatioYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_OFFI_STATIO_YTD_SALES not between", value1, value2, "lyOffiStatioYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesIsNull() {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesIsNotNull() {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesEqualTo(BigDecimal value) {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES =", value, "lyComputAndAccYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES <>", value, "lyComputAndAccYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES >", value, "lyComputAndAccYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES >=", value, "lyComputAndAccYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesLessThan(BigDecimal value) {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES <", value, "lyComputAndAccYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES <=", value, "lyComputAndAccYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesIn(List<BigDecimal> values) {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES in", values, "lyComputAndAccYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES not in", values, "lyComputAndAccYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES between", value1, value2, "lyComputAndAccYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyComputAndAccYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_COMPUT_AND_ACC_YTD_SALES not between", value1, value2, "lyComputAndAccYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplIsNull() {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL is null");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplIsNotNull() {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL is not null");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplEqualTo(BigDecimal value) {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL =", value, "lyRetailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplNotEqualTo(BigDecimal value) {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL <>", value, "lyRetailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplGreaterThan(BigDecimal value) {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL >", value, "lyRetailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL >=", value, "lyRetailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplLessThan(BigDecimal value) {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL <", value, "lyRetailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL <=", value, "lyRetailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplIn(List<BigDecimal> values) {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL in", values, "lyRetailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplNotIn(List<BigDecimal> values) {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL not in", values, "lyRetailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL between", value1, value2, "lyRetailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andLyRetailStoresAndSupplNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_RETAIL_STORES_AND_SUPPL not between", value1, value2, "lyRetailStoresAndSuppl");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesIsNull() {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesIsNotNull() {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesEqualTo(BigDecimal value) {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES =", value, "lyBusinessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES <>", value, "lyBusinessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES >", value, "lyBusinessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES >=", value, "lyBusinessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesLessThan(BigDecimal value) {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES <", value, "lyBusinessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES <=", value, "lyBusinessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesIn(List<BigDecimal> values) {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES in", values, "lyBusinessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES not in", values, "lyBusinessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES between", value1, value2, "lyBusinessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyBusinessServYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_BUSINESS_SERV_YTD_SALES not between", value1, value2, "lyBusinessServYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesIsNull() {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesIsNotNull() {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesEqualTo(BigDecimal value) {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES =", value, "lyCommercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES <>", value, "lyCommercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES >", value, "lyCommercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES >=", value, "lyCommercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesLessThan(BigDecimal value) {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES <", value, "lyCommercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES <=", value, "lyCommercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesIn(List<BigDecimal> values) {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES in", values, "lyCommercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES not in", values, "lyCommercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES between", value1, value2, "lyCommercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyCommercEquipYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_COMMERC_EQUIP_YTD_SALES not between", value1, value2, "lyCommercEquipYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesIsNull() {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesIsNotNull() {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesEqualTo(BigDecimal value) {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES =", value, "lyPpFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES <>", value, "lyPpFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES >", value, "lyPpFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES >=", value, "lyPpFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesLessThan(BigDecimal value) {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES <", value, "lyPpFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES <=", value, "lyPpFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesIn(List<BigDecimal> values) {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES in", values, "lyPpFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES not in", values, "lyPpFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES between", value1, value2, "lyPpFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andLyPpFooandhousgsYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_PP_FOOANDHOUSGS_YTD_SALES not between", value1, value2, "lyPpFooandhousgsYtdSales");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesIsNull() {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES is null");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesIsNotNull() {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesEqualTo(BigDecimal value) {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES =", value, "lySpecNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesNotEqualTo(BigDecimal value) {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES <>", value, "lySpecNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesGreaterThan(BigDecimal value) {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES >", value, "lySpecNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES >=", value, "lySpecNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesLessThan(BigDecimal value) {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES <", value, "lySpecNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES <=", value, "lySpecNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesIn(List<BigDecimal> values) {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES in", values, "lySpecNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesNotIn(List<BigDecimal> values) {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES not in", values, "lySpecNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES between", value1, value2, "lySpecNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andLySpecNocodsupplYtdSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LY_SPEC_NOCODSUPPL_YTD_SALES not between", value1, value2, "lySpecNocodsupplYtdSales");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateIsNull() {
            addCriterion("CUS_MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateIsNotNull() {
            addCriterion("CUS_MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateEqualTo(String value) {
            addCriterion("CUS_MODIFIED_DATE =", value, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateNotEqualTo(String value) {
            addCriterion("CUS_MODIFIED_DATE <>", value, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateGreaterThan(String value) {
            addCriterion("CUS_MODIFIED_DATE >", value, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_MODIFIED_DATE >=", value, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateLessThan(String value) {
            addCriterion("CUS_MODIFIED_DATE <", value, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateLessThanOrEqualTo(String value) {
            addCriterion("CUS_MODIFIED_DATE <=", value, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateLike(String value) {
            addCriterion("CUS_MODIFIED_DATE like", value, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateNotLike(String value) {
            addCriterion("CUS_MODIFIED_DATE not like", value, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateIn(List<String> values) {
            addCriterion("CUS_MODIFIED_DATE in", values, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateNotIn(List<String> values) {
            addCriterion("CUS_MODIFIED_DATE not in", values, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateBetween(String value1, String value2) {
            addCriterion("CUS_MODIFIED_DATE between", value1, value2, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCusModifiedDateNotBetween(String value1, String value2) {
            addCriterion("CUS_MODIFIED_DATE not between", value1, value2, "cusModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateIsNull() {
            addCriterion("SAL_YTD_MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateIsNotNull() {
            addCriterion("SAL_YTD_MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateEqualTo(String value) {
            addCriterion("SAL_YTD_MODIFIED_DATE =", value, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateNotEqualTo(String value) {
            addCriterion("SAL_YTD_MODIFIED_DATE <>", value, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateGreaterThan(String value) {
            addCriterion("SAL_YTD_MODIFIED_DATE >", value, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_YTD_MODIFIED_DATE >=", value, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateLessThan(String value) {
            addCriterion("SAL_YTD_MODIFIED_DATE <", value, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateLessThanOrEqualTo(String value) {
            addCriterion("SAL_YTD_MODIFIED_DATE <=", value, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateLike(String value) {
            addCriterion("SAL_YTD_MODIFIED_DATE like", value, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateNotLike(String value) {
            addCriterion("SAL_YTD_MODIFIED_DATE not like", value, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateIn(List<String> values) {
            addCriterion("SAL_YTD_MODIFIED_DATE in", values, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateNotIn(List<String> values) {
            addCriterion("SAL_YTD_MODIFIED_DATE not in", values, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateBetween(String value1, String value2) {
            addCriterion("SAL_YTD_MODIFIED_DATE between", value1, value2, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalYtdModifiedDateNotBetween(String value1, String value2) {
            addCriterion("SAL_YTD_MODIFIED_DATE not between", value1, value2, "salYtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateIsNull() {
            addCriterion("SAL_MTD_MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateIsNotNull() {
            addCriterion("SAL_MTD_MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateEqualTo(String value) {
            addCriterion("SAL_MTD_MODIFIED_DATE =", value, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateNotEqualTo(String value) {
            addCriterion("SAL_MTD_MODIFIED_DATE <>", value, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateGreaterThan(String value) {
            addCriterion("SAL_MTD_MODIFIED_DATE >", value, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_MTD_MODIFIED_DATE >=", value, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateLessThan(String value) {
            addCriterion("SAL_MTD_MODIFIED_DATE <", value, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateLessThanOrEqualTo(String value) {
            addCriterion("SAL_MTD_MODIFIED_DATE <=", value, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateLike(String value) {
            addCriterion("SAL_MTD_MODIFIED_DATE like", value, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateNotLike(String value) {
            addCriterion("SAL_MTD_MODIFIED_DATE not like", value, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateIn(List<String> values) {
            addCriterion("SAL_MTD_MODIFIED_DATE in", values, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateNotIn(List<String> values) {
            addCriterion("SAL_MTD_MODIFIED_DATE not in", values, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateBetween(String value1, String value2) {
            addCriterion("SAL_MTD_MODIFIED_DATE between", value1, value2, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalMtdModifiedDateNotBetween(String value1, String value2) {
            addCriterion("SAL_MTD_MODIFIED_DATE not between", value1, value2, "salMtdModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateIsNull() {
            addCriterion("SAL_CLS_MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateIsNotNull() {
            addCriterion("SAL_CLS_MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateEqualTo(String value) {
            addCriterion("SAL_CLS_MODIFIED_DATE =", value, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateNotEqualTo(String value) {
            addCriterion("SAL_CLS_MODIFIED_DATE <>", value, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateGreaterThan(String value) {
            addCriterion("SAL_CLS_MODIFIED_DATE >", value, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_CLS_MODIFIED_DATE >=", value, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateLessThan(String value) {
            addCriterion("SAL_CLS_MODIFIED_DATE <", value, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateLessThanOrEqualTo(String value) {
            addCriterion("SAL_CLS_MODIFIED_DATE <=", value, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateLike(String value) {
            addCriterion("SAL_CLS_MODIFIED_DATE like", value, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateNotLike(String value) {
            addCriterion("SAL_CLS_MODIFIED_DATE not like", value, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateIn(List<String> values) {
            addCriterion("SAL_CLS_MODIFIED_DATE in", values, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateNotIn(List<String> values) {
            addCriterion("SAL_CLS_MODIFIED_DATE not in", values, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateBetween(String value1, String value2) {
            addCriterion("SAL_CLS_MODIFIED_DATE between", value1, value2, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalClsModifiedDateNotBetween(String value1, String value2) {
            addCriterion("SAL_CLS_MODIFIED_DATE not between", value1, value2, "salClsModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateIsNull() {
            addCriterion("FIN_MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateIsNotNull() {
            addCriterion("FIN_MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateEqualTo(String value) {
            addCriterion("FIN_MODIFIED_DATE =", value, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateNotEqualTo(String value) {
            addCriterion("FIN_MODIFIED_DATE <>", value, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateGreaterThan(String value) {
            addCriterion("FIN_MODIFIED_DATE >", value, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateGreaterThanOrEqualTo(String value) {
            addCriterion("FIN_MODIFIED_DATE >=", value, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateLessThan(String value) {
            addCriterion("FIN_MODIFIED_DATE <", value, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateLessThanOrEqualTo(String value) {
            addCriterion("FIN_MODIFIED_DATE <=", value, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateLike(String value) {
            addCriterion("FIN_MODIFIED_DATE like", value, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateNotLike(String value) {
            addCriterion("FIN_MODIFIED_DATE not like", value, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateIn(List<String> values) {
            addCriterion("FIN_MODIFIED_DATE in", values, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateNotIn(List<String> values) {
            addCriterion("FIN_MODIFIED_DATE not in", values, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateBetween(String value1, String value2) {
            addCriterion("FIN_MODIFIED_DATE between", value1, value2, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andFinModifiedDateNotBetween(String value1, String value2) {
            addCriterion("FIN_MODIFIED_DATE not between", value1, value2, "finModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateIsNull() {
            addCriterion("SALESFORCE_MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateIsNotNull() {
            addCriterion("SALESFORCE_MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateEqualTo(String value) {
            addCriterion("SALESFORCE_MODIFIED_DATE =", value, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateNotEqualTo(String value) {
            addCriterion("SALESFORCE_MODIFIED_DATE <>", value, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateGreaterThan(String value) {
            addCriterion("SALESFORCE_MODIFIED_DATE >", value, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateGreaterThanOrEqualTo(String value) {
            addCriterion("SALESFORCE_MODIFIED_DATE >=", value, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateLessThan(String value) {
            addCriterion("SALESFORCE_MODIFIED_DATE <", value, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateLessThanOrEqualTo(String value) {
            addCriterion("SALESFORCE_MODIFIED_DATE <=", value, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateLike(String value) {
            addCriterion("SALESFORCE_MODIFIED_DATE like", value, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateNotLike(String value) {
            addCriterion("SALESFORCE_MODIFIED_DATE not like", value, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateIn(List<String> values) {
            addCriterion("SALESFORCE_MODIFIED_DATE in", values, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateNotIn(List<String> values) {
            addCriterion("SALESFORCE_MODIFIED_DATE not in", values, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateBetween(String value1, String value2) {
            addCriterion("SALESFORCE_MODIFIED_DATE between", value1, value2, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andSalesforceModifiedDateNotBetween(String value1, String value2) {
            addCriterion("SALESFORCE_MODIFIED_DATE not between", value1, value2, "salesforceModifiedDate");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountIsNull() {
            addCriterion("IS_NEW_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountIsNotNull() {
            addCriterion("IS_NEW_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountEqualTo(String value) {
            addCriterion("IS_NEW_ACCOUNT =", value, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountNotEqualTo(String value) {
            addCriterion("IS_NEW_ACCOUNT <>", value, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountGreaterThan(String value) {
            addCriterion("IS_NEW_ACCOUNT >", value, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountGreaterThanOrEqualTo(String value) {
            addCriterion("IS_NEW_ACCOUNT >=", value, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountLessThan(String value) {
            addCriterion("IS_NEW_ACCOUNT <", value, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountLessThanOrEqualTo(String value) {
            addCriterion("IS_NEW_ACCOUNT <=", value, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountLike(String value) {
            addCriterion("IS_NEW_ACCOUNT like", value, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountNotLike(String value) {
            addCriterion("IS_NEW_ACCOUNT not like", value, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountIn(List<String> values) {
            addCriterion("IS_NEW_ACCOUNT in", values, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountNotIn(List<String> values) {
            addCriterion("IS_NEW_ACCOUNT not in", values, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountBetween(String value1, String value2) {
            addCriterion("IS_NEW_ACCOUNT between", value1, value2, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andIsNewAccountNotBetween(String value1, String value2) {
            addCriterion("IS_NEW_ACCOUNT not between", value1, value2, "isNewAccount");
            return (Criteria) this;
        }

        public Criteria andCusStatusIsNull() {
            addCriterion("CUS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCusStatusIsNotNull() {
            addCriterion("CUS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCusStatusEqualTo(String value) {
            addCriterion("CUS_STATUS =", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusNotEqualTo(String value) {
            addCriterion("CUS_STATUS <>", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusGreaterThan(String value) {
            addCriterion("CUS_STATUS >", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_STATUS >=", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusLessThan(String value) {
            addCriterion("CUS_STATUS <", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusLessThanOrEqualTo(String value) {
            addCriterion("CUS_STATUS <=", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusLike(String value) {
            addCriterion("CUS_STATUS like", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusNotLike(String value) {
            addCriterion("CUS_STATUS not like", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusIn(List<String> values) {
            addCriterion("CUS_STATUS in", values, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusNotIn(List<String> values) {
            addCriterion("CUS_STATUS not in", values, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusBetween(String value1, String value2) {
            addCriterion("CUS_STATUS between", value1, value2, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusNotBetween(String value1, String value2) {
            addCriterion("CUS_STATUS not between", value1, value2, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusIsNull() {
            addCriterion("SAL_YTD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusIsNotNull() {
            addCriterion("SAL_YTD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusEqualTo(String value) {
            addCriterion("SAL_YTD_STATUS =", value, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusNotEqualTo(String value) {
            addCriterion("SAL_YTD_STATUS <>", value, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusGreaterThan(String value) {
            addCriterion("SAL_YTD_STATUS >", value, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_YTD_STATUS >=", value, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusLessThan(String value) {
            addCriterion("SAL_YTD_STATUS <", value, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusLessThanOrEqualTo(String value) {
            addCriterion("SAL_YTD_STATUS <=", value, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusLike(String value) {
            addCriterion("SAL_YTD_STATUS like", value, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusNotLike(String value) {
            addCriterion("SAL_YTD_STATUS not like", value, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusIn(List<String> values) {
            addCriterion("SAL_YTD_STATUS in", values, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusNotIn(List<String> values) {
            addCriterion("SAL_YTD_STATUS not in", values, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusBetween(String value1, String value2) {
            addCriterion("SAL_YTD_STATUS between", value1, value2, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalYtdStatusNotBetween(String value1, String value2) {
            addCriterion("SAL_YTD_STATUS not between", value1, value2, "salYtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusIsNull() {
            addCriterion("SAL_MTD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusIsNotNull() {
            addCriterion("SAL_MTD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusEqualTo(String value) {
            addCriterion("SAL_MTD_STATUS =", value, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusNotEqualTo(String value) {
            addCriterion("SAL_MTD_STATUS <>", value, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusGreaterThan(String value) {
            addCriterion("SAL_MTD_STATUS >", value, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_MTD_STATUS >=", value, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusLessThan(String value) {
            addCriterion("SAL_MTD_STATUS <", value, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusLessThanOrEqualTo(String value) {
            addCriterion("SAL_MTD_STATUS <=", value, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusLike(String value) {
            addCriterion("SAL_MTD_STATUS like", value, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusNotLike(String value) {
            addCriterion("SAL_MTD_STATUS not like", value, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusIn(List<String> values) {
            addCriterion("SAL_MTD_STATUS in", values, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusNotIn(List<String> values) {
            addCriterion("SAL_MTD_STATUS not in", values, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusBetween(String value1, String value2) {
            addCriterion("SAL_MTD_STATUS between", value1, value2, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalMtdStatusNotBetween(String value1, String value2) {
            addCriterion("SAL_MTD_STATUS not between", value1, value2, "salMtdStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusIsNull() {
            addCriterion("SAL_CLS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusIsNotNull() {
            addCriterion("SAL_CLS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusEqualTo(String value) {
            addCriterion("SAL_CLS_STATUS =", value, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusNotEqualTo(String value) {
            addCriterion("SAL_CLS_STATUS <>", value, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusGreaterThan(String value) {
            addCriterion("SAL_CLS_STATUS >", value, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_CLS_STATUS >=", value, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusLessThan(String value) {
            addCriterion("SAL_CLS_STATUS <", value, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusLessThanOrEqualTo(String value) {
            addCriterion("SAL_CLS_STATUS <=", value, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusLike(String value) {
            addCriterion("SAL_CLS_STATUS like", value, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusNotLike(String value) {
            addCriterion("SAL_CLS_STATUS not like", value, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusIn(List<String> values) {
            addCriterion("SAL_CLS_STATUS in", values, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusNotIn(List<String> values) {
            addCriterion("SAL_CLS_STATUS not in", values, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusBetween(String value1, String value2) {
            addCriterion("SAL_CLS_STATUS between", value1, value2, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andSalClsStatusNotBetween(String value1, String value2) {
            addCriterion("SAL_CLS_STATUS not between", value1, value2, "salClsStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusIsNull() {
            addCriterion("FIN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFinStatusIsNotNull() {
            addCriterion("FIN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFinStatusEqualTo(String value) {
            addCriterion("FIN_STATUS =", value, "finStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusNotEqualTo(String value) {
            addCriterion("FIN_STATUS <>", value, "finStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusGreaterThan(String value) {
            addCriterion("FIN_STATUS >", value, "finStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FIN_STATUS >=", value, "finStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusLessThan(String value) {
            addCriterion("FIN_STATUS <", value, "finStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusLessThanOrEqualTo(String value) {
            addCriterion("FIN_STATUS <=", value, "finStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusLike(String value) {
            addCriterion("FIN_STATUS like", value, "finStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusNotLike(String value) {
            addCriterion("FIN_STATUS not like", value, "finStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusIn(List<String> values) {
            addCriterion("FIN_STATUS in", values, "finStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusNotIn(List<String> values) {
            addCriterion("FIN_STATUS not in", values, "finStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusBetween(String value1, String value2) {
            addCriterion("FIN_STATUS between", value1, value2, "finStatus");
            return (Criteria) this;
        }

        public Criteria andFinStatusNotBetween(String value1, String value2) {
            addCriterion("FIN_STATUS not between", value1, value2, "finStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusIsNull() {
            addCriterion("SALESFORCE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusIsNotNull() {
            addCriterion("SALESFORCE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusEqualTo(String value) {
            addCriterion("SALESFORCE_STATUS =", value, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusNotEqualTo(String value) {
            addCriterion("SALESFORCE_STATUS <>", value, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusGreaterThan(String value) {
            addCriterion("SALESFORCE_STATUS >", value, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SALESFORCE_STATUS >=", value, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusLessThan(String value) {
            addCriterion("SALESFORCE_STATUS <", value, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusLessThanOrEqualTo(String value) {
            addCriterion("SALESFORCE_STATUS <=", value, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusLike(String value) {
            addCriterion("SALESFORCE_STATUS like", value, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusNotLike(String value) {
            addCriterion("SALESFORCE_STATUS not like", value, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusIn(List<String> values) {
            addCriterion("SALESFORCE_STATUS in", values, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusNotIn(List<String> values) {
            addCriterion("SALESFORCE_STATUS not in", values, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusBetween(String value1, String value2) {
            addCriterion("SALESFORCE_STATUS between", value1, value2, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andSalesforceStatusNotBetween(String value1, String value2) {
            addCriterion("SALESFORCE_STATUS not between", value1, value2, "salesforceStatus");
            return (Criteria) this;
        }

        public Criteria andBillingAddressIsNull() {
            addCriterion("BILLING_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBillingAddressIsNotNull() {
            addCriterion("BILLING_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBillingAddressEqualTo(String value) {
            addCriterion("BILLING_ADDRESS =", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressNotEqualTo(String value) {
            addCriterion("BILLING_ADDRESS <>", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressGreaterThan(String value) {
            addCriterion("BILLING_ADDRESS >", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BILLING_ADDRESS >=", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressLessThan(String value) {
            addCriterion("BILLING_ADDRESS <", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressLessThanOrEqualTo(String value) {
            addCriterion("BILLING_ADDRESS <=", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressLike(String value) {
            addCriterion("BILLING_ADDRESS like", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressNotLike(String value) {
            addCriterion("BILLING_ADDRESS not like", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressIn(List<String> values) {
            addCriterion("BILLING_ADDRESS in", values, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressNotIn(List<String> values) {
            addCriterion("BILLING_ADDRESS not in", values, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressBetween(String value1, String value2) {
            addCriterion("BILLING_ADDRESS between", value1, value2, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressNotBetween(String value1, String value2) {
            addCriterion("BILLING_ADDRESS not between", value1, value2, "billingAddress");
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