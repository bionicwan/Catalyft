package com.jc.domain.domainModel

import com.jc.domain.enums.ExerciseTarget

data class WorkoutTemplate(
    val name: String,
    val thumbnailRes: String,
    val description: String,
    val difficulty: Int,
    val targets: List<ExerciseTarget>
)