package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginActionPage extends PageObject{

    public void userName(String name)
    {
        $(By.name("username")).type(name);
    }

    public void password(String password)
    {
        $(By.name("password")).type(password);
    }

    public void loing()
    {
        $(By.xpath("//button[@type='submit']")).click();
    }

}
