package com.myanmatitc.homepage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmatitc.homepage.R
import com.myanmatitc.homepage.adapter.PopularAdapter
import com.myanmatitc.homepage.model.Popular
import kotlinx.android.synthetic.main.fragment_country.*
import kotlinx.android.synthetic.main.fragment_popular.*

class PopularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var popularList = ArrayList<Popular>()
        popularList.add(Popular("NEW","30% off","Iphone 8 Plus","Apple",4,"980000 KS",R.drawable.iph8))
        popularList.add(Popular("NEW","34% off","GhostBed 11 Inch Cooling Gel Memory Foam ....","GhostBed",4,"325000 KS",R.drawable.bed))
        popularList.add(Popular(" "," ","Nintendo Switch - Neon Blue and Red Joy-Con","Nintendo",4,"359000 KS",R.drawable.nitendo))
        popularList.add(Popular("NEW"," ","BELAROI Women Comfy Swing Tunic Short ...","Balaroi",4,"18990 KS",R.drawable.belaroi))

        var popularAdapter = PopularAdapter(popularList)
        popularRecycler.layoutManager = LinearLayoutManager(context)
        popularRecycler.adapter = popularAdapter

    }

}