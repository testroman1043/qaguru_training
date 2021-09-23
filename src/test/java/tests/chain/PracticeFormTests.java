package tests.chain;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class PracticeFormTests {

  PracticeFormPage practiceFormPage = new PracticeFormPage();

  @Test
  void successfulFormFilling() {
    practiceFormPage
        .openPage()
        .fillForm()
        .checkData();
  }
}
