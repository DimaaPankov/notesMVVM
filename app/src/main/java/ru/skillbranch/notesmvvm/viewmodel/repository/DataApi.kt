package ru.skillbranch.notesmvp.domain.repository


interface DataApi {
    fun getData(): String
    fun saveData(data:String)
}