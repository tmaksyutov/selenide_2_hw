import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GitHubTest {

    @Test
    @DisplayName("Проверка открытия раздела Enterprise на GitHub")
    public void checkPageLabel(){
        open("https://github.com/");
    }
}
