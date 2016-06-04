package co.devmaany.lingweed;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

import java.util.List;

/**
 * Created by devmaany on 4/6/16.
 */
public class WordEssence {
    @DatabaseField(generatedId = true)
    private Integer id;
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Word word;
    private String meaning;
    private String linkSentence;
    @ForeignCollectionField
    private List<String> usages;
    @ForeignCollectionField(columnName = "link_media",eager = true)
    private List<Media> linkMedia;
    @ForeignCollectionField
    private WordFamily family;
    @DatabaseField(foreign = true,foreignAutoRefresh = true)
    private WordEssence antonym;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getLinkSentence() {
        return linkSentence;
    }

    public void setLinkSentence(String linkSentence) {
        this.linkSentence = linkSentence;
    }

    public List<String> getUsages() {
        return usages;
    }

    public void setUsages(List<String> usages) {
        this.usages = usages;
    }

    public List<Media> getLinkMedia() {
        return linkMedia;
    }

    public void setLinkMedia(List<Media> linkMedia) {
        this.linkMedia = linkMedia;
    }

    public WordFamily getFamily() {
        return family;
    }

    public void setFamily(WordFamily family) {
        this.family = family;
    }

    public WordEssence getAntonym() {
        return antonym;
    }

    public void setAntonym(WordEssence antonym) {
        this.antonym = antonym;
    }
}
