package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class ProteyAutoTests {
    @Test
    @Description("The first page success authorized")
    @DisplayName("Проверка успешной авторизации первой страницы")
    void enterTestSuccess() {
        step("Открываем файл 'qa-test", () ->
                open("C:\\Users\\temav\\IdeaProjects\\Protey\\qa-test.html"));

        step("Вводим почту", () ->
                $("#loginEmail").setValue("test@protei.ru"));

        step("Вводим пароль", () ->
                $("#loginPassword").setValue("test"));

        step("Нажимаем вход", () ->
                $("#authButton").click());
    }

    @Test
    @Description("Wrong auth email check")
    @DisplayName("Проверка авторизации с неправильным email")
    void wrongTestEmail() {
        step("Открываем файл 'qa-test", () ->
                open("C:\\Users\\temav\\IdeaProjects\\Protey\\qa-test.html"));

        step("Вводим почту", () ->
                $("#loginEmail").setValue("test@ru"));

        step("Нажимаем вход", () ->
                $("#authButton").click());

        step("Проверяем заголовок неверный email", () -> {
            String actualTitle = $("#invalidEmailPassword").getText();
            String expectedTitle = "Неверный E-Mail или пароль";

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Wrong auth password check")
    @DisplayName("Проверка авторизации с неправильным паролем")
    void wrongTestPassword() {
        step("Открываем файл 'qa-test", () ->
                open("C:\\Users\\temav\\IdeaProjects\\Protey\\qa-test.html"));

        step("Вводим почту", () ->
                $("#loginEmail").setValue("test@protei.ru"));

        step("Вводим пароль", () ->
                $("#loginPassword").setValue("test1"));

        step("Нажимаем вход", () ->
                $("#authButton").click());

        step("Проверяем заголовок неверный email", () -> {
            String actualTitle = $("#invalidEmailPassword").getText();
            String expectedTitle = "Неверный E-Mail или пароль";

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Missing email auth")
    @DisplayName("Проверка авторизации с отсутствующем email")
    void missingTestEmail() {
        step("Открываем файл 'qa-test", () ->
                open("C:\\Users\\temav\\IdeaProjects\\Protey\\qa-test.html"));

        step("Вводим почту", () ->
                $("#loginEmail").setValue(""));

        step("Вводим пароль", () ->
                $("#loginPassword").setValue("test"));

        step("Нажимаем вход", () ->
                $("#authButton").click());

        step("Проверяем заголовок неверный email", () -> {
            String actualTitle = $("#emailFormatError").getText();
            String expectedTitle = "Неверный формат E-Mail";

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Missing password auth")
    @DisplayName("Проверка авторизации с отсутствующим password")
    void missingTestPassword() {
        step("Открываем файл 'qa-test", () ->
                open("C:\\Users\\temav\\IdeaProjects\\Protey\\qa-test.html"));

        step("Вводим почту", () ->
                $("#loginEmail").setValue("test@protei.ru"));

        step("Вводим пароль", () ->
                $("#loginPassword").setValue(""));

        step("Нажимаем вход", () ->
                $("#authButton").click());

        step("Проверяем заголовок неверный email", () -> {
            String actualTitle = $("#invalidEmailPassword").getText();
            String expectedTitle = "Неверный E-Mail или пароль";

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Success auth with male sex")
    @DisplayName("Проверка успешной отправки второй анкеты с мужским полом")
    void successTestWithSexMale() {
        step("Открываем файл 'qa-test", () ->
                open("C:\\Users\\temav\\IdeaProjects\\Protey\\qa-test.html"));

        step("Вводим почту", () ->
                $("#loginEmail").setValue("test@protei.ru"));

        step("Вводим пароль", () ->
                $("#loginPassword").setValue("test"));

        step("Нажимаем вход", () ->
                $("#authButton").click());

        step("Вводим почту второй анкеты", () ->
                $("#dataEmail").setValue("test@protei.ru"));

        step("Вводим имя второй анкеты", () ->
                $("#dataName").setValue("test"));

        step("Вводим пол второй анкеты", () ->
                $("#dataGender").selectOption("Мужской"));

        step("Выбираем чекбокс второй анкеты", () ->
                $("#dataCheck12").click());

        step("Выбираем радиобатн второй анкеты", () ->
                $("#dataSelect22").click());

        step("Отправляем вторую анкету", () ->
                $("#dataSend").click());

        step("Проверяем добавление данных", () -> {
            $x("//div[text()='Данные добавлены.']").shouldBe(visible);
        });
    }

    @Test
    @Description("Success auth with female sex")
    @DisplayName("Проверка успешной отправки второй анкеты с женским полом")
    void successTestWithSexFemale() {
        step("Открываем файл 'qa-test", () ->
                open("C:\\Users\\temav\\IdeaProjects\\Protey\\qa-test.html"));

        step("Вводим почту", () ->
                $("#loginEmail").setValue("test@protei.ru"));

        step("Вводим пароль", () ->
                $("#loginPassword").setValue("test"));

        step("Нажимаем вход", () ->
                $("#authButton").click());

        step("Вводим почту второй анкеты", () ->
                $("#dataEmail").setValue("test@protei.ru"));

        step("Вводим имя второй анкеты", () ->
                $("#dataName").setValue("test"));

        step("Вводим пол второй анкеты", () ->
                $("#dataGender").selectOption("Женский"));

        step("Выбираем чекбокс второй анкеты", () ->
                $("#dataCheck12").click());

        step("Выбираем радиобатн второй анкеты", () ->
                $("#dataSelect22").click());

        step("Отправляем вторую анкету", () ->
                $("#dataSend").click());

        step("Проверяем добавление данных", () -> {
            $x("//div[text()='Данные добавлены.']").shouldBe(visible);
        });
    }

    @Test
    @Description("Auth with wrong email")
    @DisplayName("Проверка второй анкеты с неправильной почтой")
    void wrongTestEmailSecondPage() {
        step("Открываем файл 'qa-test", () ->
                open("C:\\Users\\temav\\IdeaProjects\\Protey\\qa-test.html"));

        step("Вводим почту", () ->
                $("#loginEmail").setValue("test@protei.ru"));

        step("Вводим пароль", () ->
                $("#loginPassword").setValue("test"));

        step("Нажимаем вход", () ->
                $("#authButton").click());

        step("Вводим почту второй анкеты", () ->
                $("#dataEmail").setValue("test@"));

        step("Вводим имя второй анкеты", () ->
                $("#dataName").setValue("test"));

        step("Вводим пол второй анкеты", () ->
                $("#dataGender").selectOption("Мужской"));

        step("Выбираем чекбокс второй анкеты", () ->
                $("#dataCheck12").click());

        step("Выбираем радиобатн второй анкеты", () ->
                $("#dataSelect22").click());

        step("Отправляем вторую анкету", () ->
                $("#dataSend").click());

        step("Проверяем добавление данных", () -> {
            String actualTitle = $("#emailFormatError").getText();
            String expectedTitle = "Неверный формат E-Mail";

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Auth with wrong password")
    @DisplayName("Проверка анкеты с неправильным паролем")
    void successTestNameWithExtraSymbolsSecondPage() {
        step("Открываем файл 'qa-test", () ->
                open("C:\\Users\\temav\\IdeaProjects\\Protey\\qa-test.html"));

        step("Вводим почту", () ->
                $("#loginEmail").setValue("test@protei.ru"));

        step("Вводим пароль", () ->
                $("#loginPassword").setValue("test"));

        step("Нажимаем вход", () ->
                $("#authButton").click());

        step("Вводим почту второй анкеты", () ->
                $("#dataEmail").setValue("test@protei.ru"));

        step("Вводим имя второй анкеты", () ->
                $("#dataName").setValue("!@#$%."));

        step("Вводим пол второй анкеты", () ->
                $("#dataGender").selectOption("Мужской"));

        step("Выбираем чекбокс второй анкеты", () ->
                $("#dataCheck12").click());

        step("Выбираем радиобатн второй анкеты", () ->
                $("#dataSelect22").click());

        step("Отправляем вторую анкету", () ->
                $("#dataSend").click());

        step("Проверяем добавление данных", () -> {
            $x("//div[text()='Данные добавлены.']").shouldBe(visible);
        });
    }

    @Test
    @Description("Auth with empty fields")
    @DisplayName("Проверка отправки второй анкеты с пустыми полями")
    void wrongTestEmptyFieldsSecondPage() {
        step("Открываем файл 'qa-test", () ->
                open("C:\\Users\\temav\\IdeaProjects\\Protey\\qa-test.html"));

        step("Вводим почту", () ->
                $("#loginEmail").setValue("test@protei.ru"));

        step("Вводим пароль", () ->
                $("#loginPassword").setValue("test"));

        step("Нажимаем вход", () ->
                $("#authButton").click());

        step("Вводим почту второй анкеты", () ->
                $("#dataEmail").setValue(""));

        step("Отправляем вторую анкету", () ->
                $("#dataSend").click());

        step("Проверяем добавление данных", () -> {
            String actualTitle = $("#emailFormatError").getText();
            String expectedTitle = "Неверный формат E-Mail";

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}
