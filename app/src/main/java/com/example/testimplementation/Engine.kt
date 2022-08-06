package com.example.testimplementation

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Engine(
    var tempreture : Double,
    var isTurnedOn : Boolean
) {
    suspend fun turnon(): Flow<Double> {
        isTurnedOn = true
        return flow {
            tempreture = 95.0
            emit(tempreture)
        }

    }
}