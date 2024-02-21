package com.prepa.base.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.prepa.base.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
