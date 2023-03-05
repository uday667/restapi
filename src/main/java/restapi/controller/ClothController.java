package restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restapi.model.Cloth;
import restapi.repository.ClothRepo;
import restapi.service.ClothService;

import java.util.List;

@RestController
public class ClothController {
    @Autowired
    ClothService service;
    @Autowired
    private ClothRepo clothRepo;

    @PostMapping("/post")
    public List<Cloth> givingData(@RequestBody List<Cloth> value) {
        return service.saveData(value);
    }
    @GetMapping("/get")
    public List<Cloth> gettingData(){
        return clothRepo.findAllCloth();
    }
    @PutMapping("/update")
    public Cloth update(@RequestBody Cloth cloth) {
        return service.getUpdate(cloth);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        service.getDelete(id);
    }

}
