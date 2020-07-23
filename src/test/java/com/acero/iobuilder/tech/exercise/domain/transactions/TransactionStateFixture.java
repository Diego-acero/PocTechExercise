package com.acero.iobuilder.tech.exercise.domain.transactions;


public class TransactionStateFixture {
    public static TransactionState okState()
    {
        return new TransactionState("OK");
    }

    public static TransactionState errorState()
    {
        return new TransactionState("ERROR");
    }
}