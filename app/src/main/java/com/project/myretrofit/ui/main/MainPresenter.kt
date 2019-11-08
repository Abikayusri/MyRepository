package com.project.myretrofit.ui.main

import android.util.Log
import com.project.myretrofit.model.ContentBody
import com.project.myretrofit.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Abika Chairul Yusri
 * on Wednesday, 06 November 2019
 * Bismillahirrahmanirrahim
 */
class MainPresenter(private val listener: Listener) {

    fun getContentList() {
        ApiClient.instance.getContentList()
            .enqueue(object : Callback<List<ContentBody>> {
                override fun onFailure(call: Call<List<ContentBody>>, t: Throwable) {
                    listener.onGetContentListFailure("Data gabisa diload")
                    Log.d("Main Presenter", "Data bisa diload")
                }

                override fun onResponse(
                    call: Call<List<ContentBody>>,
                    response: Response<List<ContentBody>>
                ) {
                    val body = response.body()!!
                    val code = response.code()
                    if (code == 200) {
                        listener.onGetContentListSuccess(body.toMutableList())
                        for(item in body) {
                            Log.d("Main Presenter", "id: " + item.id)
                            Log.d("Main Presenter", "categories: " + item.categories)
                            Log.d("Main Presenter", "title: " + item.title)
                        }
                        Log.d("Main Presenter", "Data bisa diload")
                    } else {
                        listener.onGetContentListFailure("Datanya gabisa diload")
                        Log.d("Main Presenter", "Data gabisa diload")
                    }
                }
            })
    }

    interface Listener {
//        fun onGetContentListSuccess(sccMessage: String)
        fun onGetContentListSuccess(contentList: MutableList<ContentBody>)
        fun onGetContentListFailure(errMessage: String)
//        fun ongetContentListLoading(isLoading: Boolean)
    }
}