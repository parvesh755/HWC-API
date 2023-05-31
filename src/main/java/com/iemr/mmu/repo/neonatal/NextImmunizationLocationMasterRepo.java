package com.iemr.mmu.repo.neonatal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.iemr.mmu.data.neonatal.BirthDoseVaccinesMasterData;
import com.iemr.mmu.data.neonatal.NextImmunizationLocationMasterData;

@Repository
@RestResource(exported = false)
public interface NextImmunizationLocationMasterRepo extends CrudRepository<NextImmunizationLocationMasterData, Integer> {
	
	List<NextImmunizationLocationMasterData> findByDeletedOrderByName(Boolean deleted);

}