package com.triple.homework.service;

import com.triple.homework.domain.ReviewEventParam;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

  public boolean addReview(ReviewEventParam param) {
    return true;
  }

  public boolean modifyReview(ReviewEventParam param) {
    return true;
  }

  public boolean deleteReview(String reviewId) {
    return true;
  }
}
