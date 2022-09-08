package com.android.kotlin.testkotlin.ui.calendar.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.databinding.BaseObservable

class CalendarViewModel : BaseObservable(){


    fun setupAdd(context: Context) {
        Toast.makeText(context, "Add data", Toast.LENGTH_SHORT).show()
    }

}