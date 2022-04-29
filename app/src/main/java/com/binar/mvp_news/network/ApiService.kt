package com.binar.mvp_news.network

import com.binar.mvp_news.model.GetAllNewsItem
import com.binar.mvp_news.model.GetAllStaffItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("news")
    fun getAllNews(): Call<List<GetAllNewsItem>>

    @GET("staf")
    fun getAllStaff(): Call<List<GetAllStaffItem>>
}