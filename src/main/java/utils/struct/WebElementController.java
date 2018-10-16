package utils.struct;

import utils.IClikc;
import utils.ISendText;

public class WebElementController {

    public static boolean sendText(ISendText element, String text){
        return element.sendText(text);
    }

    public static boolean click(IClikc element){
        return element.click();
    }
}
