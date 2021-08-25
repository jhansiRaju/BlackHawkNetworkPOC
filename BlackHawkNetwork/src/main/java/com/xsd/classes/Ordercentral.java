package com.xsd.classes;
public class Ordercentral {
    Fulfillmentreq FulfillmentreqObject;
    private String _xmlns_xsi;
    private String _xsi_noNamespaceSchemaLocation;


    // Getter Methods 

    public Fulfillmentreq getFulfillmentreq() {
        return FulfillmentreqObject;
    }

    public String get_xmlns_xsi() {
        return _xmlns_xsi;
    }

    public String get_xsi_noNamespaceSchemaLocation() {
        return _xsi_noNamespaceSchemaLocation;
    }

    // Setter Methods 

    public void setFulfillmentreq(Fulfillmentreq fulfillmentreqObject) {
        this.FulfillmentreqObject = fulfillmentreqObject;
    }

    public void set_xmlns_xsi(String _xmlns_xsi) {
        this._xmlns_xsi = _xmlns_xsi;
    }

    public void set_xsi_noNamespaceSchemaLocation(String _xsi_noNamespaceSchemaLocation) {
        this._xsi_noNamespaceSchemaLocation = _xsi_noNamespaceSchemaLocation;
    }
}