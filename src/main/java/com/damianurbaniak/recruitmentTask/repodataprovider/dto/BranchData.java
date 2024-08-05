package com.damianurbaniak.recruitmentTask.repodataprovider.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BranchData(String name,
                         Commit commit) {

  @JsonIgnoreProperties(ignoreUnknown = true)
  public record Commit(String sha) {
  }
}