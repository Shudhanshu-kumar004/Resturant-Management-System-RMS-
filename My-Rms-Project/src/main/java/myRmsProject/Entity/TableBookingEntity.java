package myRmsProject.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "table_booking_entity")
public class TableBookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "table_size", nullable = false)
    private int table_size;

    @Column(name = "special_request")
    private String specialRequest;

}
