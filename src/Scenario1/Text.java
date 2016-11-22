package Scenario1;

/**
 * Created by Victor on 22-11-2016.
 */
public class Text implements Format {
    private String format;

    public Text(){
        this.format = ".txt";
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
