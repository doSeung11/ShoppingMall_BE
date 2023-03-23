package fontys.sem3.shoppingmall.persistence.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductEntity {
    private Long id;
    private String name;
    private Long price;
    private String gender;
    private String category;
    private String color;
    private String detail;
}
