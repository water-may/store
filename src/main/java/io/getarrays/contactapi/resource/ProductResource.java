package io.getarrays.contactapi.resource;

import io.getarrays.contactapi.domain.Product;
import io.getarrays.contactapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductResource {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        //return ResponseEntity.ok().body(productService.createContact(product));
        return ResponseEntity.created(URI.create("/product/userID")).body(productService.createProduct(product));
    }

    @GetMapping
    public ResponseEntity<Page<Product>> getProduct(@RequestParam(value = "page", defaultValue = "0") int page,
                                                     @RequestParam(value = "size", defaultValue = "10") int size) {
        return ResponseEntity.ok().body(productService.getAllProducts(page, size));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable(value = "id") String id) {
        return ResponseEntity.ok().body(productService.getProduct(id));
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteProduct(@PathVariable(value = "id") String id) {
//        productService.deleteProduct(id);
//        return ResponseEntity.noContent().build();
//    }



    @RequestMapping(value = "/{id}", method = DELETE)
    @ResponseBody
    public String deleteFile(@PathVariable("id") String id) {
        productService.deleteProduct(id);
        return "File deleted ";
    }

}