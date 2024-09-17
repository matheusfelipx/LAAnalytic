package usa.com.nba.atletas;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage palcoPrincipal) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("telaUm.fxml"));
			Scene cenario = new Scene(root,400,400);
			cenario.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
			palcoPrincipal.setScene(cenario);
			palcoPrincipal.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
