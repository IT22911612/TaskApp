package com.ahmedapps.roomdatabase.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow


@Dao
interface NoteDao {

    @Insert
    suspend fun upsertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM note ORDER BY dateAdded")
    fun getNotesOrderdByDateAdded(): Flow<List<Note>>


    @Query("SELECT * FROM note ORDER BY title ASC")
    fun getNotesOrderdByTitle(): Flow<List<Note>>

}











