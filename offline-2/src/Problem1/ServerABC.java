package Problem1;

import java.util.ArrayList;
import java.util.List;

public class ServerABC {
    private List<Observer> observers;
    private int previousState;
    private int currentState;

    public ServerABC() {
        observers = new ArrayList<>();
        currentState = 1;
    }

    public void setCurrentState(int currentState) {
        previousState = this.currentState;
        this.currentState = currentState;
        notifyAllObserver();
    }

    public int getPreviousState() {
        return previousState;
    }

    public int getCurrentState() {
        return currentState;
    }

    public void newUser(Observer observer) {
        observers.add(observer);
    }
    public void notifyAllObserver() {
        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).notifyObserver();
        }
    }
}