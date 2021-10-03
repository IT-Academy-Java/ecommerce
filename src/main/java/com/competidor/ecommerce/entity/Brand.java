package com.competidor.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="brand")
public class Brand {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id")
  private Integer idBrand;

  private String name;

}
