package com.addresses.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Messages {

    MESSAGE_1("Erro ao obter endereço"),
    MESSAGE_2("Endereço não encontrado"),
    MESSAGE_3("Endereço encontrado");

    private final String description;

}
