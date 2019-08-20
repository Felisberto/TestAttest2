package com.example.testattest.adapter

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testattest.R


/**
 * Created by Erick Melechsohn Bergmann on 2019-08-20 - It
 * Copyright (c) 2018 Itau. All rights reserved.
 */
class RcAdapter : Adapter<RcAdapter.VH>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): VH {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.adapter_item, p0, false)
        return VH(view)
    }

    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(p0: VH, p1: Int) {
    }


    inner class VH(val itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}