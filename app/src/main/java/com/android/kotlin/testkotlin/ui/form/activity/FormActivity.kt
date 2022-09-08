package com.android.kotlin.testkotlin.ui.form.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.android.kotlin.testkotlin.BR
import com.android.kotlin.testkotlin.R
import com.android.kotlin.testkotlin.databinding.ActivityFormBinding
import com.android.kotlin.testkotlin.ui.form.viewmodel.CategoryViewModel

class FormActivity : AppCompatActivity() {
    lateinit var binding : ActivityFormBinding
    private val viewModel = CategoryViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_form)
        binding.setVariable(BR.viewModel, viewModel)

        viewModel.onCreate()

        binding.tvTitle.text = "Data Binding Title"

        binding.btnShow.setOnClickListener {
            viewModel.onClickShow { data ->
                val t = Intent(this, ResultActivity::class.java).apply {
                    putExtra("data", data)
                }
                startActivity(t)
            }

        }
    }
}