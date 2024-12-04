package com.motlrolo.myfirstproject.infrastructure.http;

import com.motlrolo.myfirstproject.domain.interfaces.IInvoiceService;
import com.motlrolo.myfirstproject.domain.models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceRestController {

    @Autowired
    private IInvoiceService invoiceService;

    @PostMapping("/save")
    public Mono<Invoice> saveOneInvoice(@RequestBody Invoice invoice) {
        return invoiceService.saveInvoice(invoice);
    }

    @GetMapping
    public Flux<Invoice> getAllInvoices() {
        return invoiceService.findAllInvoices();
    }

    @GetMapping("/get/{id}")
    public Mono<Invoice> findInvoiceById(@PathVariable Integer id) {
        return invoiceService.findInvoiceById(id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<String> deleteInvoice(@PathVariable Integer id) {
        return invoiceService.deleteInvoice(id)
                .then(Mono.just("Invoice with id: " +id+ " deleted !"));
    }

}
