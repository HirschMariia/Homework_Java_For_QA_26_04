public class Ticket implements Comparable<Ticket> {
        private final String fullName;
        private final int ticketNumber;
        private final String doctorName;

        public Ticket(String fullName, int ticketNumber, String doctorName) {
            this.fullName = fullName;
            this.ticketNumber = ticketNumber;
            this.doctorName = doctorName;
        }

        @Override
        public int compareTo(Ticket o) {
            return Integer.compare(this.ticketNumber, o.ticketNumber);
        }

        @Override
        public String toString() {
            return "Ticket{" +
                    "fullName='" + fullName + '\'' +
                    ", ticketNumber=" + ticketNumber +
                    ", doctorName='" + doctorName + '\'' +
                    '}';
        }
    }


