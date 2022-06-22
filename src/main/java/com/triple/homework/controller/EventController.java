package com.triple.homework.controller;

import com.triple.homework.code.EventAction;
import com.triple.homework.code.EventType;
import com.triple.homework.domain.ReviewEventParam;
import com.triple.homework.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

  @Autowired
  private ReviewService reviewService;

  @PostMapping(value = "/events")
  public boolean events(@RequestParam ReviewEventParam param) throws Exception {
    if (EventType.REVIEW == param.getType()) {
      boolean result = false;

      if (EventAction.ADD == param.getAction()) {
        result = reviewService.addReview(param);
      } else if (EventAction.MOD == param.getAction()) {
        result = reviewService.modifyReview(param);
      } else if (EventAction.DELETE == param.getAction()) {
        result = reviewService.deleteReview(param.getReviewId());
      } else {
        throw new Exception("Not Allowed Event Action");
      }

      return result;
    } else {
      // route other event type
    }

    return true;
  }
}
