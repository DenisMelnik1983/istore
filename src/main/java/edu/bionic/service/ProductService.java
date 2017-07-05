package edu.bionic.service;

import edu.bionic.dao.ProductDao;
import edu.bionic.domain.Product;

import java.util.List;

/**
 * Created by c268 on 05.07.2017.
 */
public interface ProductService {
    public List<Product> getAll();
    public Product getById(int productId);

}
