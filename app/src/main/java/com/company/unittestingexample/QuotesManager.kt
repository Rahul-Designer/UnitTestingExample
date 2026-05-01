package com.company.unittestingexample

import android.content.Context
import com.google.gson.Gson

class QuotesManager {
    var quotesList = emptyArray<Quote>()
    var currentIndex = 0

    fun populateQuotes(context: Context,fileName : String){
        val inputStream = context.assets.open(fileName)
        val size : Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer,Charsets.UTF_8)
        val gson = Gson()
        quotesList = gson.fromJson(json,Array<Quote>::class.java)
    }

    fun populateQuotes(quotes : Array<Quote>){
        quotesList = quotes
    }

    fun getCurrentQuote() : Quote{
        return quotesList[currentIndex]
    }

    fun getNextQuote() : Quote{
        if (currentIndex == quotesList.size - 1){
            return quotesList[currentIndex]
        }
        return quotesList[++currentIndex]
    }

    fun getPreviousQuote() : Quote{
        if (currentIndex == 0){
            return quotesList[currentIndex]
        }
        return quotesList[--currentIndex]
    }
}