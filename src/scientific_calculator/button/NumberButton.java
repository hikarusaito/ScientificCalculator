package scientific_calculator.button;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import scientific_calculator.DisplayArea;


/**数字ボタンクラス*/
public class NumberButton extends JButton implements MouseListener {
	/**数字*/
	private String value;
	/**表示する場所*/
	private DisplayArea displayArea;
	
	/**数字ボタン*/
	public NumberButton(String value, DisplayArea displayArea) {
		this.value = value;
		this.displayArea = displayArea;
		addMouseListener(this);
	}
	
	/**クリックされた*/
	public void mouseClicked(MouseEvent e) {
		displayArea.addDisplayContent(value);
	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
	
}
