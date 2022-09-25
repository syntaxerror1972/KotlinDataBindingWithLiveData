package com.syntaxerror.kotlindatabindingwithlivedata.ui
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
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.syntaxerror.kotlindatabindingwithlivedata.R
import com.syntaxerror.kotlindatabindingwithlivedata.databinding.ActivityMainBinding
import com.syntaxerror.kotlindatabindingwithlivedata.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        dataBinding.mainViewModelObj = mainViewModel
        dataBinding.lifecycleOwner = this

    }
}