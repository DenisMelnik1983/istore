package edu.bionic.dao.mock;

import edu.bionic.dao.ReviewDao;
import edu.bionic.domain.Review;

import java.util.ArrayList;
import java.util.List;

public class ReviewDaoMock implements ReviewDao {

    private List<Review> reviewStorage;

    @Override
    public List<Review> getAll() {
        return new ArrayList<>(reviewStorage);
    }

    public void initReviewStorage() {
        reviewStorage = new ArrayList<>();
        reviewStorage.add(new Review("22", "Ivan", "good bla bla bla", 11));
        reviewStorage.add(new Review("23", "Ivan", "good bla bla bla", 11));
        reviewStorage.add(new Review("12", "Ivan", "good bla bla bla", 101));
        reviewStorage.add(new Review("2", "Ivan", "good bla bla bla", 21));
        reviewStorage.add(new Review("22", "Ivan", "good bla bla bla", 1));
    }
}
