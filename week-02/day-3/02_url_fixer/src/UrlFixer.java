public class UrlFixer {
    public static void main(String... args){
        String url = "https/www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds");
        String correctUrl = url.substring(0,5) + ":/" + url.substring(5,url.length());

        //StringBuilder correctUrl = new StringBuilder(url).insert(5, ":/");

        System.out.println(correctUrl);
    }
}