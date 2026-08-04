package com.fitness.aiservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class GeminiService {

    private final WebClient webClient;
    @Value("${gemini.api.url}")
    private String geminiApiUrl;
    @Value("${gemini.api.key}")
    private String geminiApiKey;


    public GeminiService(WebClient.Builder webClientBuilder) {

        this.webClient = webClientBuilder.build();
    }

    public String getAnswer(String question){

        log.info(geminiApiUrl);
        log.info(geminiApiKey);

      /*  Map<String,Object> requestBody=Map.of("contents",new Object[]{
                Map.of("parts",new Object[]{
                Map.of("text",question)
        })});*/

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("model", "gemini-3.6-flash");
        requestBody.put("input", question);

        String response=webClient.post()
                .uri(geminiApiUrl+geminiApiKey)
                .header("Content_Type","application/json")
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return response;
    }
}
