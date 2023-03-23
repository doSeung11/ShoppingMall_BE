package fontys.sem3.shoppingmall.business.impl;

import fontys.sem3.shoppingmall.business.CreateProduct;
import fontys.sem3.shoppingmall.domain.CreateProductRequest;
import fontys.sem3.shoppingmall.domain.CreateProductResponse;
import fontys.sem3.shoppingmall.persistence.ProductRepository;
import fontys.sem3.shoppingmall.persistence.entity.ProductEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateProductImpl implements CreateProduct {
    private final ProductRepository productRepository;
    @Override
    public CreateProductResponse createProduct(CreateProductRequest request) {
        ProductEntity savedProduct = saveNewProduct(request);
        return CreateProductResponse.builder()
                .id(savedProduct.getId())
                .build();
    }

    private ProductEntity saveNewProduct(CreateProductRequest request) {
        ProductEntity newProduct = ProductEntity.builder()
                .name(request.getName())
                .price(request.getPrice())
                .gender(request.getGender())
                .category(request.getCategory())
                .color(request.getColor())
                .detail(request.getDetail())
                .build();
        return productRepository.save(newProduct);
    }
}
