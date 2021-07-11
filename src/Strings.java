import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

        String intro = "My name is Chamin Kim, I go to HKIS.";
        System.out.println(intro.replaceAll("HKIS", "HKU"));
        System.out.println(intro.indexOf("Chamin"));
        System.out.println(intro.replaceAll("Chamin", "Seungmin"));

        String fullName = "Chamin Kim";
        String firstName = fullName.substring(0, 6);
        String lastName = fullName.substring(7);
        System.out.println(firstName);
        System.out.println(lastName.toUpperCase());

        String contentWithQuotationMark = "Hello my name is \"Chamin\" \nHello Java";
        System.out.println(contentWithQuotationMark);
    }
}
