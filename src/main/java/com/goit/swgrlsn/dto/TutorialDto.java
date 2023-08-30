package com.goit.swgrlsn.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TutorialDto {
  @NotBlank
  @Size(min = 0, max = 20)
  private String name;
  @NotBlank
  @Size(min = 0, max = 30)
  private String text;
}
