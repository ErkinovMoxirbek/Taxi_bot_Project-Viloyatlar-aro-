package com.example.entity;

import com.example.enums.ProfileRole;
import com.example.enums.ProfileStatus;
import com.example.enums.ProfileStep;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.relational.core.sql.In;

import java.util.UUID;

@Entity
@Table(name = "profile")
@Getter
@Setter
@ToString
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false ,name = "user_id")
    private Long userId;
    @Column( name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Enumerated(EnumType.STRING)
    @Column( name = "role")
    private ProfileRole role;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ProfileStatus status;
    @Enumerated(EnumType.STRING)
    @Column(name = "step")
    private ProfileStep step;
    @Column(name = "phone")
    private String phoneNumber;
    @Column(name = "car_num")
    private String carNum;
    @Column(name = "last_message_id")
    private Integer lastMessageId = 0;
    @Column(name = "visible")
    private Boolean visible = Boolean.FALSE;
}