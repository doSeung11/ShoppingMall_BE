package fontys.sem3.shoppingmall.business;

import fontys.sem3.shoppingmall.domain.GetAllAdminsRequest;
import fontys.sem3.shoppingmall.domain.GetAllAdminsResponse;

public interface GetAdminsUseCase {
    GetAllAdminsResponse getAdmins(GetAllAdminsRequest request);
}
