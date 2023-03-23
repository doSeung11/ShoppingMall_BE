package fontys.sem3.shoppingmall.persistence.impl;

import fontys.sem3.shoppingmall.persistence.ProductRepository;
import fontys.sem3.shoppingmall.persistence.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class FakeProductRepositoryImpl implements ProductRepository {

    private static long NEXT_NUM = 1;  //인덱싱 변수
    private final List<ProductEntity> savedProducts;  //나중엔 디비를 불러오겠지
    public FakeProductRepositoryImpl(){this.savedProducts = new ArrayList<>();}  //생성자
    @Override
    public ProductEntity save(ProductEntity Product) {
        if (Product.getId() == null){
            Product.setId(NEXT_NUM);
            NEXT_NUM++;
            this.savedProducts.add(Product);
        }
        return Product;
    }

    @Override
    public List<ProductEntity> findAll() {
        return Collections.unmodifiableList(this.savedProducts);
    }

    @Override
    public Optional<ProductEntity> findById(long productId) {
        return this.savedProducts.stream()
                .filter(productEntity -> productEntity.getId().equals((productId)))
                .findFirst();
    }

    @Override
    public void deleteById(long ProductId) {
        this.savedProducts.removeIf(ProductEntity -> ProductEntity.getId().equals(ProductId));
    }
}
