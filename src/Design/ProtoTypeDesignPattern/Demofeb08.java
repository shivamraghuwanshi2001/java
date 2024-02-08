package Design.ProtoTypeDesignPattern;

public class Demofeb08 {
    public static void main(String[] args) {
        System.out.println("creating a Obj using Prototype Design");
        NewConnection newConnection= new NewConnection();
        newConnection.setIp("192.003.004.4.6");
        newConnection.loadVeryVeryImpotandData();
        System.out.println(newConnection);


          try {
              NewConnection newConnection1=(NewConnection) newConnection.clone();
              newConnection1.setIp("120.230.456.1.8");

              System.out.println(newConnection1);

          }
          catch (CloneNotSupportedException e)
          {
              e.printStackTrace();
          }

    }
}
