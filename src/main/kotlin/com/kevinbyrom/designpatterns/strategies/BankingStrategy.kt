package com.kevinbyrom.designpatterns.strategies

interface BankingStrategy {
    fun execute(amount: Int, account: BankAccount)
}