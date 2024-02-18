package Lab.day6_lab;

public class lab6_4 {
    /*
    LAB 6.4
    String url = "https://google.com";
    Check http OR https; domain name, .com OR .net
    */
    public static void main(String[] args) {

        String url = "https://google.com/test";
        checkURL(url);

    }

    private static void checkURL(String url) {
        String  protocol;
        if(url.startsWith("https://")){
            protocol= "https";
        }else if(url.startsWith("http://"))
        {
            protocol = "http";
        }
        else protocol = "Unknown protocol";
        System.out.printf("Protocol: %s\n", protocol);

//        String prot = url.startsWith("https://") ? "https" : url.startsWith("http://") ? "http" : "Unknown protocol";

        String domain = "";
        if (url.contains("://")) {
            domain = url.substring(url.indexOf("://") + 3);
            if (domain.contains("/")) {
                domain = domain.substring(0, domain.indexOf("/"));
            }
            System.out.println("Domain name: " + domain);
        }

        // check .com OR .net
        if (domain.endsWith(".com")) {
            System.out.println("The URL ends with:.com");
        } else if (domain.endsWith(".net")) {
            System.out.println("The URL ends with: .net");
        } else {
            System.out.println("The URL does not end with .com or .net");
        }
    }
}
