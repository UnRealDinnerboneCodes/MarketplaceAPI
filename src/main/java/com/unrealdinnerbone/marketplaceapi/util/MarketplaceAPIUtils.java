package com.unrealdinnerbone.marketplaceapi.util;

import com.unrealdinnerbone.unreallib.apiutils.APIUtils;
import com.unrealdinnerbone.unreallib.apiutils.IReturnResult;
import com.unrealdinnerbone.unreallib.web.HttpHelper;
import org.jetbrains.annotations.NotNull;

import java.net.http.HttpClient;

public class MarketplaceAPIUtils {

    private static final String BASE_URL = System.getenv().getOrDefault("AUTHORS_API_URL", "https://www.minecraft.net/bin/minecraft/");

    private static final HttpHelper HELPER = new HttpHelper(HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build(), "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36");

    @NotNull
    public static <T> IReturnResult<T> get(Class<T> tClass, String urlData) {
        return APIUtils.get(HELPER, tClass, BASE_URL + urlData);
    }



}
