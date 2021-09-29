package com.competidor.ecommerce.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="price")
public class Price {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id_price")
  private Integer id_price;

  private Date start_date;
  private Date end_date;
  private int price_list;
  produc_id;
  priority
  price;
  curr;

  private Integer brand_id;


}
