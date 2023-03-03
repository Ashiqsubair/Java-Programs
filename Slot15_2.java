import java.net.Inet4Address;
import java.net.InetAddress;

import java.*;
import java.net.*;
public class Slot15_2 {
    public static void main(String[] args) {
        try{
            URL ul= new URL("https://www.rajagiri.edu");
            System.out.println("Protocol :"+ul.getProtocol());
            System.out.println("File Name :"+ul.getFile());
            System.out.println("Hostname :"+ul.getHost());
            System.out.println("Path :"+ul.getPath());
            System.out.println("Port Number :"+ul.getPort());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
