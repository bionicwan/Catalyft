package com.jc.domain.domainModel

import com.jc.domain.enums.ExerciseType

data class Exercise(
    val name: String,
    val sets: List<Set>,
    val type: ExerciseType
)