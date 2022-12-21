package com.example.recipeapp

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CustomAdapter(private val mList:List<ItemsViewModel>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent:ViewGroup,viewType:Int):ViewHolder
    {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.card_view_design,parent,false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder:ViewHolder,position:Int)
    {
        val ItemsViewModel=mList[position]
        holder.title.text=ItemsViewModel.title
        holder.description.text=ItemsViewModel.description
        holder.container.setOnClickListener{
            val intent= Intent(holder.itemView.context,SecondActivity::class.java)
            intent.putExtra("title",ItemsViewModel.title)
            intent.putExtra("description",ItemsViewModel.description)
            intent.putExtra("title",ItemsViewModel.content)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }
    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView)
    {
        val title:TextView=itemView.findViewById(R.id.title)
        val description:TextView=itemView.findViewById(R.id.description)
        val container:LinearLayout=itemView.findViewById(R.id.container)
    }

}