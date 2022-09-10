package com.unrealdinnerbone.marketplaceapi.api;

import com.squareup.moshi.Json;

public record Image(@Json(name = "Type") String type, String url) {}

