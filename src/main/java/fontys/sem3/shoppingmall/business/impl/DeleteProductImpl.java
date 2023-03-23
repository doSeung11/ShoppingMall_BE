package fontys.sem3.shoppingmall.business.impl;


import fontys.sem3.shoppingmall.business.DeleteProduct;
import fontys.sem3.shoppingmall.persistence.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteProductImpl implements DeleteProduct {
    private final ProductRepository productRepository;
    @Override
    public void deleteProduct(long productId) {
        this.productRepository.deleteById(productId);
    }
}
