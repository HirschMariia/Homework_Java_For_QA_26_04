

public class HospitalQueueSimulation {
    public static void main(String[] args) {
        TicketQueue ticketQueue = new TicketQueue();
        ticketQueue.addTicket(new Ticket("Иванов Иван Иванович", 3, "Терапевт"));
        ticketQueue.addTicket(new Ticket("Петров Петр Петрович", 1, "Хирург"));
        ticketQueue.addTicket(new Ticket("Сидоров Сидор Сидорович", 2, "Окулист"));

        ticketQueue.displayQueue();

        Ticket nextTicket = ticketQueue.getNextTicket();
        System.out.println("Next Ticket: " + nextTicket);
    }
}

