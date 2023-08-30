package com.goit.swgrlsn.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageDto {
  private Long page;
  @JsonProperty("per_page")
  private Long perPage;
  private Long total;
  @JsonProperty("total_pages")
  private Long totalPages;
  private List<UserDto> data; 
  
}
