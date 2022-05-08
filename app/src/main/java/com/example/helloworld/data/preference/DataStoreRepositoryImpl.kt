package com.example.helloworld.data.preference

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.preferences.core.Preferences
import com.example.helloworld.BuildConfig
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.serialization.json.Json
import javax.inject.Inject

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Mohammad Shohrab on 04,June,2022
 * @Company PureMind It
 * @Email puremindit.bd@gmail.com
 */
const val DataStore_NAME = BuildConfig.PREF_NAME

val Context.datastore: DataStore<Preferences> by preferencesDataStore(name = DataStore_NAME)


class DataStoreRepositoryImpl @Inject constructor(
    @ApplicationContext private val context: Context,
    private val json: Json
) : DataStoreRepository {

    companion object {
        val MESSAGE = stringPreferencesKey("message")
    }

    override suspend fun saveToken(token: String) {
        context.datastore.edit {
            it[MESSAGE] = token
        }
    }

    override suspend fun getToken(): Flow<String> {
        return context.datastore.data.map {
            it[MESSAGE] ?: ""
        }
    }

    override suspend fun clearAllPreferences() {
        context.datastore.edit {
            it.remove(MESSAGE)
            it.clear()
        }
    }
}