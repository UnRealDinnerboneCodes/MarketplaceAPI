package com.unrealdinnerbone.marketplaceapi;


import com.unrealdinnerbone.marketplaceapi.api.Product;
import com.unrealdinnerbone.marketplaceapi.util.MarketplaceAPIUtils;
import com.unrealdinnerbone.unreallib.StringUtils;
import com.unrealdinnerbone.unreallib.apiutils.IReturnResult;

public class MarketplaceAPI {

    public static IReturnResult<Product[]> getProduct(String creatorId, int skip, int limit) {
        return MarketplaceAPIUtils.get(Product[].class, StringUtils.replace("productmanagement.filterproduct.json?locale=en-us&creatorId={0}&skip={1}&limit={2}", creatorId, skip, limit));
    }

}
