package com.marketkutty.marketkutty.repository;

import com.marketkutty.marketkutty.model.dto.responseDto.ProductDto;
import com.marketkutty.marketkutty.model.entity.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    @PersistenceContext
    private EntityManager em;

    public List<ProductDto> findAll(String categoryCode){
        List<Product> productList = em.createQuery("select p from Product p where p.code=:categoryCode", Product.class)
                .setParameter("categoryCode", categoryCode)
                .getResultList();

        if (productList == null) {
            throw new IllegalArgumentException("해당 카테고리에 상품이 없습니다.");
        } else {
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

}
