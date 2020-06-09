package com.hp.twowaydatabindng

import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    @Bindable//2 way binding
    val inputName = MutableLiveData<String>()
            init{
                inputName.value = "Frank"
            }

}