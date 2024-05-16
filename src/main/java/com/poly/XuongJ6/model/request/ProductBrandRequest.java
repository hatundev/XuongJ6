package com.poly.XuongJ6.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductBrandRequest {
    private String name;
    private String color;
    private Integer quantity;
    private Float sellPrice;
    private Float originPrice;
    private Integer brandId;
    private Integer subCateId;
    private Integer statusId;
}
