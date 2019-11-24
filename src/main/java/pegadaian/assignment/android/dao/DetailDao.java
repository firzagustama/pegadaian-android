package pegadaian.assignment.android.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pegadaian.assignment.android.model.Detail;
import pegadaian.assignment.android.model.DetailId;

public interface DetailDao extends JpaRepository<Detail, DetailId> {
}
