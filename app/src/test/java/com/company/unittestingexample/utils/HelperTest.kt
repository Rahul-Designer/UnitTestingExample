package com.company.unittestingexample.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setUp(){
        println("Before every test case")
        // Arrange
       helper = Helper()
    }

    @After
    fun tearDown(){
        println("After every test case")
    }
    @Test
    fun isPalindrome() {

        // Act
        val result = helper.isPalindrome("hello")

        // Assert
        assertEquals(false,result)


    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {

        // Act
        val result = helper.isPalindrome("level")

        // Assert
        assertEquals(true,result)

    }

}