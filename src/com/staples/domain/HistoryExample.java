package com.staples.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryExample() {
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

        public Criteria andSfIdIsNull() {
            addCriterion("SF_ID is null");
            return (Criteria) this;
        }

        public Criteria andSfIdIsNotNull() {
            addCriterion("SF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSfIdEqualTo(String value) {
            addCriterion("SF_ID =", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdNotEqualTo(String value) {
            addCriterion("SF_ID <>", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdGreaterThan(String value) {
            addCriterion("SF_ID >", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdGreaterThanOrEqualTo(String value) {
            addCriterion("SF_ID >=", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdLessThan(String value) {
            addCriterion("SF_ID <", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdLessThanOrEqualTo(String value) {
            addCriterion("SF_ID <=", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdLike(String value) {
            addCriterion("SF_ID like", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdNotLike(String value) {
            addCriterion("SF_ID not like", value, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdIn(List<String> values) {
            addCriterion("SF_ID in", values, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdNotIn(List<String> values) {
            addCriterion("SF_ID not in", values, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdBetween(String value1, String value2) {
            addCriterion("SF_ID between", value1, value2, "sfId");
            return (Criteria) this;
        }

        public Criteria andSfIdNotBetween(String value1, String value2) {
            addCriterion("SF_ID not between", value1, value2, "sfId");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("YEAR like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("YEAR not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andSaleIsNull() {
            addCriterion("SALE is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsNotNull() {
            addCriterion("SALE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEqualTo(BigDecimal value) {
            addCriterion("SALE =", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotEqualTo(BigDecimal value) {
            addCriterion("SALE <>", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThan(BigDecimal value) {
            addCriterion("SALE >", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE >=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThan(BigDecimal value) {
            addCriterion("SALE <", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE <=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleIn(List<BigDecimal> values) {
            addCriterion("SALE in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotIn(List<BigDecimal> values) {
            addCriterion("SALE not in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE not between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andMarginIsNull() {
            addCriterion("MARGIN is null");
            return (Criteria) this;
        }

        public Criteria andMarginIsNotNull() {
            addCriterion("MARGIN is not null");
            return (Criteria) this;
        }

        public Criteria andMarginEqualTo(BigDecimal value) {
            addCriterion("MARGIN =", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotEqualTo(BigDecimal value) {
            addCriterion("MARGIN <>", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginGreaterThan(BigDecimal value) {
            addCriterion("MARGIN >", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MARGIN >=", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginLessThan(BigDecimal value) {
            addCriterion("MARGIN <", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MARGIN <=", value, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginIn(List<BigDecimal> values) {
            addCriterion("MARGIN in", values, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotIn(List<BigDecimal> values) {
            addCriterion("MARGIN not in", values, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARGIN between", value1, value2, "margin");
            return (Criteria) this;
        }

        public Criteria andMarginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARGIN not between", value1, value2, "margin");
            return (Criteria) this;
        }

        public Criteria andJanSalesIsNull() {
            addCriterion("JAN_SALES is null");
            return (Criteria) this;
        }

        public Criteria andJanSalesIsNotNull() {
            addCriterion("JAN_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andJanSalesEqualTo(BigDecimal value) {
            addCriterion("JAN_SALES =", value, "janSales");
            return (Criteria) this;
        }

        public Criteria andJanSalesNotEqualTo(BigDecimal value) {
            addCriterion("JAN_SALES <>", value, "janSales");
            return (Criteria) this;
        }

        public Criteria andJanSalesGreaterThan(BigDecimal value) {
            addCriterion("JAN_SALES >", value, "janSales");
            return (Criteria) this;
        }

        public Criteria andJanSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JAN_SALES >=", value, "janSales");
            return (Criteria) this;
        }

        public Criteria andJanSalesLessThan(BigDecimal value) {
            addCriterion("JAN_SALES <", value, "janSales");
            return (Criteria) this;
        }

        public Criteria andJanSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JAN_SALES <=", value, "janSales");
            return (Criteria) this;
        }

        public Criteria andJanSalesIn(List<BigDecimal> values) {
            addCriterion("JAN_SALES in", values, "janSales");
            return (Criteria) this;
        }

        public Criteria andJanSalesNotIn(List<BigDecimal> values) {
            addCriterion("JAN_SALES not in", values, "janSales");
            return (Criteria) this;
        }

        public Criteria andJanSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JAN_SALES between", value1, value2, "janSales");
            return (Criteria) this;
        }

        public Criteria andJanSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JAN_SALES not between", value1, value2, "janSales");
            return (Criteria) this;
        }

        public Criteria andFebSalesIsNull() {
            addCriterion("FEB_SALES is null");
            return (Criteria) this;
        }

        public Criteria andFebSalesIsNotNull() {
            addCriterion("FEB_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andFebSalesEqualTo(BigDecimal value) {
            addCriterion("FEB_SALES =", value, "febSales");
            return (Criteria) this;
        }

        public Criteria andFebSalesNotEqualTo(BigDecimal value) {
            addCriterion("FEB_SALES <>", value, "febSales");
            return (Criteria) this;
        }

        public Criteria andFebSalesGreaterThan(BigDecimal value) {
            addCriterion("FEB_SALES >", value, "febSales");
            return (Criteria) this;
        }

        public Criteria andFebSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEB_SALES >=", value, "febSales");
            return (Criteria) this;
        }

        public Criteria andFebSalesLessThan(BigDecimal value) {
            addCriterion("FEB_SALES <", value, "febSales");
            return (Criteria) this;
        }

        public Criteria andFebSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEB_SALES <=", value, "febSales");
            return (Criteria) this;
        }

        public Criteria andFebSalesIn(List<BigDecimal> values) {
            addCriterion("FEB_SALES in", values, "febSales");
            return (Criteria) this;
        }

        public Criteria andFebSalesNotIn(List<BigDecimal> values) {
            addCriterion("FEB_SALES not in", values, "febSales");
            return (Criteria) this;
        }

        public Criteria andFebSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEB_SALES between", value1, value2, "febSales");
            return (Criteria) this;
        }

        public Criteria andFebSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEB_SALES not between", value1, value2, "febSales");
            return (Criteria) this;
        }

        public Criteria andMarSalesIsNull() {
            addCriterion("MAR_SALES is null");
            return (Criteria) this;
        }

        public Criteria andMarSalesIsNotNull() {
            addCriterion("MAR_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andMarSalesEqualTo(BigDecimal value) {
            addCriterion("MAR_SALES =", value, "marSales");
            return (Criteria) this;
        }

        public Criteria andMarSalesNotEqualTo(BigDecimal value) {
            addCriterion("MAR_SALES <>", value, "marSales");
            return (Criteria) this;
        }

        public Criteria andMarSalesGreaterThan(BigDecimal value) {
            addCriterion("MAR_SALES >", value, "marSales");
            return (Criteria) this;
        }

        public Criteria andMarSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAR_SALES >=", value, "marSales");
            return (Criteria) this;
        }

        public Criteria andMarSalesLessThan(BigDecimal value) {
            addCriterion("MAR_SALES <", value, "marSales");
            return (Criteria) this;
        }

        public Criteria andMarSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAR_SALES <=", value, "marSales");
            return (Criteria) this;
        }

        public Criteria andMarSalesIn(List<BigDecimal> values) {
            addCriterion("MAR_SALES in", values, "marSales");
            return (Criteria) this;
        }

        public Criteria andMarSalesNotIn(List<BigDecimal> values) {
            addCriterion("MAR_SALES not in", values, "marSales");
            return (Criteria) this;
        }

        public Criteria andMarSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAR_SALES between", value1, value2, "marSales");
            return (Criteria) this;
        }

        public Criteria andMarSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAR_SALES not between", value1, value2, "marSales");
            return (Criteria) this;
        }

        public Criteria andAprSalesIsNull() {
            addCriterion("APR_SALES is null");
            return (Criteria) this;
        }

        public Criteria andAprSalesIsNotNull() {
            addCriterion("APR_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andAprSalesEqualTo(BigDecimal value) {
            addCriterion("APR_SALES =", value, "aprSales");
            return (Criteria) this;
        }

        public Criteria andAprSalesNotEqualTo(BigDecimal value) {
            addCriterion("APR_SALES <>", value, "aprSales");
            return (Criteria) this;
        }

        public Criteria andAprSalesGreaterThan(BigDecimal value) {
            addCriterion("APR_SALES >", value, "aprSales");
            return (Criteria) this;
        }

        public Criteria andAprSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APR_SALES >=", value, "aprSales");
            return (Criteria) this;
        }

        public Criteria andAprSalesLessThan(BigDecimal value) {
            addCriterion("APR_SALES <", value, "aprSales");
            return (Criteria) this;
        }

        public Criteria andAprSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APR_SALES <=", value, "aprSales");
            return (Criteria) this;
        }

        public Criteria andAprSalesIn(List<BigDecimal> values) {
            addCriterion("APR_SALES in", values, "aprSales");
            return (Criteria) this;
        }

        public Criteria andAprSalesNotIn(List<BigDecimal> values) {
            addCriterion("APR_SALES not in", values, "aprSales");
            return (Criteria) this;
        }

        public Criteria andAprSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APR_SALES between", value1, value2, "aprSales");
            return (Criteria) this;
        }

        public Criteria andAprSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APR_SALES not between", value1, value2, "aprSales");
            return (Criteria) this;
        }

        public Criteria andMaySalesIsNull() {
            addCriterion("MAY_SALES is null");
            return (Criteria) this;
        }

        public Criteria andMaySalesIsNotNull() {
            addCriterion("MAY_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andMaySalesEqualTo(BigDecimal value) {
            addCriterion("MAY_SALES =", value, "maySales");
            return (Criteria) this;
        }

        public Criteria andMaySalesNotEqualTo(BigDecimal value) {
            addCriterion("MAY_SALES <>", value, "maySales");
            return (Criteria) this;
        }

        public Criteria andMaySalesGreaterThan(BigDecimal value) {
            addCriterion("MAY_SALES >", value, "maySales");
            return (Criteria) this;
        }

        public Criteria andMaySalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAY_SALES >=", value, "maySales");
            return (Criteria) this;
        }

        public Criteria andMaySalesLessThan(BigDecimal value) {
            addCriterion("MAY_SALES <", value, "maySales");
            return (Criteria) this;
        }

        public Criteria andMaySalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAY_SALES <=", value, "maySales");
            return (Criteria) this;
        }

        public Criteria andMaySalesIn(List<BigDecimal> values) {
            addCriterion("MAY_SALES in", values, "maySales");
            return (Criteria) this;
        }

        public Criteria andMaySalesNotIn(List<BigDecimal> values) {
            addCriterion("MAY_SALES not in", values, "maySales");
            return (Criteria) this;
        }

        public Criteria andMaySalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAY_SALES between", value1, value2, "maySales");
            return (Criteria) this;
        }

        public Criteria andMaySalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAY_SALES not between", value1, value2, "maySales");
            return (Criteria) this;
        }

        public Criteria andJunSalesIsNull() {
            addCriterion("JUN_SALES is null");
            return (Criteria) this;
        }

        public Criteria andJunSalesIsNotNull() {
            addCriterion("JUN_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andJunSalesEqualTo(BigDecimal value) {
            addCriterion("JUN_SALES =", value, "junSales");
            return (Criteria) this;
        }

        public Criteria andJunSalesNotEqualTo(BigDecimal value) {
            addCriterion("JUN_SALES <>", value, "junSales");
            return (Criteria) this;
        }

        public Criteria andJunSalesGreaterThan(BigDecimal value) {
            addCriterion("JUN_SALES >", value, "junSales");
            return (Criteria) this;
        }

        public Criteria andJunSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JUN_SALES >=", value, "junSales");
            return (Criteria) this;
        }

        public Criteria andJunSalesLessThan(BigDecimal value) {
            addCriterion("JUN_SALES <", value, "junSales");
            return (Criteria) this;
        }

        public Criteria andJunSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JUN_SALES <=", value, "junSales");
            return (Criteria) this;
        }

        public Criteria andJunSalesIn(List<BigDecimal> values) {
            addCriterion("JUN_SALES in", values, "junSales");
            return (Criteria) this;
        }

        public Criteria andJunSalesNotIn(List<BigDecimal> values) {
            addCriterion("JUN_SALES not in", values, "junSales");
            return (Criteria) this;
        }

        public Criteria andJunSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUN_SALES between", value1, value2, "junSales");
            return (Criteria) this;
        }

        public Criteria andJunSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUN_SALES not between", value1, value2, "junSales");
            return (Criteria) this;
        }

        public Criteria andJulSalesIsNull() {
            addCriterion("JUL_SALES is null");
            return (Criteria) this;
        }

        public Criteria andJulSalesIsNotNull() {
            addCriterion("JUL_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andJulSalesEqualTo(BigDecimal value) {
            addCriterion("JUL_SALES =", value, "julSales");
            return (Criteria) this;
        }

        public Criteria andJulSalesNotEqualTo(BigDecimal value) {
            addCriterion("JUL_SALES <>", value, "julSales");
            return (Criteria) this;
        }

        public Criteria andJulSalesGreaterThan(BigDecimal value) {
            addCriterion("JUL_SALES >", value, "julSales");
            return (Criteria) this;
        }

        public Criteria andJulSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JUL_SALES >=", value, "julSales");
            return (Criteria) this;
        }

        public Criteria andJulSalesLessThan(BigDecimal value) {
            addCriterion("JUL_SALES <", value, "julSales");
            return (Criteria) this;
        }

        public Criteria andJulSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JUL_SALES <=", value, "julSales");
            return (Criteria) this;
        }

        public Criteria andJulSalesIn(List<BigDecimal> values) {
            addCriterion("JUL_SALES in", values, "julSales");
            return (Criteria) this;
        }

        public Criteria andJulSalesNotIn(List<BigDecimal> values) {
            addCriterion("JUL_SALES not in", values, "julSales");
            return (Criteria) this;
        }

        public Criteria andJulSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUL_SALES between", value1, value2, "julSales");
            return (Criteria) this;
        }

        public Criteria andJulSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUL_SALES not between", value1, value2, "julSales");
            return (Criteria) this;
        }

        public Criteria andAugSalesIsNull() {
            addCriterion("AUG_SALES is null");
            return (Criteria) this;
        }

        public Criteria andAugSalesIsNotNull() {
            addCriterion("AUG_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andAugSalesEqualTo(BigDecimal value) {
            addCriterion("AUG_SALES =", value, "augSales");
            return (Criteria) this;
        }

        public Criteria andAugSalesNotEqualTo(BigDecimal value) {
            addCriterion("AUG_SALES <>", value, "augSales");
            return (Criteria) this;
        }

        public Criteria andAugSalesGreaterThan(BigDecimal value) {
            addCriterion("AUG_SALES >", value, "augSales");
            return (Criteria) this;
        }

        public Criteria andAugSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUG_SALES >=", value, "augSales");
            return (Criteria) this;
        }

        public Criteria andAugSalesLessThan(BigDecimal value) {
            addCriterion("AUG_SALES <", value, "augSales");
            return (Criteria) this;
        }

        public Criteria andAugSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUG_SALES <=", value, "augSales");
            return (Criteria) this;
        }

        public Criteria andAugSalesIn(List<BigDecimal> values) {
            addCriterion("AUG_SALES in", values, "augSales");
            return (Criteria) this;
        }

        public Criteria andAugSalesNotIn(List<BigDecimal> values) {
            addCriterion("AUG_SALES not in", values, "augSales");
            return (Criteria) this;
        }

        public Criteria andAugSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUG_SALES between", value1, value2, "augSales");
            return (Criteria) this;
        }

        public Criteria andAugSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUG_SALES not between", value1, value2, "augSales");
            return (Criteria) this;
        }

        public Criteria andSepSalesIsNull() {
            addCriterion("SEP_SALES is null");
            return (Criteria) this;
        }

        public Criteria andSepSalesIsNotNull() {
            addCriterion("SEP_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andSepSalesEqualTo(BigDecimal value) {
            addCriterion("SEP_SALES =", value, "sepSales");
            return (Criteria) this;
        }

        public Criteria andSepSalesNotEqualTo(BigDecimal value) {
            addCriterion("SEP_SALES <>", value, "sepSales");
            return (Criteria) this;
        }

        public Criteria andSepSalesGreaterThan(BigDecimal value) {
            addCriterion("SEP_SALES >", value, "sepSales");
            return (Criteria) this;
        }

        public Criteria andSepSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEP_SALES >=", value, "sepSales");
            return (Criteria) this;
        }

        public Criteria andSepSalesLessThan(BigDecimal value) {
            addCriterion("SEP_SALES <", value, "sepSales");
            return (Criteria) this;
        }

        public Criteria andSepSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEP_SALES <=", value, "sepSales");
            return (Criteria) this;
        }

        public Criteria andSepSalesIn(List<BigDecimal> values) {
            addCriterion("SEP_SALES in", values, "sepSales");
            return (Criteria) this;
        }

        public Criteria andSepSalesNotIn(List<BigDecimal> values) {
            addCriterion("SEP_SALES not in", values, "sepSales");
            return (Criteria) this;
        }

        public Criteria andSepSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEP_SALES between", value1, value2, "sepSales");
            return (Criteria) this;
        }

        public Criteria andSepSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEP_SALES not between", value1, value2, "sepSales");
            return (Criteria) this;
        }

        public Criteria andOctSalesIsNull() {
            addCriterion("OCT_SALES is null");
            return (Criteria) this;
        }

        public Criteria andOctSalesIsNotNull() {
            addCriterion("OCT_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andOctSalesEqualTo(BigDecimal value) {
            addCriterion("OCT_SALES =", value, "octSales");
            return (Criteria) this;
        }

        public Criteria andOctSalesNotEqualTo(BigDecimal value) {
            addCriterion("OCT_SALES <>", value, "octSales");
            return (Criteria) this;
        }

        public Criteria andOctSalesGreaterThan(BigDecimal value) {
            addCriterion("OCT_SALES >", value, "octSales");
            return (Criteria) this;
        }

        public Criteria andOctSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OCT_SALES >=", value, "octSales");
            return (Criteria) this;
        }

        public Criteria andOctSalesLessThan(BigDecimal value) {
            addCriterion("OCT_SALES <", value, "octSales");
            return (Criteria) this;
        }

        public Criteria andOctSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OCT_SALES <=", value, "octSales");
            return (Criteria) this;
        }

        public Criteria andOctSalesIn(List<BigDecimal> values) {
            addCriterion("OCT_SALES in", values, "octSales");
            return (Criteria) this;
        }

        public Criteria andOctSalesNotIn(List<BigDecimal> values) {
            addCriterion("OCT_SALES not in", values, "octSales");
            return (Criteria) this;
        }

        public Criteria andOctSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OCT_SALES between", value1, value2, "octSales");
            return (Criteria) this;
        }

        public Criteria andOctSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OCT_SALES not between", value1, value2, "octSales");
            return (Criteria) this;
        }

        public Criteria andNovSalesIsNull() {
            addCriterion("NOV_SALES is null");
            return (Criteria) this;
        }

        public Criteria andNovSalesIsNotNull() {
            addCriterion("NOV_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andNovSalesEqualTo(BigDecimal value) {
            addCriterion("NOV_SALES =", value, "novSales");
            return (Criteria) this;
        }

        public Criteria andNovSalesNotEqualTo(BigDecimal value) {
            addCriterion("NOV_SALES <>", value, "novSales");
            return (Criteria) this;
        }

        public Criteria andNovSalesGreaterThan(BigDecimal value) {
            addCriterion("NOV_SALES >", value, "novSales");
            return (Criteria) this;
        }

        public Criteria andNovSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOV_SALES >=", value, "novSales");
            return (Criteria) this;
        }

        public Criteria andNovSalesLessThan(BigDecimal value) {
            addCriterion("NOV_SALES <", value, "novSales");
            return (Criteria) this;
        }

        public Criteria andNovSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOV_SALES <=", value, "novSales");
            return (Criteria) this;
        }

        public Criteria andNovSalesIn(List<BigDecimal> values) {
            addCriterion("NOV_SALES in", values, "novSales");
            return (Criteria) this;
        }

        public Criteria andNovSalesNotIn(List<BigDecimal> values) {
            addCriterion("NOV_SALES not in", values, "novSales");
            return (Criteria) this;
        }

        public Criteria andNovSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOV_SALES between", value1, value2, "novSales");
            return (Criteria) this;
        }

        public Criteria andNovSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOV_SALES not between", value1, value2, "novSales");
            return (Criteria) this;
        }

        public Criteria andDecSalesIsNull() {
            addCriterion("DEC_SALES is null");
            return (Criteria) this;
        }

        public Criteria andDecSalesIsNotNull() {
            addCriterion("DEC_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andDecSalesEqualTo(BigDecimal value) {
            addCriterion("DEC_SALES =", value, "decSales");
            return (Criteria) this;
        }

        public Criteria andDecSalesNotEqualTo(BigDecimal value) {
            addCriterion("DEC_SALES <>", value, "decSales");
            return (Criteria) this;
        }

        public Criteria andDecSalesGreaterThan(BigDecimal value) {
            addCriterion("DEC_SALES >", value, "decSales");
            return (Criteria) this;
        }

        public Criteria andDecSalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEC_SALES >=", value, "decSales");
            return (Criteria) this;
        }

        public Criteria andDecSalesLessThan(BigDecimal value) {
            addCriterion("DEC_SALES <", value, "decSales");
            return (Criteria) this;
        }

        public Criteria andDecSalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEC_SALES <=", value, "decSales");
            return (Criteria) this;
        }

        public Criteria andDecSalesIn(List<BigDecimal> values) {
            addCriterion("DEC_SALES in", values, "decSales");
            return (Criteria) this;
        }

        public Criteria andDecSalesNotIn(List<BigDecimal> values) {
            addCriterion("DEC_SALES not in", values, "decSales");
            return (Criteria) this;
        }

        public Criteria andDecSalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEC_SALES between", value1, value2, "decSales");
            return (Criteria) this;
        }

        public Criteria andDecSalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEC_SALES not between", value1, value2, "decSales");
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