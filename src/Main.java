public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №10");

        //Task 1
        System.out.println("\nЗадание №1:");
        String firstName = "Ivan"; // Переменная с именем
        String middleName = "Ivanovich"; // Переменная с фамилией
        String lastName = "Ivanov"; // Переменная с отчеством
        String fullName = lastName + " " + firstName + " " + middleName; // Переменная с Ф.И.О.
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        //Task 2
        System.out.println("\nЗадание №2:");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Task 3
        System.out.println("\nЗадание №3:");
        fullName = "Иванов Семён Семёнович"; // Согласно условиям задачи присвоил новые данные
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName.replace("ё", "е"));
    }
}