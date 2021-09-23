package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SearchTests {

  //  @Test
  void selenideSearchTest() {
    open("https://www.google.com/");

    $(byName("q")).setValue("Selenide").pressEnter();

    $("#search").shouldHave(text("selenide.org"));
  }
}


