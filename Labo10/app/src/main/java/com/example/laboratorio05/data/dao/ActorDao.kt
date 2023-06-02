package com.example.laboratorio05.data.dao

import androidx.room.*
import com.example.laboratorio05.data.model.ActorModel
import com.example.laboratorio05.data.model.CastModel

@Dao
interface ActorDao {
    @Query("SELECT * FROM actor_table")
    suspend fun getAllActors(): List<ActorModel>

    @Transaction
    @Insert
    suspend fun insertActor(actor: ActorModel)
}