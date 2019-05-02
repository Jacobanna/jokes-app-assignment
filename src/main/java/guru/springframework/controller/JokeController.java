package guru.springframework.controller;

import guru.springframework.model.Joke;
import guru.springframework.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        Joke joke = new Joke();
        joke.setJoke(jokeService.getRandomQuote());
        model.addAttribute("joke", joke.getJoke());
        return "chucknorris";
    }

}
