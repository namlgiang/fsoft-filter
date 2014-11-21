package com.directv.filter.repository;

import java.util.List;

import com.directv.filter.domain.OperationType;

public interface OperationTypeDAO {
    List<OperationType> findAllOperations();
}
