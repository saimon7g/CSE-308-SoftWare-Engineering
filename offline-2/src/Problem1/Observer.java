package Problem1;

public abstract class Observer {
    private ServerABC server;
    private int state;
    private String name;

    public Observer(ServerABC server, String name) {
        this.server = server;
        this.server.newUser(this);
        this.name = name;
        state = 1;
    }

    public ServerABC getServer() {
        return server;
    }

    public void setServer(ServerABC server) {
        this.server = server;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void notifyObserver();
}
