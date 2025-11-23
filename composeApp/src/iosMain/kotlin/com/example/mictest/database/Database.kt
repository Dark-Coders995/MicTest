package com.example.mictest.database

import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.example.mictest.data.local.TaskDatabase
import data.database.instantiateImpl
import kotlinx.coroutines.Dispatchers
import platform.Foundation.NSHomeDirectory

fun getTaskDatabase(): RoomDatabase.Builder<TaskDatabase> {
    val dbFile = NSHomeDirectory() + "/user.db"
    return Room.databaseBuilder<TaskDatabase>(
        name = dbFile,
        factory = { TaskDatabase::class.instantiateImpl() } // This too will show error
    )
        .fallbackToDestructiveMigrationOnDowngrade(true)
        .setDriver(BundledSQLiteDriver()) // Very important
        .setQueryCoroutineContext(Dispatchers.IO)
}