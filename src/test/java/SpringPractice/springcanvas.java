package SpringPractice;

import SpringPractice.springacrylicpainting;
import org.junit.Test;

public class springcanvas {

    @Test
    public void paintcanvas()
    {
        springacrylicpainting acr = new springacrylicpainting();
        acr.paint();
        acr.sketch();


        springoilpainting oil = new springoilpainting();
        oil.paint();
        oil.sketch();


        //Now calling through interface references
        springinterfacepainting interpaint = new springacrylicpainting() ;
        interpaint.paint();
        interpaint.sketch();


        springinterfacepainting interpaintone = new springoilpainting() ;
        interpaintone.paint();
        interpaintone.sketch();



    }
}
