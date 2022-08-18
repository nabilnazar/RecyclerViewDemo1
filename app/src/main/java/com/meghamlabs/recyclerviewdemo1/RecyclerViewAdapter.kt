package com.meghamlabs.recyclerviewdemo1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(private val fruitsList:List<Fruit>, private val clickListener:(Fruit)->Unit) : RecyclerView.Adapter<MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
          val listitem = layoutInflater.inflate(R.layout.list_item,parent,false)
          return MyViewHolder(listitem)
      }

      override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
          //var count = 0

          holder.bind(fruitsList[position],clickListener)
//          holder.myitemView.findViewById<TextView>(R.id.mytextView).text = fruits
//          holder.myitemView.findViewById<Button>(R.id.fbutton).setOnClickListener {
//
//              count++
//              holder.myitemView.findViewById<TextView>(R.id.mytextView).text = count.toString()
//
//          }
//          holder.myitemView.findViewById<Button>(R.id.fbutton).setOnLongClickListener {
//              count--
//              holder.myitemView.findViewById<TextView>(R.id.mytextView).text = count.toString()
//              false
//          }

      }
        override fun getItemCount(): Int {
        return fruitsList.size
      }

}


class MyViewHolder(val myitemView: View) : RecyclerView.ViewHolder(myitemView){


    fun bind(fruit: Fruit, clickListener: (Fruit) -> Unit){
        myitemView.findViewById<TextView>(R.id.mytextView).text= fruit.name
        myitemView.setOnClickListener {
            clickListener(fruit)
        }
    }

}