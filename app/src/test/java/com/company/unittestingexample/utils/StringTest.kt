package com.company.unittestingexample.utils

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

class StringTest {

    @Test
    fun testStringReversal_EmptyStringInput_expectedEmptyString(){
        val sut = Utils()
        val result = sut.reverseString("")
        Assert.assertEquals("",result)
    }
    @Test
    fun testStringSingleCharInput_expectedSingleChar(){
        val sut = Utils()
        val result = sut.reverseString("a")
        Assert.assertEquals("a",result)
    }
    @Test
    fun testStringValidInput_expectedValid(){
        val sut = Utils()
        val result = sut.reverseString("abc")
        Assert.assertEquals("cba",result)
    }
    @Test(expected = IllegalArgumentException::class)
    fun testStringNullInput_expectedException(){
        val sut = Utils()
        val result = sut.reverseString(null)
    }
}

@RunWith(Parameterized::class)
class ParameterizedReverseStringTest(val input : String, val expectedValue : String){

    @Test
    fun test(){
        val sut = Utils()
        val result = sut.reverseString(input)
        Assert.assertEquals(expectedValue,result)
    }

    companion object{

        @JvmStatic
        @Parameterized.Parameters(name = "{index} : {0} is reverseString - {1}")
        fun checkReverseString() : List<Array<Any>> {
            return listOf(
                arrayOf("   ","   "),
                arrayOf("abc","cba")
            )
        }
    }
}