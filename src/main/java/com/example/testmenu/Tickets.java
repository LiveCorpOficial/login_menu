package com.example.testmenu;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Tickets {

    private final StringProperty ticket_no = new SimpleStringProperty(this, "ticket_no");
    private final StringProperty book_ref = new SimpleStringProperty(this, "book_ref");
    private final StringProperty passenger_id = new SimpleStringProperty(this, "passenger_id");
    private final StringProperty passenger_name = new SimpleStringProperty(this, "passenger_name");
    private final StringProperty contact_data = new SimpleStringProperty(this, "contact_data");

    //get and set date db
    public String getTicket_no(){
        return ticket_no.get();
    }
    public String getBook_ref(){
        return book_ref.get();
    }
    public String getPassenger_id(){
        return passenger_id.get();
    }
    public String getPassenger_name(){
        return passenger_name.get();
    }
    public String getContact_data(){
        return contact_data.get();
    }

    public void setTicket_no(String t_num){
        this.ticket_no.set(t_num);
    }
    public void setBook_ref(String book_ref){
        this.book_ref.set(book_ref);
    }
    public void setPassenger_id(String pas_id){
        this.passenger_id.set(pas_id);
    }
    public void setPassenger_name(String pas_name){
        this.passenger_name.set(pas_name);
    }
    public void setContact_data(String cont_data){
        this.contact_data.set(cont_data);
    }

    public Tickets(){};

    public Tickets(String ticket_no, String book_ref,String passenger_id, String passenger_name,String contact_data) {
        setTicket_no(ticket_no);
        setBook_ref(book_ref);
        setPassenger_id(passenger_id);
        setPassenger_name(passenger_name);
        setContact_data(contact_data);
    }
}
