package scientific_calculator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import scientific_calculator.button.*;
/**関数電卓クラス*/
public class Calculator extends JFrame{
	/**表示する場所*/
	private DisplayArea displayArea;
	/**演算器*/
	private ArithmeticUnit arithmeticUnit;

	/**数字ボタン*/
	private NumberButton[] numberButton;
	/**πボタン*/
	private NumberButton piButton;
	/**eボタン*/
	private NumberButton napierButton;

	/**+ボタン*/
	private OperateButton plusButton;
	/**-ボタン*/
	private OperateButton minusButton;
	/**×ボタン*/
	private OperateButton multiplyButton;
	/**÷ボタン*/
	private OperateButton divideButton;
	/**!ボタン*/
	private OperateButton factorialButton;
	/**logボタン*/
	private OperateButton logarithmsButton;
	/**lnボタン*/
	private OperateButton logarithmsNaturalButton;
	/**sinボタン*/
	private OperateButton sinButton;
	/**cosボタン*/
	private OperateButton cosButton;
	/**tanボタン*/
	private OperateButton tanButton;
	/**2乗ボタン*/
	private OperateButton squareButton;
	/**3乗ボタン*/
	private OperateButton cubeButton;
	/**n乗ボタン*/
	private OperateButton nTimesPowerButton;
	/**(ボタン*/
	private OperateButton leftBracketButton;
	/**)ボタン*/
	private OperateButton rightBracketButton;
	/**.ボタン*/
	private OperateButton radixPointButton;
	/**Cボタン*/
	private ClearButton clearButton;
	/**=ボタン*/
	private EqualButton equalButton;
	/**delボタン*/
	private RemoveButton removeButton;
	/**2進数ボタン*/
	private BinaryButton binaryButton;
	/**8進数ボタン*/
	private OctalButton octalButton;
	/**16進数ボタン*/
	private HexButton hexButton;

	/**数字ボタン画像*/
	private ImageIcon numberButtonIcon0 = new ImageIcon("src/scientific_calculator/images/0ButtonIcon.gif");
	private ImageIcon numberButtonIcon1 = new ImageIcon("src/scientific_calculator/images/1ButtonIcon.gif");
	private ImageIcon numberButtonIcon2 = new ImageIcon("src/scientific_calculator/images/2ButtonIcon.gif");
	private ImageIcon numberButtonIcon3 = new ImageIcon("src/scientific_calculator/images/3ButtonIcon.gif");
	private ImageIcon numberButtonIcon4 = new ImageIcon("src/scientific_calculator/images/4ButtonIcon.gif");
	private ImageIcon numberButtonIcon5 = new ImageIcon("src/scientific_calculator/images/5ButtonIcon.gif");
	private ImageIcon numberButtonIcon6 = new ImageIcon("src/scientific_calculator/images/6ButtonIcon.gif");
	private ImageIcon numberButtonIcon7 = new ImageIcon("src/scientific_calculator/images/7ButtonIcon.gif");
	private ImageIcon numberButtonIcon8 = new ImageIcon("src/scientific_calculator/images/8ButtonIcon.gif");
	private ImageIcon numberButtonIcon9 = new ImageIcon("src/scientific_calculator/images/9ButtonIcon.gif");
	/**πボタン画像*/
	private ImageIcon piButtonIcon = new ImageIcon("src/scientific_calculator/images/piButtonIcon.gif");
	/**eボタン画像*/
	private ImageIcon eButtonIcon = new ImageIcon("src/scientific_calculator/images/eButtonIcon.gif");
	/**.ボタン画像*/
	private ImageIcon radixPointButtonIcon = new ImageIcon("src/scientific_calculator/images/dotButtonIcon.gif");
	/**数字ボタン配列*/
	private ImageIcon[] numberButtonIcons = {numberButtonIcon0,numberButtonIcon1,numberButtonIcon2,numberButtonIcon3,numberButtonIcon4,numberButtonIcon5,numberButtonIcon6,numberButtonIcon7,numberButtonIcon8,numberButtonIcon9};
	/**cosボタン画像*/
	private ImageIcon cosButtonIcon = new ImageIcon("src/scientific_calculator/images/cosButtonIcon.gif");
	/**sinボタン画像*/
	private ImageIcon sinButtonIcon = new ImageIcon("src/scientific_calculator/images/sinButtonIcon.gif");
	/**tanボタン画像*/
	private ImageIcon tanButtonIcon = new ImageIcon("src/scientific_calculator/images/tanButtonIcon.gif");
	/**+ボタン画像*/
	private ImageIcon plusButtonIcon = new ImageIcon("src/scientific_calculator/images/plusButtonIcon.gif");
	/**-ボタン画像*/
	private ImageIcon minusButtonIcon = new ImageIcon("src/scientific_calculator/images/minusButtonIcon.gif");
	/**÷ボタン画像*/
	private ImageIcon divideButtonIcon = new ImageIcon("src/scientific_calculator/images/divideButtonIcon.gif");
	/**×ボタン画像*/
	private ImageIcon multiButtonIcon = new ImageIcon("src/scientific_calculator/images/multiButtonIcon.gif");
	/**delボタン画像*/
	private ImageIcon deleteButtonIcon = new ImageIcon("src/scientific_calculator/images/deleteButtonIcon.gif");
	/**=ボタン画像*/
	private ImageIcon equalButtonIcon = new ImageIcon("src/scientific_calculator/images/equalButtonIcon.gif");
	/**Cボタン画像*/
	private ImageIcon clearButtonIcon = new ImageIcon("src/scientific_calculator/images/clearButtonIcon.gif");
	/**(ボタン画像*/
	private ImageIcon leftBracketButtonIcon = new ImageIcon("src/scientific_calculator/images/leftBracketButtonIcon.gif");
	/**)ボタン画像*/
	private ImageIcon rightBracketButtonIcon = new ImageIcon("src/scientific_calculator/images/rightBracketButtonIcon.gif");
	/**lnボタン画像*/
	private ImageIcon lnButtonIcon = new ImageIcon("src/scientific_calculator/images/lnButtonIcon.gif");
	/**logボタン画像*/
	private ImageIcon logButtonIcon = new ImageIcon("src/scientific_calculator/images/logButtonIcon.gif");
	/**!ボタン画像*/
	private ImageIcon factorialButtonIcon = new ImageIcon("src/scientific_calculator/images/factorialButtonIcon.gif");
	/**2乗ボタン画像*/
	private ImageIcon squareButtonIcon = new ImageIcon("src/scientific_calculator/images/squareButtonIcon.gif");
	/**3乗ボタン画像*/
	private ImageIcon cubeButtonIcon = new ImageIcon("src/scientific_calculator/images/cubeButtonIcon.gif");
	/**n乗ボタン画像*/
	private ImageIcon nTimesPowerButtonIcon = new ImageIcon("src/scientific_calculator/images/nTimesPowerButtonIcon.gif");
	/**2進数ボタン画像*/
	private ImageIcon binaryButtonIcon = new ImageIcon("src/scientific_calculator/images/binaryButtonIcon.gif");
	/**8進数ボタン画像*/
	private ImageIcon octalButtonIcon = new ImageIcon("src/scientific_calculator/images/octalButtonIcon.gif");
	/**16進数ボタン画像*/
	private ImageIcon hexButtonIcon = new ImageIcon("src/scientific_calculator/images/hexButtonIcon.gif");

	/**関数電卓(main)*/
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.setVisible(true);
	}

	/**関数電卓*/
	Calculator(){
		initFields();
		initGUI();
	}

	/**関数電卓の属性を初期化する*/
	public void initFields(){
		displayArea = new DisplayArea();
		numberButton = new NumberButton[10];
		for (int i = 0; i < 10; i++){
			numberButton[i] = new NumberButton(""+i, displayArea);
			numberButton[i].setIcon(numberButtonIcons[i]);
			add(numberButton[i]);
		}

		piButton = new NumberButton("π", displayArea);
		napierButton = new NumberButton("e", displayArea);
		clearButton = new ClearButton(displayArea);

		// new arithmeticUnit
		arithmeticUnit = new ArithmeticUnit(displayArea);
		equalButton = new EqualButton("=", arithmeticUnit);
		plusButton = new OperateButton("+", displayArea);
		minusButton = new OperateButton("-", displayArea);
		multiplyButton = new OperateButton("*", displayArea);
		divideButton = new OperateButton("/", displayArea);

		factorialButton = new OperateButton("!", displayArea);
		logarithmsButton = new OperateButton("Log", displayArea);
		logarithmsNaturalButton = new OperateButton("ln", displayArea);
		sinButton = new OperateButton("Sin", displayArea);
		cosButton = new OperateButton("Cos", displayArea);
		tanButton = new OperateButton("Tan", displayArea);

		squareButton = new OperateButton("x²", displayArea);
		cubeButton = new OperateButton("x³", displayArea);
		nTimesPowerButton = new OperateButton("xⁿ", displayArea);
		leftBracketButton = new OperateButton("(", displayArea);
		rightBracketButton = new OperateButton(")", displayArea);
		radixPointButton = new OperateButton(".", displayArea);
		removeButton = new RemoveButton(displayArea);

		binaryButton = new BinaryButton("2",displayArea);
		octalButton = new OctalButton("8",displayArea);
		hexButton = new HexButton("16",displayArea);
	}

	/**関数電卓の表示を初期化する*/
	public void initGUI(){
		// initialize
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 370);
		setLocation(100, 100);
		setResizable(false);
		setLayout(null);

		// new and add DisplayArea.
		displayArea.setBounds(10, 10, 580, 80);
		add(displayArea);

		numberButton[0].setBounds(350, 280, 120, 60);
		numberButton[1].setBounds(350, 220, 60, 60);
		numberButton[2].setBounds(410, 220, 60, 60);
		numberButton[3].setBounds(470, 220, 60, 60);
		numberButton[4].setBounds(350, 160, 60, 60);
		numberButton[5].setBounds(410, 160, 60, 60);
		numberButton[6].setBounds(470, 160, 60, 60);
		numberButton[7].setBounds(350, 100, 60, 60);
		numberButton[8].setBounds(410, 100, 60, 60);
		numberButton[9].setBounds(470, 100, 60, 60);

		// new and add NumberButtons. pi and e
		piButton.setBounds(190, 220, 60, 60);
		piButton.setIcon(piButtonIcon);
		add(piButton);
		napierButton.setBounds(190, 280, 60, 60);
		napierButton.setIcon(eButtonIcon);
		add(napierButton);

		// new and add ClearButton.
		clearButton.setBounds(530, 160, 60, 60);
		clearButton.setIcon(clearButtonIcon);
		add(clearButton);

		// new and add EqualButton.
		equalButton.setBounds(530, 220, 60, 120);
		equalButton.setIcon(equalButtonIcon);
		add(equalButton);

		// new and add OperateButtons.
		plusButton.setBounds(250, 100, 60, 60);
		plusButton.setIcon(plusButtonIcon);
		add(plusButton);

		minusButton.setBounds(250, 160, 60, 60);
		minusButton.setIcon(minusButtonIcon);
		add(minusButton);

		multiplyButton.setBounds(250, 220, 60, 60);
		multiplyButton.setIcon(multiButtonIcon);
		add(multiplyButton);

		divideButton.setBounds(250, 280, 60, 60);
		divideButton.setIcon(divideButtonIcon);
		add(divideButton);

		factorialButton.setBounds(130, 100, 60, 60);
		factorialButton.setIcon(factorialButtonIcon);
		add(factorialButton);

		logarithmsButton.setBounds(70, 100, 60, 60);
		logarithmsButton.setIcon(logButtonIcon);
		add(logarithmsButton);

		logarithmsNaturalButton.setBounds(10, 100, 60, 60);
		logarithmsNaturalButton.setIcon(lnButtonIcon);
		add(logarithmsNaturalButton);

		sinButton.setBounds(10, 160, 60, 60);
		sinButton.setIcon(sinButtonIcon);
		add(sinButton);

		cosButton.setBounds(70, 160, 60, 60);
		cosButton.setIcon(cosButtonIcon);
		add(cosButton);

		tanButton.setBounds(130, 160, 60, 60);
		tanButton.setIcon(tanButtonIcon);
		add(tanButton);

		squareButton.setBounds(10, 220, 60, 60);
		squareButton.setIcon(squareButtonIcon);
		add(squareButton);

		cubeButton.setBounds(70, 220, 60, 60);
		cubeButton.setIcon(cubeButtonIcon);
		add(cubeButton);

		nTimesPowerButton.setBounds(130, 220, 60, 60);
		nTimesPowerButton.setIcon(nTimesPowerButtonIcon);
		add(nTimesPowerButton);

		binaryButton.setBounds(10, 280, 60, 60);
		binaryButton.setIcon(binaryButtonIcon);
		add(binaryButton);

		octalButton.setBounds(70, 280, 60, 60);
		octalButton.setIcon(octalButtonIcon);
		add(octalButton);

		hexButton.setBounds(130, 280, 60, 60);
		hexButton.setIcon(hexButtonIcon);
		add(hexButton);

		leftBracketButton.setBounds(190, 100, 60, 60);
		leftBracketButton.setIcon(leftBracketButtonIcon);
		add(leftBracketButton);

		rightBracketButton.setBounds(190, 160, 60, 60);
		rightBracketButton.setIcon(rightBracketButtonIcon);
		add(rightBracketButton);

		radixPointButton.setBounds(470, 280, 60, 60);
		radixPointButton.setIcon(radixPointButtonIcon);
		add(radixPointButton);

		removeButton.setBounds(530, 100, 60, 60);
		removeButton.setIcon(deleteButtonIcon);
		add(removeButton);

	}


}
