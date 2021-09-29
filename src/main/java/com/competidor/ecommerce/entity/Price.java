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
  private int product;
  private int priority;
  private double price;
  private String curr;

  private Integer brand_id;

  public Price() {
  }

  public Price(Integer id_price, Date start_date, Date end_date, int price_list, int product_id, int priority, double price, String curr, Integer brand_id) {
    this.id_price = id_price;
    this.start_date = start_date;
    this.end_date = end_date;
    this.price_list = price_list;
    this.product = product_id;
    this.priority = priority;
    this.price = price;
    this.curr = curr;
    this.brand_id = brand_id;
  }

  public Integer getId_price() {
    return id_price;
  }

  public void setId_price(Integer id_price) {
    this.id_price = id_price;
  }

  public Date getStart_date() {
    return start_date;
  }

  public void setStart_date(Date start_date) {
    this.start_date = start_date;
  }

  public Date getEnd_date() {
    return end_date;
  }

  public void setEnd_date(Date end_date) {
    this.end_date = end_date;
  }

  public int getPrice_list() {
    return price_list;
  }

  public void setPrice_list(int price_list) {
    this.price_list = price_list;
  }

  public int getProduct() {
    return product;
  }

  public void setProduct(int product_id) {
    this.product = product_id;
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getCurr() {
    return curr;
  }

  public void setCurr(String curr) {
    this.curr = curr;
  }

  public Integer getBrand_id() {
    return brand_id;
  }

  public void setBrand_id(Integer brand_id) {
    this.brand_id = brand_id;
  }
}
