package com.example.retailstore.strategy

import com.example.retailstore.model.Bill
import com.example.retailstore.model.UserType
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


internal class NoDiscountStrategyTest {
    @Test
    fun shouldCalculateNetPayableAmountWithNoGroceries() {
        val bill = Bill(1000.0, false, UserType.EMPLOYEE)
        val strategy = NoDiscountStrategy()
        val actual = strategy.calculateNetPayableAmount(bill)
        Assertions.assertEquals(1000.0, actual)
    }
}