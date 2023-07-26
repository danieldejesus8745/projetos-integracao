package com.addresses.services;

import com.addresses.dto.AddressDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static com.addresses.utils.Messages.MESSAGE_1;

@Service
@Slf4j
public class AddressService {

    public AddressDTO getAddress(String cep) {
        URI uri = URI.create("https://viacep.com.br/ws/" + cep + "/json");

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        AddressDTO addressDTO = null;

        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            addressDTO = objectMapper.readValue(response.body(), AddressDTO.class);
        } catch (IOException | InterruptedException exception) {
            log.error(MESSAGE_1.getDescription());
        }

        return addressDTO;
    }

}
