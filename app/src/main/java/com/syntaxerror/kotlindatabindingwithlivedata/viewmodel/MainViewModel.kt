package com.syntaxerror.kotlindatabindingwithlivedata.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : KotlinDataBindingWithLiveData.
 * Package Id : com.syntaxerror.kotlindatabindingwithlivedata.viewmodel
 * Created By :  Shrawan Shinde
 * Created Date :  25,September,2022
 *
 *** Contact Details ***
 *
 * Name : Shrawan B. Shinde
 * Email : syntaxerror1972@gmail.com
 * Github Link : https://github.com/syntaxerror1972/KotlinDataBindingWithLiveData
 * LinkedIn Link : https://in.linkedin.com/in/shrawan-shinde-59ba57a1
 * Copyright (c) 2022. All rights reserved.
 *
 **************************************************************************************
 */

class MainViewModel : ViewModel() {
    val noteLiveData = MutableLiveData<String>("No Note available")

    fun updateNote(){
        noteLiveData.value = "New Note added"
    }

    fun resetNote(){
        noteLiveData.value = "Reset Clicked"
    }

}