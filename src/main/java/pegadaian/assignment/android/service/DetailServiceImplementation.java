package pegadaian.assignment.android.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pegadaian.assignment.android.dao.DetailDao;

@Service
public class DetailServiceImplementation implements DetailService {
    private DetailDao detailDao;

    @Autowired
    public DetailServiceImplementation(DetailDao detailDao) {
        this.detailDao = detailDao;
    }


}
