public class methodsOfString {
    public static void main(String[] args) {
        String message="  I like Java!!!    ";
        System.out.println("We are working with phrase - "+message);
        System.out.println("The last letter - "+message.charAt(message.length()-1));
        System.out.println("The message ends with !!! ? - "+message.endsWith("!!!"));
        System.out.println("The message starts with I lik ? - "+message.startsWith("I like"));
        System.out.println("Method strip()/trim() - "+message.strip());
        System.out.println("Method trim() - "+message.trim());
        System.out.println("message.contains(\"Java\") = " + message.contains("Java"));
        System.out.println("\"Java\" has index № "+message.lastIndexOf("Java"));
        System.out.println("message.replace('a','o') = " + message.replace('a', 'o'));
        System.out.println("message.toLowerCase() = " + message.toLowerCase());
        System.out.println("message.toUpperCase() = " + message.toUpperCase());
        System.out.println("message.replace('java','piton') = " + message.replace("Java", "piton"));
        System.out.println("Using method substring - "+message.substring(0,message.lastIndexOf("Java")));
        System.out.println("message.replace(\"Java\",\"\") = " + message.replace("Java", ""));
        System.out.println("message.lastIndexOf(6) = " + message.lastIndexOf('a'));
    }
}
