package com.project.myretrofit.model


import com.google.gson.annotations.SerializedName

data class ContentBody(
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("categories")
    val categories: String? = null,
    @SerializedName("content")
    val content: String? = null
)