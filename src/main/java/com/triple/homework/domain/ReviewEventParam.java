package com.triple.homework.domain;

import com.triple.homework.code.EventAction;
import com.triple.homework.code.EventType;
import java.util.List;
import lombok.Data;

@Data
public class ReviewEventParam {

  private EventType type;
  private EventAction action;
  private String reviewId;
  private String content;
  private List<String> attachedPhotoIds;
  private String userId;
  private String placeId;
}
