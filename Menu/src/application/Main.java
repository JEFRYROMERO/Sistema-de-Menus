package application;
	



import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
		
	
		//metodo init
		@Override
		public void init() {
		System.out.println("metodo init()");
		}
		
		@Override
	    public void start(Stage primaryStage) {
	        // Crear la barra de menú
	        MenuBar menuBar = new MenuBar();

	        // Crear los menús 
	        Menu file = new Menu("Archivo");
	        Menu edit = new Menu("Editar");
	        Menu help = new Menu("Ayuda");

	        // Crear elementos de menú 
	        MenuItem nuevoItem = new MenuItem("Nuevo");
	        MenuItem abrirItem = new MenuItem("Abrir");
	        MenuItem guardarItem = new MenuItem("Guardar");
	        MenuItem salirItem = new MenuItem("Salir");
	        MenuItem cortarItem = new MenuItem("Cortar");
	        MenuItem copiarItem = new MenuItem("Copiar");
	        MenuItem pegarItem = new MenuItem("Pegar");
	        MenuItem acercaItem = new MenuItem("Acerca de");

	        // Agregar separadores
	        SeparatorMenuItem separator1 = new SeparatorMenuItem();
	        SeparatorMenuItem separator2 = new SeparatorMenuItem();
	        SeparatorMenuItem separator3 = new SeparatorMenuItem();

	        // Agregar elementos de menú a los menús correspondientes
	        file.getItems().addAll(nuevoItem, abrirItem, guardarItem, separator1, salirItem);
	        edit.getItems().addAll(cortarItem, copiarItem, pegarItem, separator2);
	        help.getItems().addAll(acercaItem, separator3);

	        // Definir acciones para los elementos de menú
	        nuevoItem.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Se ha seleccionado Nuevo.");
	            }
	        });

	        abrirItem.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Se ha seleccionado Abrir.");
	            }
	        });

	        guardarItem.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Se ha seleccionado Guardar.");
	            }
	        });

	        salirItem.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Se ha seleccionado Salir.");
	                primaryStage.close();
	            }
	        });

	        cortarItem.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Se ha seleccionado Cortar.");
	            }
	        });

	        copiarItem.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Se ha seleccionado Copiar.");
	            }
	        });

	        pegarItem.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Se ha seleccionado Pegar.");
	            }
	        });

	        acercaItem.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Se ha seleccionado Acerca de.");
	            }
	        });

	        // Agregar los menús a la barra de menú
	        menuBar.getMenus().addAll(file, edit, help);

	        // Crear  la interfaz
	        BorderPane root = new BorderPane();
	        root.setTop(menuBar);

	        // Configurar la escena 
	        Scene scene = new Scene(root, 400, 300);
	        scene.getRoot().setStyle("-fx-background-color: lightblue;");
	        primaryStage.setScene(scene);
	        primaryStage.setTitle(" Menú en JavaFX");
	        primaryStage.show();
	    }
		
		//metodo stop
		@Override
		public void stop() {
			System.out.println("metodo stop()");
			
		}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
