package fontys.sem3.shoppingmall.persistence;

import fontys.sem3.shoppingmall.persistence.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    ProductEntity save(ProductEntity Product);

    List<ProductEntity> findAll();

    Optional<ProductEntity> findById(long productId);


    void deleteById(long ProductId);
}
