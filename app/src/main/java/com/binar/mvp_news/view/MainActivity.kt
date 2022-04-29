package com.binar.mvp_news.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.binar.mvp_news.R
import com.binar.mvp_news.adapter.AdapterNews
import com.binar.mvp_news.model.GetAllNewsItem
import com.binar.mvp_news.model.HasilPL
import com.binar.mvp_news.network.ApiClient
import com.binar.mvp_news.presenter.NewsPresenter
import com.binar.mvp_news.presenter.NewsView
import com.binar.mvp_news.presenter.PersegiPanjang
import com.binar.mvp_news.presenter.PersegiPanjangPresenter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        gotopersegipanjang.setOnClickListener {
            startActivity(Intent(this, PersegiPanjangActivity::class.java))
        }

        gotonews.setOnClickListener {
            startActivity(Intent(this, NewsActivity::class.java))
        }

        gotostaff.setOnClickListener {
            startActivity(Intent(this, StaffActivity::class.java))
        }
    }




}


