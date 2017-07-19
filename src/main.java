import javax.swing.JFrame;


public class main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		Gameplay gameplay = new Gameplay();
		
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Breakout game");
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setVisible(true);
		obj.setResizable(false);
		obj.add(gameplay);
		
	}

}
