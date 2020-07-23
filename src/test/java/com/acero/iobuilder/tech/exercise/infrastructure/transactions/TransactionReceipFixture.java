package com.acero.iobuilder.tech.exercise.infrastructure.transactions;


import org.web3j.protocol.core.methods.response.TransactionReceipt;

import java.util.ArrayList;

public class TransactionReceipFixture {

    public static TransactionReceipt correctReceip()
    {
        return new TransactionReceipt("XXXXXXaaaaaa",
                "1",
                "4",
                "34",
                "3000000",
                "20000",
                "0xasssssss",
                "root",
                "send",
                "0xfrom",
                "0xto",
                new ArrayList<>(),
                "bloom",
                "no revert");
    }

    public static TransactionReceipt emptyReceip()
    {
        return new TransactionReceipt();
    }

}