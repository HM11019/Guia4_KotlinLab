package com.example.guia4_kotlinlab.ui.button

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class ButtonViewModel : ViewModel() {
    private val _isOn = MutableLiveData<Boolean>().apply {
        value = true
    }
    val isOn: LiveData<Boolean> = _isOn
    fun toggle(value: Boolean) {
        _isOn.value = value
    }
}