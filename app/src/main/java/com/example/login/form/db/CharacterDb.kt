package com.example.login.form.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.login.form.data.Character
import com.example.login.form.db.converter.BiographyConverter
import com.example.login.form.db.converter.ImagesConverter
import com.example.login.form.db.converter.PowerstatsConverter
import com.example.login.form.db.converter.WorkConverter

@Database(entities = [Character::class], version = 1, exportSchema = false)
@TypeConverters(
    ImagesConverter::class,
    PowerstatsConverter::class,
    BiographyConverter::class,
    WorkConverter::class
)
abstract class CharacterDb : RoomDatabase() {
    abstract fun characterDao(): CharacterDao
}
