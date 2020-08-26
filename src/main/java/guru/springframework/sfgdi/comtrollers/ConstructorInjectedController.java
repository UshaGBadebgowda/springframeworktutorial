package guru.springframework.sfgdi.comtrollers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    //Autowired is optional for constructors since Spring 4 and hence AutoWired is not used.
    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }
}
