package com.binar.mvp_news.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.binar.mvp_news.R
import com.binar.mvp_news.model.GetAllStaffItem
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_news.view.*
import kotlinx.android.synthetic.main.item_staff.view.*

class AdapterStaff (private val liststaff: List <GetAllStaffItem>, private val onclick : (GetAllStaffItem)->Unit):
    RecyclerView.Adapter<AdapterStaff.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterStaff.ViewHolder {
        val itemview =
            LayoutInflater.from(parent.context).inflate(R.layout.item_staff, parent, false)
        return ViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: AdapterStaff.ViewHolder, position: Int) {
        Glide.with(holder.itemView.context).load(liststaff[position].image)
            .into(holder.itemView.gambarstaff)
        holder.itemView.text1staff.text = liststaff[position].name
        holder.itemView.text2staff.text = liststaff[position].email
        holder.itemView.text3staff.text = liststaff[position].createdAt

        holder.itemView.cardstaff.setOnClickListener {
            onclick(liststaff[position])
        }

    }

    override fun getItemCount(): Int {
        return liststaff.size
    }
}
