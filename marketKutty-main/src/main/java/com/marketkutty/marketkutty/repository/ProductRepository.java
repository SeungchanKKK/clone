package com.marketkutty.marketkutty.repository;

import com.marketkutty.marketkutty.model.dto.responseDto.ProductDto;
import com.marketkutty.marketkutty.model.entity.Product;
import com.marketkutty.marketkutty.model.entity.category.Depth1;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    @PersistenceContext
    private EntityManager em;

    public List<ProductDto> findAllDepth1(String depth1){

        Depth1 depth1Data = em.find(Depth1.class, depth1);
        List<Product> productList = depth1Data.getProductList();

        List<ProductDto> productDtoList = new ArrayList<>();
        for(Product product:productList){
                ProductDto productDto = ProductDto.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .price(product.getPrice())
                        .summary(product.getSummary())
                        .thumb(product.getThumb())
                        .build();
                productDtoList.add(productDto);
            }
            return productDtoList;
    }
}


