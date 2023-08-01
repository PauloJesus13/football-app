package com.pljesus.footballer.data.remote

import com.pljesus.footballer.data.remote.dto.TeamDetailDto
import com.pljesus.footballer.data.remote.dto.TeamDto
import retrofit2.http.GET
import retrofit2.http.Path

interface FootballDataApi {

    @GET("/v4/teams")
    suspend fun getTeams(): List<TeamDto>

    @GET("/v4/teams/{id}")
    suspend fun getTeamById(@Path("id") id: String): TeamDetailDto 
}