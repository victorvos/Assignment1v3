package Scenario3;

/**
 * Created by Eigenaar on 27-11-2016.
 */
public class Picture implements GetPictureData {
    private int pictureGrade;
    private String pictureData;


    @Override
    public String getPictureData() {
        return pictureData;
    }

    @Override
    public void setPictureGrade(int grade) {
        pictureGrade = grade;
    }
}
