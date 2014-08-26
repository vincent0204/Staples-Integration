package com.staples.domain;

import java.math.BigDecimal;

public class Output {
    private String sapRefNo;

    private String accountName;

    private String provinceSegment;

    private String citySegment;

    private String districtSegment;

    private String phone;

    private String phone2;

    private BigDecimal staff;

    private String industry;

    private String accountSource;

    private String purchaseType;

    private String customerType;

    private String bdSales;

    private String amSales;

    private String samSales;

    private String telephonist;

    private String statementPerson;

    private String isObsolete;

    private String firstOrderDate;

    private String lastOrderDate;

    private String sapGroupNo;

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

    private BigDecimal instaAndWarrYtdSales;

    private BigDecimal offiFurniYtdSales;

    private BigDecimal offiStatioYtdSales;

    private BigDecimal computAndAccessYtdSales;

    private BigDecimal retailStoresAndSuppl;

    private BigDecimal businessServYtdSales;

    private BigDecimal commercEquipYtdSales;

    private BigDecimal ppFooandhousgsYtdSales;

    private BigDecimal specNocodsupplYtdSales;

    private BigDecimal lyInstaAndWarrYtdSales;

    private BigDecimal lyOffiFurniYtdSales;

    private BigDecimal lyOffiStatioYtdSales;

    private BigDecimal lyComputAndAccYtdSales;

    private BigDecimal lyRetailStoresAndSuppl;

    private BigDecimal lyBusinessServYtdSales;

    private BigDecimal lyCommercEquipYtdSales;

    private BigDecimal lyPpFooandhousgsYtdSales;

    private BigDecimal lySpecNocodsupplYtdSales;

    private BigDecimal id;

    private String cusModifiedDate;

    private String salYtdModifiedDate;

    private String salMtdModifiedDate;

    private String salClsModifiedDate;

    private String finModifiedDate;

    private String salesforceModifiedDate;

    private String isNewAccount;

    private String cusStatus;

    private String salYtdStatus;

    private String salMtdStatus;

    private String salClsStatus;

    private String finStatus;

    private String salesforceStatus;

    private String billingAddress;

    public String getSapRefNo() {
        return sapRefNo;
    }

    public void setSapRefNo(String sapRefNo) {
        this.sapRefNo = sapRefNo == null ? null : sapRefNo.trim();
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

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
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

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType == null ? null : purchaseType.trim();
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

    public String getFirstOrderDate() {
        return firstOrderDate;
    }

    public void setFirstOrderDate(String firstOrderDate) {
        this.firstOrderDate = firstOrderDate == null ? null : firstOrderDate.trim();
    }

    public String getLastOrderDate() {
        return lastOrderDate;
    }

    public void setLastOrderDate(String lastOrderDate) {
        this.lastOrderDate = lastOrderDate == null ? null : lastOrderDate.trim();
    }

    public String getSapGroupNo() {
        return sapGroupNo;
    }

    public void setSapGroupNo(String sapGroupNo) {
        this.sapGroupNo = sapGroupNo == null ? null : sapGroupNo.trim();
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

    public BigDecimal getInstaAndWarrYtdSales() {
        return instaAndWarrYtdSales;
    }

    public void setInstaAndWarrYtdSales(BigDecimal instaAndWarrYtdSales) {
        this.instaAndWarrYtdSales = instaAndWarrYtdSales;
    }

    public BigDecimal getOffiFurniYtdSales() {
        return offiFurniYtdSales;
    }

    public void setOffiFurniYtdSales(BigDecimal offiFurniYtdSales) {
        this.offiFurniYtdSales = offiFurniYtdSales;
    }

    public BigDecimal getOffiStatioYtdSales() {
        return offiStatioYtdSales;
    }

    public void setOffiStatioYtdSales(BigDecimal offiStatioYtdSales) {
        this.offiStatioYtdSales = offiStatioYtdSales;
    }

    public BigDecimal getComputAndAccessYtdSales() {
        return computAndAccessYtdSales;
    }

    public void setComputAndAccessYtdSales(BigDecimal computAndAccessYtdSales) {
        this.computAndAccessYtdSales = computAndAccessYtdSales;
    }

    public BigDecimal getRetailStoresAndSuppl() {
        return retailStoresAndSuppl;
    }

    public void setRetailStoresAndSuppl(BigDecimal retailStoresAndSuppl) {
        this.retailStoresAndSuppl = retailStoresAndSuppl;
    }

    public BigDecimal getBusinessServYtdSales() {
        return businessServYtdSales;
    }

    public void setBusinessServYtdSales(BigDecimal businessServYtdSales) {
        this.businessServYtdSales = businessServYtdSales;
    }

    public BigDecimal getCommercEquipYtdSales() {
        return commercEquipYtdSales;
    }

    public void setCommercEquipYtdSales(BigDecimal commercEquipYtdSales) {
        this.commercEquipYtdSales = commercEquipYtdSales;
    }

    public BigDecimal getPpFooandhousgsYtdSales() {
        return ppFooandhousgsYtdSales;
    }

    public void setPpFooandhousgsYtdSales(BigDecimal ppFooandhousgsYtdSales) {
        this.ppFooandhousgsYtdSales = ppFooandhousgsYtdSales;
    }

    public BigDecimal getSpecNocodsupplYtdSales() {
        return specNocodsupplYtdSales;
    }

    public void setSpecNocodsupplYtdSales(BigDecimal specNocodsupplYtdSales) {
        this.specNocodsupplYtdSales = specNocodsupplYtdSales;
    }

    public BigDecimal getLyInstaAndWarrYtdSales() {
        return lyInstaAndWarrYtdSales;
    }

    public void setLyInstaAndWarrYtdSales(BigDecimal lyInstaAndWarrYtdSales) {
        this.lyInstaAndWarrYtdSales = lyInstaAndWarrYtdSales;
    }

    public BigDecimal getLyOffiFurniYtdSales() {
        return lyOffiFurniYtdSales;
    }

    public void setLyOffiFurniYtdSales(BigDecimal lyOffiFurniYtdSales) {
        this.lyOffiFurniYtdSales = lyOffiFurniYtdSales;
    }

    public BigDecimal getLyOffiStatioYtdSales() {
        return lyOffiStatioYtdSales;
    }

    public void setLyOffiStatioYtdSales(BigDecimal lyOffiStatioYtdSales) {
        this.lyOffiStatioYtdSales = lyOffiStatioYtdSales;
    }

    public BigDecimal getLyComputAndAccYtdSales() {
        return lyComputAndAccYtdSales;
    }

    public void setLyComputAndAccYtdSales(BigDecimal lyComputAndAccYtdSales) {
        this.lyComputAndAccYtdSales = lyComputAndAccYtdSales;
    }

    public BigDecimal getLyRetailStoresAndSuppl() {
        return lyRetailStoresAndSuppl;
    }

    public void setLyRetailStoresAndSuppl(BigDecimal lyRetailStoresAndSuppl) {
        this.lyRetailStoresAndSuppl = lyRetailStoresAndSuppl;
    }

    public BigDecimal getLyBusinessServYtdSales() {
        return lyBusinessServYtdSales;
    }

    public void setLyBusinessServYtdSales(BigDecimal lyBusinessServYtdSales) {
        this.lyBusinessServYtdSales = lyBusinessServYtdSales;
    }

    public BigDecimal getLyCommercEquipYtdSales() {
        return lyCommercEquipYtdSales;
    }

    public void setLyCommercEquipYtdSales(BigDecimal lyCommercEquipYtdSales) {
        this.lyCommercEquipYtdSales = lyCommercEquipYtdSales;
    }

    public BigDecimal getLyPpFooandhousgsYtdSales() {
        return lyPpFooandhousgsYtdSales;
    }

    public void setLyPpFooandhousgsYtdSales(BigDecimal lyPpFooandhousgsYtdSales) {
        this.lyPpFooandhousgsYtdSales = lyPpFooandhousgsYtdSales;
    }

    public BigDecimal getLySpecNocodsupplYtdSales() {
        return lySpecNocodsupplYtdSales;
    }

    public void setLySpecNocodsupplYtdSales(BigDecimal lySpecNocodsupplYtdSales) {
        this.lySpecNocodsupplYtdSales = lySpecNocodsupplYtdSales;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCusModifiedDate() {
        return cusModifiedDate;
    }

    public void setCusModifiedDate(String cusModifiedDate) {
        this.cusModifiedDate = cusModifiedDate == null ? null : cusModifiedDate.trim();
    }

    public String getSalYtdModifiedDate() {
        return salYtdModifiedDate;
    }

    public void setSalYtdModifiedDate(String salYtdModifiedDate) {
        this.salYtdModifiedDate = salYtdModifiedDate == null ? null : salYtdModifiedDate.trim();
    }

    public String getSalMtdModifiedDate() {
        return salMtdModifiedDate;
    }

    public void setSalMtdModifiedDate(String salMtdModifiedDate) {
        this.salMtdModifiedDate = salMtdModifiedDate == null ? null : salMtdModifiedDate.trim();
    }

    public String getSalClsModifiedDate() {
        return salClsModifiedDate;
    }

    public void setSalClsModifiedDate(String salClsModifiedDate) {
        this.salClsModifiedDate = salClsModifiedDate == null ? null : salClsModifiedDate.trim();
    }

    public String getFinModifiedDate() {
        return finModifiedDate;
    }

    public void setFinModifiedDate(String finModifiedDate) {
        this.finModifiedDate = finModifiedDate == null ? null : finModifiedDate.trim();
    }

    public String getSalesforceModifiedDate() {
        return salesforceModifiedDate;
    }

    public void setSalesforceModifiedDate(String salesforceModifiedDate) {
        this.salesforceModifiedDate = salesforceModifiedDate == null ? null : salesforceModifiedDate.trim();
    }

    public String getIsNewAccount() {
        return isNewAccount;
    }

    public void setIsNewAccount(String isNewAccount) {
        this.isNewAccount = isNewAccount == null ? null : isNewAccount.trim();
    }

    public String getCusStatus() {
        return cusStatus;
    }

    public void setCusStatus(String cusStatus) {
        this.cusStatus = cusStatus == null ? null : cusStatus.trim();
    }

    public String getSalYtdStatus() {
        return salYtdStatus;
    }

    public void setSalYtdStatus(String salYtdStatus) {
        this.salYtdStatus = salYtdStatus == null ? null : salYtdStatus.trim();
    }

    public String getSalMtdStatus() {
        return salMtdStatus;
    }

    public void setSalMtdStatus(String salMtdStatus) {
        this.salMtdStatus = salMtdStatus == null ? null : salMtdStatus.trim();
    }

    public String getSalClsStatus() {
        return salClsStatus;
    }

    public void setSalClsStatus(String salClsStatus) {
        this.salClsStatus = salClsStatus == null ? null : salClsStatus.trim();
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

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress == null ? null : billingAddress.trim();
    }
}