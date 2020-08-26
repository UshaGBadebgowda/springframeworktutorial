package guru.springframework.sfgdi.comtrollers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    //Spring to automatically handle injection of Greeting Service hence used Autowired.
    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }
}
