package com.example.exampractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exampractice.Constants
import com.example.exampractice.R
import com.example.exampractice.adapters.CategoryAdapter

class NewsFragment : Fragment() {
    lateinit var recyclerView : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_news2, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.adapter = CategoryAdapter(Constants.categories, requireActivity())
        activity
        return view

    }
}