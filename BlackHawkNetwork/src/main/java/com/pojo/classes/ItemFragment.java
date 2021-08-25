package com.pojo.classes;

public class ItemFragment {
	private String _id;
	 private String _class;
	 private String printerId;
	 private String printerName;
	 private String fulfillmentOrderId;
	 private String bhnLineItemId;
	 private String bundleId;
	 ProductInfo ProductInfoObject;
	 private boolean activateOnShipment;
	 ActivationMailer ActivationMailerObject;
	 Supplementals SupplementalsObject;
	 public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	public String getPrinterId() {
		return printerId;
	}
	public void setPrinterId(String printerId) {
		this.printerId = printerId;
	}
	public String getPrinterName() {
		return printerName;
	}
	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}
	public String getFulfillmentOrderId() {
		return fulfillmentOrderId;
	}
	public void setFulfillmentOrderId(String fulfillmentOrderId) {
		this.fulfillmentOrderId = fulfillmentOrderId;
	}
	public String getBhnLineItemId() {
		return bhnLineItemId;
	}
	public void setBhnLineItemId(String bhnLineItemId) {
		this.bhnLineItemId = bhnLineItemId;
	}
	public String getBundleId() {
		return bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}
	public ProductInfo getProductInfoObject() {
		return ProductInfoObject;
	}
	public void setProductInfoObject(ProductInfo productInfoObject) {
		ProductInfoObject = productInfoObject;
	}
	public boolean isActivateOnShipment() {
		return activateOnShipment;
	}
	public void setActivateOnShipment(boolean activateOnShipment) {
		this.activateOnShipment = activateOnShipment;
	}
	public ActivationMailer getActivationMailerObject() {
		return ActivationMailerObject;
	}
	public void setActivationMailerObject(ActivationMailer activationMailerObject) {
		ActivationMailerObject = activationMailerObject;
	}
	public Supplementals getSupplementalsObject() {
		return SupplementalsObject;
	}
	public void setSupplementalsObject(Supplementals supplementalsObject) {
		SupplementalsObject = supplementalsObject;
	}
	public String getShippingAccountNumber() {
		return shippingAccountNumber;
	}
	public void setShippingAccountNumber(String shippingAccountNumber) {
		this.shippingAccountNumber = shippingAccountNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public boolean isBulk() {
		return isBulk;
	}
	public void setBulk(boolean isBulk) {
		this.isBulk = isBulk;
	}
	public float getCardQuantity() {
		return cardQuantity;
	}
	public void setCardQuantity(float cardQuantity) {
		this.cardQuantity = cardQuantity;
	}
	public String getCardDenomination() {
		return cardDenomination;
	}
	public void setCardDenomination(String cardDenomination) {
		this.cardDenomination = cardDenomination;
	}
	public String getLineItemStatus() {
		return lineItemStatus;
	}
	public void setLineItemStatus(String lineItemStatus) {
		this.lineItemStatus = lineItemStatus;
	}
	public String getItemSubTotal() {
		return itemSubTotal;
	}
	public void setItemSubTotal(String itemSubTotal) {
		this.itemSubTotal = itemSubTotal;
	}
	public float getPackagingSequenceNumber() {
		return packagingSequenceNumber;
	}
	public void setPackagingSequenceNumber(float packagingSequenceNumber) {
		this.packagingSequenceNumber = packagingSequenceNumber;
	}
	public String getCardImageUrlFront() {
		return cardImageUrlFront;
	}
	public void setCardImageUrlFront(String cardImageUrlFront) {
		this.cardImageUrlFront = cardImageUrlFront;
	}
	public String getPrintType() {
		return printType;
	}
	public void setPrintType(String printType) {
		this.printType = printType;
	}
	public String getCarrierImageUrlFront() {
		return carrierImageUrlFront;
	}
	public void setCarrierImageUrlFront(String carrierImageUrlFront) {
		this.carrierImageUrlFront = carrierImageUrlFront;
	}
	public String getCarrierImageUrlBack() {
		return carrierImageUrlBack;
	}
	public void setCarrierImageUrlBack(String carrierImageUrlBack) {
		this.carrierImageUrlBack = carrierImageUrlBack;
	}
	public String getPackingSlipImageUrlFront() {
		return packingSlipImageUrlFront;
	}
	public void setPackingSlipImageUrlFront(String packingSlipImageUrlFront) {
		this.packingSlipImageUrlFront = packingSlipImageUrlFront;
	}
	public String getPackingSlipImageUrlBack() {
		return packingSlipImageUrlBack;
	}
	public void setPackingSlipImageUrlBack(String packingSlipImageUrlBack) {
		this.packingSlipImageUrlBack = packingSlipImageUrlBack;
	}
	public String getActivationCode() {
		return activationCode;
	}
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}
	public boolean isExpediteFulfillment() {
		return expediteFulfillment;
	}
	public void setExpediteFulfillment(boolean expediteFulfillment) {
		this.expediteFulfillment = expediteFulfillment;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public float getVersion() {
		return version;
	}
	public void setVersion(float version) {
		this.version = version;
	}
	private String shippingAccountNumber;
	 private String cardType;
	 private String orderType;
	 private boolean isBulk;
	 private float cardQuantity;
	 private String cardDenomination;
	 private String lineItemStatus;
	 private String itemSubTotal;
	 private float packagingSequenceNumber;
	 private String cardImageUrlFront;
	 private String printType;
	 private String carrierImageUrlFront;
	 private String carrierImageUrlBack;
	 private String packingSlipImageUrlFront;
	 private String packingSlipImageUrlBack;
	 private String activationCode;
	 private boolean expediteFulfillment;
	 private String createdDate;
	 private String lastModifiedDate;
	 private float version;
}
