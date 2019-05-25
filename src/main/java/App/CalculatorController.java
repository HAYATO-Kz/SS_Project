package App;

import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

public class CalculatorController {

    @FXML public Label MonitorLabel;

    @FXML private Button Btn0 ;
    @FXML private Button Btn1 ;
    @FXML private Button Btn2 ;
    @FXML private Button Btn3 ;
    @FXML private Button Btn4 ;
    @FXML private Button Btn5 ;
    @FXML private Button Btn6 ;
    @FXML private Button Btn7 ;
    @FXML private Button Btn8 ;
    @FXML private Button Btn9 ;

    @FXML private Button BtnDot ;
    @FXML private Button BtnPlus ;
    @FXML private Button BtnMinus ;
    @FXML private Button BtnMultiply ;
    @FXML private Button BtnDivide ;

    @FXML private Button ResetBtn;
    @FXML private Button BtnANS;
    @FXML private Button BtnRestoreANS ;
    @FXML private Button BtnSaveANS ;

    private Calculator calculator = Calculator.getInstance();
    private Calculator.Momento m ;
    private boolean getAns = false;

    public void doFunction(){
        if(MonitorLabel.getText().equals("")){
            return;
        }
        if(getAns){
            getAns = false;
        }
        calculator.doFunction(MonitorLabel.getText());
        MonitorLabel.setText(calculator.getAnswer());
    }

    public void handlePlus(ActionEvent e){
        doFunction();
        calculator.serFunction(new PlusFunction());
    }

    public void handleMinus(ActionEvent e){
        doFunction();
        calculator.serFunction(new MinusFunction());
    }

    public  void handleMultiply(ActionEvent e){
        doFunction();
        calculator.serFunction(new MultiplyFunction());
    }

    public void handleDivide(ActionEvent e){
        doFunction();
        calculator.serFunction(new DivideFunction());
    }

    public void handleNumberBtn(ActionEvent e){
        if(getAns){
            calculator.reset();
            MonitorLabel.setText("");
            getAns = false;
        }
        if(MonitorLabel.getText().equals(calculator.getAnswer())){
            MonitorLabel.setText("");
        }
        MonitorLabel.setText(MonitorLabel.getText()+((Button)e.getSource()).getText());
    }

    public void handleResetBtn(ActionEvent e){
        calculator.reset();
        MonitorLabel.setText("");
    }

    public void handleGetANSBtn(ActionEvent e){
        if(MonitorLabel.getText().equals("")){
            return;
        }
        getAns = true;
        calculator.doFunction(MonitorLabel.getText());
        MonitorLabel.setText(calculator.getAnswer());
        calculator.serFunction(new NotFunction());
    }

    public void handleSaveBtn(ActionEvent e){
        m = calculator.save();
    }

    public void  handleRestoreBtn(ActionEvent e){
        if(m == null){ return; }
        MonitorLabel.setText(calculator.getSaved(m));

    }
}
