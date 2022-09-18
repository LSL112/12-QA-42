package ru.netology.afisha;


public class Afisha {

    private String[] films = new String[0];
    private int limit;


    public Afisha() {
        limit = 10;
    }

    public Afisha(int limit) {
        this.limit = limit;
    }


    public void add(String film) {
        String[] result = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            result[i] = films[i];
        }
        result[result.length - 1] = film;
        films = result;
    }


    public String[] findAll() {
        return films;
    }


    public String[] findLast() {
        int length;
        if (films.length < limit) {
            length = films.length;
        } else {
            length = limit;
        }

        String[] result = new String[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
