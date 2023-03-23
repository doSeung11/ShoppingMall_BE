package fontys.sem3.shoppingmall.business;


import fontys.sem3.shoppingmall.domain.CreateProductRequest;
import fontys.sem3.shoppingmall.domain.CreateProductResponse;

public interface CreateProduct {
    CreateProductResponse createProduct(CreateProductRequest request);
}
