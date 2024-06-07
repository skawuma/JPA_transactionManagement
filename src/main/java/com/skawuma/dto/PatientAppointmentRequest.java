package com.skawuma.dto;

import com.skawuma.entity.Appointment;
import com.skawuma.entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author samuelkawuma
 * @package com.skawuma.dto
 * @project practoapp
 * @date 6/6/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientAppointmentRequest {
    private Patient patient;

    private Appointment appointment;
}
