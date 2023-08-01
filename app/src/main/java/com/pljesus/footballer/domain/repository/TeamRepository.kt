package com.pljesus.footballer.domain.repository

import com.pljesus.footballer.data.remote.dto.TeamDetailDto
import com.pljesus.footballer.data.remote.dto.TeamDto

interface TeamRepository {

    suspend fun getTeams(): List<TeamDto>

    suspend fun getTeamById(teamId: String): TeamDetailDto
}