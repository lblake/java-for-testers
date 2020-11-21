package com.serenitydojo;

public class Cat extends Pet {
    private String favoriteFood;
    private int age;

    public Cat(String name, String favoriteFood, int age) {
        super(name);
        this.favoriteFood = favoriteFood;
        this.age = age;
    }


    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }
}
