package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nservice")
public class I18NGreetingServiceEN implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN!!!";
    }
}
