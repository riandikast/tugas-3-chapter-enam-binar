package com.binar.mvp_news.presenter

import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.binar.mvp_news.adapter.AdapterNews
import com.binar.mvp_news.model.GetAllNewsItem
import com.binar.mvp_news.network.ApiClient
import kotlinx.android.synthetic.main.activity_main2.*
import retrofit2.Call
import retrofit2.Response

class NewsPresenter(val viewnews : NewsView) {
    fun getDataNews(){
        ApiClient.instance.getAllNews()
            .enqueue(object : retrofit2.Callback<List<GetAllNewsItem>>{
                override fun onResponse(
                    call: Call<List<GetAllNewsItem>>,
                    response: Response<List<GetAllNewsItem>>
                ) {
                    if (response.isSuccessful){
                        val newsdata = response.body()
                        viewnews.onSuccess(response.message(), newsdata!!)
                    }else{
                        viewnews.onError(response.message())
                    }
                }

                override fun onFailure(call: Call<List<GetAllNewsItem>>, t: Throwable) {
                    viewnews.onError(t.message!!)
                }
            })

    }
}