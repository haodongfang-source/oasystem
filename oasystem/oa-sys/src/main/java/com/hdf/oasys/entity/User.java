package com.hdf.oasys.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String loginName;
    private String password;
    private String sex;
    private Integer roleId;
}
