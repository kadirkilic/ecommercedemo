package itp.bootcamp.ecommercedemo.controller;

import itp.bootcamp.ecommercedemo.model.DTO.StockItemDTO;
import itp.bootcamp.ecommercedemo.service.StockItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("stock")
public class StockItemController {
    private final StockItemService stockItemService;

    @PostMapping
    public ResponseEntity createStock(@RequestBody StockItemDTO stockItemDTO) {
        stockItemService.createStockItem(stockItemDTO);
        return ResponseEntity.ok(stockItemDTO);
    }
    @DeleteMapping("{stockId}")
    public ResponseEntity deleteStockItemByID(@PathVariable Integer stockId) {
        stockItemService.deleteStockItemById(stockId);
        return ResponseEntity.ok(stockId);
    }

}
