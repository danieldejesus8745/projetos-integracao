package com.addresses.controllers;

import com.addresses.dto.AddressDTO;
import com.addresses.services.AddressService;
import com.addresses.utils.ResponseModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

import static com.addresses.utils.Messages.MESSAGE_2;
import static com.addresses.utils.Messages.MESSAGE_3;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/addresses")
public class AddressController {

    private final AddressService addressService;

    @GetMapping(path = "/{cep}/address")
    public ResponseEntity<ResponseModel> getAddress(@PathVariable("cep") String cep) {
        AddressDTO address = addressService.getAddress(cep);

        if (Objects.isNull(address)) {
            ResponseEntity.ok(new ResponseModel(MESSAGE_2.getDescription(), new AddressDTO()));
        }

        return ResponseEntity.ok(new ResponseModel(MESSAGE_3.getDescription(), address));
    }

}
