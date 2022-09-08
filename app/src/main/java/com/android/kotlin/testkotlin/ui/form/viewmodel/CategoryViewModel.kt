package com.android.kotlin.testkotlin.ui.form.viewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import com.android.kotlin.testkotlin.model.Category

class CategoryViewModel : BaseObservable() {

    var mess = ObservableField<String>()
    var category = ObservableField<Category>()
    var isShowMess = ObservableField<Boolean>()
    var isSucc = ObservableField<Boolean>()

    fun onCreate() {
        category.set(Category())
    }

    fun onClickCheck() {
        isShowMess.set(true)
        if (category.get()?.isVaild() == true) {

            mess.set("Hoàn Thành")
            isSucc.set(true)
        } else {
            mess.set("Không được trống")
            isSucc.set(false)
        }
    }

    fun onClickShow(callback: (String) -> Unit) {
        val n = category.get()?.name
        val p = category.get()?.price
        isSucc.let { callback.invoke("$n - $p") }
//        callback.invoke("$n - $p")
    }
}