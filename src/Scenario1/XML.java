package Scenario1;

/**
 * Created by Victor on 22-11-2016.
 */
public class XML implements Format {
    private String format;

    public XML(){
        this.format = ".XML";
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
