package guru.springframework.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    public String getRandomQuote() {
        ChuckNorrisQuotes quote = new ChuckNorrisQuotes();
        return quote.getRandomQuote();
    }
}
