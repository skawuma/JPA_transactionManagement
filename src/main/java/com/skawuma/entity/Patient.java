package com.skawuma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author samuelkawuma
 * @package com.skawuma.entity
 * @project practoapp
 * @date 6/6/24
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue
    private long patientId;
    private String name;
    private String email;
    private String gender;
    private String age;
    private String address;

}
