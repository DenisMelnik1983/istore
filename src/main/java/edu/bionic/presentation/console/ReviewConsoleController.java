package edu.bionic.presentation.console;

import edu.bionic.service.ProductService;
import edu.bionic.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by c268 on 10.07.2017.
 */
@Controller
public class ReviewConsoleController {
    private ReviewService reviewService;

    @Autowired
    public ReviewConsoleController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
//    @Autowired
//    public ReviewConsoleControllere(ProductService productService) {
//       // this.productService = productService;
//    }

    public void printAllReview() {
        reviewService.getAll().forEach(product -> System.out.println(product.getText()));
    }

}
