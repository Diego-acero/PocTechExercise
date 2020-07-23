package com.acero.iobuilder.tech.exercise.domain.transactions;

import java.util.Objects;

public class EtherTransaction {

    private float cuantity;
    private String receiver;

    public EtherTransaction(float cuantity, String receiver) {
        this.cuantity = cuantity;
        this.receiver = receiver;
    }

    public String getReceiver() {
        return receiver;
    }

    public float getCuantity() {
        return cuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtherTransaction that = (EtherTransaction) o;
        return Float.compare(that.cuantity, cuantity) == 0 &&
                Objects.equals(receiver, that.receiver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuantity, receiver);
    }
}
