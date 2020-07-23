package com.acero.iobuilder.tech.exercise.infrastructure.transactions;

import org.junit.jupiter.api.Test;

import static com.acero.iobuilder.tech.exercise.application.rest.SendInfoFixture.*;
import static com.acero.iobuilder.tech.exercise.domain.transactions.EtherTransactionFixture.*;
import static org.junit.jupiter.api.Assertions.*;

class SendInfoAdapterTest {

    private final SendInfoAdapter sendInfoAdapter = new SendInfoAdapter();

    @Test
    public void verifyCompleteSendInfo()
    {
        assertEquals(correctEtherTransactionInfo(), sendInfoAdapter.adapt(completeSendInfo()));
    }

    @Test
    public void verifyNoReceiver()
    {
        assertEquals(emptyReceiverEtherTransactionInfo(), sendInfoAdapter.adapt(emptyAdressSendInfo()));
    }

}