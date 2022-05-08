package com.example.helloworld.ui

import android.os.Bundle
import androidx.activity.viewModels
import com.example.helloworld.R
import com.example.helloworld.core.BaseActivity

class MainActivity : BaseActivity<MainVM>() {

    override val viewModel: MainVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}