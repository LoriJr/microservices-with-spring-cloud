package com.viratech.dto;

public record PersonRequest(
        String firstName,
        String lastName,
        String address,
        String gender
) {
}
