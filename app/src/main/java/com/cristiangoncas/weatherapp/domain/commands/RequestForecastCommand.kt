package com.cristiangoncas.weatherapp.domain.commands

import com.cristiangoncas.weatherapp.data.ForecastRequest
import com.cristiangoncas.weatherapp.domain.mappers.ForecastDataMapper
import com.cristiangoncas.weatherapp.domain.model.ForecastList

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {

    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}