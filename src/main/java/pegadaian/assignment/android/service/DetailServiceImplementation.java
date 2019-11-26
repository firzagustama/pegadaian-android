package pegadaian.assignment.android.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pegadaian.assignment.android.dao.DetailDao;
import pegadaian.assignment.android.model.Detail;

import java.util.List;

@Service
public class DetailServiceImplementation implements DetailService {
    private DetailDao detailDao;

    @Autowired
    public DetailServiceImplementation(DetailDao detailDao) {
        this.detailDao = detailDao;
    }

    public Detail store(Detail detail) {
        return detailDao.save(detail);
    }

    @Override
    public List<Detail> storeBatch(List<Detail> details) {
        return detailDao.saveAll(details);
    }

    @Override
    public List<Detail> getAll() {
        return detailDao.findAll();
    }
}
