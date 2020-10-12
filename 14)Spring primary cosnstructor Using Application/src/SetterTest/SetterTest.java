package SetterTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.si.Bean.PrimeryConstructorInjection;

public class SetterTest {

	public static void main(String[] args) {
		BeanFactory beanfactory = new XmlBeanFactory(new ClassPathResource("com/si/common/Application_Contextal.xml"));
		PrimeryConstructorInjection customer = beanfactory.getBean("mangesh", PrimeryConstructorInjection.class);
         System.out.println(customer);
	}

}
