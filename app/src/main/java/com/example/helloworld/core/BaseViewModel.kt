package com.example.helloworld.core

import androidx.lifecycle.*

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 22,April,2021
 * @Company Minisoft Park
 * @Address 18/Kha, West Nakhalpara, Tejgaon, Dhaka-1215
 * @Email shohrab.minisoftpark@gmail.com
 */
open class BaseViewModel : ViewModel(), IViewModel {

/*
    val compositeDisposable = CompositeDisposable()
    val loader =  SingleLiveEvent<Boolean>()
*/

    override fun onAny(owner: LifecycleOwner?, event: Lifecycle.Event?) {
        //   Logger.d("${event?.name}")
    }

    override fun onCreate() {

    }

    override fun onDestroy() {

    }

    override fun onStart() {

    }

    override fun onStop() {

    }

    override fun onResume() {

    }

    override fun onPause() {

    }

    override fun onCleared() {
        super.onCleared()
      //  compositeDisposable.dispose()
    }
}