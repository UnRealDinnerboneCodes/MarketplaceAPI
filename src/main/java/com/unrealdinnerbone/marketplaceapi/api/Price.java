package com.unrealdinnerbone.marketplaceapi.api;

import java.util.List;

public record Price(String currencyId, List<Sale> sales, String listPrice) {
}
