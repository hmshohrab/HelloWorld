package com.example.helloworld.ui

import com.example.helloworld.core.BaseViewModel
import com.example.helloworld.data.preference.DataStoreRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 08,May,2022
 * @Company Minisoft Park
 * @Address 18/Kha, West Nakhalpara, Tejgaon, Dhaka-1215
 * @Email shohrab.minisoftpark@gmail.com
 */
@HiltViewModel
class MainVM @Inject constructor(private var dataStoreRepository: DataStoreRepository) :
    BaseViewModel() {
}