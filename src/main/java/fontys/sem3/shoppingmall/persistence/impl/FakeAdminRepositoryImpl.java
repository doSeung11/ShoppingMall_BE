package fontys.sem3.shoppingmall.persistence.impl;

import fontys.sem3.shoppingmall.persistence.AdminRepository;
import fontys.sem3.shoppingmall.persistence.entity.AdminEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class FakeAdminRepositoryImpl implements AdminRepository {

    private static long NEXT_NUM = 1;
    private final List<AdminEntity> savedAdmins;
    public FakeAdminRepositoryImpl() {
        this.savedAdmins = new ArrayList<>();
    }

    @Override
    public AdminEntity save(AdminEntity Admin) {
        if (Admin.getNum() == null){
            Admin.setNum(NEXT_NUM);
            NEXT_NUM++;
            this.savedAdmins.add(Admin);
        }
        return Admin;
    }

    @Override
    public List<AdminEntity> findAll() {
        return Collections.unmodifiableList(this.savedAdmins);
    }

    @Override
    public void deleteByNum(long AdminNum) {
        this.savedAdmins.removeIf(AdminEntity -> AdminEntity.getNum().equals(AdminNum));
    }
}
