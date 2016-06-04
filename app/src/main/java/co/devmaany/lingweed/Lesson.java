package co.devmaany.lingweed;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

import java.util.List;

/**
 * Created by devmaany on 4/6/16.
 */
public class Lesson {
    @DatabaseField(generatedId = true)
    private Integer id;
    private String name;
    private String description;
    @ForeignCollectionField()
    private List<Word> words;


    public Lesson() {
    }

    public Lesson(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}
