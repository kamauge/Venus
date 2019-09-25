package com.example.venus.models

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Planets::class],
    version = 1
)
abstract class PlanetsDatabase: RoomDatabase(), PlanetsDao {
    abstract fun getPlanetsDao(): PlanetsDao

    companion object{
        @Volatile private var instance : PlanetsDao?= null

        private val LOCK = Any()
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            PlanetsDatabase::class.java,
            "notedatabase"
        ).build()

    }
    }


