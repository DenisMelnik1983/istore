package edu.bionic.presentation.console;

import edu.bionic.service.ProductService;

/**
 * Created by c268 on 05.07.2017.
 */
public class ProductConsoleController {
    private ProductService productService;

   // @Autowired
    public ProductConsoleController(ProductService productService) {
        this.productService = productService;
    }

    public void printAllProducts() {
        productService.getAll().forEach(product -> System.out.println(product.printInfo()));
    }
}
