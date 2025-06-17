package com.glorianyaga.Store.Service;

import com.glorianyaga.Store.Modules.Office;
import org.springframework.stereotype.Service;

@Service
public interface OfficeServiceI {
    Office createOffice(Office office);
    Office getOffice(Long officeCode);
    Office updateOffice(Long officeCode, Office office);
    void deleteOffice(Long officeCode);
}
