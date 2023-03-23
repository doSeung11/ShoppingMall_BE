package fontys.sem3.shoppingmall.persistence.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntity {

    private Long id;
    private String name;
    private String userId;
    private String UserPw;
}
