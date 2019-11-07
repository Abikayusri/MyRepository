package com.project.myretrofit.network

import com.project.myretrofit.model.*
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by Abika Chairul Yusri
 * on Wednesday, 06 November 2019
 * Bismillahirrahmanirrahim
 */
interface ApiService {
    @GET("api/posts")
    fun getContentList(): Call<List<ContentBody>>

    @POST("api/posts")
    fun addContent(
        @Body postContentResponse: PostContentResponse
    ): Call<PostResponse>//Deklarasi Default Response di sini jika ada

}