package com.competidor.ecommerce.controller;

import com.competidor.ecommerce.entity.Price;
import com.competidor.ecommerce.service.IPriceService;
import com.competidor.ecommerce.service.impl.PriceServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/price")
@Slf4j
public class PriceController {

  @Autowired
  private IPriceService priceService;

  @GetMapping("/greeting")
  @ResponseBody
  public String greeting() throws Exception{
    log.info("from greeting rest controller:  hello darling!!!");
    return "Hello darling!";
  }

  @GetMapping()
  @ResponseBody
  public List<Price> getAllPrices() throws Exception{
    return priceService.getPrices();
  }

  @GetMapping("/id/{id}")
  @ResponseBody
  public ResponseEntity<Price> getPriceById(@PathVariable("id") int id) throws Exception{
    return priceService.getPriceById(id)
      .map(price -> new ResponseEntity<>(price, HttpStatus.OK))
      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping("/product/{id}")
  @ResponseBody
  public List<Price> getPriceByProductId(@PathVariable("id") int id) throws Exception{
    return priceService.getPriceByProductId(id);
  }

  @GetMapping("/date/{date}/product/{productId}/brand/{brandId}")
  @ResponseBody
  public ResponseEntity<Price> getPriceByProductId(
    @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss") Date date,
    @PathVariable("productId") int productId,
    @PathVariable("brandId") int brandId
  ) throws Exception{
    return priceService.getOnePriceByProductAndBrandAndPriority(date, productId, brandId)
      .map(price -> new ResponseEntity<>(price, HttpStatus.OK))
      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

}
