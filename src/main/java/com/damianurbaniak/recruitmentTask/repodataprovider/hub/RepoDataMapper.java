package com.damianurbaniak.recruitmentTask.repodataprovider.hub;

import com.damianurbaniak.recruitmentTask.repodataprovider.dto.BranchData;
import com.damianurbaniak.recruitmentTask.repodataprovider.dto.RepoData;
import com.damianurbaniak.recruitmentTask.repodataprovider.dto.RepoDto;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static com.damianurbaniak.recruitmentTask.repodataprovider.dto.RepoDto.BranchDto;

@Slf4j
@UtilityClass
class RepoDataMapper {

  List<RepoDto> mapResultsToDtos(final List<RepoData> userRepos, final List<BranchData[]> branchData) {
    return IntStream.range(0, userRepos.size())
      .mapToObj(i ->
        new RepoDto(
          userRepos.get(i).name(),
          userRepos.get(i).owner().login(),
          mapBranchDataToDtos(Arrays.stream(branchData.get(i)).toList()))
      )
      .toList();
  }

  private List<BranchDto> mapBranchDataToDtos(final List<BranchData> branchData) {
    return branchData.stream()
      .map(branch -> new BranchDto(branch.name(), branch.commit().sha()))
      .toList();
  }
}