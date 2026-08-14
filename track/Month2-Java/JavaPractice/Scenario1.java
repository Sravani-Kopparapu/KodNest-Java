
class Bus {

    String Conductor;
    String Passenger;
}

class Conductor {

    String name;

    Ticket giveTicket() {
        Ticket t = new Ticket();
        System.out.println("Ticket issued to passenger");
        return t;
    }

    void collectMoney(Money cash) {

        System.out.println("Money Collected by the conductor");
    }
}

class Passenger {

    void collectTicket(Ticket t) {
        if (t != null) {
            System.out.println("Ticket is collected");
        } else {
            System.out.println("Ticket is not valid");
        }

    }

    Money payMoney() {
        Money m = new Money();
        System.out.println("Money paid to conductor");
        return m;
    }
}

class Ticket {

}

class Money {

}

class Scenario1 {

    public static void main(String[] args) {
        Conductor c = new Conductor();
        Passenger p = new Passenger();
        Money cash = new Money();
        Ticket ticket = new Ticket();
        System.out.println(ticket);
        c.collectMoney(cash);
        c.giveTicket();
        p.payMoney();
        p.collectTicket(ticket);
    }
}
