package com.example.nbc_standard_multi_view.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nbc_standard_multi_view.data.returnDummyData
import com.example.nbc_standard_multi_view.model.DataModel

class MainViewModel : ViewModel() {

    private val _data = MutableLiveData<List<DataModel>>()
    val mainData: LiveData<List<DataModel>> get() = _data

    init {
        fetchDummyData()
    }

    private fun fetchDummyData() {
        _data.value = returnDummyData()
    }
}