package com.goit.swgrlsn.controllers.impl;

import com.goit.swgrlsn.controllers.ITutorialController;
import com.goit.swgrlsn.dto.PageDto;
import com.goit.swgrlsn.dto.TutorialDto;
import com.goit.swgrlsn.services.ITutorialService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class TutorialController implements ITutorialController {
  private final  ITutorialService service;

  public TutorialController(ITutorialService service) {
    this.service = service;
  }

  @Override
  public List<PageDto> getAll() {
    return service.getAll();
  }

  @Override
  public void update(TutorialDto dto) {
    
  }

  @Override
  public TutorialDto getById(Long id) {
    return new TutorialDto();
  }
}
