package com.example.tiend.chatrealtime.presenter.login;

/**
 * Created by tiend on 8/17/2017.
 */

public interface presenterLoginInterface {
    void LoginProcess (String email, String password);
    void LoginFailed ();
    void LoginSuccess ();
    void setOnLoginResult (loginResult onLoginResult);
    interface loginResult {
        void onLoginResult();
    }
}
