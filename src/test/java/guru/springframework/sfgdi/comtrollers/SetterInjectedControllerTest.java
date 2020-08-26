package guru.springframework.sfgdi.comtrollers;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;


    @Test
    void getGreetingService() {
        System.out.println(setterInjectedController.getGreetingService());
    }

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new ConstructorGreetingServiceImpl());
    }

}