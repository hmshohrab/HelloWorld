package com.example.helloworld.core

import androidx.room.Database
import androidx.room.RoomDatabase
import java.util.concurrent.Executors

@Database(
    entities = [Message::class ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

  //  abstract fun medReminderDao(): MedReminderDao
    //abstract fun getYoutubeDao(): YoutubeDao


}
private val IO_EXECUTOR = Executors.newSingleThreadExecutor()

/**
 * Utility method to run blocks on a dedicated background thread, used for io/database work.
 */
fun ioThread(f : () -> Unit) {
    IO_EXECUTOR.execute(f)
}