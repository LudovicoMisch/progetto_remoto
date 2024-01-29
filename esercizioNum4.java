package it.edu.issgubbio.Vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class esercizioNum4 extends Application{
int eNum[];
	
	
	
	Label lSomma =new Label("Somma:");
	Label lOut= new Label("Numeri casuali:");
	Label lN =new Label("Max:");
	Label lQuanti =new Label("Quanti numeri:");
	
	
	TextField tNum=new TextField("");
	TextField tContatore=new TextField("");
	


	Button bCalcola=new Button("calcola");
	Button bAlloca=new Button("alloca");
	
	public void start(Stage finestra) {
		GridPane griglia=new GridPane();
		
		griglia.add(tNum, 1, 0);
		griglia.add(tContatore, 3, 0);
		griglia.add(lN, 0, 0);
		griglia.add(lQuanti, 2, 0);
		griglia.add(lSomma, 0, 2);
		griglia.add(lOut, 1, 2);
		griglia.add(bCalcola, 0, 1);
		griglia.add(bAlloca, 1, 1);

		bAlloca.setOnAction(e->alloca());
		bCalcola.setOnAction(e->calcola());
		
		Scene scena =new Scene(griglia);
		finestra.setScene(scena);
		finestra.setTitle("Media dei numeri");
		finestra.show();
    }
	public void alloca() {
		eNum = new int[Integer.parseInt(tContatore.getText())];
		int rand=Integer.parseInt(tNum.getText());
		for(int i=0;i<eNum.length;i++) {
			eNum[i]=(int)(Math.random()*rand);
		}
		
	}

	public void calcola() {
		int somma=0;
		String s="";
		for(int i=0;i<eNum.length;i++) {
		if(eNum[i]%3!=0) {
		somma+=eNum[i];
		 }
		s+=eNum[i]+"-";
		}
	
		lOut.setText(s+"");
		lSomma.setText(somma+"");
	}
	public static void main(String[]Args) {
		launch(Args);
	}

}
