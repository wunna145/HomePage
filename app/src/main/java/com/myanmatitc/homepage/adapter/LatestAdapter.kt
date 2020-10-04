package com.myanmatitc.homepage.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myanmatitc.homepage.R
import com.myanmatitc.homepage.model.Latest
import kotlinx.android.synthetic.main.item_latest.view.*

class LatestAdapter(var latestList: ArrayList<Latest>): RecyclerView.Adapter<LatestAdapter.LatestViewHolder>() {
    class LatestViewHolder(itemView: View):  RecyclerView.ViewHolder(itemView) {

        fun bind(latest: Latest) {
            itemView.img.setImageResource(latest.img)
            itemView.txt1.text = latest.txt1
            itemView.txt2.text = latest.txt2
            itemView.txt3.text = latest.txt3
            itemView.txt4.text = latest.txt4
            itemView.rating_bar.rating = latest.rate.toFloat()
        }
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestViewHolder {
            var view = LayoutInflater.from(parent.context).inflate(R.layout.item_latest, parent, false)
            return LatestViewHolder(view)
        }

        override fun getItemCount(): Int = latestList.size

        override fun onBindViewHolder(holder: LatestViewHolder, position: Int) {
            holder.bind(latestList[position])
        }
}