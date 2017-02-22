package word.view;

import javax.swing.JFrame;

import word.controller.WordController;

import java.awt.Dimension;

public class WordFrame extends JFrame
{
	
	private WordController baseController;
	private WordPanel appPanel;
	public WordFrame(WordController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new WordPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(750, 600));
		this.setTitle("Word Stuffs");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
