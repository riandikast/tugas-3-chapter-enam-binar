package com.binar.mvp_news.presenter

import com.binar.mvp_news.model.GetAllStaffItem


interface StaffView {
    fun onSuccessStaff(pesan : String, staff : List<GetAllStaffItem>) {

    }

    fun onErrorStaff(pesan : String){

    }
}