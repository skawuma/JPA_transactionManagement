package com.skawuma.service;

import com.skawuma.dto.PatientAppointmentRequest;
import com.skawuma.entity.Appointment;
import com.skawuma.entity.Patient;
import com.skawuma.repository.AppointmentRepository;
import com.skawuma.repository.PatientRepository;
import com.skawuma.util.PromocodeValidator;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

/**
 * @author samuelkawuma
 * @package com.skawuma.service
 * @project practoapp
 * @date 6/6/24
 */
@Service
public class PractoService {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Transactional
    public String bookAppointment(PatientAppointmentRequest request) {
        //SAVE Patient
        Patient patient = request.getPatient();
        long patientId = patientRepository.save(patient).getPatientId();
        //SAVE Appointment
        Appointment appointment = request.getAppointment();

        //rateHospitality(ratingInfo)

        //validate user promocode
        if (appointment.getPromoCode() != null) {
            PromocodeValidator.validatePromoCode(appointment.getPromoCode());
        }
        appointment.setPatientId(patientId);

        String appointmentNo = appointmentRepository.save(appointment).getAppointmentId();
        return "Hi " + patient.getName() +
                " Your appointment booked successfully & appointment number is "
                + appointmentNo;
    }

    //    public void addDoctorRating() {
//        //save to db
//    }
//


}
