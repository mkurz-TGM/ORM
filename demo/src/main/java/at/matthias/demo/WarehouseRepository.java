package at.matthias.demo;

import at.matthias.demo.warehouse.WarehouseData;
import org.springframework.data.repository.CrudRepository;

public interface WarehouseRepository extends CrudRepository<WarehouseData, Integer> {

}