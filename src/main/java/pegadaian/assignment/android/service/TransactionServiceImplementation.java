package pegadaian.assignment.android.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pegadaian.assignment.android.dao.TransactionDao;

@Service
public class TransactionServiceImplementation implements TransactionService {
    private TransactionDao transactionDao;

    @Autowired
    public TransactionServiceImplementation(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }
}
