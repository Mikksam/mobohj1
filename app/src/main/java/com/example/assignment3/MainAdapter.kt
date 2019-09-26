package com.example.assignment3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.time_row.view.*
import java.util.*

class MainAdapter(arrayTime: ArrayList<String>) : RecyclerView.Adapter<CustomViewHolder>(){

    public val timeArray = arrayTime

    override fun getItemCount(): Int {
        return timeArray.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.time_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val timeNow = timeArray.get(position)
        holder.view.timeView.text = timeNow

    }
}

class CustomViewHolder(val view : View) : RecyclerView.ViewHolder(view) {

    }



