package com.marketkutty.marketkutty.controller;

import com.marketkutty.marketkutty.model.dto.responseDto.ProductDto;
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

    @GetMapping("/api/product/{categoryCode}")
    public ResponseEntity<List<ProductDto>> getProductList(@PathVariable String categoryCode){
        List<ProductDto> responseDto = productService.getProductList(categoryCode);
        return ResponseEntity.ok()
                .body(responseDto);
    }

}