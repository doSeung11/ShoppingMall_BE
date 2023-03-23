package fontys.sem3.shoppingmall.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductRequest {
    private String name;
    private Long price;
    private String gender;
    private String category;
    private String color;
    private String detail;
}
