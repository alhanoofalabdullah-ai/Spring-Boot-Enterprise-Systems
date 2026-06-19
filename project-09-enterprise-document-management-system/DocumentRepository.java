package com.alhanoof.edms.repository;

import com.alhanoof.edms.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository
        extends JpaRepository<Document, Long> {
}
