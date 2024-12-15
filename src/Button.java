public class Button {
    IEventHandler handler;

    public Button(IEventHandler handler){
        this.handler = handler;
    }

    public void click(){
        handler.execute();
    }

    public void setHandler(IEventHandler handler){
        this.handler = handler;
    }
}

class PowerButton extends Button{
    public boolean isPower;
    public PowerButton(IEventHandler handler) {
        super(handler);
        this.isPower = false;
    }

    public PowerButton(){
        this(null);
    }

    @Override
    public void click() {
        isPower = !isPower;
        super.click();
    }
}

interface IEventHandler{
    void execute();
}

class PowerOnHandler implements IEventHandler{

    @Override
    public void execute() {
        System.out.println("Power On");
    }
}

class PowerOffHandler implements IEventHandler{

    @Override
    public void execute() {
        System.out.println("Power Off");
    }
}
