package main;

import java.awt.EventQueue;

import manager.Manager;

/**
 * @author alu2017243
 *
 */
public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					Manager manager = new Manager();
					manager.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}