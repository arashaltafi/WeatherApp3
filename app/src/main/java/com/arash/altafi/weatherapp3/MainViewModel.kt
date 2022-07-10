package com.arash.altafi.weatherapp3

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import com.arash.altafi.weatherapp3.service.WeatherRepository
import com.arash.altafi.weatherapp3.service.dto.CurrentWeather
import com.arash.altafi.weatherapp3.service.dto.FullWeather
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@SuppressLint("MissingPermission")
@HiltViewModel
class MainViewModel @Inject constructor(
    repository: WeatherRepository
) : ViewModel() {

    val current: Flow<CurrentWeather> = repository.getCurrentWeather()
    val forecast: Flow<List<FullWeather.Daily>> = repository.getFiveDayForecast()

}