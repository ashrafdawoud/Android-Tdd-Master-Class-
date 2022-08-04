package com.example.testimplementation.acceptanceTest

import com.example.testimplementation.Car
import junit.framework.TestCase.assertEquals
import org.junit.Test

class CarFreature {
    val car = Car(5.0)

    @Test
    fun `car is loosing fuel when it turns on `(){
        car.turnsOn()
        assertEquals(4.5 , car.fuel)
    }
}