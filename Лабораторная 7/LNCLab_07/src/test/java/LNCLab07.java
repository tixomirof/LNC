import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LNCLab07 {
    @Test
    public void Test1_OpenNews() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_news']")
                .click();
        $x("//div[@class='page-header block separator js_top_toolbar']")
                .shouldBe(Condition.text("Новости Иркутска"));
    }

    @Test
    public void Test2_OpenStates() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_posts']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("Cтатьи"));
    }

    @Test
    public void Test3_OpenEvents() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_afisha']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("Мероприятия и события в Иркутске"));
    }

    @Test
    public void Test4_OpenAdBoard() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_used']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("Доска объявлений в Иркутске"));
    }

    @Test
    public void Test5_OpenWork() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_vacancy']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("Работа в Иркутске"));
    }

    @Test
    public void Test6_OpenMarket() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_market']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("Компании, товары и услуги в Иркутске"));
    }

    @Test
    public void Test7_OpenWebcams() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_webcams']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("Веб камеры в Иркутске"));
    }

    @Test
    public void Test8_OpenPhotos() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_photosoc']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("Фото в Иркутске"));
    }

    @Test
    public void Test9_OpenRadios() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_radio']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("Радио online"));
    }

    @Test
    public void Test10_OpenStat() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_stat']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("Опрос населения"));
    }

    @Test
    public void Test11_OpenSights() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_sights']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("Достопримечательности Иркутска"));
    }

    @Test
    public void Test12_OpenPhones() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_phones']")
                .click();
        $x("//div[@class='page-header block ']")
                .shouldBe(Condition.text("Телефоны городских служб"));
    }

    @Test
    public void Test13_OpenGKH() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_gkh']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("ЖКХ Иркутска"));
    }

    @Test
    public void Test14_OpenMeters() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_meter']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.text("Показания счетчиков"));
    }

    @Test
    public void Test15_LogIn_LogOut() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@class='main bg-color-main a white']")
                .click();
        $x("//input[@id='email']")
                .setValue("stud0000267820@study.utmn.ru");
        $x("//input[@id='password']")
                .setValue("гпЗ7мфдвУ");
        var res = $x("//button[@type='submit']");
        executeJavaScript("arguments[0].click()", res);
        $x("//div[@class='color-main']")
                .shouldHave(Condition.text("Добрый день, Лекс Ти!"));

        // logging out
        var logoutBtn = $x("//a[@href='http://irkutsk.holme.ru/logout/']");
        logoutBtn.click();
        $x("//div[@class='color-main']")
                .shouldHave(Condition.text("Добрый день, рады вас видеть!"));
    }

    @Test
    public void Test16_AddMarketFilter() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_market']")
                .click();
        $x("//span[@class='grey icon-drop-down']")
                .click();
        $x("//a[@href='/market/catalog/56bd0e47ca3fda206a5626e8/']")
                .click();
        $x("//a[@class='bg-icon grey icon-close']")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text("Бизнес"));
    }

    @Test
    public void Test17_TryAddRCToFavoriteNotLoggedIn() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_gkh']")
                .click();
        $x("//a[text()='Показать все УК']")
                .click();
        $x("//a[@href='/uk/5a315918c7d6045057a8c2c2/']")
                .click();
        $x("//span[@class='btn js_uk_favorite']")
                .click();
        $x("//span[@class='js_layout-alert__btn-ok btn hidden']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text("Войти"));
    }

    @Test
    public void Test18_TryToCommentNewNotLoggedIn() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_news']")
                .click();
        $$(By.className("js_news_list_block"))
                .get(0)
                .find(By.cssSelector("a"))
                .click();
        $x("//span[@id='comments_no_auth']")
                .click();
        $x("//span[@class='js_layout-alert__btn-ok btn hidden']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text("Войти"));
    }

    @Test
    public void Test19_Rzhaka() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_photosoc']")
                .click();
        $$x("//div[@class='photos js_block1 block1']")
                .get(0)
                .click();
        var smilesLine =
                $x("//div[@class='js_smile_count js_smile_count_line count ']");
        var currentSmiles = 0;
        try {
            currentSmiles = Integer.parseInt(smilesLine.getText());
        } catch (NumberFormatException e) {
            currentSmiles = 0;
        }
        $x("//div[@class='smile-wrapper js_smile_vote js_smile_vote_line']")
                .click();
        smilesLine.shouldHave(Condition.text(String.valueOf(currentSmiles + 1)));
    }

    @Test
    public void Test20_TryCommentStateNotLoggedIn() {
        open("http://irkutsk.holme.ru/");
        $x("//a[@id='mainMenuDesktop_posts']")
                .click();
        $x("//a[@href='/posts/5f870350c5ef1e6ef8c76118/']")
                .click();
        $x("//span[@id='comments_no_auth']")
                .click();
        $x("//span[@class='js_layout-alert__btn-ok btn hidden']")
                .click();
        $x("//div[@class='page-header block separator']")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text("Войти"));
    }
}