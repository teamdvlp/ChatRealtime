package com.example.tiend.chatrealtime.presenter.login;

/**
 * Created by tiend on 8/17/2017.
 */

public class presenterLogin implements presenterLoginInterface {

    private loginResult loginResult;
    @Override
    public void LoginProcess(String email, String password) {

    }

    @Override
    public void LoginFailed() {

    }

    @Override
    public void LoginSuccess() {

    }

    @Override
    public void setOnLoginResult(loginResult onLoginResult) {
        this.loginResult = onLoginResult;
    }
}
