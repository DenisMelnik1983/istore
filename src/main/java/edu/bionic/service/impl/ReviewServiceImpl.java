package edu.bionic.service.impl;

import edu.bionic.dao.ReviewDao;
import edu.bionic.domain.Review;
import edu.bionic.service.ReviewService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by c268 on 10.07.2017.
 */
public class ReviewServiceImpl implements ReviewService {
    private ReviewDao reviewDao;

    @Override
    public List<Review> getAll() {
        return reviewDao.getAll()
                .stream()
                .sorted(Comparator.comparing(Review::getName))
                .collect(Collectors.toList());
    }
}
