/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Monitor.FleetAdmin.Passengers;

import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.TestEntity;

/**
 *
 * @author ZiyandaP
 */
public class AddPassengers
{
//    private static final DateFormat dateObj = new SimpleDateFormat("yyyy_MM_dd");
//    String newDate;   
//        newDate = dateObj.format(new Date());
    final TestEntity testData;
    int counter = 1;
    String errorMsg;
    
    public AddPassengers(TestEntity testData)  {
        this.testData = testData;
    }


    public boolean navigateToMonitorTab(){
        
        
        if(!SeleniumDriverInstance.waitForElementByXpath("(//A[@href='#'])[1]")) {
            
            errorMsg = "Failed to click on Monitor Tab";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("(//A[@href='#'])[1]");
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked Monitor tab successfully -", false);
        counter++;
        return true;
    
    }
    public boolean navigateToPassengers(){
        
        if(!SeleniumDriverInstance.waitForElementByXpath("//A[@ng-href='#/fleet-admin/passengers'][text()='Passengers']")) {
            
            errorMsg = "Failed to click on passengers";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//A[@ng-href='#/fleet-admin/passengers'][text()='Passengers']");
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked on Passengers successfully -", false);
        counter++;
        return true;
    
    }
    public boolean clickAddPassengerBtn(){
        
        if(!SeleniumDriverInstance.waitForElementByXpath("//A[@class='btn btn-small btn-success']")) {
            
            errorMsg = "Failed to click on Add passenger button";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//A[@class='btn btn-small btn-success']");
        SeleniumDriverInstance.takeScreenShot(counter + "- Clicked on Add passenger button successfully -", false);
        counter++;
        return true;
    
    }
    public boolean isNameClicked() {
        if(!SeleniumDriverInstance.waitForElementByXpath("//input[@name='passengerName']")) {
            
            errorMsg = "Failed to click on Name";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//input[@name='passengerName']");

        SeleniumDriverInstance.takeScreenShot(counter + "- Successfully clicked on Name -", false);
        counter++;
        return true;
    }
    public boolean addTextToName(String textToEnter) {
        if(!SeleniumDriverInstance.waitForElementByXpath("//input[@name='passengerName']")) {
            
            errorMsg = "Failed to add text to Name field";
            return false;
        }
        
        SeleniumDriverInstance.EnterTextByXpath("//input[@name='passengerName']", textToEnter);
        SeleniumDriverInstance.takeScreenShot(counter + "- Text added successfully -", false);
        counter++;
        return true;
    }
    public boolean isNotesClicked() {
        if(!SeleniumDriverInstance.waitForElementByXpath("//TEXTAREA[@class='span12 no-resize ng-pristine ng-valid']")) {
            
            errorMsg = "Failed to click on Notes";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//TEXTAREA[@class='span12 no-resize ng-pristine ng-valid']");
        SeleniumDriverInstance.takeScreenShot(counter + "- Successfully clicked on Notes -", false);
        counter++;
        return true;
    }
    public boolean addTextToNotes(String textToEnter) {
        if(!SeleniumDriverInstance.waitForElementByXpath("//TEXTAREA[@class='span12 no-resize ng-pristine ng-valid']")) {
            
            errorMsg = "Failed to add text to Notes field";
            return false;
        }
        
        SeleniumDriverInstance.EnterTextByXpath("//TEXTAREA[@class='span12 no-resize ng-pristine ng-valid']", textToEnter);
        SeleniumDriverInstance.takeScreenShot(counter + "- Text added to Notes successfully -", false);
        counter++;
        return true;
    }
    public boolean clickSave() {
        if(!SeleniumDriverInstance.waitForElementByXpath("//BUTTON[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']")) {
            
            errorMsg = "Failed to click on Save";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']");
        SeleniumDriverInstance.takeScreenShot(counter + "- Successfully clicked on Save -", false);
        counter++;
        return true;
    }
    public boolean isFilterClicked() {
        if(!SeleniumDriverInstance.waitForElementByXpath("(//INPUT[@type='text'])[1]")) {
            
            errorMsg = "Failed to click on the filter";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='text'])[1]");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked on the filter -", false);
        counter++;
        return true;
    }
    public boolean addTextToFilter(String textToEnter) {
        if(!SeleniumDriverInstance.waitForElementByXpath("(//INPUT[@type='text'])[1]")) {
            
            errorMsg = "Failed to add text to filter";
            return false;
        }
        
        SeleniumDriverInstance.EnterTextByXpath("(//INPUT[@type='text'])[1]", textToEnter);
        SeleniumDriverInstance.takeScreenShot(counter + "- Text addded successfully -", false);
        counter++;
        return true;
    }
    public boolean isDropDownClicked(){
        if(!SeleniumDriverInstance.waitForElementByXpath("(//LI[@ng-repeat='row in limitedRows'])[1]")) {
            
            errorMsg = "Failed to click drop down";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("(//LI[@ng-repeat='row in limitedRows'])[1]");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked drop down -", false);      
        counter++;
        return true;
    }
    public boolean isEditClicked(){
        if(!SeleniumDriverInstance.waitForElementByXpath("//span[@class='ng-binding'][text() = 'Edit']")) {
            
            errorMsg = "Failed to click on Edit";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//span[@class='ng-binding'][text() = 'Edit']");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked Edit -", false);      
        counter++;
        return true;
    }
    public boolean isMobileNumberClicked() {
        if(!SeleniumDriverInstance.waitForElementByXpath("//INPUT[@class='span12 ng-pristine ng-valid ng-valid-dmx-minlength ng-valid-dmx-maxlength ng-valid-dmx-phonenumber ng-valid-dmx-phonecountrycode']")) {
            
            errorMsg = "Failed to click on MobileNumber";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//INPUT[@class='span12 ng-pristine ng-valid ng-valid-dmx-minlength ng-valid-dmx-maxlength ng-valid-dmx-phonenumber ng-valid-dmx-phonecountrycode']");
        SeleniumDriverInstance.takeScreenShot(counter + "- Successfully clicked on Mobile Number -", false);
        counter++;
        return true;
    }
    public boolean addTextToMobileNumber(String textToEnter) {
        if(!SeleniumDriverInstance.waitForElementByXpath("//INPUT[@class='span12 ng-pristine ng-valid ng-valid-dmx-minlength ng-valid-dmx-maxlength ng-valid-dmx-phonenumber ng-valid-dmx-phonecountrycode']")) {
            
            errorMsg = "Failed to add text to MobileNumber";
            return false;
        }
        
        SeleniumDriverInstance.EnterTextByXpath("//INPUT[@class='span12 ng-pristine ng-valid ng-valid-dmx-minlength ng-valid-dmx-maxlength ng-valid-dmx-phonenumber ng-valid-dmx-phonecountrycode']", textToEnter);
        SeleniumDriverInstance.takeScreenShot(counter + "- Text added successfully -", false);
        counter++;
        return true;
    }
     public boolean isSaveButnClicked() {
        if(!SeleniumDriverInstance.waitForElementByXpath("//BUTTON[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']")) {
            
            errorMsg = "Failed to click on the Save button";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn-wide btn-small btn-success btn ng-scope ng-binding'][text()='Save']");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked the Save button -", false);
        counter++;
        return true;
    }
    public boolean isFilterClickedAgain() {
        if(!SeleniumDriverInstance.waitForElementByXpath("(//INPUT[@type='text'])[1]")) {
            
            errorMsg = "Failed to click on the filter";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='text'])[1]");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked on the filter -", false);
        counter++;
        return true;
    }
    public boolean addTextToFilterAgain(String textToEnter) {
        if(!SeleniumDriverInstance.waitForElementByXpath("(//INPUT[@type='text'])[1]")) {
            
            errorMsg = "Failed to add text to filter";
            return false;
        }
        
        SeleniumDriverInstance.EnterTextByXpath("(//INPUT[@type='text'])[1]", textToEnter);
        SeleniumDriverInstance.takeScreenShot(counter + "- Text addded successfully -", false);
        counter++;
        return true;
    }
    public boolean compareMobileNum(String textToCompare){
        
         if(!SeleniumDriverInstance.waitForElementByXpath("(//DIV)[102]")) {
            
            errorMsg = "Failed to click on " +textToCompare+ " Column";
            return false;
         }
        String checkText  = SeleniumDriverInstance.retrieveTextByXpath("(//DIV)[102]");
        if(!(checkText.contains(textToCompare))){
            
            errorMsg = "Failed to compare";
            testData.extractParameter("Mobile number did not persist ", checkText, "FAIL");
            SeleniumDriverInstance.takeScreenShot(counter + "- Clicked " +textToCompare+ " UNsuccessfully -", false);
            counter++;
            System.out.println("Compared Unsuccessfully!!!");
            return false;
            
        }
            testData.extractParameter("Mobile number persisted ", checkText, "PASS");
            SeleniumDriverInstance.takeScreenShot(counter + "- Clicked " +textToCompare+ " successfully -",true);
            counter++;  
            System.out.println("Compared successfully!!!");
            return true;
            
            
    }

    public boolean isDropDownClickedAgain(){
        if(!SeleniumDriverInstance.waitForElementByXpath("(//LI[@ng-repeat='row in limitedRows'])[1]")) {
            
            errorMsg = "Failed to click drop down";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("(//LI[@ng-repeat='row in limitedRows'])[1]");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked drop down -", false);      
        counter++;
        return true;
    }
    public boolean isEditClickedAgain(){
        if(!SeleniumDriverInstance.waitForElementByXpath("//span[@class='ng-binding'][text() = 'Edit']")) {
            
            errorMsg = "Failed to click on Edit for the second time";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//span[@class='ng-binding'][text() = 'Edit']");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked Edit -", false);      
        counter++;
        return true;
    }
    public boolean isCloseClicked(){
        if(!SeleniumDriverInstance.waitForElementByXpath("//BUTTON[@id='Close']")) {
            
            errorMsg = "Failed to click on close button!!";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//BUTTON[@id='Close']");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked Edit -", false);      
        counter++;
        return true;
    }
    public boolean clickFilterToRemove() {
        if(!SeleniumDriverInstance.waitForElementByXpath("(//INPUT[@type='text'])[1]")) {
            
            errorMsg = "Failed to click on the filter";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("(//INPUT[@type='text'])[1]");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked on the filter -", false);
        counter++;
        return true;
    }
    public boolean FilterToRemove(String textToEnter) {
        if(!SeleniumDriverInstance.waitForElementByXpath("(//INPUT[@type='text'])[1]")) {
            
            errorMsg = "Failed to add text to filter";
            return false;
        }
        
        SeleniumDriverInstance.EnterTextByXpath("(//INPUT[@type='text'])[1]", textToEnter);
        SeleniumDriverInstance.takeScreenShot(counter + "- Text addded successfully -", false);
        counter++;
        return true;
    }

    public boolean isRemoveClicked(){
    if(!SeleniumDriverInstance.waitForElementByXpath("//i[@class='icon icon-remove-sign icon-red']")) {
            
            errorMsg = "Failed to click OK";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//i[@class='icon icon-remove-sign icon-red']");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked OK -", false);      
        counter++;
        return true;
    }
    public boolean isRemoveClickedAgain(){
        if(!SeleniumDriverInstance.waitForElementByXpath("//BUTTON[@class='btn ng-scope ng-binding btn-success'][text()='Remove']")) {
            
            errorMsg = "Failed to click on Remove";
            return false;
        }
        SeleniumDriverInstance.clickElementByXpath("//BUTTON[@class='btn ng-scope ng-binding btn-success'][text()='Remove']");
        SeleniumDriverInstance.takeScreenShot(counter + "-Successfully clicked Remove -", false);      
        counter++;
        System.out.println("Done running Tests, and if they reach here it means they went successfully!!");
        return true;
    }
}
    
