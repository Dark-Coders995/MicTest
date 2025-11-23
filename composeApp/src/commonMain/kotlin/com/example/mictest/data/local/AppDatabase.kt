package com.example.mictest.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mictest.data.model.TaskEntity

@Database(entities = [TaskEntity::class], version = 1)

abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}