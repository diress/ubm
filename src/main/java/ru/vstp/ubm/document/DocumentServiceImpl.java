package ru.vstp.ubm.document;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.vstp.ubm.model.Document;
import ru.vstp.ubm.model.DocumentForm;
import ru.vstp.ubm.model.DocumentItem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documents;

    public DocumentServiceImpl(DocumentRepository documents) {
        this.documents = documents;
    }

    @Override
    public void add(Document document) {
        documents.save(document);
    }

    @Override
    public Document add(DocumentForm form, LocalDateTime time) {
        Document document = new Document(form.getDocId(), time, form.getDocNote());
        DocumentItem item = new DocumentItem(3,10,"engine");
        document.getItems().add(item);
        return documents.save(document);
    }

    @Override
    public Document update(DocumentForm form, LocalDateTime time) {
        Document document = new Document(form.getDocId(), time, form.getDocNote());
        return documents.save(document);
    }

    @Override
    public void delete(int id) {
        documents.deleteById(id);
    }

    @Override
    public List<Document> list() {
        return documents.findAll(new Sort(Sort.Direction.ASC, "id"));
    }
}
