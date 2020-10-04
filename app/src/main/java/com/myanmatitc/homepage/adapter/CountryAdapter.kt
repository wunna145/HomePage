package com.myanmatitc.homepage.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myanmatitc.homepage.R
import com.myanmatitc.homepage.model.Country
import kotlinx.android.synthetic.main.item_country.view.*

class CountryAdapter(var countryList: ArrayList<Country>): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    class CountryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(country: Country){
            itemView.img.setImageResource(country.img)
            itemView.name.text = country.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int = countryList.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countryList[position])
    }
}