package com.mysite.beta;

import org.springframework.web.client.RestTemplate;
import java.lang.*;
import java.util.*;
import java.io.PrintStream;

public class Consumeapi {

    final String uri = "https://data.cityofchicago.org/resource/tt4n-kn4t.json";

    public String function consume() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

}
