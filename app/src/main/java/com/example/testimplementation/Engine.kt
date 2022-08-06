package com.example.testimplementation

import kotlinx.coroutines.delay

class Engine(
    var tempreture : Double,
    var isTurnedOn : Boolean
) {
    suspend fun turnon(){
        delay(6000)
        tempreture = 95.0
        isTurnedOn = true
    }
}