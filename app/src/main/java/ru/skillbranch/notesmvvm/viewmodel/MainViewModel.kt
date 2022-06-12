package ru.skillbranch.notesmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import ru.skillbranch.notesmvp.domain.repository.DataApi


class MainViewModel(val data: DataApi):ViewModel() {
    private val _resultLive = MutableLiveData<String>()
    val resultLive = _resultLive


    fun save(text:String) {
         data.saveData(text)
    }

    fun load() { _resultLive.value = data.getData()}


}