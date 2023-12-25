package Interface;

public class Car implements carInterface{

    public boolean isHandBreakApplied;

    public boolean isHandBreakApplied() {
        return isHandBreakApplied;
    }

    public void setHandBreakApplied(boolean isHandBreakApplied) {
        this.isHandBreakApplied = isHandBreakApplied;
    }

    @Override
    public boolean applyBreak(boolean status) {
        
        isHandBreakApplied = status;
        return isHandBreakApplied;
        
    }
    
}
