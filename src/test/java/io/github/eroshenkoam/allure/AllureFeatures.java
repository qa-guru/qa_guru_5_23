package io.github.eroshenkoam.allure;

import io.qameta.allure.Feature;
import io.qameta.allure.LabelAnnotation;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface AllureFeatures {

    @Documented
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Feature("Issues")
    @ManualMember("baev")
    @AutoMember("eroshenkoam")
    @Component("Веб-интерфейс")
    @interface Issues {

    }

    @Documented
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Tags({@Tag("critical"), @Tag("web")})
    @Feature("Pull Requests")
    @ManualMember("user2")
    @AutoMember("user1")
    @Component("Веб-интерфейс")
    @interface PullRequests {

    }

    @Documented
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Tags({@Tag("critical"), @Tag("web")})
    @Feature("Milestones")
    @ManualMember("user2")
    @AutoMember("user1")
    @Component("Веб-интерфейс")
    @interface Milestones {

    }
}
