package com.example.mictest.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "task")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val taskType: String,

    val audioPath: String?,
    val imagePath: String?,
    val text: String?,
    val imageUrl: String?,

    val timestamp: Long,
    val duration: Long


)