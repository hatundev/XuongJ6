package com.poly.XuongJ6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @Column(name = "brand_id")
    private Integer brandId;
    @Column(name = "brand_name", length = 100)
    private String brandName;
}
