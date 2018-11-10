package ru.vstp.ubm.document;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vstp.ubm.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {

}
