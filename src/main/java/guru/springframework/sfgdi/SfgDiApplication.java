package guru.springframework.sfgdi;

import guru.springframework.sfgdi.comtrollers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SfgDiApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext appContext;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		//Requires casting since it returns an object of class Object

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("-----Profile injected-----");
		System.out.println(i18nController.sayHello());


		MyController myController = (MyController) ctx.getBean("myController");


		System.out.println("---Primary Bean----");
		System.out.println(myController.sayHello());

		System.out.println("----Property-----");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetingService());

		System.out.println("----Setter----");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetingService());

		System.out.println("----Constructor----");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetingService());


	}

	@Override
	public void run(String... args) throws Exception {

		//Prints all the bean names loaded when spring boot application starts
		String[] beans = appContext.getBeanDefinitionNames();
		Arrays.sort(beans);
		for (String bean : beans) {
			System.out.println(bean);
		}


	}
}
