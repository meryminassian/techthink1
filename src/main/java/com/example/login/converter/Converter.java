package com.example.login.converter;

import com.example.login.controller.model.AddressResponse;
import com.example.login.controller.model.UserResponse;
import com.example.login.persistence.Address;
import com.example.login.persistence.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Converter {
    public UserResponse fromUserToResponse(User user){
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setFirst_name(user.getFirst_name());
        userResponse.setLast_name(user.getLast_name());
        userResponse.setUsername(user.getUsername());
        userResponse.setEmail(user.getEmail());
        return userResponse;
    }

    public AddressResponse fromAddressToResponse(Address address){
        AddressResponse addressResponse = new AddressResponse();
        addressResponse.setId(address.getId());
        addressResponse.setCountry(address.getCountry());
        addressResponse.setCity(address.getCity());
        addressResponse.setStreet(address.getStreet());
        return addressResponse;
    }

    public List<AddressResponse> fromAddressToResponseList(List<Address> addresses){
        return addresses.stream().map(each -> fromAddressToResponse(each))
                .collect(Collectors.toList());
    }
}
