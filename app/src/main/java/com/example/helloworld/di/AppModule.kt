package com.example.helloworld.di

import android.content.Context
import androidx.room.Room
import com.example.helloworld.BuildConfig
import com.example.helloworld.core.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideLocalDB(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java, BuildConfig.DB_NAME
        ).fallbackToDestructiveMigration()
            .build()
    }

    @OptIn(ExperimentalSerializationApi::class)
    @Provides
    fun json(): Json {
        return Json {
            ignoreUnknownKeys = true
            isLenient = true
            allowStructuredMapKeys = true
            encodeDefaults = true
            explicitNulls = false
            coerceInputValues = true
        }
    }

}