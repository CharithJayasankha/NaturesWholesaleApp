package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Customer {
    private String id;
    private String title;
    private String name;
    private String address;
    private String contactNumber;
    private String dob;
}
