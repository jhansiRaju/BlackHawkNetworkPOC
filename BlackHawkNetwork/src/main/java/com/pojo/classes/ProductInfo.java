package com.pojo.classes;

public class ProductInfo {
	 private String iid;
	 private String upc;
	 private String name;
	 private float quantity;
	 private boolean isClosed;
	 private boolean isPreprinted;
	public String getIid() {
		return iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public boolean isClosed() {
		return isClosed;
	}
	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	public boolean isPreprinted() {
		return isPreprinted;
	}
	public void setPreprinted(boolean isPreprinted) {
		this.isPreprinted = isPreprinted;
	}
}
