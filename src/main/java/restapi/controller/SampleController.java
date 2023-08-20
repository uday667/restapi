package restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;
import restapi.model.Cloth;
import restapi.repository.ClothRepo;

import java.util.List;
import java.util.Optional;

@RestController
public class SampleController {

    @Autowired
    private ClothRepo repo;

    @GetMapping("/get")
    public List<Cloth> getAll() {
        return (List<Cloth>) repo.findAll();
    }
    @GetMapping(value = "{bookid}")
    public Optional<Cloth> getID(@PathVariable(value = "bookid") int clothNumber) {
        return Optional.of(repo.findById(clothNumber).get());
    }
    @PostMapping("/save")
    public Cloth createRecord(@RequestBody Cloth cloth) {
        return repo.save(cloth);
    }
    @GetMapping(value = "{bookId}")
    public Cloth updaterecord(@PathVariable(value = "bookId") int good)  {
        return Optional.of(repo.findById(good).get());
        // if(cloth == null || cloth.getClothNumber() = null) {
        //     throw new ChangeSetPersister.NotFoundException();
        // }
    }
}
