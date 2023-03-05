package fontys.sem3.shoppingmall.business.impl;

import fontys.sem3.shoppingmall.business.GetAdminsUseCase;
import fontys.sem3.shoppingmall.domain.Admin;
import fontys.sem3.shoppingmall.domain.GetAllAdminsRequest;
import fontys.sem3.shoppingmall.domain.GetAllAdminsResponse;
import fontys.sem3.shoppingmall.persistence.AdminRepository;
import fontys.sem3.shoppingmall.persistence.entity.AdminEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetAdminsUseCaseImpl implements GetAdminsUseCase {

    private AdminRepository adminRepository;

    @Override
    public GetAllAdminsResponse getAdmins(GetAllAdminsRequest request) {
        List<AdminEntity> results = adminRepository.findAll();

        final GetAllAdminsResponse response = new GetAllAdminsResponse();
        List<Admin> admins = results
                .stream()
                .map(AdminConverter::convert)
                .toList();
        response.setAdmins(admins);
        return response;
    }
}
