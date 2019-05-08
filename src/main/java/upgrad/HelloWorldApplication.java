package upgrad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/*uncomment @ServletComponentScan if want to create web application using servlet*/
@SpringBootApplication
//@ServletComponentScan
public class HelloWorldApplication {

    public  static void main(String args[]){
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
