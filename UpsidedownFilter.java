import java.awt.Color;

/**
 * An image filter to flip the image vertically / turn it upside down.
 * 
 * @author Giovanny Ospina
 * @version 12.11.2017
 */
public class UpsidedownFilter extends Filter
{
    /**
     * Constructor for objects of class UpsidedownFilter.
     * @param name The name of the filter.
     */
    public UpsidedownFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height / 2; y++) {
                Color left = image.getPixel(x, y);
                image.setPixel(x, y, image.getPixel(x, height - 1 - y));
                image.setPixel(x, height - 1 - y, left);
            }
        }
    }
}
