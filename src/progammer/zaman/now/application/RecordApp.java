package progammer.zaman.now.application;

import progammer.zaman.now.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Jeremy", "Rahasia");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Jeremy"));
        System.out.println(new LoginRequest("Jeremy", "Rahasia"));

    }
}
