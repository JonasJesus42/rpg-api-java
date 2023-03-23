package com.rpg.service;

import com.rpg.model.EquipmentsModel;
import org.springframework.stereotype.Service;
import com.rpg.repository.EquipmentsRepository;

@Service
public class EquipmentService {
    final EquipmentsRepository equipmentRepository;

    public EquipmentService(EquipmentsRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public Object save(EquipmentsModel equipmentsModel) {
        return equipmentRepository.save(equipmentsModel);
    }
}
