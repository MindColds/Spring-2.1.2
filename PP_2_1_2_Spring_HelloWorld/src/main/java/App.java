import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        //---------------------------------------------------------
        HelloWorld bean = context.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        HelloWorld helloWorld = context.getBean("helloworld", HelloWorld.class);
        System.out.println(helloWorld.getMessage());
        System.out.println("Переменные класса Helloworld ссылаются на один объект? -" + (bean == helloWorld));

        //------------------------------------------------------------
        Cat catVaska = context.getBean("cat", Cat.class);
        Cat catBoriska = context.getBean("cat", Cat.class);
        System.out.println("Переменные класса Cat ссылаются на один объект? - " + (catVaska == catBoriska));
    }
}