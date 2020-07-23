package com.acero.iobuilder.tech.exercise.infrastructure.transactions;

import org.springframework.stereotype.Component;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

import java.math.BigDecimal;

@Component
public class TransferWrapper {
    private final String PRIVATE_KEY = "0x6cbed15c793ce57650b9877cf6fa156fbef513c4e6134f022a85b1ffdd59b2a1";
    private Web3j web3j;
    private TransactionManager transactionManager;
    private Transfer transfer;

    public TransferWrapper()
    {
        this.web3j = Web3j.build(new HttpService("HTTP://127.0.0.1:8545"));
        this.transactionManager = new RawTransactionManager(
                web3j,
                getCredentialsFromPrivateKey()
        );
        this.transfer = new Transfer(web3j, transactionManager);
    }

    public TransactionReceipt send(String receiverWallet, float amount) throws Exception {
        return transfer.sendFunds(receiverWallet,
                BigDecimal.valueOf(amount),
                Convert.Unit.ETHER).send();
    }

    private Credentials getCredentialsFromPrivateKey()
    {
        return Credentials.create(PRIVATE_KEY);
    }
}
