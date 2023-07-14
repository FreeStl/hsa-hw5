package com.example.hsa5hw;

import com.example.hsa5hw.model.MongoPerson;
import com.example.hsa5hw.repos.PersonMongoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/api")
public class Controller {
    private final PersonMongoRepository mongoRepo;

    public Controller(PersonMongoRepository mongoRepo) {
        this.mongoRepo = mongoRepo;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean insert(@RequestParam String name) {
        String newName = name + Instant.now().getNano() + ThreadLocalRandom.current().nextInt();
        var result = mongoRepo.save(new MongoPerson(newName));
        System.out.println(result);
        return true;
    }
}
