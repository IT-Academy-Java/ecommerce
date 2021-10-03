package com.competidor.ecommerce.repository;


import com.competidor.ecommerce.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPriceRepository extends JpaRepository<Price, Integer> {

  List<Price> findPricesByProduct(int id);
  Optional<Price> findFirstByProductAndBrandOrderByPriorityDesc(int productId, int brandId);

}
