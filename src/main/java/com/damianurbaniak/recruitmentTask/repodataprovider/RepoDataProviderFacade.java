package com.damianurbaniak.recruitmentTask.repodataprovider;

import com.damianurbaniak.recruitmentTask.repodataprovider.dto.RepoDto;
import java.util.List;

public interface RepoDataProviderFacade {

  List<RepoDto> fetchRepoData(final String userName, final String acceptHeader);
}
