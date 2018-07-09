
package pages;

import framework.Page;
import org.openqa.selenium.By;


public class Portals extends Page{
    
    private void clickOnAddNewPortal() {
        clickOnElement(By.className("btn"));
    }
    
    private void SendTextOnTitleFiled() {
        sendTextOnField(By.id("title"));
    }
    
}
