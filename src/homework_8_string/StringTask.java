package homework_8_string;

public class StringTask {
    public static final String GREETING = "Hey, my name is %s, and I'm %d years old";

    public static void main(String[] args) {
        String s = "Hey how are you";

        //print the length of the string
        System.out.println(s.length());

        //print the last char of the string (use the previous method to calculate the index - do not use hardcoded indexes)
        System.out.println(s.charAt(s.length() - 1));

        //print the index of 'a'
        System.out.println(s.indexOf('a'));

        //substirng the string by the second space " " - result should be "Hey how"
        int sub = s.indexOf(" ");
        int sub1 = s.indexOf(" ", sub + 1);
        System.out.println(s.substring(0, sub1));

        //check if the string start with 'h', with 'H', end with '\'
        System.out.println(s.startsWith("h"));
        System.out.println(s.startsWith("H"));
        System.out.println(s.endsWith("'\'"));

        //check if the string contains "are you" contains "are you "
        System.out.println(s.contains("are you"));

        //replace "how" to "who"
        System.out.println(s.replace("how", "who"));

        //split the string via space " " and print each word from the new line
        String[] array = s.split(" ");
        for (String text : array) {
            System.out.println(text);
        }

        //create the method that takes String and char parameters and return the quantity of letters that exist in that string
        int count = getCharQuantityInTheString("Hey how are you", 'o');
        System.out.println(count);

        //create the greeting method that takes name and age and print the string - "Hey, my name is Andrii, and I'm 41 years old"
        // (Use String.format function)
        greeting("Nikolay", 31);
    }

    public static int getCharQuantityInTheString(String s, char c) {
        int quatityLetter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                quatityLetter++;
        }
        return quatityLetter;
    }

    public static void greeting(String name, int age) {
        String gret = String.format(GREETING, name, age);
        System.out.println(gret);
    }
}
