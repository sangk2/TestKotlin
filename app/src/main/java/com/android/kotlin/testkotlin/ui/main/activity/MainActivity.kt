package com.android.kotlin.testkotlin.ui.main.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.android.kotlin.testkotlin.BR
import com.android.kotlin.testkotlin.R
import com.android.kotlin.testkotlin.databinding.ActivityMainBinding
import com.android.kotlin.testkotlin.ui.form.activity.FormActivity
import com.android.kotlin.testkotlin.ui.main.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.setVariable(BR.viewModel, viewModel)


    }
}