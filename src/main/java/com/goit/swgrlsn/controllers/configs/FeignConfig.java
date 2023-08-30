package com.goit.swgrlsn.controllers.configs;

import feign.Contract;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = {"com.goit.swgrlsn"})
public class FeignConfig {
  @Bean
  public Contract useFeignAnnotations() {
    return new Contract.Default();
  }

}
