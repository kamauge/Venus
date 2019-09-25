package com.example.venus.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Planets(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String
)