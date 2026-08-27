interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {

    public void turnOn() {
        System.out.println("Light is turned on");
    }

    public void turnOff() {
        System.out.println("Light is turned off");
    }
}

class Fan implements SmartDevice {

    public void turnOn() {
        System.out.println("Fan is turned on");
    }

    public void turnOff() {
        System.out.println("Fan is turned off");
    }
}

class AirConditioner implements SmartDevice {

    public void turnOn() {
        System.out.println("AC is turned on");
    }

    public void turnOff() {
        System.out.println("AC is turned off");
    }
}

class Main {
    public static void main(String[] args) {

        SmartDevice t = new Light();
        t.turnOn();
        t.turnOff();

        t = new Fan();
        t.turnOn();
        t.turnOff();

        t = new AirConditioner();
        t.turnOn();
        t.turnOff();
    }
}