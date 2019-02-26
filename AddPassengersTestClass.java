/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Monitor.FleetAdmin.Passengers;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.narrator;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.TestResult;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import KeywordDrivenTestFramework.Entities.TestEntity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ZiyandaP
 */
public class AddPassengersTestClass  extends BaseClass{

    final TestEntity testData;
    int counter = 1;
    String errorMsg;
    AddPassengers passenger;
    Date date  = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("E yyyy_mm_dd_hh_mm_ss");
    String newDate   = sdf.format(date);
    
    
    public AddPassengersTestClass(TestEntity testData) {
        this.testData = testData;
        passenger = new AddPassengers(testData);
    }

    public TestResult executingTest() throws InterruptedException{

       this.setStartTime();
       String passengerName = "MiX Passenger"+ newDate;

    if(!passenger.navigateToMonitorTab()){
        SeleniumDriverInstance.takeScreenShot(counter + " Failed to click on Monitor Tab", true);
        counter++;
        narrator.failedMessage("Failed to click on Monitor Tab - "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Monitor Tab", this.getTotalExecutionTime());
    }
    pause(3000);
    if(!passenger.navigateToPassengers()){
        SeleniumDriverInstance.takeScreenShot(counter + " Failed to click on Passengers", true);
        counter++;
        narrator.failedMessage("Failed to click on Passengers - "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Passengers", this.getTotalExecutionTime());
    }
    pause(3000);
    if(!passenger.clickAddPassengerBtn()){
        SeleniumDriverInstance.takeScreenShot(counter + " Failed to click on Add passenger button", true);
        counter++;
        narrator.failedMessage("Failed to click on Add passenger button - "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Add passenger button", this.getTotalExecutionTime());
    }
    pause(3000);
    if(!passenger.isNameClicked()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on the Name field ", true);
        counter++;
        narrator.failedMessage("Failed to click on the Name field - "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on the Name field ", this.getTotalExecutionTime());
    }
    pause(3000);
    
    if(!passenger.addTextToName(passengerName)){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on the Name field ", true);
        counter++;
        narrator.failedMessage("Failed to click on the Name field - "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on the Name field ", this.getTotalExecutionTime());
    }
    pause(3000);
    if(!passenger.isNotesClicked()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Notes field ", true);
        counter++;
        narrator.failedMessage("Failed to click on Notes field - "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Notes field ", this.getTotalExecutionTime());
    }
    pause(3000);
    if(!passenger.addTextToNotes("This passenger was created by automated test")){
    
           SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Notes field ", true);
           counter++;
           narrator.failedMessage("Failed to click on Notes field" +errorMsg);
           return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Notes field", this.getTotalExecutionTime());
    
    }
    pause(3000);
    if(!passenger.clickSave()){
    
           SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Notes field ", true);
           counter++;
           narrator.failedMessage("Failed to click on Save " +errorMsg);
           return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Save", this.getTotalExecutionTime());
    
    }
    pause(3000);
    if(!passenger.isFilterClicked()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on the Filter", true);
        counter++;
        narrator.failedMessage("Failed to click on the Filter- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on the Filter", this.getTotalExecutionTime());
    }
    pause(3000);
    if(!passenger.addTextToFilter(passengerName)){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add text on the Filter", true);
        counter++;
        narrator.failedMessage("Failed to add text on the Filter- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add text on the Filter", this.getTotalExecutionTime());                
    }
    pause(3000);
    if(!passenger.isDropDownClicked()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on the drop down", true);
        counter++;
        narrator.failedMessage("Failed to click on the drop down- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on the drop down", this.getTotalExecutionTime());
    } 
    pause(3000);
    if(!passenger.isEditClicked()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Edit", true);
        counter++;
        narrator.failedMessage("Failed to click on Edit- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Edit", this.getTotalExecutionTime());                
    }
    if(!passenger.isMobileNumberClicked()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Add Driver Button ", true);
        counter++;
        narrator.failedMessage("Failed to click on Add Driver Button- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Add Driver Button", this.getTotalExecutionTime());
    }
    pause(2000);
    if(!passenger.addTextToMobileNumber("+27763470967")){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Add Driver Button ", true);
        counter++;
        narrator.failedMessage("Failed to click on Add Driver Button- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Add Driver Button", this.getTotalExecutionTime());
    }
     pause(3000);
    if(!passenger.isSaveButnClicked()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on the Save button", true);
        counter++;
        narrator.failedMessage("Failed to select save- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on the Save button", this.getTotalExecutionTime());       
    }
     pause(3000);
    if(!passenger.isFilterClickedAgain()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on the Filter", true);
        counter++;
        narrator.failedMessage("Failed to click on the Filter- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on the Filter", this.getTotalExecutionTime());
    }
    pause(3000);
    if(!passenger.addTextToFilterAgain(passengerName)){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to add text on the Filter", true);
        counter++;
        narrator.failedMessage("Failed to add text on the Filter- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add text on the Filter", this.getTotalExecutionTime());                
    }
    if(!passenger.compareMobileNum("+27763470967")){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Mobile number did not persist", true);
        counter++;
        narrator.failedMessage("Mobile number did not persist- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Mobile number did not persist", this.getTotalExecutionTime());
    }
    pause(3000);
    if(!passenger.isDropDownClickedAgain()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on the drop down", true);
        counter++;
        narrator.failedMessage("Failed to click on the drop down- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on the drop down", this.getTotalExecutionTime());
    }
    pause(3000);
    if(!passenger.isEditClickedAgain()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Edit for the second time", true);
        counter++;
        narrator.failedMessage("Failed to click on Edit for the second time- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Edit for the second time", this.getTotalExecutionTime());                
    }
    pause(3000);
    if(!passenger.isCloseClicked()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Edit for the second time", true);
        counter++;
        narrator.failedMessage("Failed to click on Edit for the second time- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Edit for the second time", this.getTotalExecutionTime());                
    }
    pause(3000);
    if(!passenger.clickFilterToRemove()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on on Filter to remove", true);
        counter++;
        narrator.failedMessage("Failed to click on Filter to remove- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on on Filter to remove", this.getTotalExecutionTime());                
    }
    pause(3000);
    if(!passenger.FilterToRemove(passengerName)){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to Add text on Filter to remove", true);
        counter++;
        narrator.failedMessage("Failed to add text on Filter to remove- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to add text on Filter to remove", this.getTotalExecutionTime());                
    }
    if(!passenger.isDropDownClicked()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on the drop down to Remove", true);
        counter++;
        narrator.failedMessage("Failed to click on the drop down to Remove- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on the drop down to Remove", this.getTotalExecutionTime());
    } 
    pause(3000);
           
    if(!passenger.isRemoveClicked()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Remove", true);
        counter++;
        narrator.failedMessage("Failed to click on Remove- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Remove", this.getTotalExecutionTime());
    }
      
    pause(3000);
    if(!passenger.isRemoveClickedAgain()){
            
        SeleniumDriverInstance.takeScreenShot(counter + " - Failed to click on Remove", true);
        counter++;
        narrator.failedMessage("Failed to click on Remove- "+errorMsg);
        return new TestResult(testData, Enums.ResultStatus.FAIL, "Failed to click on Remove", this.getTotalExecutionTime());
    }
      
    pause(3000);
    return new TestResult(testData, Enums.ResultStatus.PASS, "Successfully Added a Passenger.", this.getTotalExecutionTime());
    }
        
    }
    
    
    
    
    

