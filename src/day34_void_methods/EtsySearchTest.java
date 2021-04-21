package day34_void_methods;

//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class EtsySearchTest {
    public static void main(String[] args) {

        System.out.println("-----Starting Etsy search smoke test-----");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("-----Etsy search smoke test is completed-----");
    }

    public static void openBrowser() {
        System.out.println("1. Launching the Chrome browser");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("2. Navigate to etsy - https://www.etsy.com/");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("3. Search for a wooden spoon");
    }
    public static void verifyResultsAreDisplayed() {
        System.out.println("4. Verify results");
    }


}
