package com.binar.mvp_news.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.binar.mvp_news.R

import com.binar.mvp_news.model.GetAllNewsItem
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_news.view.*


class AdapterNews(private val listnews: List <GetAllNewsItem>, private val onclick : (GetAllNewsItem)->Unit):RecyclerView.Adapter<AdapterNews.ViewHolder>(){
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view)
//    var datanews : List<GetAllNewsItem>? = null
//    fun setDataNews(news  : List<GetAllNewsItem>){
//        this.datanews = news
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNews.ViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: AdapterNews.ViewHolder, position: Int) {
        Glide.with(holder.itemView.context).load(listnews[position].image).into(holder.itemView.gambar)
        holder.itemView.text1.text = listnews[position].title
        holder.itemView.text2.text = listnews[position].author
        holder.itemView.text3.text = listnews[position].createdAt

        holder.itemView.card.setOnClickListener {
            onclick(listnews[position])
        }

    }

    override fun getItemCount(): Int {
        return listnews.size
    }


}