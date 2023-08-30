package com.goit.swgrlsn.controllers;

import com.goit.swgrlsn.dto.PageDto;
import com.goit.swgrlsn.dto.TutorialDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tutorials")
public interface ITutorialController {
  @Operation(summary = "Get all tutorials")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Found the book",
          content = { @Content(mediaType = "application/json",
              schema = @Schema(implementation = TutorialDto.class)) }),
      @ApiResponse(responseCode = "400", description = "Invalid id supplied",
          content = @Content),
      @ApiResponse(responseCode = "404", description = "Book not found",
          content = @Content) })
  @GetMapping
  List<PageDto> getAll();
  @Operation(summary = "Update tutorial")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200"),
      @ApiResponse(responseCode = "400", description = "Invalid id supplied",
          content = @Content),
      @ApiResponse(responseCode = "404", description = "Book not found",
          content = @Content) })
  @PostMapping
  void update(@Valid @RequestBody TutorialDto dto);

  @Operation(summary = "Get by id tutorial")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Found the book",
          content = { @Content(mediaType = "application/json",
              schema = @Schema(implementation = TutorialDto.class)) }),
      @ApiResponse(responseCode = "400", description = "Invalid id supplied",
          content = @Content),
      @ApiResponse(responseCode = "404", description = "Book not found",
          content = @Content) })
  @GetMapping("/{id}")
  TutorialDto getById(@PathVariable("id") Long id);
}
