package edu.bionic.service.impl;

import edu.bionic.dao.ReviewDao;
import edu.bionic.domain.Product;
import edu.bionic.domain.Review;
import edu.bionic.service.ReviewService;
import edu.bionic.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by c268 on 10.07.2017.
 */
@Service

public class ReviewServiceImpl implements ReviewService {
    private ReviewDao reviewDao;

    @Autowired
    public ReviewServiceImpl(ReviewDao reviewDao) {
        this.reviewDao = reviewDao;
    }

    @Override
    public List<Review> getAll() {
        return reviewDao.getAll()
                .stream()
                .sorted(Comparator.comparing(Review::getName))
                .collect(Collectors.toList());
    }
//
//    @Override
//    public Product getById(int productId) {
//        return productDao.getById(productId).
//                orElseThrow(() -> new NotFoundException(String.format("Product with id=%d was not found", productId)));
//    }
}
