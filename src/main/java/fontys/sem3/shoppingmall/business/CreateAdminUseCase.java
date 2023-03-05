package fontys.sem3.shoppingmall.business;

import fontys.sem3.shoppingmall.domain.CreateAdminRequest;
import fontys.sem3.shoppingmall.domain.CreateAdminResponse;

public interface CreateAdminUseCase {
    CreateAdminResponse createAdmin(CreateAdminRequest request);
}
