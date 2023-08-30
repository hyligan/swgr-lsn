package com.goit.swgrlsn.services.impl;

import com.goit.swgrlsn.dto.PageDto;
import com.goit.swgrlsn.feign.FeignTutorialController;
import com.goit.swgrlsn.services.ITutorialService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ITutorialServiceImpl implements ITutorialService {
  
  private final FeignTutorialController feignTutorialController;

  public ITutorialServiceImpl(FeignTutorialController feignTutorialController) {
    this.feignTutorialController = feignTutorialController;
  }

  @Override
  public List<PageDto> getAll() {
    return List.of(feignTutorialController.getPage());
  }
  
  
}
