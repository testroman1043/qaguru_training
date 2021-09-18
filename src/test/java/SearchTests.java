import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SearchTests {
  double a=0.1;
  double b=0.2;

//  @Test
  void selenideSearchTest() {
    open("https://www.google.com/");

    $(byName("q")).setValue("Selenide").pressEnter();

    $("#search").shouldHave(text("selenide.org"));
  }


  @Test
  void testAd(){

    double c = a+b-b;
    System.out.println("Вот сколько будет" +c);
    assertTrue(a +b-b==0.1);
  }
}