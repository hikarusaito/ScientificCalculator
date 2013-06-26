package scientific_calculator.button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import scientific_calculator.DisplayArea;

/**8進数変換クラス*/
public class OctalButton extends JButton implements MouseListener{
	/**表示する場所*/
	private DisplayArea displayArea;
	
	/**8進数変換*/
	public OctalButton(String operator, DisplayArea displayArea){
		this.displayArea = displayArea;
		addMouseListener(this);
	}
	
	/**クリックされた*/
	public void mouseClicked(MouseEvent e) {
		try{
		System.out.println("OctalButton!");
		displayArea.setText("("+Integer.toOctalString(Integer.parseInt(displayArea.getText()))+")₈");
		}catch(Exception e1){
			System.out.println("double型は変換できません");
			displayArea.setText("error");
		}
		}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

}

