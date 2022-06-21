package com.marketkutty.marketkutty.service;


import com.marketkutty.marketkutty.model.dto.responseDto.ProducetDetailDto;
import com.marketkutty.marketkutty.model.dto.responseDto.ProductDto;
import com.marketkutty.marketkutty.model.entity.Product;
import com.marketkutty.marketkutty.model.entity.ProductDetail;
import com.marketkutty.marketkutty.repository.ProductDetailRepository;
import com.marketkutty.marketkutty.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductDetailRepository productDetailRepository;

    public List<ProductDto> getProductList(String depth1){
        return productRepository.findAllDepth1(depth1);
    }

    public ProducetDetailDto getProductDetail(Long productId) {
        ProductDetail productDetail = productDetailRepository.findByProductId(productId);
        ProducetDetailDto productTotal= new ProducetDetailDto(productDetail);
        return productTotal;
    }
}
