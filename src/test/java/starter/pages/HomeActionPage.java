package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class HomeActionPage extends PageObject {


    public void validateHomePage()
    {
        String title=getDriver().getTitle();
        Assert.assertEquals("OrangeHRM",title);
    }
}
