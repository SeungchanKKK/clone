package com.marketkutty.marketkutty.controller;

import com.marketkutty.marketkutty.model.dto.responseDto.ProducetDetailDto;
import com.marketkutty.marketkutty.model.dto.responseDto.ProductDto;
import com.marketkutty.marketkutty.model.entity.ProductDetail;
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
    public ResponseEntity<List<ProductDto>> getProductList(@PathVariable String depth1){
        List<ProductDto> responseDto = productService.getProductList(depth1);
        return ResponseEntity.ok()
                .body(responseDto);
    }

    @GetMapping("/api/product/{productId}")
    public ProducetDetailDto getProductdetail(@PathVariable Long productId){
        return productService.getProductDetail(productId);
    }

}
