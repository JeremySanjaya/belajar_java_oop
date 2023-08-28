package progammer.zaman.now;

import jdk.jshell.EvalException;
import progammer.zaman.now.data.LoginRequest;
import progammer.zaman.now.error.ValidationException;
import progammer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) throws ValidationException {

        LoginRequest loginRequest = new LoginRequest(null, null);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }


        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");
    }
}
