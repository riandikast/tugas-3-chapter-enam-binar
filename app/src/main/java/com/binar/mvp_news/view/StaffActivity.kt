package com.binar.mvp_news.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.binar.mvp_news.R
import com.binar.mvp_news.adapter.AdapterStaff
import com.binar.mvp_news.model.GetAllStaffItem
import com.binar.mvp_news.presenter.StaffPresenter
import com.binar.mvp_news.presenter.StaffView
import kotlinx.android.synthetic.main.activity_news.*
import kotlinx.android.synthetic.main.activity_staff.*

class StaffActivity : AppCompatActivity(), StaffView {
    private lateinit var  presenterstaff : StaffPresenter
    lateinit var adapterstaff : AdapterStaff
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff)
        presenterstaff = StaffPresenter(this)
        presenterstaff.getDataStaff()
    }

    override fun onSuccessStaff(pesan: String, staffdata: List<GetAllStaffItem>) {

        liststaff.layoutManager = LinearLayoutManager(this)
        adapterstaff = AdapterStaff(staffdata){
            val pindah = Intent(this@StaffActivity, StaffDetail::class.java)
            pindah.putExtra("detailstaff", it)
            startActivity(pindah)
        }
        liststaff.adapter = adapterstaff

    }

    override fun onErrorStaff(pesan: String) {
        Toast.makeText(this, pesan, Toast.LENGTH_LONG).show()

    }
}