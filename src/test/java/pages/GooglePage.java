package pages;

public class GooglePage extends BasePage {

    private String searchBoton = "(//input[@value='Buscar con Google' and @type='submit' and @role='button'])[1]";
    private String searchTextField = "//textarea[@id='APjFqb']";
    private String firstResult = "(//h3[text()='Google'])[1]";

    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
    }

    public void clickGoogleSearch() {
        clickElement(searchBoton);
    }

    public void enterSearchCriteria(String criteria) {
        write(searchTextField, criteria);
    }

    public String firstResult() {
        return textFromElement(firstResult);
    }

}
