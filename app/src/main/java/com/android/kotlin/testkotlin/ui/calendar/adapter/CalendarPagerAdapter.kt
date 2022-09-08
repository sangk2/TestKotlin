package com.android.kotlin.testkotlin.ui.calendar.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.android.kotlin.testkotlin.ui.calendar.fragment.CalendarDayFragment
import com.android.kotlin.testkotlin.ui.calendar.fragment.CalendarMonthFragment
import com.android.kotlin.testkotlin.ui.calendar.fragment.CalendarWeekFragment


class CalendarPagerAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    private var pages = ArrayList<Fragment>()

    init {
        pages.add(CalendarMonthFragment.newInstance())
        pages.add(CalendarWeekFragment.newInstance())
        pages.add(CalendarDayFragment.newInstance())
    }
    override fun getItemCount(): Int {
        return pages.size
    }

    override fun createFragment(position: Int): Fragment {
        return pages[position]
    }
}