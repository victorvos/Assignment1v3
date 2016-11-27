package Scenario3;

/**
 * Created by Eigenaar on 27-11-2016.
 */
public class PictureProxy implements GetPictureData{
    @Override
    public String getPictureData() {
        Picture pic = new Picture();

        return pic.getPictureData();
    }

    @Override
    public void setPictureGrade(int grade) {
        Picture pic = new Picture();

        pic.setPictureGrade(grade);
    }
}
