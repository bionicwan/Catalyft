package com.jc.domain.domainModel

data class Workout(
    val name: String,
    val createdOn: String,
    val exercise: List<Exercise>
)