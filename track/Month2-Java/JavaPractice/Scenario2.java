// Mobile unlocking using method overloading

class Mobile {

    void unlock(int pin) {
        if (pin == 1234) {
            System.out.println("Pin matched, Mobile is unlocked");
        } else {
            System.out.println("Invalid pin");
        }
    }

    void unlock(String password) {
        if (password == "Captian America") {
            System.out.println("Password matched, Mobile is unlocked");
        } else {
            System.out.println("Invalid password");
        }
    }

    void unlock(Pattern p1) {
        if (p1 != null) {
            System.out.println("Pattern matched, Mobile unlocked");
        } else {
            System.out.println("Invalid Pattern");
        }
    }

    void unlock(FaceId f) {
        if (f != null) {
            System.out.println("FaceId matched, Mobile unlocked");
        } else {
            System.out.println("Invalid FaceId");
        }
    }

    void unlock(FingerPrint fp) {
        if (fp != null) {
            System.out.println("Fingerprint matched, Mobile is unlocked");
        } else {
            System.out.println("Invalid fingerprint");
        }
    }
}

class Pattern {

}

class FaceId {

}

class FingerPrint {

}

class Scenario2 {

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Pattern p1 = new Pattern();
        FaceId f = new FaceId();
        FingerPrint fp = new FingerPrint();
        String password = "Captain America";
        int pin = 1234;
        m1.unlock(pin);
        m1.unlock(password);
        m1.unlock(p1);
        m1.unlock(f);
        m1.unlock(fp);

    }
}
