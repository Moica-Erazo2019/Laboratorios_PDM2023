package com.example.laboratorio05.ui.movie

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel


class MovieViewHolder (itemview : View): RecyclerView.ViewHolder (itemview) {
    private var textoUno: TextView = itemView.findViewById (R.id.textoUno)
    private var textoDos: TextView = itemView.findViewById (R.id.textoDos)
    private var imagenUNO: ImageView = itemView.findViewById (R.id.imagenUNO)

    fun bind(movie:MovieModel){
        textoUno.text= movie.name
        textoDos.text= movie.qualification
    }
}