package com.myanmatitc.homepage.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myanmatitc.homepage.R
import com.myanmatitc.homepage.model.Popular
import kotlinx.android.synthetic.main.item_popular.view.*

class PopularAdapter (var popularList: ArrayList<Popular>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>(){
    class PopularViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bind(popular: Popular) {
            itemView.txt1.text = popular.newTxt
            itemView.txt2.text = popular.off
            itemView.name.text = popular.name
            itemView.brand.text = popular.brand
            itemView.rating_bar.rating = popular.rate.toFloat()
            itemView.price.text = popular.price
            itemView.image.setImageResource(popular.img)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_popular,parent,false)
        return PopularViewHolder(view)
    }

    override fun getItemCount(): Int = popularList.size

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.bind(popularList[position])
    }
}