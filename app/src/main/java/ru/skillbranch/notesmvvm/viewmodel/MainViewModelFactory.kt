package ru.skillbranch.notesmvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.skillbranch.notesmvp.data.repository.Data
import ru.skillbranch.notesmvp.data.storage.database.DataBaseUserStorage


class MainViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(Data(DataBaseUserStorage())) as T
    }
}