package com.example.democountries.controller;

import com.example.democountries.model.País;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("{code}")
    public ResponseEntity<País> getCountryInfo(@PathVariable String code) throws ParseException {

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("https://restcountries.com/v3.1/alpha/" + code, String.class);

        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(result);
        JSONObject json = (JSONObject) jsonArray.get(0);

        String s = ((JSONObject)json.get("name")).get("official").toString();

        System.out.println(s);

        País p = new País(json.get("cca3").toString(), json.get("capital").toString());

        return ResponseEntity.ok(p);

    }
}
