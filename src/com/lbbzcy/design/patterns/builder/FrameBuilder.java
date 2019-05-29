package com.lbbzcy.design.patterns.builder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-05-27 22:46
 * @Copyright: asiainfo
 */
public class FrameBuilder extends Builder implements ActionListener {

	private JFrame frame = new JFrame();
	private Box box = new Box(BoxLayout.Y_AXIS);

	@Override
	public void buildTitle(String title) {
		frame.setTitle(title);
	}

	@Override
	public void buildString(String str) {
		box.add(new JLabel(str));
	}

	@Override
	public void buildItems(String[] items) {
		Box innerbox = new Box(BoxLayout.Y_AXIS);
		for (int i=0;i<items.length;i++) {
			JButton button = new JButton(items[i]);
			button.addActionListener(this);
			innerbox.add(button);
		}
		box.add(innerbox);
	}

	@Override
	public void buildDone() {
		frame.getContentPane().add(box);
		frame.pack();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public JFrame getResult() {
		return frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
}
