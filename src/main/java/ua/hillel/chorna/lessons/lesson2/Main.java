package ua.hillel.chorna.lessons.lesson2;

public class Main {
    public static void main(String[] args) {
        byte age;
        age = 55;
        System.out.println(age);

        byte age2 = 25;
        System.out.println(age2);

        age2 = 35;
        System.out.println(age2);

        // byte: -128/127
        // short: -+32000
        // int: -+2 billion
        // long: -+9 billion

        short shortVariable = 31000;
        System.out.println(shortVariable);

        int intVariable = 300000000;
        System.out.println(intVariable);

        long longVariable = 30000000000L; //'l' or 'L' in the end
        System.out.println(longVariable);


        float floatVariable = 1.1234567890F; //'f' or 'F' in the end
        double doubleVariable = 1.1234567890;
        System.out.println(floatVariable);
        System.out.println(doubleVariable);

        // char: 0/65536 (only 1 symbol)

        char charA = 'A';
        char charA2 = 65; // ASCII table - latin letters in upper case
        char charA3 = 66;
        System.out.println(charA);
        System.out.println(charA2);
        System.out.println(charA3);

        // '\u0070' - знак градуса

        // logical(boolean): true/false
        boolean isOK = true;
        boolean notOK = false;
        System.out.println(isOK);
        System.out.println(notOK);

        // String
        String str = "Hello!";
        String str2 = new String ("Hello"); // new string object
        System.out.println(str);

        // stack memory (fast but limited) - all variables for primitive data types
        // heap memory (all operative memory but slow) - for reference data types
        // Heap memory has STRING POOL (where String data (and other) is contained)

        System.out.println(str + longVariable); // concatenation - if we add sth to a String, we receive a String
        System.out.println(str + " " + longVariable + " " + charA2);

        System.out.println();
        System.out.println();

        System.out.println(age2 + age + str); // arithmetic operation + string (90Hello!)
        System.out.println(str + age2 + age); // string and stuck numbers without arithmetic action(Hello!3555)
        // operation priority: using дужки
        System.out.println(str + (age2 + age)); // Hello!90
        System.out.println(age2 + (age + str)); // 3555Hello!

        // кастування
        byte demoByte = 125;
        short demoShort = demoByte;
        System.out.println(demoShort); // 125

        int demoInt = demoShort;
        System.out.println(demoInt); // 125
        int demoInt2 = demoByte;
        System.out.println(demoInt2); // 125

        double demoDouble = demoInt;
        System.out.println(demoDouble); // 125.0

        // forced кастування
        byte byteVariable = 127;
        System.out.println(byteVariable);

        byte byteVariable2 = (byte) 128;
        System.out.println(byteVariable2);

        double doubleDemo = 55.123;
        demoInt = (int) doubleDemo;
        System.out.println(demoInt); // 55
    }
}
