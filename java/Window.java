package create2_environment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("all")
public class Window extends JFrame{
	
	JPanel mainPanel = new JPanel();
	
	public Window()
	{
		mainPanel.setLayout(new BorderLayout());
		setJMenuBar(new Menu());
		
		mainPanel.add(new IO(),BorderLayout.WEST);
		mainPanel.add(new Room(),BorderLayout.CENTER);

		add(mainPanel);
		setSize(1424, 768);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//
	class Menu extends JMenuBar
	{
		public Menu()
		{
			//Build the first menu.
			JMenu menu = new JMenu("Menu");
			add(menu);
			
			JMenuItem menuItem = new JMenuItem("Item");
			menu.add(menuItem);
			
			JMenuItem exitItem = new JMenuItem("exit");
			exitItem.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent event) {
		            System.exit(0);
		        }
			});
			menu.add(exitItem);
		}
	}
	
	//
	class IO extends JPanel
	{
		public IO()
		{
			setLayout(new BorderLayout());
			
			setBorder(BorderFactory.createTitledBorder(
			        BorderFactory.createEtchedBorder()));
			setPreferredSize(new Dimension(250,50));

			// input
			JTextArea inputTextBox = new JTextArea(18,20);
			inputTextBox.setLineWrap(true);
			inputTextBox.setWrapStyleWord(true);
			JScrollPane scrollPane_1 = new JScrollPane(
					inputTextBox, 
					JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			
			scrollPane_1.setBorder(BorderFactory.createTitledBorder(
			        BorderFactory.createEtchedBorder(), "Input"));
			add(scrollPane_1,BorderLayout.NORTH);
			
			// button
			JPanel temp = new JPanel();
			temp.add(new JButton("Send Commands"));
			add(temp,BorderLayout.CENTER);
			
			// output
			JTextArea outputTextBox = new JTextArea(18,20);
			outputTextBox.setLineWrap(true);
			outputTextBox.setWrapStyleWord(true);
			JScrollPane scrollPane_2 = new JScrollPane(
					outputTextBox, 
					JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
					JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane_2.setBorder(BorderFactory.createTitledBorder(
			        BorderFactory.createEtchedBorder(), "Output"));
			add(scrollPane_2,BorderLayout.SOUTH);
			
			pack();
			
			//setBackground(Color.green);
			setTitle("test");
		}
	}
	
	//
	class Room extends JPanel
	{
		public Room()
		{
			setBackground(Color.red);
			// add drawing of a queue here
		}
	}
}
