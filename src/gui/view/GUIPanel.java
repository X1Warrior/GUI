package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIAppController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click on the button");
		appLayout = new SpringLayout();
		
		setupPanel();
	}
	
	/**
	 * used to add all components to the screen and install a layout manager
	 * also set color :D
	 */
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.add(firstButton);
		this.setLayout(appLayout);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
