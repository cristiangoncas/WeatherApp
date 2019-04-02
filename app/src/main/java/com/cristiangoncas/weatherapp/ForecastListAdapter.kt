package com.cristiangoncas.weatherapp

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.cristiangoncas.weatherapp.domain.model.ForecastList

class ForecastListAdapter(private val weekForecast: ForecastList) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(TextView(parent.context))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weekForecast.dailyForecast[position]) {
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount(): Int = weekForecast.dailyForecast.size

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}