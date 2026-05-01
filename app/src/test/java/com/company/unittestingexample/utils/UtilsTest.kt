package com.company.unittestingexample.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class UtilsTest {

    lateinit var utils: Utils

    @Before
    fun setUp(){
        println("Before every test case")
        // Arrange
       utils = Utils()
    }

    @After
    fun tearDown(){
        println("After every test case")
    }
    @Test
    fun isPalindrome() {

        // Act
        val result = utils.isPalindrome("hello")

        // Assert
        assertEquals(false,result)


    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {

        // Act
        val result = utils.isPalindrome("level")

        // Assert
        assertEquals(true,result)

    }

}