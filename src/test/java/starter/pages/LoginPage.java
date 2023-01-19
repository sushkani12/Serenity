package starter.pages;

import net.thucydides.core.annotations.Step;

public class LoginPage {

    LoginActionPage loginActionPage;

    @Step
    public void openApplicatipon()
    {
        loginActionPage.open();
    }
    @Step
    public void enterUserName(String userName)
    {
        loginActionPage.userName(userName);
    }
    @Step
    public void enterPassword(String password)
    {
        loginActionPage.password(password);
    }
    @Step
    public void login()
    {
        loginActionPage.loing();
    }
}
