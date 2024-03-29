package com.project.myretrofit.model


import com.google.gson.annotations.SerializedName

data class ContentBody(
    @SerializedName("categories")
    val categories: String? = null,
    @SerializedName("content")
    val content: String? = null,
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("title")
    val title: String? = null
)