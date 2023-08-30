package com.goit.swgrlsn.feign;

import com.goit.swgrlsn.controllers.configs.FeignConfig;
import com.goit.swgrlsn.dto.PageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "custome", url = "${url.random}", 
    configuration = FeignConfig.class)
public interface FeignTutorialController  {
  @GetMapping
  PageDto getPage();
}
