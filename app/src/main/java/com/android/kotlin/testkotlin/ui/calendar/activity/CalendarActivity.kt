package com.android.kotlin.testkotlin.ui.calendar.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.android.kotlin.testkotlin.BR
import com.android.kotlin.testkotlin.R
import com.android.kotlin.testkotlin.databinding.ActivityCalendarBinding
import com.android.kotlin.testkotlin.ui.calendar.adapter.CalendarPagerAdapter
import com.android.kotlin.testkotlin.ui.calendar.viewmodel.CalendarViewModel
import com.google.android.material.tabs.TabLayoutMediator


class CalendarActivity : AppCompatActivity() {

    lateinit var binding: ActivityCalendarBinding
    private val viewModel = CalendarViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_calendar)
        binding.setVariable(BR.viewModel, viewModel)

        init()
    }

    private fun init() {
        setupViewPager()
        setupTabLayout()
        setupAction()
    }

    private fun setupAction() {

    }

    private fun setupViewPager() {
        val adapter = CalendarPagerAdapter(this)
        binding.viewPager.adapter = adapter

    }

    private fun setupTabLayout() {
        with(binding.toolbar.tabLayout) {
            TabLayoutMediator(
                binding.toolbar.tabLayout, binding.viewPager
            ) { tab, position ->
                when (position) {
                    0 -> tab.text = "Month"
                    1 -> tab.text = "Week"
                    2 -> tab.text = "Day"
                    else -> {}
                }
            }.attach()
        }
    }
}

//            val data = arrayOf("Month", "Week", "Day")
//
//            for (item in data) {
//                tab.text = item
//            }
//                when (position) {
//                    0 -> tab.text = "Month"
//                    1 -> tab.text = "Week"
//                    2 -> tab.text = "Day"
//                    else -> {}
//                }

//                val map = HashMap<Int, String>()
//                map[0] = "Month"
//                map[1] = "Week"
//                map[2] = "Day"
//
//                for (value in map.values) {
//                    tab.text = value
//                }
//
//                for (key in map.keys) {
//                    tab.text = map[key]
//                }

//                data.map {  }
//                data.flatMap {  }
//                data.filter {  }
//            }.attach()

//    }
//}