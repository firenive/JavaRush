package level7;

public class CheckURL {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        if (!url.startsWith("http")) return "неизвестный";
        String protocol = url.substring(0, url.indexOf(":"));
        return protocol;
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        String domain;
        if (url.endsWith("com") | url.endsWith("ru") | url.endsWith("net") | url.endsWith("org")) {
            domain = url.substring(url.indexOf(".") +1);
        } else return "неизвестный";

        return domain;
    }
}
