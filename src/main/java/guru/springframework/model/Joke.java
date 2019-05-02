package guru.springframework.model;

import guru.springframework.service.JokeService;

public class Joke {
    String joke;

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "joke='" + joke + '\'' +
                '}';
    }
}
