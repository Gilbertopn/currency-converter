package com.gilberto.currency_converter.domain;



import com.gilberto.currency_converter.domain.valueobject.Money;

import java.time.LocalDateTime;
import java.util.UUID;

public class CurrencyConversion {

    private final UUID id;
    private final Money originalAmount;
    private final Money convertedToUSD;
    private final Money convertedToEUR;
    private final LocalDateTime createdAt;

    public CurrencyConversion(
            Money originalAmount,
            Money convertedToUSD,
            Money convertedToEUR
    ) {
        this.id = UUID.randomUUID();
        this.originalAmount = originalAmount;
        this.convertedToUSD = convertedToUSD;
        this.convertedToEUR = convertedToEUR;
        this.createdAt = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public Money getOriginalAmount() {
        return originalAmount;
    }

    public Money getConvertedToUSD() {
        return convertedToUSD;
    }

    public Money getConvertedToEUR() {
        return convertedToEUR;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}