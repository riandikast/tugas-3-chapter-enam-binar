
package com.binar.mvp_news.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.binar.mvp_news.R
import com.binar.mvp_news.model.HasilPL
import com.binar.mvp_news.presenter.PersegiPanjang
import com.binar.mvp_news.presenter.PersegiPanjangPresenter

class PersegiPanjangActivity : AppCompatActivity(), PersegiPanjang {
    private var presenter : PersegiPanjangPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)
        presenter = PersegiPanjangPresenter(this)
        presenter!!.hitung(10,5)
    }

    override fun hasil(hasil: HasilPL) {
        Toast.makeText(this,hasil.total.toString(), Toast.LENGTH_LONG).show()
    }
}