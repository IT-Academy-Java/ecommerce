package com.competidor.ecommerce.entity;

import javax.persistence.*;


@Entity
@Table(name="brand")
public class Brand {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id")
  private Integer id_brand;

  private String name;

  public Brand() {}

  public Brand(int id_brand, String name) {
    this.id_brand = id_brand;
    this.name = name;
  }

  public int getId_brand() {
    return id_brand;
  }

  public void setId_brand(int id_brand) {
    this.id_brand = id_brand;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
