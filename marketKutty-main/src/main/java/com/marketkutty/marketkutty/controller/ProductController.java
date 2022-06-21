package com.marketkutty.marketkutty.controller;

<<<<<<< HEAD
import com.marketkutty.marketkutty.model.dto.responseDto.ProductDetailDto;
import com.marketkutty.marketkutty.model.dto.responseDto.ProductDto;
=======
import com.marketkutty.marketkutty.model.dto.ProductDto;
import com.marketkutty.marketkutty.model.dto.responseDto.ProductRespDto;
>>>>>>> 71e8f28d1b95c9e306327b75db79f20aa4bb4afd
import com.marketkutty.marketkutty.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/api/category/{depth1}")
    public ProductRespDto getProductList(@PathVariable String depth1){
        return productService.getProductList(depth1);
    }
<<<<<<< HEAD

    @GetMapping("/api/product/{productId}")
    public ProductDetailDto getProductdetail(@PathVariable Long productId){
        return productService.getProductDetail(productId);
    }



}
=======
}
>>>>>>> 71e8f28d1b95c9e306327b75db79f20aa4bb4afd
