package com.company.unittestingexample

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*
import org.junit.Test
import java.io.FileNotFoundException

class QuotesManagerTest {

    @Test(expected = FileNotFoundException::class)
    fun populateQuotes() {
        // Arrange
        val quotesManager = QuotesManager()

        // Act
        val context = ApplicationProvider.getApplicationContext<Context>()
        quotesManager.populateQuotes(context, "")
    }

    @Test(expected = JsonSyntaxException::class)
    fun testPopulateQuotesFromAssets_InvalidJSON_expected_Exception() {
        // Arrange
        val quotesManager = QuotesManager()

        // Act
        val context = ApplicationProvider.getApplicationContext<Context>()
        quotesManager.populateQuotes(context, "malformed.json")
    }

    @Test
    fun testPopulateQuotesFromAssets_ValidJSON_expected_Count() {
        // Arrange
        val quotesManager = QuotesManager()

        // Act
        val context = ApplicationProvider.getApplicationContext<Context>()
        quotesManager.populateQuotes(context, "quotes.json")

        // Assert
        assertEquals(5, quotesManager.quotesList.size)
    }

    @Test
    fun testPreviousQuote_expected_CorrectQuote() {
        // Arrange
        val quoteManager = QuotesManager()
        quoteManager.populateQuotes(
            arrayOf<Quote>(
                Quote("This is first quote", "1"),
                Quote("This is second quote", "2"),
                Quote("This is third quote", "3")
            )
        )

        // Act
        val quote = quoteManager.getPreviousQuote()

        // Assert
        assertEquals("1",quote.author)
    }


    @Test
    fun testNextQuote_expected_CorrectQuote() {
        // Arrange
        val quoteManager = QuotesManager()
        quoteManager.populateQuotes(
            arrayOf<Quote>(
                Quote("This is first quote", "1"),
                Quote("This is second quote", "2"),
                Quote("This is third quote", "3")
            )
        )

        // Act
        val quote = quoteManager.getNextQuote()

        // Assert
        assertEquals("2",quote.author)
    }
}