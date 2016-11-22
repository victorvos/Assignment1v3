package Scenario1;

/**
 * Created by Victor on 22-11-2016.
 */
public class Word97 implements  Format{
    private String format;
    Main m = new Main();

    public Word97(){
        this.format = ".docx";
        m.Register("Word97");
    }

    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public void setFormat(String f) {
        format = f;
    }

    @Override
    public void SaveAS(){
        System.out.println(format + " is opgeslagen");
        //implementatie voor bijbehorende format (SaveAS) kan hier worden gecodeerd.
    }
}
