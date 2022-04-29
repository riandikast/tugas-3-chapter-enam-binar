package com.binar.mvp_news.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.binar.mvp_news.R
import com.binar.mvp_news.model.GetAllNewsItem
import com.bumptech.glide.Glide

import kotlinx.android.synthetic.main.activity_news_detail.*

class NewsDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)
        val getnews = intent.getParcelableExtra<GetAllNewsItem>("detailnews")

        text1detailnews.text = getnews?.title
        text2detailnews.text = getnews?.author
        text3detailnews.text = getnews?.createdAt
        text4detailnews.text = ""



        Glide.with(this).load(getnews?.image).into(gambar1)
    }
}