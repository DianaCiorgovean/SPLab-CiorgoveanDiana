//package ro.uvt.info.splabciorgoveandiana;
package ro.uvt.info.splabciorgoveandiana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.uvt.info.splabciorgoveandiana.difexample.ClientComponent;
import ro.uvt.info.splabciorgoveandiana.difexample.SingletonComponent;
import ro.uvt.info.splabciorgoveandiana.difexample.TransientComponent;
@SpringBootApplication
public class SpLabCiorgoveanDianaApplication {
		public static void main(String[] args) {
//
		ApplicationContext context = SpringApplication.run(SpLabCiorgoveanDianaApplication.class, args);
		TransientComponent transientBean = context.getBean(TransientComponent.class);
		transientBean.operation();

		transientBean = context.getBean(TransientComponent.class);
		transientBean.operation();

		SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
		singletonBean.operation();

		singletonBean = context.getBean(SingletonComponent.class);
		singletonBean.operation();
		ClientComponent c = context.getBean(ClientComponent.class);
		c.operation();
		c = (ClientComponent)context.getBean("clientComponent");
		c.operation();
	}
}




