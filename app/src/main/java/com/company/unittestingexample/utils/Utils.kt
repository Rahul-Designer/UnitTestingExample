package com.company.unittestingexample.utils

class Utils {

    fun isPalindrome(input: String): Boolean {
        var i = 0
        var j = input.length - 1
        while (i < j) {
            if (input[i] != input[j]) {
                return false
            }
            i++
            j--
        }
        return true
    }

    fun validPassword(input: String): String {
        return when {
            input.isBlank() -> "Password not be empty"
            input.length < 6 -> "Password not be less than 6 characters"
            input.length > 15 -> "Password not be greater than 15 characters"
            else -> "Password is valid"
        }
    }

    fun reverseString(input : String?) : String{
        if (input == null){
            throw IllegalArgumentException("Input string is null")
        }
        val char = input.toCharArray()
        var i = 0
        var j = char.size -1
        while(i < j){
            val temp = char[i]
            char[i] = char[j]
            char[j] = temp
            i++
            j--
        }
        return char.joinToString("")
    }

}