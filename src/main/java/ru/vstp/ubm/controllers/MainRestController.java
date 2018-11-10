package ru.vstp.ubm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.vstp.ubm.document.DocumentService;
import ru.vstp.ubm.model.Document;
import ru.vstp.ubm.model.DocumentForm;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class MainRestController {

    private final DocumentService documentService;

    public MainRestController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @RequestMapping(value = "/documents", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Document> getDocuments() {
        return documentService.list();
    }

    @RequestMapping(value = "/documents", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Document putDocument(@RequestBody DocumentForm form) {
        return documentService.update(form, LocalDateTime.now());
    }

    @RequestMapping(value = "/documents", //
            method = RequestMethod.POST, //
            produces = { MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Document addDocument(@RequestBody DocumentForm form) {
        return documentService.add(form, LocalDateTime.now());
    }

    // http://localhost:8080/SomeContextPath/employee/{empId}
    @RequestMapping(value = "/documents/{docId}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteEmployee(@PathVariable("docId") Integer docId) {

        System.out.println("(Service Side) Deleting employee with Id: " + docId);

        documentService.delete(docId);
    }
}

