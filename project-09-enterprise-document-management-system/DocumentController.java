package com.alhanoof.edms.controller;

import com.alhanoof.edms.entity.Document;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @PostMapping("/upload")
    public String uploadDocument(
            @RequestParam MultipartFile file
    ) {
        return "Document Uploaded Successfully";
    }

    @GetMapping("/{id}")
    public String getDocument(
            @PathVariable Long id
    ) {
        return "Document Details";
    }

    @DeleteMapping("/{id}")
    public String deleteDocument(
            @PathVariable Long id
    ) {
        return "Document Deleted Successfully";
    }
}
