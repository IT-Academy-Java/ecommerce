package com.competidor.ecommerce.service.impl;


import com.competidor.ecommerce.entity.Price;
import com.competidor.ecommerce.repository.IPriceRepository;
import com.competidor.ecommerce.service.IPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PriceServiceImpl implements IPriceService {

  @Autowired
  private IPriceRepository iPriceRepository;

  @Override
  public List<Price> getPrices() {
    return iPriceRepository.findAll();
  }

  @Override
  public Optional<Price> getPriceById(int id) {
    return iPriceRepository.findById(id);
  }

  @Override
  public Optional<Price> getPriceByProductId(int id) {
    return iPriceRepository.findPriceByProduct(id);
  }


}
