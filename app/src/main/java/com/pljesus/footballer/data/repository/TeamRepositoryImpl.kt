package com.pljesus.footballer.data.repository

import com.pljesus.footballer.data.remote.FootballDataApi
import com.pljesus.footballer.data.remote.dto.TeamDetailDto
import com.pljesus.footballer.data.remote.dto.TeamDto
import com.pljesus.footballer.domain.repository.TeamRepository
import javax.inject.Inject

class TeamRepositoryImpl @Inject constructor(
    private val api: FootballDataApi
) : TeamRepository {

    override suspend fun getTeams(): List<TeamDto> {
        return api.getTeams()
    }

    override suspend fun getTeamById(teamId: String): TeamDetailDto {
        return api.getTeamById(teamId)
    }
}