package info.thecodinglive.config;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

@Configuration
public class RestConfig {

    private static final int TIME_OUT = 5000;

    private ClientHttpRequestFactory getClientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        clientHttpRequestFactory.setConnectionRequestTimeout(5000);
        clientHttpRequestFactory.setReadTimeout(5000);
        return clientHttpRequestFactory;
    }

    private ClientHttpRequestFactory getrestConfigHttpRequestFactory() {
        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(TIME_OUT)
                .setConnectionRequestTimeout(TIME_OUT)
                .setSocketTimeout(TIME_OUT)
                .build();

        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(config)
                .build();
        return new HttpComponentsClientHttpRequestFactory(httpClient);
    }
}
