package com.project.myretrofit.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Abika Chairul Yusri
 * on Wednesday, 06 November 2019
 * Bismillahirrahmanirrahim
 */
data class PostContentResponse (
    @SerializedName("title")
    val title: String?,
    @SerializedName("categories")
    val categories: String?,
    @SerializedName("content")
    val content: String?
)