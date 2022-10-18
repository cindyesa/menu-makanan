package com.cindy.menumakanan

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class Adapter(
    private val menuMakanan: Array<String>,
    private val hargaMakanan: Array<String>,
    private val menuImage: IntArray,
    private val menuDeskripsi: Array<String>
) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val namaTextView: TextView
        val cardView: CardView
        val hargaTextView: TextView
        val fotoImage: ImageView

        init {
            namaTextView = view.findViewById(R.id.nama)
            hargaTextView = view.findViewById(R.id.harga)
            cardView = view.findViewById(R.id.card_view)
            fotoImage = view.findViewById(R.id.foto)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.row, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.namaTextView.text = menuMakanan[position]
        viewHolder.fotoImage.setImageResource(menuImage[position])
        viewHolder.hargaTextView.text = hargaMakanan[position]
        viewHolder.cardView.setOnClickListener {
            val x = Bundle()
            x.putString("menu", menuMakanan[position])
            x.putString("desk", menuDeskripsi[position])
            x.putString("harga", hargaMakanan[position])
            x.putInt("foto", menuImage[position])
            val intent = Intent(viewHolder.cardView.context, Detail::class.java)
            intent.putExtras(x)
            viewHolder.cardView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = menuMakanan.size
}