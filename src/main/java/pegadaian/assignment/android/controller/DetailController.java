package pegadaian.assignment.android.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pegadaian.assignment.android.model.Detail;
import pegadaian.assignment.android.service.DetailService;

import java.util.List;

@RestController
@RequestMapping(path = "detail")
public class DetailController {
    private DetailService detailService;

    @Autowired
    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }

    @CrossOrigin("*")
    @PostMapping
    public Detail store(@RequestBody Detail detail) {
        return detailService.store(detail);
    }

    @CrossOrigin("*")
    @GetMapping
    public List<Detail> getAll() {
        return detailService.getAll();
    }
}
