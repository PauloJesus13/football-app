package com.pljesus.footballer.domain.model

import com.pljesus.footballer.data.remote.dto.TeamDto

data class Team(
    val code: String,
    val flag: String,
    val id: Int,
    val name: String
)

fun TeamDto.toTeam(): Team {
    return Team(
        code = code,
        flag = flag,
        id = id,
        name = name
    )
}