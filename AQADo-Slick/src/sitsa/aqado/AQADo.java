package sitsa.aqado;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class AQADo extends StateBasedGame {
	
	public final int Main_Menu = 1;
	public final int Name_Input = 2;
    public final int How_To = 4;
    public final int In_Game2 = 5;

	public AQADo(String gamename) {
		super(gamename);
	}
	
	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		this.addState(new MainMenu(Main_Menu));
		this.addState(new NameInput(Name_Input));
        	this.addState(new HowTo(How_To));
        	this.addState(new InGame2(In_Game2));
		
		this.enterState(Main_Menu);
	}
	
	public static void main(String[] args){
		try{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new AQADo("AQADo"));
			appgc.setDisplayMode(700,  800, false);
			appgc.setShowFPS(false);
			appgc.start();
            Logger.getLogger(AQADo.class.getName()).log(Level.INFO, "Computer Science : AQADo - Connor Monaghan");
		}catch(SlickException ex){
			Logger.getLogger(AQADo.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
