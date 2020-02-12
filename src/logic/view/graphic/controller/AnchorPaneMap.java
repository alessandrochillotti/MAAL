package logic.view.graphic.controller;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;
import logic.model.StringParser;
import logic.view.ViewComponent;

public class AnchorPaneMap extends Decorator{

	public AnchorPaneMap(ViewComponent anchorPaneComponent) {
		super(anchorPaneComponent);
	}
	
	public AnchorPane manageMap(AnchorPane anchorPane) {
		StringParser parser = new StringParser();
		WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        
        final URL urlGoogleMaps = getClass().getResource("../../resources/maps.html");
        webEngine.load(urlGoogleMaps.toExternalForm());
        webEngine.setOnAlert(new EventHandler<WebEvent<String>>() {
        	@Override
            public void handle(WebEvent<String> e) {
        		System.out.println(e.toString());
               }
            });
        
		Button b = new Button("OPEN IN MAPS");
		b.setMinWidth(anchorPane.getWidth());
		
		b.setAlignment(Pos.CENTER);
		b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	try {
					Desktop.getDesktop().browse(new URL(parser.parseStringMaps()).toURI()) ;
				} catch (MalformedURLException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
            }
        });
        
        VBox verticalBox = new VBox(webView, b);
        verticalBox.setMaxWidth(anchorPane.getWidth());
        verticalBox.setMaxHeight(anchorPane.getHeight());
		anchorPane.getChildren().add(verticalBox);
		return anchorPane;
    }
	
	
	@Override
	public AnchorPane draw() {
		AnchorPane preliminaryResults = super.draw();
		preliminaryResults = this.manageMap(preliminaryResults);
		return preliminaryResults;
	}
	
}