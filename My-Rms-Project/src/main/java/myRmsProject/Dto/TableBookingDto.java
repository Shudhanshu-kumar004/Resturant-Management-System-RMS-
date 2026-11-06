package myRmsProject.Dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TableBookingDto {
    private Long id;
    private String name;
    private String emailId;
    private String phoneNumber;
    private int table_size;
    private String specialRequest;
}
