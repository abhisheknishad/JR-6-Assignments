package empmgtusingspring3rd.com.cg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:employee.properties")
@ComponentScan("empmgtusingspring2nd.com.cg")
@Configuration
public class JavaConfig {

}
