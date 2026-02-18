package com.gilberto.currency_converter.domain.valueobject;

import java.util.Set;

public class Currency {

    private static final Set<String> SUPPORTED_CURRENCIES = Set.of("USD", "EUR", "BRL");

    private final String code;

    public Currency(String code) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Currency cannot be null or empty");
        }

        code = code.toUpperCase();

        if (!SUPPORTED_CURRENCIES.contains(code)) {
            throw new IllegalArgumentException("Unsupported currency: " + code);
        }

        this.code = code;
    }

    public String getCode() {
        return code;
    }
}