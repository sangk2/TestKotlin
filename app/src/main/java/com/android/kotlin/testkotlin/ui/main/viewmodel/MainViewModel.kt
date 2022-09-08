package com.android.kotlin.testkotlin.ui.main.viewmodel

import android.content.Context
import android.content.Intent
import androidx.databinding.BaseObservable
import com.android.kotlin.testkotlin.ui.calendar.activity.CalendarActivity
import com.android.kotlin.testkotlin.ui.form.activity.FormActivity

class MainViewModel : BaseObservable() {

    fun loadForm(context: Context) {
        val intent = Intent(context, FormActivity::class.java)
        context.startActivity(intent)
    }

    fun loadCalendar(context: Context) {
        val intent = Intent(context, CalendarActivity::class.java)
        context.startActivity(intent)
    }
}