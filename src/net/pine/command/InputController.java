package net.pine.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import net.pine.command.message.Message;
import net.pine.game.board.Board;

public class InputController {
	
	private static Board board;
	
	private static boolean active;
	
	public static void start() {
		try {
			
			active = true;
			
			onStart();
			
			InputStreamReader reader = new InputStreamReader(System.in);
			
			BufferedReader buffered = new BufferedReader(reader);
			
			while(active) {
				
				String s = buffered.readLine();
				
				if(s == null) break;
				
				Message m = Message.fromString(s);
				
				CommandManager.parseMessage(m);
			}
			
			onStop();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void stop() {
		active = false;
	}
	
	public static void sendMessage(String name, String... args) {
		Message m = new Message(name, args);
		
		sendMessage(m);
	}
	
	public static void sendMessage(Message m) {
		String s = m.toString();
		
		System.out.println(s);
	}
	
	private static void onStart() {
		
	}
	
	private static void onStop() {
		
	}
	
	public static Board getBoard() {
		return board;
	}
	
	public static boolean isActive() {
		return active;
	}
	
}
