package com.android.kotlin.testkotlin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.android.kotlin.testkotlin.BR
import com.android.kotlin.testkotlin.R
import com.android.kotlin.testkotlin.databinding.ActivityMainBinding
import com.android.kotlin.testkotlin.viewmodel.CategoryViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    private val viewModel = CategoryViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.setVariable(BR.viewModel, viewModel)

        viewModel.onCreate()

        binding.tvTitle.text = "Data Binding Title"

        binding.btnShow.setOnClickListener {
            viewModel.onClickShow { data ->
                val intent = Intent(this, ResultActivity::class.java).apply {
                    putExtra("data", data)
                }
                startActivity(intent)
            }

        }

    }
}