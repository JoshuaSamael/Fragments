package com.example.fragmentsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentsapp.R
import com.example.fragmentsapp.adapters.SimpleAdapter


class CategoryFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list = listOf<String>("Pizza","Hamburguesa","Tacos","Enchiladas","Hot dogs","Hot cakes","Tortas","Elote","Palomitas","Nachos")
        val recyclerView = view.findViewById<RecyclerView>(R.id.category_recycleView)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = SimpleAdapter(list)
    }
}

