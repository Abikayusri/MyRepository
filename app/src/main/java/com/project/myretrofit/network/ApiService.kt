package com.project.myretrofit.network

import com.project.myretrofit.model.ContentBody
import com.project.myretrofit.model.DefaultResponse
import com.project.myretrofit.model.PostContentResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by Abika Chairul Yusri
 * on Wednesday, 06 November 2019
 * Bismillahirrahmanirrahim
 */
interface ApiService {
    @GET("api/posts")
    fun getStudentList(): Call<ContentBody>

    @POST("api/posts")
    fun addContent(
        @Body postContentResponse: PostContentResponse

//        @Field("title") title: String,
//        @Field("categories") categories: String,
//        @Field("content") content: String
    ):Call<DefaultResponse>//Deklarasi Default Response di sini jika ada

}