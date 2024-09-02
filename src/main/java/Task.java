public class Task {
    private final String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void markDone(){
        this.isDone = true;
    }

    public void unmarkDone(){
        this.isDone = false;
    }

    public String toString() { return String.format("[%s] %s", isDone ? "X" : " ", description); }
}
