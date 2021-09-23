package tests;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;

public class GitHubPageTests {
  @Test
  void gitHubTest(){
    open("https://github.com/");
    $x("//input[@name='q']").setValue("selenide").pressEnter();
    $x("//a[@href='/selenide/selenide']").click();
    $x("//a[@id='wiki-tab']").click();
    $$x("//li[contains(@class, 'Box-row')]//a[text()='SoftAssertions']").shouldHaveSize(1);








  }

}
