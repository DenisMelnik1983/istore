package edu.bionic;

import edu.bionic.dao.ProductDao;
import edu.bionic.dao.mock.ProductDaoMock;
import edu.bionic.presentation.console.ProductConsoleController;
import edu.bionic.service.impl.OrderServiceImpl;
import edu.bionic.service.impl.ProductServiceImpl;

/**
 * Created by c268 on 05.07.2017.
 */
public class ConsoleApplication {
    public static void main(String[] args) {
        ProductDaoMock productDaoMock =  new ProductDaoMock();
        productDaoMock.initProductStorage();
        ProductServiceImpl productService = new ProductServiceImpl(productDaoMock);
        ProductConsoleController productConsoleController = new ProductConsoleController(productService);
        productConsoleController.printAllProducts();
    }
}
