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
@Table(name = "product_brand")
public class ProductBrand {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    @Id
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brandId;
}
