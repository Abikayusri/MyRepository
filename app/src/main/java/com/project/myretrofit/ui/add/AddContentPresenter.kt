package com.project.myretrofit.ui.add

import com.project.myretrofit.model.PostResponse
import com.project.myretrofit.model.PostContentResponse
import com.project.myretrofit.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Abika Chairul Yusri
 * on Wednesday, 06 November 2019
 * Bismillahirrahmanirrahim
 */
class AddContentPresenter(private val listener: Listener) {

    fun createContent(postContentResponse: PostContentResponse) {
        ApiClient.instance.addContent(postContentResponse)
            .enqueue(object : Callback<PostResponse> {
                override fun onFailure(call: Call<PostResponse>, t: Throwable) {
                    listener.onAddContentFailure("Error datanya")
                }

                override fun onResponse(
                    call: Call<PostResponse>, response: Response<PostResponse>
                ) {
                    listener.onAddContentSuccess("Data Sukses")
                }
            })

    }

    interface Listener {
        fun onAddContentSuccess(sccMessage: String)
        fun onAddContentFailure(errMessage: String)
    }
}