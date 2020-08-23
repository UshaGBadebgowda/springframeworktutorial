package guru.springframework.sfgdi.comtrollers;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }
}
