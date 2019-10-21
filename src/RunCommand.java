
public class RunCommand implements Command {
	private Player player;
	public RunCommand(Player aPlayer) {
		this.player = aPlayer;
	}
	public void execute() {
		this.player.runForward();
	}
}
