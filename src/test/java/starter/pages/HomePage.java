package starter.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {

    HomeActionPage homeActionPage;

    @Step
    public void verifyHome()
    {
        homeActionPage.validateHomePage();
    }
}
