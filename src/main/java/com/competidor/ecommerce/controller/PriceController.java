package com.competidor.ecommerce.controller;

import com.competidor.ecommerce.entity.Price;
import com.competidor.ecommerce.service.impl.PriceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/price")
public class PriceController {

  @Autowired
  private PriceServiceImpl priceService;

  @GetMapping("/greeting")
  @ResponseBody
  public String greeting() throws Exception{
    return "Hello darling!";
  }

  @GetMapping()
  @ResponseBody
  public List<Price> getAllPrices() throws Exception{
    return priceService.getPrices();
  }

  @GetMapping("/{id}")
  @ResponseBody
  public ResponseEntity<Price> getPriceById(@PathVariable("id") int id) throws Exception{
    return priceService.getPriceById(id)
      .map(price -> new ResponseEntity<>(price, HttpStatus.OK))
      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping("/product/{id}")
  @ResponseBody
  public ResponseEntity<Price> getPriceByProductId(@PathVariable("id") int id) throws Exception{
    return priceService.getPriceByProductId(id)
      .map(price -> new ResponseEntity<>(price, HttpStatus.OK))
      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

}
