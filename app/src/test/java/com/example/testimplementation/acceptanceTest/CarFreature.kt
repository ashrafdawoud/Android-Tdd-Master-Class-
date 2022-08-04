package com.example.testimplementation.acceptanceTest

import com.example.testimplementation.Car
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test

class CarFreature {
    val engine = Engine()
    val car = Car(5.0 , engine)

    @Test
    fun `car is loosing fuel when it turns on `(){
        car.turnsOn()
        assertEquals(4.5 , car.fuel)
    }
    @Test
    fun `engine tempreture should be encreases when engin is turned on `(){
        car.turnsOn()

        assertEquals(95 , engine.tempreture)
        assertTrue(engine.isTurnedOn)
    }
}