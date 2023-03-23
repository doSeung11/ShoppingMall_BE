package fontys.sem3.shoppingmall.business;

import fontys.sem3.shoppingmall.domain.Product;

import java.util.Optional;

public interface GetProduct {
    Optional<Product> getProduct(long productId);
}
