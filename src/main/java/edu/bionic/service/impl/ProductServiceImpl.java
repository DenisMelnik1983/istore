package edu.bionic.service.impl;

import edu.bionic.dao.ProductDao;
import edu.bionic.domain.Product;
import edu.bionic.service.ProductService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by c268 on 05.07.2017.
 */
public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;

   // @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll()
                .stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());
    }

    @Override
    public Product getById(int productId) {
        return productDao.getById(productId).
                orElseThrow(() -> new RuntimeException(String.format("Product with id=%d was not found", productId)));
    }
}
