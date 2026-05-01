package com.company.unittestingexample.utils

import org.junit.Assert
import org.junit.Test

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