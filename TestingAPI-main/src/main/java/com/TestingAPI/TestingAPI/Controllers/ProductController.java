package com.TestingAPI.TestingAPI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.TestingAPI.TestingAPI.Dao.ProductRepository;
import com.TestingAPI.TestingAPI.Entities.Product;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products/")
public class ProductController {

    @Autowired
    private final ProductRepository productRepository;


    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        try{
            HttpStatus.valueOf(200);
            return productRepository.findAll();

        }
        catch(Exception e){
            e.printStackTrace();
            HttpStatus.valueOf(404);
            return null;
        }
    }

    @GetMapping("/{id}/")
    public ResponseEntity<Product> getProductById(@PathVariable UUID id) {
        Product product = productRepository.findById(id).get();
        if (product != null) {
            HttpStatus.valueOf(200);
            return ResponseEntity.ok(product);
        } else {
            HttpStatus.valueOf(404);
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
       try{
           Product savedProduct = productRepository.save(product);
           HttpStatus.valueOf(201);
           return savedProduct;


       }
       catch(Exception e){
        HttpStatus.valueOf(400);
        e.printStackTrace();

       }
       return null;

      
   
    }

    @PutMapping("/{id}/")
    public ResponseEntity<Product> updateProduct(@PathVariable UUID id, @RequestBody Product productDetails) {
        Product product = productRepository.findById(id).get();
        if (product != null) {
            // Update product details
            product.setType(productDetails.getType());
            product.setBrand(productDetails.getBrand());
            product.setTitle(productDetails.getTitle());
            product.setCurrency(productDetails.getCurrency());
            product.setPrice(productDetails.getPrice());
            product.setDescription(productDetails.getDescription());
            product.setTax(productDetails.getTax());
            product.setImages(productDetails.getImages());

            Product updatedProduct = productRepository.save(product);
            HttpStatus.valueOf(200);
            return ResponseEntity.ok(updatedProduct);
        } else {
            HttpStatus.valueOf(404);
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}/")
    public ResponseEntity<Void> deleteProduct(@PathVariable UUID id) {
        Product product = productRepository.findById(id).get();
        if (product != null) {
            productRepository.delete(product);
            HttpStatus.valueOf(204);
            return ResponseEntity.noContent().build();
        } else {
            HttpStatus.valueOf(404);
            return ResponseEntity.notFound().build();
        }
    }
    @PatchMapping("/{id}/")
    public ResponseEntity<Product>patchProduct(@PathVariable UUID id,@RequestBody Product productDetails){
        Product product = productRepository.findById(id).get();
        if (product != null) {
            // Update product details
            product.setType(productDetails.getType());
            product.setBrand(productDetails.getBrand());
            product.setTitle(productDetails.getTitle());
            product.setCurrency(productDetails.getCurrency());
            product.setPrice(productDetails.getPrice());
            product.setDescription(productDetails.getDescription());
            product.setTax(productDetails.getTax());
            product.setImages(productDetails.getImages());

            Product updatedProduct = productRepository.save(product);
            HttpStatus.valueOf(200);
            return ResponseEntity.ok(updatedProduct);
        } else {
            HttpStatus.valueOf(404);
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{id}/generate_template/")
    public HttpStatus generateProductTemplate(@PathVariable UUID id){
        System.out.println("I am Product template mapping");
        Product pr=productRepository.findById(id).get();
        if(pr!=null){
            return HttpStatus.valueOf(200);
        }
        return HttpStatus.valueOf(404);


    }
}
