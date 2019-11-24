package pegadaian.assignment.android.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pegadaian.assignment.android.service.DetailService;

@RestController
@RequestMapping(path = "detail")
public class DetailController {
    private DetailService detailService;

    @Autowired
    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }
}
