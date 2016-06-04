package co.devmaany.lingweed;

/**
 * Created by devmaany on 4/6/16.
 */
public class Media {
    private Integer id;
    private Word word;
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
