
/**
 * Write a description of class BatchConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class BatchConversion {

    public static void main(String[] args) {
        GrayscaleConverter.selectAndConvert();          //converts selected files/imaged gray-scaled and saves
        ImageInversion.selectAndConvert();              //converts selected files/imaged negative and saves
    }


}