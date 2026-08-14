
import java.util.Scanner;

class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    public MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Price: " + price);
    }
}

class MobilePlanApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String planName = sc.nextLine();
        int price = sc.nextInt();
        MobilePlan m1 = new MobilePlan();
        m1.display();
        MobilePlan m2 = new MobilePlan(planName, price);
        m2.display();
    }
}
