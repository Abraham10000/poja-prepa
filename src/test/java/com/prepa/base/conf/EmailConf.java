package com.prepa.base.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.prepa.base.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
