package sk.train.app;

import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JLabel;

import sk.train.service.Service;

public class Application {

	public static void main(String[] args) {
		
		Service serv = new Service();

		System.out.println(serv.getMessage());
		Class<?> clazz = serv.getClass();
		System.out.println(clazz);
		
		
		
		JFrame frame = new JFrame("Message");
		JLabel label = new JLabel(serv.getMessage().getS());
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setSize(200, 200);
		frame.setVisible(true);

	}

}
