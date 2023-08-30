package com.goit.swgrlsn.controllers.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigApp {
  @Bean
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }
}
