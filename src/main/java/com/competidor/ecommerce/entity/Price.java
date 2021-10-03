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

  private Date startDate;
  private Date endDate;
  private int priceList;
  private int productId;
  private int priority;
  private double price;
  private String curr;
  private Integer brandId;

}
