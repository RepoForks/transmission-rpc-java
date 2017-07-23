package com.costular.transmission_rc.http.command;

/**
 * Created by costular on 21/07/17.
 */
public abstract class Command {

    String method;
    BodyArguments arguments;

    public Command(String method, BodyArguments arguments) {
        this.method = method;
        this.arguments = arguments;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public BodyArguments getArguments() {
        return arguments;
    }

    public void setArguments(BodyArguments arguments) {
        this.arguments = arguments;
    }
}
