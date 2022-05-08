package com.example.helloworld.data.preference

import kotlinx.coroutines.flow.Flow

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Mohammad Shohrab on 04,June,2022
 * @Company PureMind It
 * @Email puremindit.bd@gmail.com
 */
interface DataStoreRepository {
    suspend fun saveToken(token: String)
    suspend fun getToken(): Flow<String>
    suspend fun clearAllPreferences()
}