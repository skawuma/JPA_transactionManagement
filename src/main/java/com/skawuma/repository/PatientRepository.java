package com.skawuma.repository;

import com.skawuma.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author samuelkawuma
 * @package com.skawuma.repository
 * @project practoapp
 * @date 6/6/24
 */
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
