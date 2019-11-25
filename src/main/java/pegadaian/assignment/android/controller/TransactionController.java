package pegadaian.assignment.android.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pegadaian.assignment.android.model.Transaction;
import pegadaian.assignment.android.service.TransactionService;

import java.util.List;

@RestController
@RequestMapping(path = "transaction")
public class TransactionController {
    private TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @CrossOrigin("*")
    @PostMapping
    public Transaction store(@RequestBody Transaction transaction) {
        return transactionService.store(transaction);
    }

    @CrossOrigin("*")
    @GetMapping
    public List<Transaction> getAll() {
        return transactionService.getAll();
    }
}
