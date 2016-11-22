package Scenario1;

/**
 * Created by Victor on 22-11-2016.
 */
public class HTML implements Format {
    private String format;

    public HTML(){
        this.format = ".html";
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
