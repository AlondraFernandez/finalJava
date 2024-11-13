package Alo.coderhouse.jpa.repositories;

import Alo.coderhouse.jpa.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, String> {
}