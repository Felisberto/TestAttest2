package com.example.testattest.adapter

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.testattest.R
import com.example.testattest.model.ModelTest


/**
 * Created by Erick Melechsohn Bergmann on 2019-08-20 - It
 * Copyright (c) 2018 Itau. All rights reserved.
 */
class RcAdapter : Adapter<RcAdapter.VH>() {

    lateinit  var listModel : List<ModelTest>

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): VH {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.adapter_item, p0, false)
        return VH(view)
    }

    override fun getItemCount(): Int = listModel.size

    override fun onBindViewHolder(p0: VH, p1: Int) {
        p0.bindViews(p1)
    }

    fun addItens(list: List<ModelTest>){
        listModel = list
    }

    inner class VH(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindViews(int : Int){
            view.findViewById<TextView>(R.id.tv1).text = "Nome"
            view.findViewById<TextView>(R.id.tv2).text = int.toString()
        }
    }
}