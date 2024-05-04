import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanSame =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanSame.getMessage());
        System.out.println("Hello world: " + (bean == beanSame));
        Cat firstCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(firstCat.getAge() + " " + firstCat.getName());
        Cat secondCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(secondCat.getAge() + " " + secondCat.getName());
        System.out.println("Cat: " + (firstCat == secondCat));
    }
}