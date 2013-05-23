import javax.swing.JFrame;

import com.crud.gui.MainWindow;
import com.crud.gui.MainWindow2;


public class app {

	public static void main(String[] args) {
		MainWindow2 mainWindow2 = new MainWindow2();
		mainWindow2.setVisible(true);
		mainWindow2.setResizable(true);
		mainWindow2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
