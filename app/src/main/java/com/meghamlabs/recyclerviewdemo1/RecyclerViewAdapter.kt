package com.meghamlabs.recyclerviewdemo1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter : RecyclerView.Adapter<MyViewHolder>() {


    val fruitlist = listOf("mango","apple","orange","pappaya","coconut","lemon","fruty","frutyy")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
          val listitem = layoutInflater.inflate(R.layout.list_item,parent,false)
          return MyViewHolder(listitem)
      }

      override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
          var count = 0
          val fruits = fruitlist[position]
          holder.myitemView.findViewById<TextView>(R.id.mytextView).text = fruits
          holder.myitemView.findViewById<Button>(R.id.fbutton).setOnClickListener {

              count++
              holder.myitemView.findViewById<TextView>(R.id.mytextView).text = count.toString()

          }
          holder.myitemView.findViewById<Button>(R.id.fbutton).setOnLongClickListener {
              count--
              holder.myitemView.findViewById<TextView>(R.id.mytextView).text = count.toString()
              false
          }

      }
        override fun getItemCount(): Int {
        return fruitlist.size
      }

}


class MyViewHolder(val myitemView: View) : RecyclerView.ViewHolder(myitemView){

}