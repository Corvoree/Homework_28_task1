package kg.attractor.java.task1;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        // cats.sort(?);
        // Printer.print(cats);


        System.out.println("Сортировка по породе (лямбда-выражение)");
        cats.sort((cat1, cat2) -> cat1.getBreed().compareTo(cat2.getBreed()));
        Printer.print(cats);

        System.out.println("Сортировка по породе (ссылка на метод)");
        cats.sort(Cat::compareByBreed);
        Printer.print(cats);

        System.out.println("Сортировка по имени и возрасту (ссылка на метод)");
        cats.sort(Cat::compareByNameAndAge);
        Printer.print(cats);


    }

}
