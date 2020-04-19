
/**
 * Write a description of class ImageSaver here.
 *
 * @author - Ronit Chatterjee
 * @version - v1.0
 */
import edu.duke.ImageResource;

public class ImageSaver {
	public static void doSave(ImageResource image, String fileName, String conversionType) {
        image.setFileName(conversionType + fileName);
        image.save();
	}
}
