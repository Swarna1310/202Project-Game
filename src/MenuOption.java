
public class MenuOption extends Actor {

    private ICommand command = null;

    public MenuOption(String name) {


    }
  public void setCommand(ICommand command) {
        this.command = command;
    }


    @Override
    public void act() {
            if (this.command != null) {
                command.execute();
        }
    }

  
}
