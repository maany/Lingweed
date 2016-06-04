package co.devmaany.lingweed.api;

import java.util.List;

import co.devmaany.lingweed.Word;

/**
 * Created by devmaany on 4/6/16.
 */
public interface WordService {
    void saveOrUpdate(Word word);
    List<Word> getAll();
    Word getById(Integer id);
    Word deleteLesson(Word word);
    Word findByName(String name);
    Word findByMeaning(String meaning);
    Word findByLink(String linkSentence);
}
