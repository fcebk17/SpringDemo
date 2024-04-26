package onlyfun.caterpillar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class SpringDemo {
    public static void main(String[] args) {
//        Resource rs = new FileSystemResource("spring-config.xml");
//        BeanFactory factory = new XmlBeanFactory(rs);
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/spring-config.xml");

        HelloBean hellobean = (HelloBean) context.getBean("helloBean");
        System.out.println(hellobean.getHelloWorld());
    }
}
