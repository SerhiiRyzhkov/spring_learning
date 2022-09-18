package spring_introduction.train;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test0 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext0.xml");

        Person person = context.getBean("Lera", Person.class);
        person.introduce();

        person.getPet().say();

        context.close();
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext00.xml");
        Person person1 = context1.getBean("Serhii", Person.class);
        person1.introduce();
        person1.getPet().say();

        context1.close();
    }
}
