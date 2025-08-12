public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper= 763789;
        System.out.println("Задача 1");
        System.out.println("собак = " + dog);
        System.out.println("кошек = " + cat);
        System.out.println("бумаги = " + paper);
        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2");
        System.out.println("собак = " + dog);
        System.out.println("кошек = " + cat);
        System.out.println("бумаги = " + paper);
        //Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("собак = " + dog);
        System.out.println("кошек = " + cat);
        System.out.println("бумаги = " + paper);
        //Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("Друзей = " + friend);
        friend = friend + 2;
        System.out.println("19 + 2 = " + friend);
        friend = friend / 7;
        System.out.println("21 / 7 = " + friend);
        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("Лягушек = " + frog);
        frog = frog * 10;
        System.out.println("3.5 * 10 =" + frog);
        frog = frog / 3.5;
        System.out.println("35 / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("10 + 4 = " + frog);
        //Задача 6
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var result1 = boxer1 + boxer2;
        var result2 = boxer2 - boxer1;
        System.out.println("Общий вес боксеров = " + result1);
        System.out.println("Разница между боксерами = " + result2);
        //Задача 7
        System.out.println("Задача 7");
        var result3 = boxer2 % boxer1;
        System.out.println("Остаток от деления между двумя весами = " + result3);
        //Задача 8
        System.out.println("Задача 8");
        var hours = 640;
        var worker = hours / 8;
        System.out.println("Всего работников в компании - " + worker + " человек");
        worker = worker + 94;
        var hpw = hours / worker;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + hpw + " часов работы может быть поделено между сотрудниками.");
    }
}