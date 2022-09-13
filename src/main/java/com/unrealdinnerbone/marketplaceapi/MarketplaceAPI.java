package com.unrealdinnerbone.marketplaceapi;


import com.unrealdinnerbone.marketplaceapi.api.Category;
import com.unrealdinnerbone.marketplaceapi.api.Product;
import com.unrealdinnerbone.marketplaceapi.util.MarketplaceAPIUtils;
import com.unrealdinnerbone.unreallib.StringUtils;
import com.unrealdinnerbone.unreallib.apiutils.IReturnResult;
import com.unrealdinnerbone.unreallib.json.JsonParseException;

import java.util.ArrayList;
import java.util.List;

public class MarketplaceAPI {

    public static IReturnResult<Product[]> getProduct(String creatorId, int skip, int limit) {
        return MarketplaceAPIUtils.get(Product[].class, StringUtils.replace("productmanagement.filterproduct.json?locale=en-us&creatorId={0}&skip={1}&limit={2}", creatorId, skip, limit));
    }

    public static IReturnResult<Product[]> getProduct(Category category, int skip, int limit) {
        String url = StringUtils.replace("productmanagement.productsinfobytype.json?locale=en-us&skip={1}&limit={2}&type={0}", category.getName(), skip, limit);
        return MarketplaceAPIUtils.get(Product[].class, url);
    }



    public static List<Product> getAllProducts(Category category, int start, int limit) throws JsonParseException {
        List<Product> products = new ArrayList<>();
        IReturnResult<Product[]> result = MarketplaceAPI.getProduct(category, start, limit);
        Product[] foundProducts = result.getExceptionally();
        if(foundProducts.length == limit) {
            products.addAll(getAllProducts(category, start + limit, limit));
        }
        products.addAll(List.of(foundProducts));
        return products;
    }



    public static List<Product> getAllProducts(String name, int start, int limit) throws JsonParseException {
        List<Product> products = new ArrayList<>();
        IReturnResult<Product[]> result = MarketplaceAPI.getProduct(name, start, limit);
        Product[] foundProducts = result.getExceptionally();
        if(foundProducts.length == limit) {
            products.addAll(getAllProducts(name, start + limit, limit));
        }
        products.addAll(List.of(foundProducts));
        return products;
    }
}