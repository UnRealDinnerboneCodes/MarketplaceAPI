package com.unrealdinnerbone.marketplaceapi.api;

import com.squareup.moshi.Json;

import java.util.List;

public record Product(@Json(name = "Locale") String locale,
                      @Json(name = "CreationDate") String creationDate,
                      @Json(name = "rid") String rid,
                      @Json(name = "Description") TextBox description,
                      @Json(name = "ContentType") String contentType,
                      @Json(name = "CreatorId") long creatorId,
                      @Json(name = "Images") List<Image> images,
                      @Json(name = "Title") TextBox title,
                      @Json(name = "DisplayProperties") DisplayProperties displayProperties,
                      @Json(name = "StartDate") String startDate,
                      @Json(name = "Prices") List<Price> prices,
                      @Json(name = "_attachments") String attachments,
                      @Json(name = "IsTest") boolean isTest,
                      @Json(name = "AverageRating") Double averageRating,
                      @Json(name = "TotalRatingsCount") Integer totalRatingsCount,
                      @Json(name = "id") String id,
                      @Json(name = "_self") String self,
                      @Json(name = "Tags") List<String> tags,
                      @Json(name = "_etag") String eTag,
                      @Json(name = "_ts") String ts) {}
