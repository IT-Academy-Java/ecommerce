package com.competidor.ecommerce.service;


import com.competidor.ecommerce.entity.Price;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IPriceService {

  public List<Price> getPrices();
  public Optional<Price> getPriceById(int id);
  public List<Price> getPriceByProductId(int id);
  public Optional<Price> getOnePriceByProductAndBrandAndPriority(Date date, int productId, int brandId) throws ParseException;

}
