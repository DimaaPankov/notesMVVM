package ru.skillbranch.notesmvp.data.storage


interface UserStorage {

    fun save(save: String)

    fun get () : String

}