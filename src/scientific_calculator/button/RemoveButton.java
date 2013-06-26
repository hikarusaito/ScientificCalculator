package scientific_calculator.button;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JButton;

import scientific_calculator.DisplayArea;
/**delボタンクラス*/
public class RemoveButton extends JButton implements MouseListener{
	/**表示する場所*/
	private DisplayArea displayArea;
	/**delボタン*/
	public RemoveButton(DisplayArea displayArea){
		//setOpaque(false);
		this.displayArea = displayArea;
		addMouseListener(this);
	}
	
	/**クリックされた*/
	public void mouseClicked(MouseEvent e) {
		displayArea.removeSingleDisplayContent();
		Runtime r = Runtime.getRuntime();
		try{
			r.exec("say " + "delete!!!");
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
