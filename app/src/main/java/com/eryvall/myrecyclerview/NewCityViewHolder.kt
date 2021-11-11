package com.eryvall.myrecyclerview

import android.view.View
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class NewCityViewHolder (itemView:View): RecyclerView.ViewHolder (itemView){

    fun bind(city: City){
val cityNameTextView:TextView=itemView.findViewById(R.id.city_name_text_view)
        val cityPopulationTextView:TextView=itemView.findViewById(R.id.city_population_text_view)

        cityNameTextView.text=city.name
        cityPopulationTextView.text=city.population.toString()
    }
}