package com.example.testattest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
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

    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkbox_meat -> {
                    if (checked) {
                        // Put some meat on the sandwich

                        Toast.makeText(applicationContext, "More Meat", Toast.LENGTH_LONG).show()

                    } else {
                        // Remove the meat
                        Toast.makeText(applicationContext, "No Meat", Toast.LENGTH_LONG).show()

                    }
                }
                R.id.checkbox_cheese -> {
                    if (checked) {
                        // Cheese me
                        Toast.makeText(applicationContext, "Queso", Toast.LENGTH_LONG).show()

                    } else {
                        // I'm lactose intolerant
                        Toast.makeText(applicationContext, "Vegan", Toast.LENGTH_LONG).show()

                    }
                }
            }
        }
    }
}
