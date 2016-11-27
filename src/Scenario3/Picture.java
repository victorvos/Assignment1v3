package Scenario3;

/**
 * Created by Eigenaar on 27-11-2016.
 */
public class Picture implements GetPictureData {
    private int pictureGrade;
    private String filename;
    private int grade;

    public Picture(String filename){
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }

    public void setPictureGrade(int grade){
        this.grade = grade;
    }
}
