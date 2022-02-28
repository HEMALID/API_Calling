package com.example.api_calling

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("todos")
    fun getData():Call<List<MyData.MyDataItem>>
}