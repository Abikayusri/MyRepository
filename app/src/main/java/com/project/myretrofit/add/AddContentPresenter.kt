package com.project.myretrofit.add

import com.project.myretrofit.model.DefaultResponse
import com.project.myretrofit.model.PostContentResponse
import com.project.myretrofit.network.ApiClient
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Abika Chairul Yusri
 * on Wednesday, 06 November 2019
 * Bismillahirrahmanirrahim
 */
class AddContentPresenter(private val listener: Listener) {

    fun createContent(postContentResponse: PostContentResponse) {
//        listener.onAddContentLoading(true)
        ApiClient.instance.addContent(postContentResponse)
            .enqueue(object : Callback<DefaultResponse> {
                override fun onFailure(call: retrofit2.Call<DefaultResponse>, t: Throwable) {
                    listener.onAddContentFailure("Error datanya")
                }

                override fun onResponse(
                    call: retrofit2.Call<DefaultResponse>, response: Response<DefaultResponse>
                ) {
                    listener.onAddContentSuccess("Data Sukses")
                }
            })

    }

    interface Listener {
        fun onAddContentSuccess(sccMessage: String)
        fun onAddContentFailure(errMessage: String)
//        fun onAddContentLoading(isLoading: Boolean)
    }

}