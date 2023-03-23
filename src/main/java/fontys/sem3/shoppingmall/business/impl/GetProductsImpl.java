package fontys.sem3.shoppingmall.business.impl;

import fontys.sem3.shoppingmall.business.GetProducts;
import fontys.sem3.shoppingmall.business.converter.ProductConverter;
import fontys.sem3.shoppingmall.domain.GetAllProductsRequest;
import fontys.sem3.shoppingmall.domain.GetAllProductsResponse;
import fontys.sem3.shoppingmall.domain.Product;
import fontys.sem3.shoppingmall.persistence.ProductRepository;
import fontys.sem3.shoppingmall.persistence.entity.ProductEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetProductsImpl implements GetProducts {
    private ProductRepository productRepository;
    @Override
    public GetAllProductsResponse getProducts(GetAllProductsRequest request) {
        List<ProductEntity> results = productRepository.findAll();

        final GetAllProductsResponse response = new GetAllProductsResponse();
        List<Product> products = results
                .stream()
                .map(ProductConverter::convert)
                .toList();
        response.setProducts(products);
        return response;
    }
}
