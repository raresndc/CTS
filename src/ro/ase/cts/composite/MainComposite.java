package ro.ase.cts.composite;

public class MainComposite {
    public static void main(String[] args){
        EmailReceiver email1 = new EmailAddress("ion.popescu@ase.ro");
        EmailReceiver email2 = new EmailAddress("maria.popescu@ase.ro");
        EmailReceiver group1 = new EmailGroup("gr1@ase.ro");
        group1.addReceiver(email1);
        group1.addReceiver(email2);
        group1.receive("buna");

        EmailReceiver group2 = new EmailGroup("seriaA@ase.ro");
        EmailReceiver email3 = new EmailAddress("secretar@ase.ro");
        group2.addReceiver(group1);
        group2.addReceiver(email3);
        group2.receive("legitimatiile sunt gata!");

    }
}
