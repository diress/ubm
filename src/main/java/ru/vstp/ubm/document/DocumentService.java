package ru.vstp.ubm.document;

import ru.vstp.ubm.model.Document;
import ru.vstp.ubm.model.DocumentForm;

import java.time.LocalDateTime;
import java.util.List;

public interface DocumentService {

    void add(Document document);

    Document add(DocumentForm form, LocalDateTime time);

    Document update(DocumentForm form, LocalDateTime time);

    void delete(int id);

    List<Document> list();
}
