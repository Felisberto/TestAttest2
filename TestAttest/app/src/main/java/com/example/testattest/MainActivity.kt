package com.example.testattest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.testattest.adapter.RcAdapter
import com.example.testattest.model.ModelTest
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thisAdapter = RcAdapter()
        thisAdapter.addItens(listOf(ModelTest(), ModelTest(), ModelTest()))
        rvTest.run {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = thisAdapter
        }
    }
}
