package edu.bionic.presentation.console;

import edu.bionic.service.ProductService;
import edu.bionic.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by c268 on 10.07.2017.
 */
public class ReviewConsoleController {
    private ReviewService reviewService;

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
