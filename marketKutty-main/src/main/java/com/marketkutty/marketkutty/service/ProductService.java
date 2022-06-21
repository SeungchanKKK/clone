package com.marketkutty.marketkutty.service;

import com.marketkutty.marketkutty.model.dto.responseDto.ProductDetailDto;
import com.marketkutty.marketkutty.model.dto.responseDto.ProductRespDto;
import com.marketkutty.marketkutty.model.entity.ProductDetail;
import com.marketkutty.marketkutty.repository.ProductDetailRepository;
import com.marketkutty.marketkutty.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductDetailRepository productDetailRepository;

    public ProductRespDto getProductList(String depth1){
        return productRepository.findAllDepth1(depth1);
    }

    public ProductDetailDto getProductDetail(Long productId) {
        ProductDetail productDetail = productDetailRepository.findByProductId(productId);
        ProductDetailDto productTotal= new ProductDetailDto(productDetail);
        return productTotal;
    }
}
