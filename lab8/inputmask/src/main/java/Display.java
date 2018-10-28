
class Display implements IDisplayComponent, IKeyEventHandler {

    protected IKeyEventHandler nextHandler;


    public void setNext(IKeyEventHandler next) {

    }

    public String display() {
        return "";
    }

    public void key(String ch, int cnt) {


    }

    public void addSubComponent(IDisplayComponent c) {
        return;
    }

}