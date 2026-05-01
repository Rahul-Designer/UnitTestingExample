package com.company.unittestingexample.utils

import org.junit.Assert
import org.junit.Test

class PasswordTest {

    @Test
    fun validatePassword_blankInput_expectedRequiredField(){
        // Arrange
        val sut = Utils()

        // Act
        val result = sut.validPassword("     ")

        // Assert
        Assert.assertEquals("Password not be empty",result)
    }

    @Test
    fun validatePassword_2CharInput_expectedValidationMsg(){
        // Arrange
        val sut = Utils()

        // Act
        val result = sut.validPassword("ab")

        // Assert
        Assert.assertEquals("Password not be less than 6 characters",result)
    }

    @Test
    fun validatePassword_CorrectInput_expectedValidPassword(){
        // Arrange
        val sut = Utils()

        // Act
        val result = sut.validPassword("Pass123")

        // Assert
        Assert.assertEquals("Password is valid",result)
    }
}