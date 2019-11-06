package com.project.myretrofit.model


import com.google.gson.annotations.SerializedName

data class ContentBody(
    @SerializedName("categories")
    val categories: String?,
    @SerializedName("content")
    val content: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?
)