/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuatroa.retodos.repository.crud;

import com.cuatroa.retodos.model.CleaningProduct;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author desaextremo
 */
public interface CleaningCrudProductRepository extends MongoRepository<CleaningProduct, String> {
    public List<CleaningProduct> findByPriceLessThanEqual(double precio);
}
