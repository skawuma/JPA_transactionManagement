package com.skawuma.repository;

import com.skawuma.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author samuelkawuma
 * @package com.skawuma.repository
 * @project practoapp
 * @date 6/6/24
 */
public interface AppointmentRepository extends JpaRepository<Appointment,String> {

}
