package fontys.sem3.shoppingmall.business.impl;

import fontys.sem3.shoppingmall.business.DeleteAdminUseCase;
import fontys.sem3.shoppingmall.persistence.AdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteAdminUseCaseImpl implements DeleteAdminUseCase {

    private final AdminRepository adminRepository;

    @Override
    public void deleteAdmin(long adminNum) {
        this.adminRepository.deleteByNum(adminNum);
    }
}
