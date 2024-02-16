package ua.hillel.chorna.lessons.lesson4;

public class ArithmeticOps {
    public static void main(String[] args) {
        System.out.println(5+10);

        int a = 5;
        int b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);

        System.out.println(10 / 3); // кастується до int
        System.out.println(10.0 / 3);
        System.out.println(10 / 3.0);
        System.out.println(10.0 / 3.0);
        System.out.println(10D / 3);
        System.out.println((double) b / a);
        System.out.println(b / (double) a);
        System.out.println((double) b / (double) a);

//        There are two types of comments:
//        Ctrl+/

//        /*......
//        .....*/

//        Залишок від ділення: %
        System.out.println(8 % 3); // 2 * 3 = 6, and 8 - 6 = 2 (result = 2)
        System.out.println(10 % 6);//4 6 * 1 = 6 and 10 - 6 = 4


        System.out.println(3 % 1111);// result = 3 (the first number if no action can be taken)

//        transferring to another string: \n
//        4 spaces: \t
//        viewing very lon string = use + and Enter (concatenation)


//        скорочені оператори
        int x = 10;
        int y = x + 5;
        x = y; // not a great option
        System.out.println(x); //15

        x = x + 5;
        System.out.println(x); //20

        x += 5;
        System.out.println(x);//25

//        +=   -=   *=   /=   %=

//        increments / decrements

        int incr = 10;
        incr += 1; //11
        incr++; //we can add ONLY 1
        System.out.println(incr); //12

        int decr = 10;
        decr -= 1;
        decr--;
        System.out.println(decr);

//        prefix / postfix
        ++incr;
        System.out.println(incr); //13
//        incr++ спочатку віддаємо значення, а потім - інкремент
//        ++incr спочатку іткремент, а потім - віддаємо

        int ab = 5;
        int ac = 2;
        int result = ab++ + ++ab - --ac;
        System.out.println("result = " + result); // 11
        System.out.println("ab = " + ab); // 7
        System.out.println("ac = " + ac); // 1

        int ad = 5;
        int ae = 2;
        int result2 = ad++ + ae++ + --a;
        System.out.println("result = " + result2); // 11
        System.out.println("ad = " + ad); // 6
        System.out.println("ae = " + ae);// 3

        // class Math // зажимаємо Ctrl + наводимо на нього + клікаємо лівою мишою

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.abs(10));//absolute number - модуль числа - передаєм від'ємне, а отримуємо додатнє
        int absValue = Math.abs(10);
        System.out.println(absValue);



        System.out.println(Math.pow(3, 2));// зведення до степеня - 3 до степеня 2 (9) // приймає значення double


        System.out.println(Math.sqrt(16)); // корінь квадратний - буде 4 // double


        System.out.println(Math.round(16.55));// приймає дробове число і віддвє округлене = 17// але не просто відкидає числа після крапки, а округлює в меншу чи більшу сторону


        System.out.println(Math.max(11, 5)); // приймає 2 значення і повертає найбільше з них


        System.out.println(Math.min(6, 78));// протилежне попередньому

        System.out.println(Math.random());//тільки віддає значення, а НЕ приймає - генерує нове випадкове число - від 0.0 до найбільшого числа,яке менше від 1
        // щоб згенерувати цілі числа:
        System.out.println((int) (Math.random() * 10));// from 0 to 10 - надаємо пріоритет операції множення на 10, а потім кастуємо в int

        // якщо хочемо від 0 до 10 - вводимо 11 (бо 9.999999 після кастування - це 9)
        // інший варіант - Math.round:
        System.out.println(Math.round(Math.random() * 10));


        //from 15 to 30 - формула:
        int min = 15;
        int max = 30;
        int resultRand = (int) (Math.random () * (max - min + 1) + min);
        System.out.println((int) ((Math.random() * 16) + 15));
        System.out.println(resultRand);

    }
}
