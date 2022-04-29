package com.binar.mvp_news.presenter

import com.binar.mvp_news.model.GetAllStaffItem
import com.binar.mvp_news.network.ApiClient
import retrofit2.Call
import retrofit2.Response

class StaffPresenter (val viewstaff : StaffView) {
    fun getDataStaff(){
        ApiClient.instance.getAllStaff()
            .enqueue(object : retrofit2.Callback<List<GetAllStaffItem>>{
                override fun onResponse(
                    call: Call<List<GetAllStaffItem>>,
                    response: Response<List<GetAllStaffItem>>
                ) {
                    if (response.isSuccessful){
                        val staffdata = response.body()
                        viewstaff.onSuccessStaff(response.message(), staffdata!!)
                    }else{
                        viewstaff.onErrorStaff(response.message())
                    }
                }

                override fun onFailure(call: Call<List<GetAllStaffItem>>, t: Throwable) {
                    viewstaff.onErrorStaff(t.message!!)
                }
            })

    }
}