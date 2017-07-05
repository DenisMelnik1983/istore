package edu.bionic.dao;

import edu.bionic.domain.Product;

import java.util.List;
import java.util.Optional;

/**
 * Created by c268 on 05.07.2017.
 */
public interface ProductDao {
    public List<Product> getAll();
    public Optional<Product> getById(int productId);

 //   Optional<Product> getById(int productId);
}
