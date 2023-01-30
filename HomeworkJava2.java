/*1) Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
2) Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
3) *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
4) Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
Используем метод StringBuilder.append().
5) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
6) *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
7) **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.*/





public class HomeworkJava2 {

    public static String reverseRecurs(String str)
    {
        if (str == null || str.equals("")){
            return str;
        }
        return reverseRecurs(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        //Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
        //Используем метод StringBuilder.append().

        int a = 3;
        int b = 56;

        StringBuilder sum = new StringBuilder();
        sum
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ")
                .append(a + b);
        System.out.println(sum);

        StringBuilder dif = new StringBuilder();
        dif
                .append(a)
                .append(" - ")
                .append(b)
                .append(" = ")
                .append(a - b);
         System.out.println(dif);

         StringBuilder mult = new StringBuilder();
        mult
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ")
                .append(a * b);
        System.out.println(mult);

        StringBuilder div = new StringBuilder();
        div
                .append(a)
                .append(" / ")
                .append(b)
                .append(" = ")
                .append((float)a / b);
        System.out.println(div);

        // Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt()

        sum.insert(8, "равно");
        sum.deleteCharAt(7);
        System.out.println(sum);

        dif.insert(8, "равно");
        dif.deleteCharAt(7);
        System.out.println(dif);

        mult.insert(8, "равно");
        mult.deleteCharAt(7);
        System.out.println(mult);

        div.insert(8, "равно");
        div.deleteCharAt(7);
        System.out.println(div);

        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

        System.out.println(sum.replace(7, 12, "равно"));
        System.out.println(dif.replace(7,12, "равно"));
        System.out.println(mult.replace(7, 12, "равно"));
        System.out.println(div.replace(7, 12, "равно"));


        //Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

        long start = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "=";
        }
        System.out.println(str);

        long end = System.currentTimeMillis();
        System.out.println("Время выполнения первого цикла: " + (end - start));

        long start1 = System.currentTimeMillis();

        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            str1.append("=");
        }
        System.out.println(str1);

        long end1 = System.currentTimeMillis();
        System.out.println("Время выполнения второго цикла: " + (end1 - start1));

        System.out.println("Разница: " + ((end - start) - (end1 - start1)));


        // Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

        String s = "10, 50, 700";
        StringBuilder s1 = new StringBuilder("1, 500, 70");
        System.out.println(s.toString().equals(s1.toString()));

        //  Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

        s1 = s1.reverse();
        System.out.println(s1);
        System.out.println(s.toString().equals(s1.toString()));

        //Напишите программу, чтобы перевернуть строку с помощью рекурсии.

        System.out.println(reverseRecurs(s));


    }

}
