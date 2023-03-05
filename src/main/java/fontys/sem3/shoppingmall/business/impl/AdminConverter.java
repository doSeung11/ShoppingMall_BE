package fontys.sem3.shoppingmall.business.impl;

import fontys.sem3.shoppingmall.domain.Admin;
import fontys.sem3.shoppingmall.persistence.entity.AdminEntity;

public class AdminConverter {

    private AdminConverter(){ }

    public static Admin convert(AdminEntity admin){
        return Admin.builder()
                .num(admin.getNum())
                .id(admin.getId())
                .pw(admin.getPw())
                .name(admin.getName())
                .build();
    }
}
