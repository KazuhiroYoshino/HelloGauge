import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Assert;

public class VerifyImplementation {
    @Step("タイトルに<title>が設定されていること")
    public void checkTitle(String title) {
        Assert.assertEquals(title, Driver.webDriver.getTitle());
    }
}
