package com.example.helloworld.core

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.helloworld.BuildConfig
import com.example.helloworld.R
 import java.lang.reflect.ParameterizedType
import kotlin.random.Random

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 22,April,2021
 * @Company Minisoft Park
 * @Address 18/Kha, West Nakhalpara, Tejgaon, Dhaka-1215
 * @Email shohrab.minisoftpark@gmail.com
 */
abstract class BaseActivity<ViewModel : BaseViewModel> : AppCompatActivity(),
    BaseFragmentCommunicator {

    abstract val viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        // setVerifiedTheme()
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(viewModel)

    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setUpView()
        observeClickEvents()
        observeViewModelEvents()
    }


    /**
     * Observes Rxview events when implemented
     */
    open fun observeClickEvents() {

    }

    /**
     * Used instead of onCreate
     */
    open fun setUpView() {

    }

    /**
     * Observes livedata from viewmodel
     */
    open fun observeViewModelEvents() {

    }


    override fun startActivity(clz: Class<*>?, bundle: Bundle?) {
        val intent = Intent(this, clz)
        if (bundle != null) {
            intent.putExtras(bundle)
        }
        startActivity(intent)
    }

    override fun replaceFragment(fragment: Fragment, tag: String) {
        val fm = supportFragmentManager
        val ft: FragmentTransaction = fm.beginTransaction()
//        fragment?.let {
//            ft.replace(R.id.container, it, tag)
//            // showDebugToast(tag)
//        }
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        ft.addToBackStack(tag).commit()
    }

/*    override fun getSharedPreference(): AppPreference2 {
        return BaseApplication.getSharedPreference()
    }*/


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun setupActionBar(toolbar: Toolbar, enableBackButton: Boolean) {
        setSupportActionBar(toolbar)
        if (enableBackButton) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setHomeButtonEnabled(true)
        }
    }

    override fun showDebugToast(msg: String) {
        if (BuildConfig.DEBUG) {
            //  infoColorToast(msg, "Info")
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        }
    }

    override fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    override fun showDialog() {
        var i = Random.nextInt(0, 100);
        // progressDialog.showDialog()
        // progressDialog.show(supportFragmentManager,"baseact${Random.nextInt(0, 100)}")


    }

    override fun dismissDialog() {
        // progressDialog.hideDialog()
        //  progressDialog.cancel()
    }

    private fun getViewModelClass(): Class<ViewModel> {
        val type =
            (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0]
        return type as Class<ViewModel>
    }
}