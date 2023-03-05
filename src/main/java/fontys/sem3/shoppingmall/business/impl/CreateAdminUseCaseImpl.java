package fontys.sem3.shoppingmall.business.impl;

import fontys.sem3.shoppingmall.business.CreateAdminUseCase;
import fontys.sem3.shoppingmall.domain.CreateAdminRequest;
import fontys.sem3.shoppingmall.domain.CreateAdminResponse;
import fontys.sem3.shoppingmall.persistence.AdminRepository;
import fontys.sem3.shoppingmall.persistence.entity.AdminEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateAdminUseCaseImpl implements CreateAdminUseCase {

    private final AdminRepository adminRepository;

    @Override
    public CreateAdminResponse createAdmin(CreateAdminRequest request) {
        AdminEntity savedAdmin = saveNewAdmin(request);
        return CreateAdminResponse.builder()
                .adminNum(savedAdmin.getNum())
                .build();
    }

    private AdminEntity saveNewAdmin(CreateAdminRequest request) {

        AdminEntity newAdmin = AdminEntity.builder()
                .id(request.getId())
                .pw(request.getPw())
                .name(request.getName())
                .build();
        return adminRepository.save(newAdmin);
    }
}
