package gui

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.TextField
import scalafx.scene.control.Button
import scalafx.scene.control.MenuBar
import scalafx.scene.control.Menu
import scalafx.scene.control.MenuItem

object UserView extends JFXApp {
	stage = new PrimaryStage {
		title = "User Tool"
		
		scene = new Scene {
			val menuBar = new MenuBar
			val fileMenu = new Menu("File")
			val menuItem = new MenuItem("Open")
			fileMenu.items = List(menuItem)
			
			menuBar.menus = List(fileMenu)
			
			content = Seq(
				new TextField {
					text = "Test"
					layoutX = 200
					layoutY = 200
					
				}, 
				new Button{
					text = "Enter"
					layoutX = 100
					layoutY = 200
				},
				
				menuBar
			)
		}
	
	}
}