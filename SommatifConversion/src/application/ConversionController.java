package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConversionController {

    @FXML
    private Button btnExit4;

    @FXML
    private Button btnExit3;

    @FXML
    private Button btnExit2;

    @FXML
    private Button btnExit1;

    @FXML
    private Label lblDesc;

    @FXML
    private TextField txtPouce;

    @FXML
    private TextField txtCalGram;

    @FXML
    private TextField txtKiloJoule;

    @FXML
    private TextField txtMetre;

    @FXML
    private TextField txtCAD;

    @FXML
    private TextField txtJoule;

    @FXML
    private Button btnConvertir3;

    @FXML
    private TextField txtUSD;

    @FXML
    private TextField txtPieds;

    @FXML
    private Button btnConvertir2;

    @FXML
    private Button btnConvertir1;

    @FXML
    private TextField txtEU;

    
    @FXML
    private void fermer()
    {
    	System.exit(0);
    }
    
    
    @FXML
    private void Convert1 ()
    {
    	int canadianConvert = Integer.valueOf(txtCAD.getText());
    	int USConvert = Integer.valueOf(txtUSD.getText());
    	int EUConvert = Integer.valueOf(txtEU.getText());
    	if((canadianConvert>0)||(canadianConvert==0))
    	{
    		double CAD = Double.parseDouble(txtCAD.getText());
    		double USD = CAD * 0.79;
    		double EU = CAD * 0.66;
    		
    		txtCAD.setText(Double.toString(CAD));
    		txtUSD.setText(Double.toString(USD));
    		txtEU.setText(Double.toString(EU));
    	}
    	if((USConvert>0)||(USConvert==0))
    	{
    		double USD = Double.parseDouble(txtUSD.getText());
    		double CAD = USD * 1.26;
    		double EU = USD * 0.83;
    		
    		txtCAD.setText(Double.toString(CAD));
    		txtUSD.setText(Double.toString(USD));
    		txtEU.setText(Double.toString(EU));
    	}
    	if((EUConvert>0)||(EUConvert==0))
    	{
    		double EU = Double.parseDouble(txtEU.getText());
    		double USD = EU * 1.21;
    		double CAD = EU * 1.53;
    		
    		
    		txtCAD.setText(Double.toString(CAD));
    		txtUSD.setText(Double.toString(USD));
    		txtEU.setText(Double.toString(EU));
    	}
    }
    
}
