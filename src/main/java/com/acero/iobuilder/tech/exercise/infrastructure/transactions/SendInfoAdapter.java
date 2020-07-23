package com.acero.iobuilder.tech.exercise.infrastructure.transactions;

import com.acero.iobuilder.tech.exercise.application.rest.SendInfo;
import com.acero.iobuilder.tech.exercise.domain.transactions.EtherTransaction;
import org.springframework.stereotype.Component;

@Component
public class SendInfoAdapter {
    public EtherTransaction adapt(SendInfo sendInfo)
    {
        return new EtherTransaction(sendInfo.getAmount(), sendInfo.getReceiverWallet());
    }
}
