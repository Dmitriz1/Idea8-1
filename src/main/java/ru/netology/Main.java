package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ivan";
        post.surname = "Ivanov";
        post.pastronymic = "Ivanovich";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        Post.FormDate.day = 13;
        Post.FormDate.month = 06;
        Post.FormDate.year = 1999;
        post.subscription = true;
        System.out.println("Имя: " + post.name);
        System.out.println("Фамилия: " + post.surname);
        System.out.println("Отчество: " + post.pastronymic);
        System.out.println("Паспорт: " + post.passport);
        System.out.println("Номер телефона: " + post.phone);
        System.out.println("Дата рождения: " + Post.FormDate.day + "." + Post.FormDate.month + "." + Post.FormDate.year);
    }
}