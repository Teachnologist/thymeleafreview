package com.mysite.beta;

import org.springframework.web.client.RestTemplate;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


public class Consumeapi {

    final String URI = "https://data.cityofchicago.org/resource/tt4n-kn4t.json";

    public String consume() {
        // HttpHeaders
        HttpHeaders headers = new HttpHeaders();


        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));

        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON);

        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Send request with GET method, and Headers.
        ResponseEntity<String> response = restTemplate.exchange(URI, //
                HttpMethod.GET, entity, String.class);

        String result = response.getBody();

        System.out.println(result);
        return result;
    }

}
