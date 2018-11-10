package ru.vstp.ubm.model;

import javax.persistence.*;

@Entity
public class DocumentItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="DOC_ID")
    private Document document;

    @Column
    private int quantity;

    @Column
    private int price;

    @Column( name="DESCR", length = 100)
    private String description;


    public DocumentItem() {
    }

    public DocumentItem(int quantity, int price, String description) {
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
