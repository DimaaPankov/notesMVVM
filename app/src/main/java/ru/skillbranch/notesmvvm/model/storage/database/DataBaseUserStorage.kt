package ru.skillbranch.notesmvp.data.storage.database

import ru.skillbranch.notesmvp.data.storage.UserStorage

class DataBaseUserStorage : UserStorage {

    var _data = "null"

    override fun save(data: String) {
        _data = data
    }

    override fun get(): String =  _data

}