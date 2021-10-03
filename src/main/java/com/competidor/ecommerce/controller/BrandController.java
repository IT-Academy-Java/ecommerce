package com.competidor.ecommerce.controller;

import com.competidor.ecommerce.entity.Brand;
import com.competidor.ecommerce.service.IBrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
@Slf4j
public class BrandController {

  @Autowired
  private IBrandService iBrandService;

  @GetMapping("/greeting")
  @ResponseBody
  public String greeting() throws Exception{
    return "Hello darling!";
  }

  @GetMapping()
  @ResponseBody
  public List<Brand> getAllBrands() throws Exception{
    return iBrandService.getBrands();
  }
}
