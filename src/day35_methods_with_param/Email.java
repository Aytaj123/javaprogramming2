package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("Nadir", "FannieMae");
        buildEmail("Kareem", "Aytaj");
    }
    public static void buildEmail(String name, String domain){
        name = name.replace(" ","_");
        domain = domain.toLowerCase();
        String email = name + "@" + domain + ".com";
        System.out.println("email = " + email);


    }

}
