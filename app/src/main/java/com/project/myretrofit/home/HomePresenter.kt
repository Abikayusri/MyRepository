//package com.project.myretrofit.home
//
//import com.project.myretrofit.model.ContentBody
//import com.project.myretrofit.network.ApiClient
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import java.util.*
//
///**
// * Created by Abika Chairul Yusri
// * on Wednesday, 06 November 2019
// * Bismillahirrahmanirrahim
// */
//class HomePresenter(private val listener: Listener) {
//
//    fun getStudentList() {
//        listener.onGetStudentListLoading(true)
//        val call = ApiClient.getApiService().getStudentList()
//        call.enqueue(object : Callback<ContentBody> {
//            override fun onFailure(call: Call<ContentBody>, t: Throwable) {
//                listener.onGetStudentListLoading(false)
//                listener.onGetStudentListFailure("Something kayanya wrong")
//            }
//
//            override fun onResponse(call: Call<ContentBody>, response: Response<ContentBody>) {
//                listener.onGetStudentListLoading(false)
//                val body = response.body()
//                val code = response.code()
//                if (body != null && code == 200) {
//                    val data = body.data
//                    if (data != null) {
//                        listener.onGetStudentListSuccess(data.toMutableList())
//                    }
//                    return
//                }
//                listener.onGetStudentListFailure("Something went wrong")
//            }
//        })
//    }
//
//    interface Listener {
//        fun onGetStudentListSuccess(studentList: MutableList<ContentBody>)
//        fun onGetStudentListFailure(errMessage: String)
//        fun onGetStudentListLoading(isLoading: Boolean)
//    }
//}