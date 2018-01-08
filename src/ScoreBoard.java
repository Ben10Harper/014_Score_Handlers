import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreBoard implements ActionListener {

	// example ...ScoreBoard extents JFrame implements ActionListener GOOD
	// example ...ScoreBoard extents JFrame implements ActionListener, AnotherOne
	// GOOD
	// example ...ScoreBoard extents JFrame, JPanel implements ActionListener BAD

	// extends means inherit - use all vars and methods of the superclass
	// implements means you must use an "interface"

	int homeScoreAmount = 0;
	int visitorScoreAmount = 0;

	JPanel titlePanel, scorePanel, buttonPanel;
	JLabel homeLabel, visitorLabel, homeScore, visitorScore;
	JButton resetButton;
	JButton addOneHome, addTwoHome, addThreeHome, addSixHome, minusOneHome;
	JButton addOneVisitor, addTwoVisitor, addThreeVisitor, addSixVisitor, minusOneVisitor;

	public Container createContentPane() {

		JPanel totalGUI = new JPanel();
		totalGUI.setSize(400, 300);
		totalGUI.setLayout(null);
		totalGUI.setBackground(Color.BLUE);

		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(null);
		titlePanel.setLocation(10, 10);
		titlePanel.setSize(330, 30);
		titlePanel.setBackground(Color.RED);
		totalGUI.add(titlePanel);

		homeLabel = new JLabel("Home Team");
		homeLabel.setLocation(0, 0);
		homeLabel.setSize(200, 30);
		homeLabel.setHorizontalAlignment(0);
		homeLabel.setForeground(Color.YELLOW);
		titlePanel.add(homeLabel);
		
		visitorLabel = new JLabel("Visiting Team");
		visitorLabel.setLocation(120, 0);
		visitorLabel.setSize(200, 30);
		visitorLabel.setHorizontalAlignment(0);
		visitorLabel.setForeground(Color.YELLOW);
		titlePanel.add(visitorLabel);
		
		JPanel scorePanel = new JPanel();
		scorePanel.setLayout(null);
		scorePanel.setLocation(10, 50);
		scorePanel.setSize(330, 30);
		scorePanel.setBackground(Color.GREEN);
		totalGUI.add(scorePanel);
		
		homeScore = new JLabel(""+homeScoreAmount);
		homeScore.setLocation(0,0);
		homeScore.setSize(200,30);
		homeScore.setHorizontalAlignment(0);
		scorePanel.add(homeScore);
		
		visitorScore = new JLabel(""+visitorScoreAmount);
		visitorScore.setLocation(120,0);
		visitorScore.setSize(200,30);
		visitorScore.setHorizontalAlignment(0);
		scorePanel.add(visitorScore);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setLocation(10, 90);
		buttonPanel.setSize(330, 195);
		buttonPanel.setBackground(Color.CYAN);
		totalGUI.add(buttonPanel);
		
		addOneHome = new JButton("+1");
		addOneHome.setLocation(5,5);
		addOneHome.setSize(160,30);
		addOneHome.addActionListener(this);
		buttonPanel.add(addOneHome);
		
		addOneVisitor = new JButton("+1");
		addOneVisitor.setLocation(165,5);
		addOneVisitor.setSize(160,30);
		addOneVisitor.addActionListener(this);
		buttonPanel.add(addOneVisitor);
		
		addTwoHome = new JButton("+2");
		addTwoHome.setLocation(5,35);
		addTwoHome.setSize(160,30);
		addTwoHome.addActionListener(this);
		buttonPanel.add(addTwoHome);
		
		addTwoVisitor = new JButton("+2");
		addTwoVisitor.setLocation(165,35);
		addTwoVisitor.setSize(160,30);
		addTwoVisitor.addActionListener(this);
		buttonPanel.add(addTwoVisitor);
		
		addThreeHome = new JButton("+3");
		addThreeHome.setLocation(5,65);
		addThreeHome.setSize(160,30);
		addThreeHome.addActionListener(this);
		buttonPanel.add(addThreeHome);
		
		addThreeVisitor = new JButton("+3");
		addThreeVisitor.setLocation(165,65);
		addThreeVisitor.setSize(160,30);
		addThreeVisitor.addActionListener(this);
		buttonPanel.add(addThreeVisitor);
		
		addSixHome = new JButton("+6");
		addSixHome.setLocation(5,95);
		addSixHome.setSize(160,30);
		addSixHome.addActionListener(this);
		buttonPanel.add(addSixHome);
		
		addSixVisitor = new JButton("+6");
		addSixVisitor.setLocation(165,95);
		addSixVisitor.setSize(160,30);
		addSixVisitor.addActionListener(this);
		buttonPanel.add(addSixVisitor);
		
		minusOneHome = new JButton("-1");
		minusOneHome.setLocation(5,125);
		minusOneHome.setSize(160,30);
		minusOneHome.addActionListener(this);
		buttonPanel.add(minusOneHome);
		
		minusOneVisitor = new JButton("-1");
		minusOneVisitor.setLocation(165,125);
		minusOneVisitor.setSize(160,30);
		minusOneVisitor.addActionListener(this);
		buttonPanel.add(minusOneVisitor);
		
		resetButton = new JButton("Start Over");
		resetButton.setLocation(5,160);
		resetButton.setSize(320,30);
		resetButton.addActionListener(this);
		buttonPanel.add(resetButton);
		
		return totalGUI;
	}

	// this method came to us from the interface ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == addOneHome) {
			homeScoreAmount = homeScoreAmount + 1;
			homeScore.setText(""+homeScoreAmount);
		} else if (e.getSource() == addOneVisitor) {
			visitorScoreAmount = visitorScoreAmount + 1;
			visitorScore.setText(""+visitorScoreAmount);
		} else if (e.getSource() == resetButton) {
			homeScoreAmount = 0;
			visitorScoreAmount = 0;
			homeScore.setText(""+homeScoreAmount);
			visitorScore.setText(""+visitorScoreAmount);
		} else if (e.getSource() == addTwoHome) {
			homeScoreAmount = homeScoreAmount + 2;
			homeScore.setText(""+homeScoreAmount);
		} else if (e.getSource() == addTwoVisitor) {
			visitorScoreAmount = visitorScoreAmount + 2;
			visitorScore.setText(""+visitorScoreAmount);
		} else if (e.getSource() == addThreeHome) {
			homeScoreAmount = homeScoreAmount + 3;
			homeScore.setText(""+homeScoreAmount);
		} else if (e.getSource() == addThreeVisitor) {
			visitorScoreAmount = visitorScoreAmount + 3;
			visitorScore.setText(""+visitorScoreAmount);
		} else if (e.getSource() == addSixHome) {
			homeScoreAmount = homeScoreAmount + 6;
			homeScore.setText(""+homeScoreAmount);
		} else if (e.getSource() == addSixVisitor) {
			visitorScoreAmount = visitorScoreAmount + 6;
			visitorScore.setText(""+visitorScoreAmount);
		} else if (e.getSource() == minusOneHome) {
			homeScoreAmount = homeScoreAmount - 1;
			if (homeScoreAmount<0) {
				homeScoreAmount=0;
			}
			homeScore.setText(""+homeScoreAmount);
		} else if (e.getSource() == minusOneVisitor) {
			visitorScoreAmount = visitorScoreAmount - 1;
			if (visitorScoreAmount<0) {
				visitorScoreAmount=0;
			}
			visitorScore.setText(""+visitorScoreAmount);
		}

	}

}
