import java.util.PriorityQueue;

public class TicketQueue {
    private final PriorityQueue<Ticket> queue;

    public TicketQueue() {
        this.queue = new PriorityQueue<>();
    }

    public void addTicket(Ticket ticket) {
        queue.add(ticket);
    }

    public Ticket getNextTicket() {
        return queue.poll();
    }

    public boolean hasNextTicket() {
        return !queue.isEmpty();
    }

    public void displayQueue() {
        for (Ticket ticket : queue) {
            System.out.println(ticket);
        }
    }
}

