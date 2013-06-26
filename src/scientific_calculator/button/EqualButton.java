package scientific_calculator.button;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;

import scientific_calculator.ArithmeticUnit;


/**=ボタンクラス*/
public class EqualButton extends JButton implements MouseListener{
	/**演算器*/
	ArithmeticUnit arithmeticUnit;
	/**=ボタン*/
	public EqualButton(String display, ArithmeticUnit arithmeticUnit) {
		this.arithmeticUnit =arithmeticUnit;
		addMouseListener(this);
	}
	
	/**クリックされた*/
	public void mouseClicked(MouseEvent e) {
		System.out.println("EqualButton!");
		arithmeticUnit.operate();
	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
	
}
