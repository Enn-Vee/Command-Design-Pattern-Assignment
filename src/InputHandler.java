import java.util.Map;
import java.util.HashMap;
public class InputHandler {
	private Map<String, Command> commands;
	public InputHandler(Player player) {
		commands = new HashMap<>();
		Command jump = new JumpCommand(player);
		Command run = new RunCommand(player);
		Command fire = new FireCommand(player);
		Command quit = new QuitCommand();
		commands.put("jump", jump);
		commands.put("run", run);
		commands.put("fire", fire);
		commands.put("quit", quit);
	}
	
	public void buttonPressed(String button) {
		commands.get(button).execute();
	}
}
