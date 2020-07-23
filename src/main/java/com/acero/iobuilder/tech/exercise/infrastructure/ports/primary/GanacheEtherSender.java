package com.acero.iobuilder.tech.exercise.infrastructure.ports.primary;

import com.acero.iobuilder.tech.exercise.application.rest.SendInfo;
import com.acero.iobuilder.tech.exercise.domain.ports.primary.EtherSender;
import com.acero.iobuilder.tech.exercise.domain.ports.secondary.EtherRepository;
import com.acero.iobuilder.tech.exercise.domain.transactions.EtherTransaction;
import com.acero.iobuilder.tech.exercise.domain.transactions.TransactionState;
import com.acero.iobuilder.tech.exercise.infrastructure.transactions.SendInfoAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GanacheEtherSender implements EtherSender {

    @Autowired
    private SendInfoAdapter sendInfoAdapter;
    @Autowired
    private EtherRepository etherRepository;

    @Override
    public TransactionState send(SendInfo sendInfo) {
        EtherTransaction etherTransaction = sendInfoAdapter.adapt(sendInfo);
        return etherRepository.sendEth(etherTransaction);
    }
}
