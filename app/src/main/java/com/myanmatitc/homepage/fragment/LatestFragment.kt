package com.myanmatitc.homepage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmatitc.homepage.R
import com.myanmatitc.homepage.adapter.LatestAdapter
import com.myanmatitc.homepage.model.Latest
import kotlinx.android.synthetic.main.fragment_latest.*


class LatestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_latest, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var latestList = ArrayList<Latest>()
        latestList.add(Latest(R.drawable.bag,"Hyde Park","N41015","LOUIS VUITTON","211,000 KS",4))
        latestList.add(Latest(R.drawable.hoodie,"HORNS PINK LONG","SLEEVE T SHIRT","Lady Gaga","72000 KS",5))
        latestList.add(Latest(R.drawable.iphone,"IPhone","","Apple","700,000 KS",5))

        var latestAdapter =LatestAdapter(latestList)
        latestRecycler.layoutManager = LinearLayoutManager(
            context,LinearLayoutManager.HORIZONTAL, false
        )

        latestRecycler.adapter =latestAdapter
    }
}