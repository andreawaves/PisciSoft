package com.example.piscisoftmobile.ui.reservar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReservarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text
}