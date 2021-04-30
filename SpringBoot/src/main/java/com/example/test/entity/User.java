package com.example.test.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author libo
 * @since 2021-04-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID=1L;

      private String id;

    private String name;

    private Integer age;

    private String email;

    private String userName;

    private String passWord;


}
