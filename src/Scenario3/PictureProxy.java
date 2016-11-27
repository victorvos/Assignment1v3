package Scenario3;

/**
 * Created by Eigenaar on 27-11-2016.
 */
public class PictureProxy implements GetPictureData{
    private int grade;
    private Picture pic;
    private String fileName;

    public PictureProxy(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(pic == null){
            pic = new Picture(fileName);
        }
        pic.display();
    }

    @Override
    public void setPictureGrade(int grade) {
        this.grade = grade;
    }
}
