package pegadaian.assignment.android.service;

import pegadaian.assignment.android.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction store(Transaction transaction);

    List<Transaction> getAll();
}
