package com.glorianyaga.Store.Controllers;

import com.glorianyaga.Store.Modules.Office;
import com.glorianyaga.Store.Service.OfficeServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/office")
@RequiredArgsConstructor
public class OfficeController {

    public final OfficeServiceI officeServiceI;

    @PostMapping("/createOffice")
    public ResponseEntity<String> createOffice(@RequestBody Office office) {
        officeServiceI.createOffice(office);
        return ResponseEntity.ok(("Office created successfully"));
    }

    @GetMapping("/viewOffice/{officeCode}")
    public ResponseEntity<?> viewOffice(@PathVariable Long officeCode) {
        try {
            Office office = officeServiceI.getOffice(officeCode);
            return ResponseEntity.ok(office);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    @PutMapping("/updateOffice/{officeCode}")
    public ResponseEntity<?> updateOffice(@PathVariable Long officeCode, @RequestBody Office office) {
        try {
            Office updatedOffice = officeServiceI.updateOffice(officeCode, office);
            return ResponseEntity.ok(updatedOffice);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
    @DeleteMapping("/deleteOffice/{officeCode}")
    public ResponseEntity<Void> deleteOffice(@PathVariable Long officeCode) {
        try {
            officeServiceI.deleteOffice(officeCode);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}