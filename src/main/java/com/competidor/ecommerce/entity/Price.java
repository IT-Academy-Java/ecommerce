package com.competidor.ecommerce.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name="price")
public class Price {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id")
  private Integer idPrice;

  @Column(name="start_date")
  private Date startDate;

  @Column(name="end_date")
  private Date endDate;

  @Column(name="price_list")
  private int priceList;

  @Column(name="product_id")
  private int productId;

  private int priority;
  private double price;
  private String curr;

  @Column(name="brand_id")
  private Integer brandId;

}
