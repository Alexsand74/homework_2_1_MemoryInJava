
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*         Задание 5
        Напишите метод, который изменяет значение переменной типа int.

        Объявите метод changeValue, который принимает параметр типа int под названием value.
        Внутри метода с помощью оператора присваивания запишите в параметр значение 22.

        В методе main объявите переменную типа int под названием value и запишите туда значение 33.
        В следующей строке вызовите метод changeValue и передайте в него эту переменную.
        На платформу пришлите ответ на вопрос выше.  Код вашего решения присылать на платформу не нужно.
        */
        {
            System.out.println("    Задание 5 ");

            int value = 33;
            System.out.println("\" до метода int value = 33\" ");
            changeValue(value);
            System.out.println("\" после метода value =  " + value);
            System.out.println(" Как мы видим при передаче переменной int value, в метод changeValue "
                    + "\n значение не изменилось и = 33 "
                    + "\n так как скопированное значение в метод ни как не влияет на само "
                    + "\n int value написанное выше, до вызова метода changeValue");
            System.out.println("======================================================");
        }
        {
/*         Задание 6
        Напишите метод, который изменяет значение переменной типа Integer.
        Объявите метод changeValue, который принимает параметр типа Integer под названием value.
        Внутри метода с помощью оператора присваивания запишите в параметр значение 22.

        В методе main объявите переменную типа Integer под названием value и запишите туда значение 33.
        В следующей строке вызовите метод changeValue и передайте в него эту переменную.
        */
            System.out.println("    Задание 6 ");

            Integer value = 33;
            System.out.println("\" до метода int value = 33\" ");
            changeValueInteger(value);
            System.out.println("\" после метода value =  " + value);
            System.out.println(" Как мы видим при передаче переменной Integer value, в метод changeValueInteger"
                    + "\n значение не изменилось и = 33 "
                    + "\n так как скопированное значение ссылки в метод ни как не влияет на само "
                    + "\n Integer value написанное выше, до вызова метода changeValueInteger");
            System.out.println("======================================================");
        }
        {
/*            Задание 7
            Напишите метод, который изменяет значение массива типа Integer.
            Объявите метод changeValue, который принимает параметр массива типа Integer под названием value.
            Внутри метода с помощью оператора присваивания запишите в параметр новый массив {1,2}.

            В методе main объявите массив типа Integer под названием value и запишите туда значение {3,4}.
            В следующей строке вызовите метод changeValue и передайте в него этот массив.
*/
            System.out.println("    Задание 7 ");
            Integer[] value = {3,4};
            System.out.println("\" до метода Integer[] value \" " + Arrays.toString(value));
            changeValueIntegerArrey(value);
            System.out.println("\" после метода Integer[] value \" " + Arrays.toString(value));
            System.out.println(" Как мы видим при передаче массива Integer [] value, в метод changeValueIntegerArrey "
                    + "\n значение элементов массива  Integer[] value не изменилось "
                    + "\n так как скопированное значение ссылки на массив в метод ни как не влияет на сам "
                    + "\n внешний Integer[] value массив написанный выше, до вызова метода changeValueIntegerArrey");
            System.out.println("======================================================");
        }
        {
/*            Задание 8
            Напишите метод, который изменяет значение массива типа Integer. Объявите метод changeValue,
            который принимает параметр массива типа Integer под названием value. Внутри метода с помощью
            оператора присваивания запишите в первую ячейку параметра цифру 99.

            В методе main объявите массив типа Integer под названием value и запишите туда значение {3,4}.
            В следующей строке вызовите метод changeValue и передайте в него этот массив.

 */
            System.out.println("    Задание 8 ");
            Integer[] value = {3,4};
            System.out.println("\" до метода Integer[] value \" " + Arrays.toString(value));
            changeFirstValueIntegerArray(value);
            System.out.println("\" после метода Integer[] value \" " + Arrays.toString(value));
            System.out.println(" Как мы видим при передаче массива Integer [] value, в метод changeFirstValueIntegerArray"
                    + "\n значение элементов массива  Integer[] value изменилось "
                    + "\n так как скопированное значение ссылки на массив в методе остается на внешний Integer[] value  "
                    + "\n массив написанный выше, и в методе changeValueIntegerArrey по данной ссылке идет"
                    + "\n обращение к первой ячейки массива и осуществляется замена её содержания");
            System.out.println("======================================================");
        }
        {
/*            Задание 9
            Объявите объект класса person с полями name и surname. Переопределите у него метод toString так,
            чтобы он возвращал строку из name и surname.
            Объявите метод changePerson, который принимает параметр типа Person под названием person.
            Внутри метода с помощью оператора присваивания запишите в параметр новый объект типа Person.
            Присвойте строке name значение Ilya, строке surname — значение Lagutenko.

            В методе main объявите переменную типа Person под названием person и запишите новый объект
            типа Person. Присвойте строке name значение Lyapis, строке surname значение — Trubetskoy.
            В следующей строке вызовите метод changePerson и передайте в него эту переменную.
 */
            Person person = new Person("Lyapis", "Trubetskoy");
            System.out.println("\" до метода объект person\" " + person.toString());
            person.changePerson(person);
            System.out.println("\" после метода объект person\" " + person.toString());
            System.out.println(" Как мы видим при передаче объекта person, в метод changePerson "
                    + "\n значение значение полей объекта person не изменилось "
                    + "\n так как скопированное значение ссылки на объект в методе ни как не влияет на сам "
                    + "\n внешний принимаемый объект написанный выше, до вызова метода changePerson");
            System.out.println("======================================================");
        }
        {
/*             Задание 10
            Объявите объект класса person с полями name и surname. Переопределите у него метод toString так,
            чтобы он возвращал строку из name и surname.
            Объявите метод changePerson, который принимает параметр типа Person под названием person.
            Внутри метода запишите в поле name строку “Ilya”, а в строку surname — “Lagutenko”.

            В методе main объявите переменную типа Person под названием person и запишите новый объект
            типа Person. Присвойте строке name значение Lyapis, строке surname значение — Trubetskoy.
            В следующей строке вызовите метод changePerson и передайте в него эту переменную.
 */
            Person person = new Person("Lyapis", "Trubetskoy");
            System.out.println("\" до метода объект person\" " + person.toString());
            person.changePersonName(person);
            System.out.println("\" после метода объект person\" " + person.toString());
            System.out.println(" Как мы видим при передаче объекта person, в метод changePersonName "
                    + "\n значение полей объекта person изменилось, так как метод changePersonName  "
                    + "\n использует скопированное значение ссылки на объект и по данной ссылке  "
                    + "\n изменяет его поля, на те, что заданы внутри его ");
            System.out.println("======================================================");
        }

    }
    private static void changeValue(int value) {
        value = 22;
    }

    private static void changeValueInteger(Integer value) {
        value = 22;
    }
    private static void changeValueIntegerArrey (Integer [] value) {
        value = new Integer[]{1, 2};
    }
    private static void changeFirstValueIntegerArray (Integer [] value) {
        value [0] = 99;
    }
}