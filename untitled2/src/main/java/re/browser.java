package re;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class browser {

    public static Properties prob;
    private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();
    public static WebDriver bowserInvocation() throws IOException {

        String path = System.getProperty("user.dir");
        System.out.println(path);
      /*  FileInputStream inputStream = new FileInputStream(new File(path + "/src/main/resources/utility/environment.properties"));
        prob = new Properties();
        prob.load(inputStream);*/
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shalini\\Downloads\\chrom86_driver\\chromedriver.exe");


        EdgeOptions e = new EdgeOptions();
        e.addArguments("--disable-dev-shm-usage");
        e.addArguments("--no-sandbox");
        threadLocal.set(new EdgeDriver(e));
        //e.setAcceptInsecureCerts(true);
        //e.addArguments("--disable-notifications");

       /* switch (prob.getProperty("re.browser").toLowerCase()){

            case "chrome":
                threadLocal.set(new ChromeDriver());
                break;
            case "edge":
                threadLocal.set(new EdgeDriver());

                break;
            default:
                throw new InvalidArgumentException("invalid re.browser name");
        }*/

//        if(prob.getProperty("re.browser").equalsIgnoreCase("chrome")){
//
//            driver = new ChromeDriver();
//        }
//        else if (prob.getProperty("re.browser").equalsIgnoreCase("edge")){
//
//            driver = new EdgeDriver();
//        }
//        else{
//            throw new InvalidArgumentException("invalid re.browser name");
//        }

        //   driver.get(prob.getProperty("url"));
    //    getDriver().navigate().to(prob.getProperty("url"));

       // getDriver().manage().window().maximize();
        //getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        return getDriver();

    }

    public static WebDriver getDriver(){

        return threadLocal.get();
    }

}




