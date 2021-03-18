package gui.viewsandcontrollers.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ModelController {
	
	 @FXML
	    private Label label;

	    public void initialize() {
	        // TODO
	    }
	    
	    @FXML
	    private void handleButtonAction2(ActionEvent event) {
	        label.setText("Hello World!222");
	    }

}
