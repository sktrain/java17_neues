package sk.train.app;

import java.lang.reflect.*;


import javax.swing.JFrame;
import javax.swing.JLabel;

import sk.train.service.Service;

public class Application {

	public static void main(String[] args) {
		
		Service serv = Service.getService();

		System.out.println(serv.getMessage());
		Class<?> clazz = serv.getClass();
		System.out.println(clazz);
		
		//Test Reflection
		try {
			Method m = clazz.getMethod("getMessage"); //soweit gut
			Object o = clazz.newInstance();
			Field f = clazz.getDeclaredField("i");
			System.out.println("Bis hierhin");
			f.setAccessible(true);
			f.setInt(o, 0);
			
			System.out.println(o);
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JFrame frame = new JFrame("Message");
		JLabel label = new JLabel(serv.getMessage());
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

}
