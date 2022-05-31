package com.anton.kotlincrud

interface CrudView {
    //Untuk get data
    fun onSuccessGet(data: List<DataItem1>?)
    fun onFailedGet(msg : String)
    //Untuk Delete
    fun onSuccessDelete(msg: String)
    fun onErrorDelete(msg: String)
    //Untuk Add
    fun successAdd(msg : String)
    fun errorAdd(msg: String)
    //Untuk Update
    fun onSuccessUpdate(msg : String)
    fun onErrorUpdate(msg : String)
}