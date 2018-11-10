package ru.vstp.ubm.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Document {

    @Id
    @Column(name="DOC_ID")
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int id;

    @Basic
    @Column (name = "NAME")
    private String note;

    @Column (name = "CREATED")
    private LocalDateTime created;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,  mappedBy = "document")
//    @OrderBy("base_order ASC")
    private List<DocumentItem> items = new ArrayList<>();

    public Document() {
    }

    public Document(int id, LocalDateTime time, String note) {
        this.id = id;
        this.note = note;
        this.created = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public List<DocumentItem> getItems() {
        return items;
    }

    public void setItems(List<DocumentItem> items) {
        this.items = items;
    }
}
