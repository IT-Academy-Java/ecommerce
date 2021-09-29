package com.competidor.ecommerce.service.impl;

import com.competidor.ecommerce.entity.Brand;
import com.competidor.ecommerce.repository.IBrandRepository;
import com.competidor.ecommerce.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements IBrandService {

  @Autowired
  private IBrandRepository iBrandRepository;

  @Override
  public List<Brand> getBrands() {
    return iBrandRepository.findAll();
  }
}
