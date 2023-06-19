package com.example.service_client.requests;

import com.example.service_client.UrlProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.HttpStatus.OK;

public class HttpClientTest {

    private RestTemplate restTemplate;

    @BeforeMethod
    public void setUp() {
        restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
    }

    @Test(invocationCount = 200)
    public void catalogOrderingMessage() throws InterruptedException {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.CATALOG_ORDERING, String.class);
        assertEquals(response.getStatusCode(), OK);
        sleep(5000);
    }

    @Test(invocationCount = 200)
    public void catalogPaymentMessage() throws InterruptedException {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.CATALOG_PAYMENT, String.class);
        assertEquals(response.getStatusCode(), OK);
        sleep(2000);
    }

    @Test(invocationCount = 100)
    public void catalogWebhookMessage() {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.CATALOG_WEBHOOK, String.class);
        assertEquals(response.getStatusCode(), OK);
    }

    @Test(invocationCount = 1)
    public void catalogBackgroundMessage() {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.CATALOG_BACKGROUND, String.class);
        assertEquals(response.getStatusCode(), OK);
    }

    @Test(invocationCount = 200)
    public void catalogSignalMessage() throws InterruptedException {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.CATALOG_SIGNAL, String.class);
        assertEquals(response.getStatusCode(), OK);
        sleep(2000);
    }

    @Test(invocationCount = 1)
    public void orderingCatalogMessage() {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.ORDERING_CATALOG, String.class);
        assertEquals(response.getStatusCode(), OK);
    }

    @Test(invocationCount = 200)
    public void orderingPaymentMessage() throws InterruptedException {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.ORDERING_PAYMENT, String.class);
        assertEquals(response.getStatusCode(), OK);
        sleep(2000);
    }

    @Test(invocationCount = 1)
    public void orderingWebhookMessage() {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.ORDERING_WEBHOOK, String.class);
        assertEquals(response.getStatusCode(), OK);
    }

    @Test(invocationCount = 1)
    public void orderingBackgroundMessage() {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.ORDERING_BACKGROUND, String.class);
        assertEquals(response.getStatusCode(), OK);
    }

    @Test(invocationCount = 200)
    public void orderingSignalMessage() throws InterruptedException {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.ORDERING_SIGNAL, String.class);
        assertEquals(response.getStatusCode(), OK);
        sleep(2000);
    }

    @Test(invocationCount = 20)
    public void webhookCatalogMessage() throws InterruptedException {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.WEBHOOK_CATALOG, String.class);
        assertEquals(response.getStatusCode(), OK);
        sleep(5000);
    }

    @Test(invocationCount = 300)
    public void webhookPaymentMessage() throws InterruptedException {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.WEBHOOK_PAYMENT, String.class);
        assertEquals(response.getStatusCode(), OK);
        sleep(2000);
    }

    @Test(invocationCount = 5)
    public void webhookOrderingMessage() throws InterruptedException {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.WEBHOOK_ORDERING, String.class);
        assertEquals(response.getStatusCode(), OK);
        sleep(5000);
    }

    @Test(invocationCount = 200)
    public void webhookBackgroundMessage() throws InterruptedException {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.WEBHOOK_BACKGROUND, String.class);
        assertEquals(response.getStatusCode(), OK);
        sleep(2000);
    }

    @Test(invocationCount = 200)
    public void webhookSignalMessage() throws InterruptedException {
        ResponseEntity<String> response = restTemplate.getForEntity(UrlProvider.WEBHOOK_SIGNAL, String.class);
        assertEquals(response.getStatusCode(), OK);
        sleep(2000);
    }
}
