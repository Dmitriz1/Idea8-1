package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Ivan";
        post.surname = "Ivanov";
        post.pastronymic = "Ivanovich";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.birthday.day = 13;
        post.birthday.month = 06;
        post.birthday.year = 1999;
        post.subscription = true;
        System.out.println("Имя: " + post.name);
        System.out.println("Фамилия: " + post.surname);
        System.out.println("Отчество: " + post.pastronymic);
        System.out.println("Паспорт: " + post.passport);
        System.out.println("Номер телефона: " + post.phone);
        System.out.println("Дата рождения: " + post.birthday.day + "." + post.birthday.month + "." + post.birthday.year);
    }
}