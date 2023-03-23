package fontys.sem3.shoppingmall.business.converter;


import fontys.sem3.shoppingmall.domain.Product;
import fontys.sem3.shoppingmall.persistence.entity.ProductEntity;

public class ProductConverter {
    private ProductConverter(){ }

    public static Product convert(ProductEntity product){
        return Product.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .gender(product.getGender())
                .category(product.getCategory())
                .color(product.getColor())
                .detail(product.getDetail())
                .build();
    }
}
