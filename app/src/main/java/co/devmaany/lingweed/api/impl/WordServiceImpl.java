package co.devmaany.lingweed.api.impl;

import java.util.List;

import co.devmaany.lingweed.Word;
import co.devmaany.lingweed.api.dao.WordDAO;
import co.devmaany.lingweed.api.net.WordService;

/**
 * Created by devmaany on 4/6/16.
 */
public class WordServiceImpl implements WordService {
    WordDAO dao;
    @Override
    public void saveOrUpdate(Word word) {
        dao.saveOrUpdate(word );
    }

    @Override
    public List<Word> getAll() {
        return dao.getAll();
    }

    @Override
    public Word getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public Word deleteLesson(Word word) {
        return dao.deleteLesson(word);
    }
}
