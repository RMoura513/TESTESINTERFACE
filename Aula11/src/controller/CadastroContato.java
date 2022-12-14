package controller;

import java.util.AbstractSequentialList;

import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CadastroContato extends Application{
	
	@Override
	public void start(Stage stage) throws Exception{
		
		GridPane grid = new GridPane();
		Scene scn = new Scene(grid, 600, 200);
		
		
		Label lblId = new Label("ID: ");
		grid.add(lblId, 0, 0);
		
		TextField txtId = new TextField();
		grid.add(txtId, 1, 0);
		
		
		
		Label lblNome = new Label("Nome: ");
		grid.add(lblNome, 0, 1);
		
		TextField txtNome = new TextField();
		grid.add(txtNome, 1, 1);
		
		
		
		Label lblTelefone = new Label("Telefone: ");
		grid.add(lblTelefone, 0, 2);
		
		TextField txtTelefone = new TextField();
		grid.add(txtTelefone, 1, 2);

		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(25);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(75);
		
		RowConstraints row1 = new RowConstraints();
	    row1.setPercentHeight(25);
		RowConstraints row2 = new RowConstraints();
		row2.setPercentHeight(25);
		RowConstraints row3 = new RowConstraints();
		row3.setPercentHeight(25);
		RowConstraints row4 = new RowConstraints();
		row4.setPercentHeight(25);
		
		TranslateTransition animation1 = new TranslateTransition(Duration.seconds(0.7));
		animation1.setFromX(500);
		animation1.setToX(0);
		animation1.setNode(txtId);
		animation1.play();
		
		TranslateTransition animation2 = new TranslateTransition(Duration.seconds(0.7));
		animation2.setFromX(500);
		animation2.setToX(0);
		animation2.setNode(txtTelefone);
		animation2.play();
		
		TranslateTransition animation3 = new TranslateTransition(Duration.seconds(0.7));
		animation3.setFromX(500);
		animation3.setToX(0);
		animation3.setNode(txtNome);
		animation3.play();
		
		SequentialTransition animateAll = new SequentialTransition(animation1, animation2, animation3);
		grid.getColumnConstraints().addAll(col1, col2);
		grid.getRowConstraints().addAll(row1, row2, row3, row4);
		grid.setPadding(new Insets(10));
		
		
		Button btnSalvar = new Button("Salvar");
		grid.add(btnSalvar, 0, 3);
		
		Button btnPesquisar = new Button("Pesquisar");
		grid.add(btnPesquisar, 1, 3);
		
		
		stage.setScene(scn);
		stage.setTitle("Cadastro de Contato");
		stage.show();
		
		
	}

	public static void main(String[] args) {
		Application.launch(CadastroContato.class, args);
	}
	
	
}
