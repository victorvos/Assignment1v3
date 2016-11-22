package Scenario1;

/**
 * Created by Victor on 22-11-2016.
 */
public class Word97 implements  Format{
    private String format;

    public Word97(){
        this.format = ".docx";
    }

    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public void setFormat(String f) {
        format = f;
    }
}
