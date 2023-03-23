package fontys.sem3.shoppingmall.controller;


import fontys.sem3.shoppingmall.business.CreateProduct;
import fontys.sem3.shoppingmall.business.DeleteProduct;
import fontys.sem3.shoppingmall.business.GetProduct;
import fontys.sem3.shoppingmall.business.GetProducts;
import fontys.sem3.shoppingmall.domain.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductsController {
    private final CreateProduct createProduct;
    private final DeleteProduct deleteProduct;
    private final GetProducts getProducts;
    private final GetProduct getProduct;


    @PostMapping()
    public ResponseEntity<CreateProductResponse> createProduct(@RequestBody @Valid CreateProductRequest request){
        CreateProductResponse response = createProduct.createProduct(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int productId) {
        deleteProduct.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<GetAllProductsResponse> getAllProductsResponseResponseEntity(){
        GetAllProductsRequest request = GetAllProductsRequest.builder().build();
        GetAllProductsResponse response = getProducts.getProducts(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> getProduct(@PathVariable(value = "id") final long id) {
        final Optional<Product> productOptional = getProduct.getProduct(id);
        if (productOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(productOptional.get());
    }
}
