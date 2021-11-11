package com.eryvall.myrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewCityAdapter(private val cityList: List<City>): RecyclerView.Adapter<NewCityViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewCityViewHolder {

        val cityListItemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.new_city_list_item, parent,false)


        return NewCityViewHolder(cityListItemView)
    }

    override fun onBindViewHolder(holder: NewCityViewHolder, position: Int) {
       val city=cityList[position]
        holder.bind(city)
    }

    override fun getItemCount(): Int {
        return cityList.size
    }
}