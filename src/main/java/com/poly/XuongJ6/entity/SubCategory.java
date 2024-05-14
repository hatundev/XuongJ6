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
@Table(name = "sub_category")
public class SubCategory {

    @Id
    @Column(name = "sub_cate_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subCateId;

    @Column(name = "sub_cate_name", length = 50)
    private String subCateName;

    @Column(name = "sub_cate_code", length = 20)
    private String subCateCode;

    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Category cateId;
}
