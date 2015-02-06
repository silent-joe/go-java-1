/**
 * 
 */
package ua.com.goit.gojava.alex_kholmov;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author SASH
 *
 */
public class FotoStudio implements ShowInfo{
    private Contacts contacts;
    private String additionalInfo;
    ArrayList<Reserve> reservs = new ArrayList<Reserve>();

    public FotoStudio(Contacts contacts, String additionalInfo) {
        // TODO Auto-generated constructor stub
        this.contacts = contacts;
        this.additionalInfo = additionalInfo;
    }
    
    void addReserv(Reserve reserv) {
        reservs.add(reserv);
    }
    
    void removeReserv(Reserve reserv) {
        reservs.remove(reserv);
    }

    Contacts getContacts() {
        return contacts;
    }

    void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    String getAdditionalInfo() {
        return additionalInfo;
    }

    void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    public void displayInfo() {
        contacts.displayInfo();
        System.out.println(additionalInfo);
        for (Reserve reserve : reservs) {
            reserve.displayInfo();
        }
    }
}