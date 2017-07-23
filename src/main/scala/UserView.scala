package gui

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.TextField
import scalafx.scene.control.Button
import scalafx.scene.control.MenuBar

object UserView extends JFXApp {
	stage = new PrimaryStage {
		title = "User Tool"
		
		scene = new Scene {
			content = Seq(
				new TextField {
					text = "Test"
					
				}, 
				new Button{
					text = "Enter"
					layoutX = 100
					layoutY = 200
				},
				
				new MenuBar{
				
				
				}
			)
		}
	
	}
}