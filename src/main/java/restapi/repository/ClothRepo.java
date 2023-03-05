package restapi.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import restapi.model.Cloth;

import java.util.List;

@Repository
public interface ClothRepo extends CrudRepository<Cloth,Integer>, JpaSpecificationExecutor<Cloth> {

    @Query("select e from Cloth e order by clothColor")
    List<Cloth> findAllCloth();
}
