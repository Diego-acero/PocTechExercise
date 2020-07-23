package com.acero.iobuilder.tech.exercise.infrastructure.ports.secondary;


import com.acero.iobuilder.tech.exercise.domain.ports.secondary.EtherRepository;
import com.acero.iobuilder.tech.exercise.domain.transactions.EtherTransaction;
import com.acero.iobuilder.tech.exercise.domain.transactions.TransactionState;
import com.acero.iobuilder.tech.exercise.infrastructure.transactions.TransferWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Web3JEth implements EtherRepository {

    private static final String ERROR = "ERROR";

    @Autowired
    private TransferWrapper transferWrapper;


    @Override
    public TransactionState sendEth(EtherTransaction etherTransaction) {

        if(verifyInfo(etherTransaction)) {
           return new TransactionState(ERROR);
        }

        try {
            transferWrapper.send(
                etherTransaction.getReceiver(),
                etherTransaction.getCuantity()
            );
            return new TransactionState("OK");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new TransactionState(ERROR);
        }
    }

    private boolean verifyInfo(EtherTransaction etherTransaction) {
        return etherTransaction.getReceiver() == null || etherTransaction.getCuantity() == 0;
    }
}
