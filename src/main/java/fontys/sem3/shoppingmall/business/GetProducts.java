package fontys.sem3.shoppingmall.business;

import fontys.sem3.shoppingmall.domain.GetAllProductsRequest;
import fontys.sem3.shoppingmall.domain.GetAllProductsResponse;

public interface GetProducts {
    GetAllProductsResponse getProducts(GetAllProductsRequest request);
}
