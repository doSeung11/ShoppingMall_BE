package fontys.sem3.shoppingmall.persistence;

import fontys.sem3.shoppingmall.persistence.entity.AdminEntity;

import java.util.List;

public interface AdminRepository {

    AdminEntity save(AdminEntity Admin);

    List<AdminEntity> findAll();

    void deleteByNum(long AdminNum);


}
