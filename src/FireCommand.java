
public class FireCommand implements Command {
	private Player player;
	public FireCommand(Player aPlayer) {
		this.player = aPlayer;
	}
	public void execute() {
		this.player.fire();
	}
}
