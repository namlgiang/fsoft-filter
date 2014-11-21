package com.directv.filter.repository;

import java.util.List;

import com.directv.filter.domain.InputType;

public interface InputTypeDAO {
    List<InputType> findAllInputTypes();
}
