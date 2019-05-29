package com.dmall.inventoryservice.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventHandler {

  //TODO: listen order event
  public void receive(OrderEvent event) {
    log.info("=======received：" + event.toString());
  }
}
