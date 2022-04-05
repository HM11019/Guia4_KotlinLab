package com.example.guia4_kotlinlab.ui.text_view

import android.graphics.Color
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewViewModel : ViewModel() {
    private val _textColor = MutableLiveData<Int>().apply {
        value = Color.rgb(0,0,0);
    }

    val textColor: LiveData<Int> = _textColor

    fun changeTextColor(view: View) {
        _textColor.value = Color.rgb(
            (0..255).random(),
            (0..255).random(),
            (0..255).random()
        )
    }
}