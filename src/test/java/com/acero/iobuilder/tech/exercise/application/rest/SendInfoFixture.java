package com.acero.iobuilder.tech.exercise.application.rest;


public class SendInfoFixture {
    public static SendInfo completeSendInfo() {
        SendInfo sendInfo = new SendInfo();
        sendInfo.setAmount(2f);
        sendInfo.setReceiverWallet("xxx032");
        return sendInfo;
    }

    public static SendInfo emptySendInfo() {
        SendInfo sendInfo = new SendInfo();
        sendInfo.setAmount(0f);
        sendInfo.setReceiverWallet(null);
        return sendInfo;
    }

    public static SendInfo emptyAmountSendInfo() {
        SendInfo sendInfo = new SendInfo();
        sendInfo.setAmount(0f);
        sendInfo.setReceiverWallet("xxx032");
        return sendInfo;
    }

    public static SendInfo emptyAdressSendInfo() {
        SendInfo sendInfo = new SendInfo();
        sendInfo.setAmount(2f);
        sendInfo.setReceiverWallet(null);
        return sendInfo;
    }
}