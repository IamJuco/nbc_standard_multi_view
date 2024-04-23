package com.example.nbc_standard_multi_view.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nbc_standard_multi_view.model.DataModel

class DetailViewModel : ViewModel() {
    private val _dataModel = MutableLiveData<DataModel>()
    val detailData: LiveData<DataModel> get() = _dataModel

//    fun setDataModel(data: DataModel) {
//        _dataModel.value = data
//    }
}