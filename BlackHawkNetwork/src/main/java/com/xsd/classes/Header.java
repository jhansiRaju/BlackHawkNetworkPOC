package com.xsd.classes;

public class Header {
	 private String date;
	 private String batchnumber;
	 private String ordercount;
	 private String ofrspecversion;
	 private String ofrid;


	 // Getter Methods 

	 public String getDate() {
	  return date;
	 }

	 public String getBatchnumber() {
	  return batchnumber;
	 }

	 public String getOrdercount() {
	  return ordercount;
	 }

	 public String getOfrspecversion() {
	  return ofrspecversion;
	 }

	 public String getOfrid() {
	  return ofrid;
	 }

	 // Setter Methods 

	 public void setDate(String date) {
	  this.date = date;
	 }

	 public void setBatchnumber(String batchnumber) {
	  this.batchnumber = batchnumber;
	 }

	 public void setOrdercount(String ordercount) {
	  this.ordercount = ordercount;
	 }

	 public void setOfrspecversion(String ofrspecversion) {
	  this.ofrspecversion = ofrspecversion;
	 }

	 public void setOfrid(String ofrid) {
	  this.ofrid = ofrid;
	 }
}
