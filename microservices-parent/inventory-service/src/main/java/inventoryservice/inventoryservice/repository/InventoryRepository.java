package inventoryservice.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import inventoryservice.inventoryservice.model.*;

import java.util.*;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findBySkuCode();
}
