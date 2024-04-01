package inventoryservice.inventoryservice.service;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import inventoryservice.inventoryservice.repository.*;

@Service
@RequiredArgsConstructor
public class InventoryService {
    
    private final InventoryRepository inventoryRepository;

    @Transactional()
    public boolean isInStock(String skuCode) {
        return inventoryRepository.findBySkuCode().isPresent();
    }
}
