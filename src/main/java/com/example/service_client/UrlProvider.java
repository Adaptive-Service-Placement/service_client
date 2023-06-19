package com.example.service_client;

public class UrlProvider {

    // DNS OF APPLICATION GOES HERE
    public static final String HOST = "34.89.239.165.nip.io";

    public static final String CATALOG_ORDERING = "http://" + HOST + "/catalog-api/api/v1/Catalog/ordering";
    public static final String CATALOG_PAYMENT = "http://" + HOST + "/catalog-api/api/v1/Catalog/payment";
    public static final String CATALOG_WEBHOOK = "http://" + HOST + "/catalog-api/api/v1/Catalog/webhook";
    public static final String CATALOG_SIGNAL = "http://" + HOST + "/catalog-api/api/v1/Catalog/signal";
    public static final String CATALOG_BACKGROUND = "http://" + HOST + "/catalog-api/api/v1/Catalog/background";

    public static final String ORDERING_CATALOG = "http://" + HOST + "/ordering-api/api/v1/Orders/catalog";
    public static final String ORDERING_PAYMENT = "http://" + HOST + "/ordering-api/api/v1/Orders/payment";
    public static final String ORDERING_WEBHOOK = "http://" + HOST + "/ordering-api/api/v1/Orders/webhook";
    public static final String ORDERING_SIGNAL = "http://" + HOST + "/ordering-api/api/v1/Orders/signal";
    public static final String ORDERING_BACKGROUND = "http://" + HOST + "/ordering-api/api/v1/Orders/background";

    public static final String WEBHOOK_ORDERING = "http://" + HOST + "/webhooks-api/api/v1/Webhooks/ordering";
    public static final String WEBHOOK_PAYMENT = "http://" + HOST + "/webhooks-api/api/v1/Webhooks/payment";
    public static final String WEBHOOK_CATALOG = "http://" + HOST + "/webhooks-api/api/v1/Webhooks/catalog";
    public static final String WEBHOOK_SIGNAL = "http://" + HOST + "/webhooks-api/api/v1/Webhooks/signal";
    public static final String WEBHOOK_BACKGROUND = "http://" + HOST + "/webhooks-api/api/v1/Webhooks/background";
}
