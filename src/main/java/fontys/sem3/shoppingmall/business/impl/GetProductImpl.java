package fontys.sem3.shoppingmall.business.impl;

import fontys.sem3.shoppingmall.business.GetProduct;
import fontys.sem3.shoppingmall.business.converter.ProductConverter;
import fontys.sem3.shoppingmall.domain.Product;
import fontys.sem3.shoppingmall.persistence.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GetProductImpl implements GetProduct {
    private ProductRepository productRepository;

    @Override
    public Optional<Product> getProduct(long productId) {
        return productRepository.findById(productId).map(ProductConverter::convert);
    }
}
