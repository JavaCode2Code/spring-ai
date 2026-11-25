package com.scjp.demo.service;

import org.springframework.stereotype.Service;

import com.google.genai.Client;

@Service
public class ChatService {
	
	private final  Client client;
    public ChatService() {
        this.client = Client.builder()
                .apiKey("dummy-api-key")
                .build();
    }

    public String ask(String prompt) {
        var response = client.models.generateContent(
                "gemini-3.6-flash",
                prompt,
                null);

        return response.text();
    }

}
