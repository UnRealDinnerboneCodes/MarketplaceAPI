package com.unrealdinnerbone.marketplaceapi.api;

import java.util.List;

public record DisplayProperties(boolean purchasable, List<PackIdentity> packIdentity, int bundleMSRP, String price, String creatorName) {
}
