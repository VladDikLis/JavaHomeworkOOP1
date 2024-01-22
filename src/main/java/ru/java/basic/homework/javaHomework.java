package ru.java.basic.homework;

public class javaHomework {
    public static void main(String[] args) {
        User user1 = new User("Ivanov", "Ivan", "Ivanich", 2001, "ivanIvanInan@pochta.ru");
        user1.userPrint();

        User[] user = {
            new User("Ivanov", "Ivan", "Ivanich", 2001, "ivanIvanInan@pochta.ru"),
            new User("Ivanov2", "Ivan2", "Ivanich2", 2002, "ivanIvanInan2@pochta.ru"),
            new User("Ivanov3", "Ivan3", "Ivanich3", 1960, "ivanIvanInan3@pochta.ru"),
            new User("Ivanov4", "Ivan4", "Ivanich4", 1970, "ivanIvanInan4@pochta.ru"),
            new User("Ivanov5", "Ivan5", "Ivanich5", 1980, "ivanIvanInan5@pochta.ru"),
            new User("Ivanov6", "Ivan6", "Ivanich6", 1990, "ivanIvanInan6@pochta.ru"),
            new User("Ivanov7", "Ivan7", "Ivanich7", 1955, "ivanIvanInan7@pochta.ru"),
            new User("Ivanov8", "Ivan8", "Ivanich8", 1975, "ivanIvanInan8@pochta.ru"),
            new User("Ivanov9", "Ivan9", "Ivanich9", 1977, "ivanIvanInan9@pochta.ru"),
            new User("Ivanov10", "Ivan10", "Ivanich10", 2005, "ivanIvanInan10@pochta.ru")
        };

        for (int i = 0; i<=9; i++) {
            user[i].userPrint40();
        }
        Box box1 = new Box("Большая", "Красная", "Закрыта", "Пусто");
        box1.boxPrint();
        box1.boxOpen();
        box1.boxIn("Шар");
        box1.boxIn("Кукла");
        box1.boxOut();
        box1.boxOut();
        box1.boxClose();
        box1.boxOut();
        box1.boxNewcolour("Синяя");
        box1.boxPrint();
    }
}
