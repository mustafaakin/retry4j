package com.evanlennick.retry4j;

public class AttemptResults<T> {

    private T result;

    private boolean wasSuccessful;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean wasSuccessful() {
        return wasSuccessful;
    }

    public void setSuccessful(boolean wasSuccessful) {
        this.wasSuccessful = wasSuccessful;
    }
}
