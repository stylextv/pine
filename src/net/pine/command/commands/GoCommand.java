package net.pine.command.commands;

import net.pine.command.Command;
import net.pine.command.InputController;
import net.pine.command.message.Message;
import net.pine.game.board.Board;
import net.pine.pick.MovePicker;

public class GoCommand extends Command {
	
	public GoCommand() {
		super("go");
		
		addExecutor(CommandPreset., null);
	}
	
	@Override
	public void execute(Message m) {
		Board b = InputController.getBoard();
		
		int move = MovePicker.pickMove(b);
		
		
	}
	
}
