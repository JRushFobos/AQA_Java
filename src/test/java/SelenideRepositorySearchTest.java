package github;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;


public class SelenideRepositorySearchTest {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        Configuration.holdBrowserOpen = true;
    // Открыть главную страницу
        Selenide.open("https://github.com");
    // Ввести в поле ввода selenide и нажать enter
        Selenide.$("[data-target='qbsearch-input.inputButtonText']").click();
        Selenide.$("[data-target='query-builder.input']").setValue("selenide").pressEnter();
    //
        Selenide.sleep(5000);


    // Кликнуть на первый репозиторий из списка найденных
    // Проверка заголовка selenide/selenide


    }
}
