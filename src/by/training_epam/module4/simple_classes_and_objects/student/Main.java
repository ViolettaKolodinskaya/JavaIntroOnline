package module4.student;
/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
        из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
        номеров групп студентов, имеющих оценки, равные только 9 или 10
*/

public class Main {

    public static void main(String [] args) {

        Student[] students = {
                new Student("Dark B.N",7, new int[] {9,10,9,10,10}),
                new Student("Snow D.B.",6, new int[]{2,5,7,4,8}),
                new Student("Lite D.B.",3, new int[]{2,5,7,4,8}),
                new Student("Frog D.B.",6, new int[]{2,5,7,4,8}),
                new Student("Weather D.B.",8, new int[]{10,9,9,9,9}),
                new Student("Night D.B.",6, new int[]{2,5,7,4,8}),
                new Student("Summer D.B.",5, new int[]{9,9,9,9,9}),
                new Student("Winter D.B.",2, new int[]{2,5,7,4,8}),
                new Student("Lake D.B.",3, new int[]{2,5,7,4,8}),
                new Student("River D.B.",1, new int[]{8,5,9,4,8}),
        };

        Logic logic=new Logic();
        logic.printHonoursPupil(students);

    }
}
