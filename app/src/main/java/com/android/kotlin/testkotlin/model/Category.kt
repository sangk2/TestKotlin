package com.android.kotlin.testkotlin.model

import android.text.TextUtils
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.android.kotlin.testkotlin.BR

class Category : BaseObservable() {

    @get:Bindable
    var name : String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var price : String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.price)
        }


    fun isVaild () : Boolean {
        return !TextUtils.isEmpty(name) && !TextUtils.isEmpty(price)
    }
}