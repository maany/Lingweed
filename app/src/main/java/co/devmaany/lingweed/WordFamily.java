package co.devmaany.lingweed;

import com.j256.ormlite.field.DatabaseField;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by devmaany on 4/6/16.
 */
public class WordFamily extends ArrayList<Word> {
    @DatabaseField(generatedId = true)
    private Integer id;
}
