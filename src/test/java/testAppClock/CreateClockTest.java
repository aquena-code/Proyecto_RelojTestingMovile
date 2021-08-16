package testAppClock;

import activitiesClockApp.MainActivity;
import activitiesClockApp.SearchCityActivity;
import controlAppium.Label;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

import java.net.MalformedURLException;
import java.util.List;

public class CreateClockTest {
    private MainActivity mainActivity = new MainActivity();
    private SearchCityActivity searchCityActivity = new SearchCityActivity();

    @AfterEach
    public void cleanup() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
    @Test
    public void verifyCreateNewClock() throws MalformedURLException {
        mainActivity.clockMenuButtom.click();
        mainActivity.cityAddButton.click();
        searchCityActivity.searchTextBox.click();
        searchCityActivity.searchTextBox.setValue("Paris");
        searchCityActivity.searchTextBox.click();
        searchCityActivity.elementListSearch.click();

        String cityActual = mainActivity.cityCreated.getControl().getText()+"";
        Assertions.assertEquals("Paris", cityActual,"ERROR! Not was created the Clock!!");
    }
}
