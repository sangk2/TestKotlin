package com.android.kotlin.testkotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.android.kotlin.testkotlin.BR
import com.android.kotlin.testkotlin.R
import com.android.kotlin.testkotlin.viewmodel.ResultViewModel
import com.android.kotlin.testkotlin.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding : ActivityResultBinding
    private val viewModel = ResultViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_result)
        binding.setVariable(BR.viewModel, viewModel)

        val intent = intent
        val data : String? = intent.getStringExtra("data")

        viewModel.rs.set(data)

    }
}