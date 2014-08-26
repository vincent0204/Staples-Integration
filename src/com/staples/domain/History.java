package com.staples.domain;

import java.math.BigDecimal;

public class History {
    private String sapRefNo;

    private String sfId;

    private String year;

    private BigDecimal sale;

    private BigDecimal margin;

    private BigDecimal janSales;

    private BigDecimal febSales;

    private BigDecimal marSales;

    private BigDecimal aprSales;

    private BigDecimal maySales;

    private BigDecimal junSales;

    private BigDecimal julSales;

    private BigDecimal augSales;

    private BigDecimal sepSales;

    private BigDecimal octSales;

    private BigDecimal novSales;

    private BigDecimal decSales;

    public String getSapRefNo() {
        return sapRefNo;
    }

    public void setSapRefNo(String sapRefNo) {
        this.sapRefNo = sapRefNo == null ? null : sapRefNo.trim();
    }

    public String getSfId() {
        return sfId;
    }

    public void setSfId(String sfId) {
        this.sfId = sfId == null ? null : sfId.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    public BigDecimal getMargin() {
        return margin;
    }

    public void setMargin(BigDecimal margin) {
        this.margin = margin;
    }

    public BigDecimal getJanSales() {
        return janSales;
    }

    public void setJanSales(BigDecimal janSales) {
        this.janSales = janSales;
    }

    public BigDecimal getFebSales() {
        return febSales;
    }

    public void setFebSales(BigDecimal febSales) {
        this.febSales = febSales;
    }

    public BigDecimal getMarSales() {
        return marSales;
    }

    public void setMarSales(BigDecimal marSales) {
        this.marSales = marSales;
    }

    public BigDecimal getAprSales() {
        return aprSales;
    }

    public void setAprSales(BigDecimal aprSales) {
        this.aprSales = aprSales;
    }

    public BigDecimal getMaySales() {
        return maySales;
    }

    public void setMaySales(BigDecimal maySales) {
        this.maySales = maySales;
    }

    public BigDecimal getJunSales() {
        return junSales;
    }

    public void setJunSales(BigDecimal junSales) {
        this.junSales = junSales;
    }

    public BigDecimal getJulSales() {
        return julSales;
    }

    public void setJulSales(BigDecimal julSales) {
        this.julSales = julSales;
    }

    public BigDecimal getAugSales() {
        return augSales;
    }

    public void setAugSales(BigDecimal augSales) {
        this.augSales = augSales;
    }

    public BigDecimal getSepSales() {
        return sepSales;
    }

    public void setSepSales(BigDecimal sepSales) {
        this.sepSales = sepSales;
    }

    public BigDecimal getOctSales() {
        return octSales;
    }

    public void setOctSales(BigDecimal octSales) {
        this.octSales = octSales;
    }

    public BigDecimal getNovSales() {
        return novSales;
    }

    public void setNovSales(BigDecimal novSales) {
        this.novSales = novSales;
    }

    public BigDecimal getDecSales() {
        return decSales;
    }

    public void setDecSales(BigDecimal decSales) {
        this.decSales = decSales;
    }
}