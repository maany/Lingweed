package co.devmaany.lingweed;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

import java.util.List;

/**
 * Created by devmaany on 4/6/16.
 */
public class Word {
    @DatabaseField(generatedId = true)
    private Integer id;
    private String name;
    @DatabaseField(foreign = true,foreignAutoRefresh = true)
    private Lesson lesson;
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Media pronunciation;
    @ForeignCollectionField(columnName = "word_essence", eager = true)
    private List<WordEssence> wordEssence;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Media getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(Media pronunciation) {
        this.pronunciation = pronunciation;
    }

    public List<WordEssence> getWordEssence() {
        return wordEssence;
    }

    public void setWordEssence(List<WordEssence> wordEssence) {
        this.wordEssence = wordEssence;
    }
}
