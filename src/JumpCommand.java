
public class JumpCommand implements Command {
	private Player player;
	public JumpCommand(Player aPlayer) {
		this.player = aPlayer;
	}
	public void execute() {
		this.player.jump();
	}
}
