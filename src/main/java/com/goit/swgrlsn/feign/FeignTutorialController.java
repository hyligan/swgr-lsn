package com.goit.swgrlsn.feign;

import com.goit.swgrlsn.controllers.configs.FeignConfig;
import com.goit.swgrlsn.dto.PageDto;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "custome", url = "${url.random}", 
    configuration = FeignConfig.class)
public interface FeignTutorialController  {
  @GetMapping
  @RequestLine("GET")
  PageDto getPage();
}
