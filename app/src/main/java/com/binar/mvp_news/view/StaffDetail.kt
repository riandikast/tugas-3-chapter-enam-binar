package com.binar.mvp_news.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binar.mvp_news.R
import com.binar.mvp_news.model.GetAllStaffItem
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_staff_detail.*
import kotlinx.android.synthetic.main.item_staff.*

class StaffDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff_detail)
        val getstaff = intent.getParcelableExtra<GetAllStaffItem>("detailstaff")

        text1detailstaff.text = getstaff?.name
        text2detailstaff.text = getstaff?.email
        text3detailstaff.text = getstaff?.createdAt
        text4detailstaff.text = ""



        Glide.with(this).load(getstaff?.image).into(gambar1)
    }
}