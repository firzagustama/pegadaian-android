package pegadaian.assignment.android.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pegadaian.assignment.android.dao.TransactionDao;
import pegadaian.assignment.android.model.Transaction;

import java.util.List;

@Service
public class TransactionServiceImplementation implements TransactionService {
    private TransactionDao transactionDao;

    @Autowired
    public TransactionServiceImplementation(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    @Override
    public Transaction store(Transaction transaction) {
        return transactionDao.save(transaction);
    }

    @Override
    public List<Transaction> getAll() {
        return transactionDao.findAll();
    }
}
