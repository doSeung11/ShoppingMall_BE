package fontys.sem3.shoppingmall.persistence.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdminEntity {

    private Long num;
    private String id;
    private String pw;
    private String name;
}
