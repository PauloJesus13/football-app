package com.pljesus.footballer.data.remote.dto

data class TeamDetailDto(
    val address: String,
    val area: Area,
    val clubColors: String,
    val coach: Coach,
    val crest: String,
    val founded: Int,
    val id: Int,
    val lastUpdated: String,
    val marketValue: Int,
    val name: String,
    val runningCompetitions: List<RunningCompetition>,
    val shortName: String,
    val squad: List<Squad>,
    val staff: List<Any>,
    val tla: String,
    val venue: String,
    val website: String
)