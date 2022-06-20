package com.marketkutty.marketkutty.model.entity;

import com.marketkutty.marketkutty.model.entity.baseEntity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@NoArgsConstructor
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PRODUCT_ID")
    private Long id;

    @NotNull
    private String code; //001001

    @NotNull
    private String name;

    @NotNull
    private int price;

    @NotNull
    private String summary;

    @NotNull
    private String thumb;

}
