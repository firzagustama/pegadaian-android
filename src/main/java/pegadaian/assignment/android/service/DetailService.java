package pegadaian.assignment.android.service;

import pegadaian.assignment.android.model.Detail;

import java.util.List;

public interface DetailService {
    Detail store(Detail detail);

    List<Detail> getAll();
}
