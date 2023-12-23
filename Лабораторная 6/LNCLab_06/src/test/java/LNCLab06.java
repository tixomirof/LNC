import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class LNCLab06 {

    @Test
    public void LabTest(){
        open("https://duckduckgo.com/");
        $x("//input[@name='q']")
                .setValue("Тихомиров Алексей Константинович")
                .pressEnter();
        $x("//div[@class='dropdown  dropdown--safe-search ']")
                .shouldBe(Condition.visible);
    }
}
