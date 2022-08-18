package com.meghamlabs.recyclerviewdemo1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    val fruitlist = listOf(Fruit("mango","tom"),Fruit("orange","shaba"),Fruit("pappaya","shammi"),Fruit("pappaya","shammi"),
        Fruit("sukki","thengha"),Fruit("assdsd","ewncnv"),Fruit("sdshvds","shadsdbhsmmi"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myrecycleview = findViewById<RecyclerView>(R.id.My_recyclerView)
        myrecycleview.setBackgroundColor(Color.BLUE)
        myrecycleview.layoutManager = LinearLayoutManager(this)
        myrecycleview.adapter = MyRecyclerViewAdapter(fruitlist) { selectedFruitItem: Fruit ->
            listItemClicked(
                selectedFruitItem
            )
        }

    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(this@MainActivity,
            "Supplier name is ${fruit.supplier}", Toast.LENGTH_LONG).show()
    }
}