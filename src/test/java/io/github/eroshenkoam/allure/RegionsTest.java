package io.github.eroshenkoam.allure;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RegionsTest {

    @DisplayName("Проверка региона")
    @ParameterizedTest(name = "{displayName}")
    @CsvSource({
            "Москва,Московская область",
            "Санкт-Петербург,Ленинградская область",
            "Череповец, Вологодская область"
    })
    public void testRegion(String city, String region) {
        Allure.parameter("Город", city);
        Allure.parameter("Регион", region);
        //...
    }

    @Test
    @ManualMember("baev")
    @AutoMember("eroshenkoam")
    @DisplayName("Проверка работы секции Members")
    public void testMembers() {
    }

    @Test
    @Component("База данных")
    @DisplayName("Проверка работы секции Fields")
    public void testCustomFields() {
    }

    @Test
    @Tags({@Tag("critical"), @Tag("web")})
    @DisplayName("Проверка работы секции Tags")
    public void testTags() {
    }

    @Test
    @io.github.eroshenkoam.allure.Tags({"qaguru", "web"})
    @DisplayName("Проверка работы секции Tags")
    public void testngTags() {
    }

    @Test
    @AllureFeatures.Issues
    @Tags({@Tag("critical"), @Tag("web")})
    @DisplayName("Проверка работы секции Tags")
    public void testBigAnnotation() {
    }

}
