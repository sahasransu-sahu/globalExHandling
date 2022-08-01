import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.sahas.logging"})
public class ExMain extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ExMain.class, args);
    }
}
