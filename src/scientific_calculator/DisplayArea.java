package scientific_calculator;

import java.awt.Color;
import java.awt.Font;

import javax.print.attribute.standard.Finishings;
import javax.swing.JTextArea;


/**表示する場所クラス*/
public class DisplayArea extends JTextArea{
	/**表示している数式*/
	private String displayContent = "";
	/**入力完了フラグ*/
	private boolean finishedFlag = true;

	/**表示する場所*/
	DisplayArea(){
		setBackground(Color.white);
		setText("");
		setRows(1);
		Font font = new Font("Dialog", Font.PLAIN, 45);
		setFont(font);
	}

	/**表示する数式の追加*/
	public void addDisplayContent(String displayContent){
			if (finishedFlag == true){
				this.displayContent = displayContent;
				finishedFlag = false;
			}else{
				this.displayContent = getText() + displayContent;
			}
			setText(this.displayContent);
	}

	/**表示する数式の1文字削除*/
	public void removeSingleDisplayContent(){
		if (displayContent.length() > 0){
			displayContent = displayContent.substring(0, displayContent.length() - 1);
			setText(displayContent);
		}
	}

	/**表示の初期化*/
	public void clear(){
		displayContent = "";
		setText("");
		finishedFlag = true;
	}

	/**入力完了フラグ*/
	public void finished(){
		finishedFlag = true;
	}

}
