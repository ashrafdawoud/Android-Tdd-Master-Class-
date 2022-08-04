package com.example.testimplementation.unitTest

import com.example.testimplementation.Car
import junit.framework.TestCase.assertEquals
import org.junit.Test

class CarSould {
    val car = Car(6.0)

    @Test
    fun `loose fuel when it turns on `(){
        car.turnsOn()
        assertEquals(5.5 , car.fuel)
    }
}