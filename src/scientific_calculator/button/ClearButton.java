package scientific_calculator.button;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JButton;

import scientific_calculator.DisplayArea;


/**Cボタンクラス*/
public class ClearButton extends JButton implements MouseListener {
	/**表示する場所*/
	private DisplayArea displayArea;
	/**Cボタン*/
	public ClearButton(DisplayArea displayArea) {
		this.displayArea = displayArea;
		addMouseListener(this);
	}
	
	/**クリックされた*/
	public void mouseClicked(MouseEvent e) {
		displayArea.clear();
		Runtime r = Runtime.getRuntime();
		try{
			r.exec("say " + "clear!!!!");
		}
		catch (IOException e1){
			e1.printStackTrace();
		}
	}
	
	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
	
}