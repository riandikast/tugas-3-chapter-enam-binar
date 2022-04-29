package com.binar.mvp_news.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.binar.mvp_news.R
import com.binar.mvp_news.adapter.AdapterNews
import com.binar.mvp_news.model.GetAllNewsItem
import com.binar.mvp_news.presenter.NewsPresenter
import com.binar.mvp_news.presenter.NewsView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_news.*
import kotlinx.android.synthetic.main.activity_news.listnews

class NewsActivity : AppCompatActivity(), NewsView {
    private lateinit var  presenternews : NewsPresenter
    lateinit var adapternews : AdapterNews
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        presenternews = NewsPresenter(this)
        presenternews.getDataNews()

    }

    override fun onSuccess(pesan: String, newsdata: List<GetAllNewsItem>) {

        listnews.layoutManager = LinearLayoutManager(this)
        adapternews = AdapterNews(newsdata){
            val pindah = Intent(this@NewsActivity, NewsDetail::class.java)
            pindah.putExtra("detailnews", it)
            startActivity(pindah)
        }
        listnews.adapter = adapternews


    }

    override fun onError(pesan: String) {
        Toast.makeText(this, pesan, Toast.LENGTH_LONG).show()

    }
}