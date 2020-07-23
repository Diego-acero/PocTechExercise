package com.acero.iobuilder.tech.exercise.domain.ports.secondary;

import com.acero.iobuilder.tech.exercise.domain.transactions.EtherTransaction;
import com.acero.iobuilder.tech.exercise.domain.transactions.TransactionState;

public interface EtherRepository {
    TransactionState sendEth(EtherTransaction etherTransaction);
}
