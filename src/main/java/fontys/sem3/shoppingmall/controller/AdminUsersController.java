package fontys.sem3.shoppingmall.controller;


import fontys.sem3.shoppingmall.business.CreateAdminUseCase;
import fontys.sem3.shoppingmall.business.DeleteAdminUseCase;
import fontys.sem3.shoppingmall.business.GetAdminsUseCase;
import fontys.sem3.shoppingmall.domain.CreateAdminRequest;
import fontys.sem3.shoppingmall.domain.CreateAdminResponse;
import fontys.sem3.shoppingmall.domain.GetAllAdminsRequest;
import fontys.sem3.shoppingmall.domain.GetAllAdminsResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admins")
@AllArgsConstructor
public class AdminUsersController {
    private final CreateAdminUseCase createAdminUseCase;
    private final GetAdminsUseCase getAdminsUseCase;
    private final DeleteAdminUseCase deleteAdminUseCase;

    @PostMapping()
    public ResponseEntity<CreateAdminResponse> createAdmin(@RequestBody @Valid CreateAdminRequest request){
        CreateAdminResponse response = createAdminUseCase.createAdmin(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("{adminNum}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable int adminNum) {
        deleteAdminUseCase.deleteAdmin(adminNum);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<GetAllAdminsResponse> getAllAdminsResponseResponseEntity(){
        GetAllAdminsRequest request = GetAllAdminsRequest.builder().build();
        GetAllAdminsResponse response = getAdminsUseCase.getAdmins(request);
        return ResponseEntity.ok(response);
    }
}