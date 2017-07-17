package edu.bionic.presentation.console.sevlet;

import edu.bionic.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by c268 on 17.07.2017.
 */
@WebServlet("/products")
public class ProductServlet extends HelloServlet {

    private ProductService productService;

    @Autowired
    public void setProductServlet(ProductService productService) {
        this.productService = productService;
    }

    @java.lang.Override
    public void init() throws ServletException {
        super.init();

    }

    @java.lang.Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        productService.getAll().forEach(product -> {
            try {
                resp.getWriter().println(product.printInfo());
            }catch (IOException e){
                e.printStackTrace();
            }

        });
    }
}
