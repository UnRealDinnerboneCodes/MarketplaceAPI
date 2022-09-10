package com.unrealdinnerbone.marketplaceapi.api;

import com.squareup.moshi.Json;

public record TextBox(@Json(name = "en-us") String enUs,
                      String neutral) {
}
