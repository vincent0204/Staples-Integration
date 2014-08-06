package com.staples.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Output {
    private BigDecimal id;

    private String customerType;

    private String bdSales;

    private String amSales;

    private String samSales;

    private String telephonist;

    private String statementPerson;

    private String isObsolete;

    private Date firstOrderDate;

    private Date lastOrderDate;

    private String sapGroupNo;

    private String sapRefNo;

    private BigDecimal tyYtdMargin;

    private BigDecimal tyYtdSales;

    private BigDecimal tyYtdOrderCount;

    private BigDecimal tyYtdMonthCount;

    private BigDecimal tyMtdMargin;

    private BigDecimal tyMtdSales;

    private BigDecimal tyMtdOrderCount;

    private BigDecimal lyYtdSales;

    private BigDecimal blyYtdSales;

    private BigDecimal lyYtdMargin;

    private BigDecimal blyYtdMargin;

    private BigDecimal lyMtdSales;

    private BigDecimal blyMtdSales;

    private BigDecimal lyMtdMargin;

    private BigDecimal blyMtdMargin;

    private BigDecimal totalAr;

    private BigDecimal invoicedAr;

    private BigDecimal uninvoicedAr;

    private BigDecimal totalArOverdue;

    private BigDecimal invoicedArOverdue;

    private BigDecimal uninvoicedArOverdue;

    private BigDecimal totalCredit;

    private String statementIdentification;

    private String statementIdentificationFrom;

    private String statementIdentificationTo;

    private String invoiceIdentification;

    private String paymentCondition;

    private BigDecimal statementDay;

    private BigDecimal statementDayFrom;

    private BigDecimal statementDayTo;

    private BigDecimal invoiceDay;

    private String cusStatus;

    private String salStatus;

    private String finStatus;

    private String salesforceStatus;

    private Date cusModifiedDate;

    private Date salModifiedDate;

    private Date finModifiedDate;

    private Date salesforceModifiedDate;

    private String accountName;

    private String provinceSegment;

    private String citySegment;

    private String districtSegment;

    private String phone;

    private BigDecimal staff;

    private String industry;

    private String accountSource;

    private String segmentation;

    private String natureOfFirm;

    private String purchaseType;

    private String isNewAccount;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public String getBdSales() {
        return bdSales;
    }

    public void setBdSales(String bdSales) {
        this.bdSales = bdSales == null ? null : bdSales.trim();
    }

    public String getAmSales() {
        return amSales;
    }

    public void setAmSales(String amSales) {
        this.amSales = amSales == null ? null : amSales.trim();
    }

    public String getSamSales() {
        return samSales;
    }

    public void setSamSales(String samSales) {
        this.samSales = samSales == null ? null : samSales.trim();
    }

    public String getTelephonist() {
        return telephonist;
    }

    public void setTelephonist(String telephonist) {
        this.telephonist = telephonist == null ? null : telephonist.trim();
    }

    public String getStatementPerson() {
        return statementPerson;
    }

    public void setStatementPerson(String statementPerson) {
        this.statementPerson = statementPerson == null ? null : statementPerson.trim();
    }

    public String getIsObsolete() {
        return isObsolete;
    }

    public void setIsObsolete(String isObsolete) {
        this.isObsolete = isObsolete == null ? null : isObsolete.trim();
    }

    public Date getFirstOrderDate() {
        return firstOrderDate;
    }

    public void setFirstOrderDate(Date firstOrderDate) {
        this.firstOrderDate = firstOrderDate;
    }

    public Date getLastOrderDate() {
        return lastOrderDate;
    }

    public void setLastOrderDate(Date lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }

    public String getSapGroupNo() {
        return sapGroupNo;
    }

    public void setSapGroupNo(String sapGroupNo) {
        this.sapGroupNo = sapGroupNo == null ? null : sapGroupNo.trim();
    }

    public String getSapRefNo() {
        return sapRefNo;
    }

    public void setSapRefNo(String sapRefNo) {
        this.sapRefNo = sapRefNo == null ? null : sapRefNo.trim();
    }

    public BigDecimal getTyYtdMargin() {
        return tyYtdMargin;
    }

    public void setTyYtdMargin(BigDecimal tyYtdMargin) {
        this.tyYtdMargin = tyYtdMargin;
    }

    public BigDecimal getTyYtdSales() {
        return tyYtdSales;
    }

    public void setTyYtdSales(BigDecimal tyYtdSales) {
        this.tyYtdSales = tyYtdSales;
    }

    public BigDecimal getTyYtdOrderCount() {
        return tyYtdOrderCount;
    }

    public void setTyYtdOrderCount(BigDecimal tyYtdOrderCount) {
        this.tyYtdOrderCount = tyYtdOrderCount;
    }

    public BigDecimal getTyYtdMonthCount() {
        return tyYtdMonthCount;
    }

    public void setTyYtdMonthCount(BigDecimal tyYtdMonthCount) {
        this.tyYtdMonthCount = tyYtdMonthCount;
    }

    public BigDecimal getTyMtdMargin() {
        return tyMtdMargin;
    }

    public void setTyMtdMargin(BigDecimal tyMtdMargin) {
        this.tyMtdMargin = tyMtdMargin;
    }

    public BigDecimal getTyMtdSales() {
        return tyMtdSales;
    }

    public void setTyMtdSales(BigDecimal tyMtdSales) {
        this.tyMtdSales = tyMtdSales;
    }

    public BigDecimal getTyMtdOrderCount() {
        return tyMtdOrderCount;
    }

    public void setTyMtdOrderCount(BigDecimal tyMtdOrderCount) {
        this.tyMtdOrderCount = tyMtdOrderCount;
    }

    public BigDecimal getLyYtdSales() {
        return lyYtdSales;
    }

    public void setLyYtdSales(BigDecimal lyYtdSales) {
        this.lyYtdSales = lyYtdSales;
    }

    public BigDecimal getBlyYtdSales() {
        return blyYtdSales;
    }

    public void setBlyYtdSales(BigDecimal blyYtdSales) {
        this.blyYtdSales = blyYtdSales;
    }

    public BigDecimal getLyYtdMargin() {
        return lyYtdMargin;
    }

    public void setLyYtdMargin(BigDecimal lyYtdMargin) {
        this.lyYtdMargin = lyYtdMargin;
    }

    public BigDecimal getBlyYtdMargin() {
        return blyYtdMargin;
    }

    public void setBlyYtdMargin(BigDecimal blyYtdMargin) {
        this.blyYtdMargin = blyYtdMargin;
    }

    public BigDecimal getLyMtdSales() {
        return lyMtdSales;
    }

    public void setLyMtdSales(BigDecimal lyMtdSales) {
        this.lyMtdSales = lyMtdSales;
    }

    public BigDecimal getBlyMtdSales() {
        return blyMtdSales;
    }

    public void setBlyMtdSales(BigDecimal blyMtdSales) {
        this.blyMtdSales = blyMtdSales;
    }

    public BigDecimal getLyMtdMargin() {
        return lyMtdMargin;
    }

    public void setLyMtdMargin(BigDecimal lyMtdMargin) {
        this.lyMtdMargin = lyMtdMargin;
    }

    public BigDecimal getBlyMtdMargin() {
        return blyMtdMargin;
    }

    public void setBlyMtdMargin(BigDecimal blyMtdMargin) {
        this.blyMtdMargin = blyMtdMargin;
    }

    public BigDecimal getTotalAr() {
        return totalAr;
    }

    public void setTotalAr(BigDecimal totalAr) {
        this.totalAr = totalAr;
    }

    public BigDecimal getInvoicedAr() {
        return invoicedAr;
    }

    public void setInvoicedAr(BigDecimal invoicedAr) {
        this.invoicedAr = invoicedAr;
    }

    public BigDecimal getUninvoicedAr() {
        return uninvoicedAr;
    }

    public void setUninvoicedAr(BigDecimal uninvoicedAr) {
        this.uninvoicedAr = uninvoicedAr;
    }

    public BigDecimal getTotalArOverdue() {
        return totalArOverdue;
    }

    public void setTotalArOverdue(BigDecimal totalArOverdue) {
        this.totalArOverdue = totalArOverdue;
    }

    public BigDecimal getInvoicedArOverdue() {
        return invoicedArOverdue;
    }

    public void setInvoicedArOverdue(BigDecimal invoicedArOverdue) {
        this.invoicedArOverdue = invoicedArOverdue;
    }

    public BigDecimal getUninvoicedArOverdue() {
        return uninvoicedArOverdue;
    }

    public void setUninvoicedArOverdue(BigDecimal uninvoicedArOverdue) {
        this.uninvoicedArOverdue = uninvoicedArOverdue;
    }

    public BigDecimal getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(BigDecimal totalCredit) {
        this.totalCredit = totalCredit;
    }

    public String getStatementIdentification() {
        return statementIdentification;
    }

    public void setStatementIdentification(String statementIdentification) {
        this.statementIdentification = statementIdentification == null ? null : statementIdentification.trim();
    }

    public String getStatementIdentificationFrom() {
        return statementIdentificationFrom;
    }

    public void setStatementIdentificationFrom(String statementIdentificationFrom) {
        this.statementIdentificationFrom = statementIdentificationFrom == null ? null : statementIdentificationFrom.trim();
    }

    public String getStatementIdentificationTo() {
        return statementIdentificationTo;
    }

    public void setStatementIdentificationTo(String statementIdentificationTo) {
        this.statementIdentificationTo = statementIdentificationTo == null ? null : statementIdentificationTo.trim();
    }

    public String getInvoiceIdentification() {
        return invoiceIdentification;
    }

    public void setInvoiceIdentification(String invoiceIdentification) {
        this.invoiceIdentification = invoiceIdentification == null ? null : invoiceIdentification.trim();
    }

    public String getPaymentCondition() {
        return paymentCondition;
    }

    public void setPaymentCondition(String paymentCondition) {
        this.paymentCondition = paymentCondition == null ? null : paymentCondition.trim();
    }

    public BigDecimal getStatementDay() {
        return statementDay;
    }

    public void setStatementDay(BigDecimal statementDay) {
        this.statementDay = statementDay;
    }

    public BigDecimal getStatementDayFrom() {
        return statementDayFrom;
    }

    public void setStatementDayFrom(BigDecimal statementDayFrom) {
        this.statementDayFrom = statementDayFrom;
    }

    public BigDecimal getStatementDayTo() {
        return statementDayTo;
    }

    public void setStatementDayTo(BigDecimal statementDayTo) {
        this.statementDayTo = statementDayTo;
    }

    public BigDecimal getInvoiceDay() {
        return invoiceDay;
    }

    public void setInvoiceDay(BigDecimal invoiceDay) {
        this.invoiceDay = invoiceDay;
    }

    public String getCusStatus() {
        return cusStatus;
    }

    public void setCusStatus(String cusStatus) {
        this.cusStatus = cusStatus == null ? null : cusStatus.trim();
    }

    public String getSalStatus() {
        return salStatus;
    }

    public void setSalStatus(String salStatus) {
        this.salStatus = salStatus == null ? null : salStatus.trim();
    }

    public String getFinStatus() {
        return finStatus;
    }

    public void setFinStatus(String finStatus) {
        this.finStatus = finStatus == null ? null : finStatus.trim();
    }

    public String getSalesforceStatus() {
        return salesforceStatus;
    }

    public void setSalesforceStatus(String salesforceStatus) {
        this.salesforceStatus = salesforceStatus == null ? null : salesforceStatus.trim();
    }

    public Date getCusModifiedDate() {
        return cusModifiedDate;
    }

    public void setCusModifiedDate(Date cusModifiedDate) {
        this.cusModifiedDate = cusModifiedDate;
    }

    public Date getSalModifiedDate() {
        return salModifiedDate;
    }

    public void setSalModifiedDate(Date salModifiedDate) {
        this.salModifiedDate = salModifiedDate;
    }

    public Date getFinModifiedDate() {
        return finModifiedDate;
    }

    public void setFinModifiedDate(Date finModifiedDate) {
        this.finModifiedDate = finModifiedDate;
    }

    public Date getSalesforceModifiedDate() {
        return salesforceModifiedDate;
    }

    public void setSalesforceModifiedDate(Date salesforceModifiedDate) {
        this.salesforceModifiedDate = salesforceModifiedDate;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getProvinceSegment() {
        return provinceSegment;
    }

    public void setProvinceSegment(String provinceSegment) {
        this.provinceSegment = provinceSegment == null ? null : provinceSegment.trim();
    }

    public String getCitySegment() {
        return citySegment;
    }

    public void setCitySegment(String citySegment) {
        this.citySegment = citySegment == null ? null : citySegment.trim();
    }

    public String getDistrictSegment() {
        return districtSegment;
    }

    public void setDistrictSegment(String districtSegment) {
        this.districtSegment = districtSegment == null ? null : districtSegment.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public BigDecimal getStaff() {
        return staff;
    }

    public void setStaff(BigDecimal staff) {
        this.staff = staff;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getAccountSource() {
        return accountSource;
    }

    public void setAccountSource(String accountSource) {
        this.accountSource = accountSource == null ? null : accountSource.trim();
    }

    public String getSegmentation() {
        return segmentation;
    }

    public void setSegmentation(String segmentation) {
        this.segmentation = segmentation == null ? null : segmentation.trim();
    }

    public String getNatureOfFirm() {
        return natureOfFirm;
    }

    public void setNatureOfFirm(String natureOfFirm) {
        this.natureOfFirm = natureOfFirm == null ? null : natureOfFirm.trim();
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType == null ? null : purchaseType.trim();
    }

    public String getIsNewAccount() {
        return isNewAccount;
    }

    public void setIsNewAccount(String isNewAccount) {
        this.isNewAccount = isNewAccount == null ? null : isNewAccount.trim();
    }
}