package com.example.venus.models

import androidx.room.*

@Dao
interface PlanetsDao {

    @Insert
    fun addPlanet(planets: Planets)

    @Insert
    fun addMultiplePlanets(vararg planets: Planets)

    @Query("SELECT * FROM planets")
    fun getAllPlanets(): List<Planets>

    @Update
    fun updatePlanets(planets: Planets)

    @Delete
    fun deletePlanets()
}