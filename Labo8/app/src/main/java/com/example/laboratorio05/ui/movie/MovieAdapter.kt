package com.example.laboratorio05.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel



class MovieAdapter : RecyclerView.Adapter<MovieViewHolder>() {

    private var data: List<MovieModel>? = null


    fun setDAta(data: List<MovieModel>) {
        this.data = data
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_movie,parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount() = data?.size ?:0


    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        data?.let {
            val movie = it[position]
            holder.bind(movie)
        }
    }

}




