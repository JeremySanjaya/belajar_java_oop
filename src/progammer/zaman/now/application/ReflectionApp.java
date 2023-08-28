package progammer.zaman.now.application;

import progammer.zaman.now.data.CreateUserRequest;
import progammer.zaman.now.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {


        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Jeremy");
        request.setPassword("Jeremy");
        ValidationUtil.validationReflection(request);
    }
}
