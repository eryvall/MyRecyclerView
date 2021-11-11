package com.eryvall.myrecyclerview

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(cityName:String){
        val cityNameTextView:TextView=itemView.findViewById(R.id.city_name_text_view)
        cityNameTextView.text=cityName

        itemView.setOnClickListener {
            Toast.makeText(itemView.context, cityName, Toast.LENGTH_LONG).show()
        }

    }
}