package com.example.testimplementation.unitTest

import com.example.testimplementation.Car
import com.example.testimplementation.Engine
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.mockito.Mockito.*


/**
 * Mockito verify() method can be used to test number of method invocations too.
 * We can test exact number of times, at least once, at least,
 * at most number of invocation times for a mocked method.*/
/**
 *
 * verify(mockList, times(1)).size(); //same as normal verify method
 * verify(mockList, atLeastOnce()).size(); // must be called at least once
 * verify(mockList, atMost(2)).size(); // must be called at most 2 times
 * verify(mockList, atLeast(1)).size(); // must be called at least once
 * verify(mockList, never()).clear(); // must never be called*/
/**
 * We can use InOrder to verify the order of invocation. We can skip any method to verify,
 * but the methods being verified must be invoked in the same order.
 *
 * InOrder inOrder = inOrder(mockList, mockMap);
 * inOrder.verify(mockList).add("Pankaj");
 * inOrder.verify(mockList, calls(1)).size();
 * inOrder.verify(mockList).isEmpty();
 * inOrder.verify(mockMap).isEmpty();*/
class CarSould {
    private val engine: Engine = mock(Engine::class.java)
    private val car = Car(6.0 , engine)

    @Test
    fun `loose fuel when it turns on `() {
        car.turnsOn()
        assertEquals(5.5, car.fuel)
    }
    @Test
    fun `should turnon it's engin`(){
        car.turnsOn()

        verify(engine , times(1)).turnon()
    }
}