package co.devmaany.lingweed;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;

/**
 * Created by devmaany on 4/6/16.
 */
public class Media {
    @DatabaseField(generatedId = true)
    private Integer id;
    @DatabaseField(foreign = true,foreignAutoRefresh = true)
    private Word word;
    @DatabaseField(dataType = DataType.ENUM_STRING)
    private MediaType type;
    private String resource;

    public Media(Word word, MediaType type, String resource) {
        this.word = word;
        this.type = type;
        this.resource = resource;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType type) {
        this.type = type;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
