package com.eryvall.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cityNameList: List<String> =
            listOf("Moscow", "Volgograd", "Samara", "Rostov-on-Don", "S.Petersburg")

        val cityList: List<City> = listOf(
            City("Moscow", 10000000),
            City("Volgograd", 1000000),
            City("Samara", 1200000),
            City("Rostov-on-Don", 2000000),
            City("S.Petersburg", 9000000)
        )

        val citiesRecyclerView: RecyclerView = findViewById(R.id.cities_recycler_view)
        citiesRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //citiesRecyclerView.adapter = CityAdapter(cityNameList)
citiesRecyclerView.adapter=NewCityAdapter(cityList)
    }
}