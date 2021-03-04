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
    	
    	if(!txtCAD.getText().equals(""))
    	{
    		verifNum(txtCAD);
    		double CAD = Double.parseDouble(txtCAD.getText()); 
    		double USD = CAD * 0.79; 
    		double EU = CAD * 0.66;
    				  
    		 txtCAD.setText(Double.toString(CAD)); 
    		 txtUSD.setText(Double.toString(USD));
    		 txtEU.setText(Double.toString(EU));
    	}
	
		 
    	if(!txtUSD.getText().equals(""))
    	{
    		verifNum(txtUSD);
    		double USD = Double.parseDouble(txtUSD.getText());
    		double CAD = USD * 1.26;
    		double EU = USD * 0.83;
    		
    		txtCAD.setText(Double.toString(CAD));
    		txtUSD.setText(Double.toString(USD));
    		txtEU.setText(Double.toString(EU));
    	}
    	if(!txtEU.getText().equals(""))
    	{
    		verifNum(txtEU);
    		double EU = Double.parseDouble(txtEU.getText());
    		double USD = EU * 1.21;
    		double CAD = EU * 1.53;
    		
    		
    		txtCAD.setText(Double.toString(CAD));
    		txtUSD.setText(Double.toString(USD));
    		txtEU.setText(Double.toString(EU));
    	}
    }
    @FXML
    private void Convert2 ()
    {
    	
    	
    	if(!txtMetre.getText().equals(""))
    	{
    		verifNum(txtMetre);
    		double M = Double.parseDouble(txtMetre.getText());
    		double P = M * 39.37;
    		double Pi = M * 3.281;
    		
    		txtMetre.setText(Double.toString(M));
    		txtPouce.setText(Double.toString(P));
    		txtPieds.setText(Double.toString(Pi));
    	}
    	if(!txtPouce.getText().equals(""))
    	{
    		verifNum(txtPouce);
    		double P = Double.parseDouble(txtPouce.getText());
    		double M = P / 39.37;
    		double Pi = P / 12;
    		
    		txtMetre.setText(Double.toString(M));
    		txtPouce.setText(Double.toString(P));
    		txtPieds.setText(Double.toString(Pi));
    	}
    	if(!txtPieds.getText().equals(""))
    	{
    		verifNum(txtPieds);
    		double Pi = Double.parseDouble(txtPieds.getText());
    		double M = Pi / 3.281;
    		double P = Pi * 12;
    		
    		
    		txtMetre.setText(Double.toString(M));
    		txtPieds.setText(Double.toString(Pi));
    		txtPouce.setText(Double.toString(P));
    	}
    }
    @FXML
    private void Convert3 ()
    {
    	if(!txtJoule.getText().equals(""))
    	{
    		verifNum(txtJoule);
    		double J = Double.parseDouble(txtJoule.getText());
    		double C = J / 4.184;
    		double K = J / 1000;
    		
    		txtJoule.setText(Double.toString(J));
    		txtCalGram.setText(Double.toString(C));
    		txtKiloJoule.setText(Double.toString(K));
    	}
    	if(!txtCalGram.getText().equals(""))
    	{
    		verifNum(txtCalGram);
    		double C = Double.parseDouble(txtCalGram.getText());
    		double J = C  * 4.184;
    		double K = C / 239;
    		
    		txtJoule.setText(Double.toString(J));
    		txtCalGram.setText(Double.toString(C));
    		txtKiloJoule.setText(Double.toString(K));
    	}
    	if(!txtKiloJoule.getText().equals(""))
    	{
    		verifNum(txtKiloJoule);
    		double K = Double.parseDouble(txtKiloJoule.getText());
    		double J = K * 1000;
    		double C = K * 239;
    		
    		
    		txtJoule.setText(Double.toString(J));
    		txtCalGram.setText(Double.toString(C));
    		txtKiloJoule.setText(Double.toString(K));
    	}
    }
   
    @FXML
    private void ClearMonnaie ()
    {
    	txtCAD.setText("");
    	txtUSD.setText("");
    	txtEU.setText("");
    }
    @FXML
    private void ClearMesures ()
    {
    	txtMetre.setText("");
    	txtPieds.setText("");
    	txtPouce.setText("");
    }
    @FXML
    private void ClearEnergie ()
    {
    	txtJoule.setText("");
    	txtCalGram.setText("");
    	txtKiloJoule.setText("");
    }
    public void verifNum(TextField a)
    {
    	if(a.getText().equals("")) a.setText("0");
    	a.textProperty().addListener((observable,oldValue,newValue)->
    	{
    		if(!newValue.matches("^[0-9](\\.[0-9]+)?$)"))
    				{
    					
    			a.setText(newValue.replaceAll("[^\\d*\\.]", ""));
    				}
    	});
    	
    }
 
}
