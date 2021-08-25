package com.pojo.classes;

import java.util.ArrayList;

public class Supplementals {
	private boolean pinMailerRequired;
	 private boolean pinMailerDelay;
	 private String shippingMethodId;
	 private String shippingMethodName;
	 ShippingAddress ShippingAddressObject;
	 ReturnAddress ReturnAddressObject;
	 RegisterAddress RegisterAddressObject;
	 BomInfo BomInfoObject;
	 PackagingInfo PackagingInfoObject;
	 public boolean isPinMailerRequired() {
		return pinMailerRequired;
	}
	public void setPinMailerRequired(boolean pinMailerRequired) {
		this.pinMailerRequired = pinMailerRequired;
	}
	public boolean isPinMailerDelay() {
		return pinMailerDelay;
	}
	public void setPinMailerDelay(boolean pinMailerDelay) {
		this.pinMailerDelay = pinMailerDelay;
	}
	public String getShippingMethodId() {
		return shippingMethodId;
	}
	public void setShippingMethodId(String shippingMethodId) {
		this.shippingMethodId = shippingMethodId;
	}
	public String getShippingMethodName() {
		return shippingMethodName;
	}
	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}
	public ShippingAddress getShippingAddressObject() {
		return ShippingAddressObject;
	}
	public void setShippingAddressObject(ShippingAddress shippingAddressObject) {
		ShippingAddressObject = shippingAddressObject;
	}
	public ReturnAddress getReturnAddressObject() {
		return ReturnAddressObject;
	}
	public void setReturnAddressObject(ReturnAddress returnAddressObject) {
		ReturnAddressObject = returnAddressObject;
	}
	public RegisterAddress getRegisterAddressObject() {
		return RegisterAddressObject;
	}
	public void setRegisterAddressObject(RegisterAddress registerAddressObject) {
		RegisterAddressObject = registerAddressObject;
	}
	public BomInfo getBomInfoObject() {
		return BomInfoObject;
	}
	public void setBomInfoObject(BomInfo bomInfoObject) {
		BomInfoObject = bomInfoObject;
	}
	public PackagingInfo getPackagingInfoObject() {
		return PackagingInfoObject;
	}
	public void setPackagingInfoObject(PackagingInfo packagingInfoObject) {
		PackagingInfoObject = packagingInfoObject;
	}
	public IvrDetail getIvrDetailObject() {
		return IvrDetailObject;
	}
	public void setIvrDetailObject(IvrDetail ivrDetailObject) {
		IvrDetailObject = ivrDetailObject;
	}
	public ArrayList<Object> getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(ArrayList<Object> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	IvrDetail IvrDetailObject;
	 ArrayList < Object > additionalInfo = new ArrayList < Object > ();
}
