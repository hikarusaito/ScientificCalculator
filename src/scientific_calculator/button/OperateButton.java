package scientific_calculator.button;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import scientific_calculator.DisplayArea;

/**演算記号ボタンクラス*/
public class OperateButton extends JButton implements MouseListener {
	/**表示する場所*/
	private DisplayArea displayArea;
	/**演算記号*/
	final String operator;
	
	/**演算記号ボタン*/
	public OperateButton(String operator, DisplayArea displayArea) {
		this.displayArea = displayArea;
		this.operator=setOperator(operator);
		addMouseListener(this);
	}
	
	/**演算記号入力*/
	private String setOperator(String operator){
		if(operator.equals("x²")){
			return "²";
		}
		else if(operator.equals("x³")){
			return "³";
		}
		else if(operator.equals("xⁿ")){
			return "^";
		}
		return operator;
		
	}

	/**クリックされた*/
	public void mouseClicked(MouseEvent e) {
		System.out.println("OperationButton!");
		displayArea.addDisplayContent(operator);
	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
}
