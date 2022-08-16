package com.meghamlabs.recyclerviewdemo1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myrecycleview = findViewById<RecyclerView>(R.id.My_recyclerView)
        myrecycleview.setBackgroundColor(Color.BLUE)
        myrecycleview.layoutManager = LinearLayoutManager(this)
        myrecycleview.adapter = MyRecyclerViewAdapter()

    }
}