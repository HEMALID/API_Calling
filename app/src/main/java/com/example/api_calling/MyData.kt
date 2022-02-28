package com.example.api_calling

import com.google.gson.annotations.SerializedName

class MyData : ArrayList<MyData.MyDataItem>(){
    data class MyDataItem(
        val completed: Boolean,
        val id: Int,
        val title: String,
        val userId: Int
    )
}