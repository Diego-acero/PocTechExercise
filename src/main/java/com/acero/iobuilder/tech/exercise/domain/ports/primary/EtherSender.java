package com.acero.iobuilder.tech.exercise.domain.ports.primary;

import com.acero.iobuilder.tech.exercise.application.rest.SendInfo;
import com.acero.iobuilder.tech.exercise.domain.transactions.TransactionState;

public interface EtherSender {
    TransactionState send(SendInfo sendInfo);
}
