package restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restapi.model.Cloth;
import restapi.repository.ClothRepo;

import java.util.List;

@Service
public class ClothService {
    @Autowired
    ClothRepo repo;

    public List<Cloth> saveData(List<Cloth> cloth) {
        return (List<Cloth>) repo.saveAll(cloth);

    }
    public List<Cloth> getData() {
        return (List<Cloth>) repo.findAll();
    }
    public Cloth getUpdate(Cloth cloth) {
/*        Cloth value = repo.findById(id).orElse(null);
        System.out.println("uday");
        value.setClothColor(value.getClothColor());
        System.out.println("uday after");
        value.setClothName(value.getClothName());
        return repo.save(value);*/
        return repo.save(cloth);
    }
    public void getDelete(int id) {
         repo.deleteById(id);
    }
}
