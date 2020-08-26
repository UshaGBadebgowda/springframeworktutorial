package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nservice")
public class I18NGreetingServiceES implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Monda - ES!!!";
    }
}
