package ru.skillbranch.notesmvp.data.repository

import ru.skillbranch.notesmvp.data.storage.UserStorage
import ru.skillbranch.notesmvp.domain.repository.DataApi

class Data(val storage: UserStorage): DataApi {

    private var _data:String? = null

    override fun getData():String  = storage.get()

    override fun saveData(data: String) {
        storage.save(data)

    }

}