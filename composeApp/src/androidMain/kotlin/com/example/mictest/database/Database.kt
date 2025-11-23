package com.example.mictest.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.example.mictest.data.local.TaskDatabase
import kotlinx.coroutines.Dispatchers

fun getTaskDatabase(context: Context): RoomDatabase.Builder<TaskDatabase> {
    val dbFile = context.getDatabasePath("task.db")
    return Room.databaseBuilder<TaskDatabase>(
        context = context.applicationContext,
        name = dbFile.absolutePath
    )
        .fallbackToDestructiveMigrationOnDowngrade(true)
        .setDriver(BundledSQLiteDriver()) // Very important
        .setQueryCoroutineContext(Dispatchers.IO)
}