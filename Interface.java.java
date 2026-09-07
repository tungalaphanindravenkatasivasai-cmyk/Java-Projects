import java.util.Scanner;
interface SmartDevice {
  void turnOn();
  void turnOff();
}

class SmartFan implements SmartDevice {
  public void turnOn() {
  System.out.println("Smart Fan is turned ON");
  }
  public void turnOff() {
  System.out.println("Smart Fan is turned OFF");
  }
}

class SmartLight implements SmartDevice {
  public void turnOn() {
    System.out.println("Smart Light is turned ON");
  }
  public void turnOff() {
    System.out.println("Smart Light is turned OFF");
  }
}

class SmartAC implements SmartDevice {
  public void turnOn() {
    System.out.println("Smart AC is turned ON");
  }
  public void turnOff() {
    System.out.println("Smart AC is turned OFF");
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      String command = sc.nextLine();
      String[] parts = command.split(" ");
      String device = parts[0];
      String action = parts[1];
      SmartDevice obj;
      if (device.equals("Fan")) {
        obj = new SmartFan();
      } else if (device.equals("Light")) {
        obj = new SmartLight();
      } else {
        obj = new SmartAC();
      }
      if (action.equals("ON")) {
        obj.turnOn();
      } else {
        obj.turnOff();
      }
    }  
    sc.close();
  }
}