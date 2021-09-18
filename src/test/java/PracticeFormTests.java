import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import java.io.File;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PracticeFormTests {
  @Test
  void testFillPracticeForm(){
    String fistName = "Roman";
    String lastName = "Foorman";
    String eMail = "asd@asd.com";
    String mobile = "1234567890";
    String dayOfBirth = "12";
    String mounthOfBirth = "June";
    String yearOfBirth = "2006";
    String subjectsContainer = "Arts";
    File image = new File("src/test/resources/img/37m.jpeg");
    String absolutePath = image.getAbsolutePath();
    String currentAddress = "My Adress";
    String city = "Noida";
    String state = "NCR";
    String gender = "Male";
    String hobby = "Reading";
    String photoName = "37m.jpeg";

    Configuration.startMaximized=true;
    open("https://demoqa.com/automation-practice-form");
    $("#firstName").setValue(fistName);
    $("#lastName").setValue(lastName);
    $("#userEmail").setValue(eMail);
    $(By.xpath("//label[text()='Male']")).click();
    $("#userNumber").setValue(mobile);
    $("#dateOfBirthInput").click();
    $(".react-datepicker__month-select").selectOptionContainingText(mounthOfBirth);
    $(".react-datepicker__year-select").selectOptionByValue(yearOfBirth);
    $(By.xpath("//*[text()='"+dayOfBirth+"']")).click();
    $("#subjectsInput").setValue(subjectsContainer);
    $("#subjectsInput").pressEnter();
    $(By.xpath("//label[text()='Reading']")).click();
    $("#uploadPicture").setValue(absolutePath);
    $("#currentAddress").setValue(currentAddress);
    $("#state").click();
    $(By.xpath("//*[text()='"+state+"']")).click();
    $("#city").scrollIntoView(true);
    $("#city").click();
    $(By.xpath("//*[text()='"+city+"']")).click();
    $("#submit").click();


    //Assertions
    $(By.xpath("//tr/td[text()='Student Name']/following-sibling::td")).shouldHave(text(fistName+" "+lastName));
    $(By.xpath("//tr/td[text()='Student Email']/following-sibling::td")).shouldHave(text(eMail));
    $(By.xpath("//tr/td[text()='Gender']/following-sibling::td")).shouldHave(text(gender));
    $(By.xpath("//tr/td[text()='Mobile']/following-sibling::td")).shouldHave(text(mobile));
    $(By.xpath("//tr/td[text()='Date of Birth']/following-sibling::td")).shouldHave(text(dayOfBirth +" "+ mounthOfBirth+","+yearOfBirth));
    $(By.xpath("//tr/td[text()='Subjects']/following-sibling::td")).shouldHave(text(subjectsContainer));
    $(By.xpath("//tr/td[text()='Hobbies']/following-sibling::td")).shouldHave(text(hobby));
    $(By.xpath("//tr/td[text()='Picture']/following-sibling::td")).shouldHave(text(photoName));
    $(By.xpath("//tr/td[text()='Address']/following-sibling::td")).shouldHave(text(currentAddress));
    $(By.xpath("//tr/td[text()='State and City']/following-sibling::td")).shouldHave(text(state+" "+city));















  }

}
