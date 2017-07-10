package edu.bionic.service;

import edu.bionic.domain.Product;
import edu.bionic.domain.Review;

import java.util.List;

/**
 * Created by c268 on 10.07.2017.
 */
public interface ReviewService {
    List<Review> getAll();


    Product getById(int productId);
}
