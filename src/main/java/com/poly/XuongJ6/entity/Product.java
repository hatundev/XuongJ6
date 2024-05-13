package com.poly.XuongJ6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id")
    private Integer productId;
    @ManyToOne
    @JoinColumn(name = "sub_cate_id")
    private SubCategory subCateId;
    @Column(name = "product_name",length = 100)
    private String productName;
    @Column(name = "color",length = 50)
    private String color;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "sell_price")
    private Double sellPrice;
    @Column(name = "origin_price")
    private Double originPrice;
    @Column(name = "description",length = 1000)
    private String description;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status statusId;
}
