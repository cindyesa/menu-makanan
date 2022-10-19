package com.cindy.menumakanan

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class detail : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = intent
        val menu = intent.getStringExtra("menu")
        val desk = intent.getStringExtra("desk")
        val harga = intent.getStringExtra("harga")
        val foto = intent.getIntExtra("foto", 0)

        val name: TextView = findViewById(R.id.judul)
        val hargatxt: TextView = findViewById(R.id.harga)
        val desktxt: TextView = findViewById(R.id.deskripsi)
        val image: ImageView = findViewById(R.id.foto)

        name.text = menu
        image.setImageResource(foto)
        hargatxt.text = "Rp$harga"
        desktxt.text = desk
    }
}