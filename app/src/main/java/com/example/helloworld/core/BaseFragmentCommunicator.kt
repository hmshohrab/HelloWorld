package com.example.helloworld.core

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 22,April,2021
 * @Company Minisoft Park
 * @Address 18/Kha, West Nakhalpara, Tejgaon, Dhaka-1215
 * @Email shohrab.minisoftpark@gmail.com
 */
interface BaseFragmentCommunicator {

    fun startActivity(clz: Class<*>?, bundle: Bundle?)
    fun setupActionBar(toolbar: Toolbar, enableBackButton: Boolean)
    fun replaceFragment(fragment: Fragment, tag: String)
      fun showDebugToast(msg: String)
    fun showToast(msg: String)
    fun showDialog()
    fun dismissDialog()


}