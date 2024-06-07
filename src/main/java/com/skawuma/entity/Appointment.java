package com.skawuma.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

/**
 * @author samuelkawuma
 * @package com.skawuma.entity
 * @project practoapp
 * @date 6/6/24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointment {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String appointmentId;
    @JsonFormat(pattern = "dd/MM/yyy")
    private Date appointmentDate;
    private String doctorName;
    private String promoCode;
    private long patientId;

}
