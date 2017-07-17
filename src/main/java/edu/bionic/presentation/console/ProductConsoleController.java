package edu.bionic.presentation.console;

import edu.bionic.domain.Product;
import edu.bionic.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductConsoleController {

    private ProductService productService;

    @Autowired
    public ProductConsoleController(ProductService productService) {
        this.productService = productService;
    }

    public void printAllProducts() {
        productService.getAll().forEach(product -> System.out.println(product.printInfo()));
    }

    public void printProductInfo(int productId) {
        Product product = productService.getById(productId);

        System.out.println("������������: " + product.getName());
        System.out.println("����: " + product.getColor());
        System.out.println("������: " + product.getCapacity());
        System.out.println("�������: " + product.getDisplay());
        System.out.println("����: " + product.getPrice());
    }
}
