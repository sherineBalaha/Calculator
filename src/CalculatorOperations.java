
import java.awt.Font;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91030283
 */
public class CalculatorOperations {
    
    public String stringOutputAnswer ="";
    
    public double doubleAfterOperator;
    public double doubleBeforeOperator;
    public double doubleOutputAnswer;
  
    
      /////////////////////////////////////////////////////////////////////////////
    //rounding methods
    public String roundNumberEntered(double doubleInputNumber ,int intRoundingNumber)
        {
            
            String StringRoundedAnswer;
            
            //determining rounding number according to selected by radioRound
            DecimalFormat roundDecimal= new DecimalFormat("#");
            switch (intRoundingNumber)
            {
                case 0:
                roundDecimal = new DecimalFormat("#");    
                break;
                
                case 1:
                roundDecimal = new DecimalFormat("#.#");    
                break;
                
                case 2:
                roundDecimal = new DecimalFormat("#.##");    
                break;
                    
                case 3:
                roundDecimal = new DecimalFormat("#.###");    
                break;
                              
                case 4:
                roundDecimal = new DecimalFormat("#.####");    
                break;
                    
                case 5:
                roundDecimal = new DecimalFormat("#.#####");    
                break;
                
                case 6:
                roundDecimal = new DecimalFormat("#.######");    
                break;   
                 
                case 7:
                roundDecimal = new DecimalFormat("#.#######");    
                break;
                    
                case 8:
                roundDecimal = new DecimalFormat("#.########");    
                break;
                    
                case 9:
                roundDecimal = new DecimalFormat("#.#########");    
                break;    
                    
            }    
            //DecimalFormat roundDecimal = new DecimalFormat("#.####");
            roundDecimal.setRoundingMode(RoundingMode.HALF_UP);
            StringRoundedAnswer =String.valueOf(roundDecimal.format(doubleInputNumber));
            
            return StringRoundedAnswer;
            
            
        }//method
    //determining rounding number
  
    
    public String operatorMethod(String operator,String stringBeforeOperator,String stringAfterOperator)
   
    {
          
    
        switch (operator)
        {
            
            case "+" :
                
                doubleBeforeOperator = Double.parseDouble(stringBeforeOperator);
                doubleAfterOperator  = Double.parseDouble(stringAfterOperator) ;
                doubleOutputAnswer = doubleBeforeOperator + doubleAfterOperator ;
                break;
                
            case "-" :
                
                doubleBeforeOperator = Double.parseDouble(stringBeforeOperator);
                doubleAfterOperator  = Double.parseDouble(stringAfterOperator) ;
                doubleOutputAnswer = doubleBeforeOperator - doubleAfterOperator ;
                break;   
             
            case "*" :
                
                doubleBeforeOperator = Double.parseDouble(stringBeforeOperator);
                doubleAfterOperator  = Double.parseDouble(stringAfterOperator) ;
                doubleOutputAnswer = doubleBeforeOperator * doubleAfterOperator ;
                break;       
                
            case "/" :
                
                doubleBeforeOperator = Double.parseDouble(stringBeforeOperator);
                doubleAfterOperator  = Double.parseDouble(stringAfterOperator) ;
                doubleOutputAnswer = doubleBeforeOperator / doubleAfterOperator ;
                break;       
            
        }//switch
    
        stringOutputAnswer = String.valueOf(doubleOutputAnswer);
        return stringOutputAnswer;

    }//method      
    
    
    
    
//    double num1;
//    double num2;
//    
//    setNum1()
//    setOperator()
//    setNum2()
//    getAnswer()
//    
//    c.setNum1(1)
//    c.setOperatoer('+')
//    c.setnum2(2)
//    screen.show(c.getanswer())
    
    
//        0!  = 1
//        1!  = 1
//        2!  = 2 * 1
//        3!  = 3 * 2 * 1
//        4!  = 4 * 3 * 2 * 1
    
 
   
    
    
    
}//class
