package com.binar.mvp_news.presenter

import com.binar.mvp_news.model.HasilPL
import com.binar.mvp_news.view.MainActivity

class PersegiPanjangPresenter( var pview : PersegiPanjang) {
    fun hitung(panjang:Int, lebar : Int){
        val total =  panjang * lebar

        val count = HasilPL()
        count.total = total
        pview.hasil(count)
    }
}