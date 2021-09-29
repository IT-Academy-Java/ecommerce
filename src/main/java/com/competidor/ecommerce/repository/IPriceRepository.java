package com.competidor.ecommerce.repository;


import com.competidor.ecommerce.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPriceRepository extends JpaRepository<Price, Integer> {

  //Optional<Price> getPriceByProduct_id(int id);
  Optional<Price> findPriceByProduct(int id);

}
