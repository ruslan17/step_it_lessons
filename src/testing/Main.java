package testing;

import java.util.Scanner;


public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*Задание 1
Числа Фибоначчи – это последовательность чисел, в ко-
торой два первых числа последовательности равны 0 и 1, а
каждое последующее число равно сумме двух предыдущих.
Показать на экране все числа Фибоначчи в диапазоне от
0 до 10 000 000. */
        /*int fib = 0;
        int a = 0;
        int b = 1;
        int i=0;
        while (fib<10000000) {
            if (i == 0) {
                fib = 0;
            } else if (i == 1) {
                fib = 1;
            } else {
                fib = a + b;
                a = b;
                b = fib;
            }
            System.out.print(fib + "  \t");
            if (i%5==0){
                System.out.println();
            }
            i++;
        }
*/

        //2. prostie cisla ot 2 do 1 000 000
        /*boolean flag = false;
        for (int i = 2; i < 1000000; i++) {
            if (i / 2 != 0 || i == 2) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    System.out.print(i + "  ");
                }
                flag = false;


            }
        }

*/
        /*Задание 3/ Самовлюблённое число или число Армстронга – натураль-
ное число, которое равно сумме своих цифр, возведенных
в степень, равную количеству его цифр.
Показать на экране все числа Армстронга в диапазоне от
10 до 1 000 000.
Например:6
153 = 1^3 + 5^3 + 3^3*/
        /*int num = 10;
        while (num < 1000000) {
            // сначала определяем сколько цифр в одном числе
            int count = howManyDigits(num);
            int copy = num;// kopiya cisla , shtobi ne portit samo cislo.
            int sum = 0;
            while (copy != 0) {

                sum = sum + cube(copy % 10);
                copy = copy / 10;

            }
            if (num == sum) {
                System.out.println(sum);
            }
            num++;
        }
*/
        /*Задание 4
Совершенное число – натуральное число, равное сумме всех
своих собственных делителей (то есть всех положительных
делителей, отличных от самого числа).
Показать на экране все совершенные числа в диапазоне от
0 до 1 000 000.
Примеры:
1-е совершенное число: 6 имеет следующие собственные
делители – 1, 2, 3; их сумма равна 6.
2-е совершенное число: 28 имеет следующие собственные
делители: – 1, 2, 4, 7, 14; их сумма равна 28.*/
 /*       int number = 6;
        int sum = 0;
        int divider = 0;
// ya beru cisla,  nacinaya ot 2, tak kak 0 delitsa ni na shto krome seba,
//tak je kak i 1 delitsa tolko na seba i na nol delit nelza.
        while (number < 1000000) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                System.out.println(number);
            }
            number++;
            sum=0;
        }
*/
        /*Задание 5
        Напишите программу, которая будет проверять, является
        ли число, введенное с клавиатуры палиндромом (одинаково
                читающееся в обоих направлениях). Например, 123454321
        или 221122 – палиндром. Программа должна вывести YES,
        если число является палиндромом, и NO – в противополож-
                ном случае.
    */

        /*System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int new_number = 0;
        int copy = number;
        int ten = 1;
        //eta cast umnojaet vozvodit 10 v stepen kolicestva cifr vvedennoqo cisla
        for (int i = 0; i < howManyDigits(copy) - 1; i++) {
            ten = ten * 10;
        }
        // formiruem novoe cisla, berem ostatok s konca, umnojaya na 10 v stepeni kolicestva cifr.
        while (copy != 0) {
            new_number = new_number + (copy % 10) * ten;
            ten = ten / 10;
            copy = copy / 10;
        }
        //proverka, ravni li cisla
        if (new_number == number) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
*/
        /*ne dodelano
        Задание 6
        Вывести на консоль все восьмизначные числа, цифры в
        которых не повторяются. Эти числа должны делиться на
        12345, без остатка. Показать общее количество найденных
        чисел.


        int[] arr = new int[8];// massiv dla zapisi cifr cisla
        int j = 0; //scetchik dla massiva
        while (copy != 0) {
            arr[j] = copy % 10;
            copy = copy / 10;
            System.out.print(arr[j] + " ");
            j++;
        }
        int compare = arr[0];
        int k = 0;
        while (k < arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (compare == arr[i]) {
                    count++;
                }


            }


            k++;
        }
*/


/*Задание 7
Показать битовое представление значения переменной
типа int, используя только один цикл, управляющую пере-
менную, вывод на консоль и битовые операции.
Не использовать строки и любые другие готовые функ-
ции (методы).
*/
        /*System.out.println("Vvedite cislo: ");
        int number = sc.nextInt();
        int bit = 0;
        int power = 1;
        while (number != 0) {
            bit = bit + (number % 2) * power;
            number = number / 2;
            power = power * 10;


        }
        System.out.println("Bitovoe predstavlenie=  " + bit);1
*/
/*Задание 8
Электронные часы показывают время в формате от 00:00
до 23:59. Написать программу, которая выведет на консоль
сколько раз за сутки случается так, что слева от двоеточия
показывается симметричная комбинация для той, что спра-
ва от двоеточия (например, 02:20, 11:11 или 15:51). Вывести
на экран все симметричные комбинации. Вывести общее
число комбинаций. */
/*
// переменная для записи преобразованного значения часов для сравнения с минутами
        int counthour = 0;
        // счетчик для симметричных значений
        int symmetry=0;
        for (int hour = 0; hour <  24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                //нули  не сравниваем, сразу выписываем, остальные все значения сравниваются
                if (hour == 0 && minute == 0) {
                    System.out.println("0" + hour + ":0" + minute);
                    symmetry++;
                }
                // если число меньше 10, например 5, то для сравнения например с 50,
                // нужно чтобы компилятор видел это число как 50 после преобразования

                if (hour < 10 && hour != 0) {
                    counthour = hour + 9 * hour;
                }
                // если же число больше 10, то просто преобразовываем, то есть переворачиваем число,
                //записывая в новую переменную
                else if (hour >= 10) {
                    counthour = (hour % 10) * 10 + hour / 10;
                }
                // здесь идет уже сравнения для распечатки симметричных значений
                if (counthour == minute && hour != 0 && minute != 0) {
                    symmetry++;
                    if (hour < 10)
                        // нули мы добавляем для того чтобы выглядело эстетично,
                        //  то есть не было просто 2:02 например
                        System.out.println("0" + hour + ":" + minute);
                    else if (minute < 10 && minute != 0) {
                        System.out.println(hour + ":0" + minute);
                    } else {
                        System.out.println(hour + ":" + minute);
                    }
                }


            }
        }
        System.out.println("Kolicestvo simmetricnix znaceniy= "+symmetry);
*/




/*Задание 9
Если перечислить все натуральные числа меньше 10, крат-
ные 3 или 5, мы получаем 3, 5, 6 и 9. Сумма этих кратных – 23.
Найдите сумму всех чисел, кратных 3 или 5, начиная с 0
и до 1 000*/
        /*int i = 1;
        int count = 0;
        int sum=0;
        while (i <= 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                sum=sum+i;
            }
            i++;
        }
        System.out.println("Sum= "+sum);
    */
     /*   Задание 10
        2520 – наименьшее число, которое можно разделить на
        каждое из чисел от 1 до 10, без остатка. Написать програм-
        му, которая рассчитывает наименьшее положительное чис-
        ло, которое делится на все числа от 1 до 20.
*/
   /*     int i = 1; // cislo, kotoroe mi proveraem
        int count = 0; // scitaem na skolko iz cisel ot 1 do 20 delitsa dannoe cislo
        boolean flag = false; // kak tolko naxoditsa cislo, flag = false, i cikl prerivaetsa.
        while (count != 20) {
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count != 20) {
                count = 0;
            }
            i++;
        }
        System.out.println("Cislo= " + (i - 1));
        */
   /*Задание 11
Напишите программу, которая выводит на экран числа
от 1 до 1 000. При этом вместо чисел, кратных трём, про-
грамма должна выводить слово fizz, а вместо чисел, кратных
пяти – слово buzz. Если число кратно пятнадцати, то про-
грамма должна выводить вместо числа слово hiss.
*/
  /* int i=1;
   while (i<=1000){
       if (i%3==0&&i%5!=0){
           System.out.print("fizz  \t");
       }
       else if (i%3!=0&&i%5==0){
           System.out.print("buzz  \t");
       }
       else if (i%3==0&&i%5==0){
           System.out.print("hiss  \t");
           System.out.println();// po 15 cisel na stroku, shtobi udobney citat bilo
       }
       else {
           System.out.print(i+"    \t");

       }
   i++;
   }
*/
/*Задание 12
В первый день спортсмен пробежал x километров, а затем
он каждый день увеличивал пробег на 10% от предыдущего
значения. По числу, указанному с клавиатуры y, определите
номер дня, на который пробег спортсмена составит не менее
y километров. */
/*        System.out.println("Vvedite skolko km probejal sportsmen v perviy den: ");
        double x = sc.nextDouble();
        System.out.println("Vvedite skolko km on doljen probejat: ");
        double y = sc.nextDouble();
        double count = x;// nacinaem s kilometra
        int i = 1;// perviy den ved toje scitaetsa
        while (count < y) {
            count = count + x * 0.1;
            i++;
        }
        System.out.println("Sportsmen probejit " + count + " kilometrov v " + i + " den");

*/


        }
        }










