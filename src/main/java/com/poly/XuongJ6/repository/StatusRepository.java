package com.poly.XuongJ6.repository;

import com.poly.XuongJ6.entity.Status;
import com.poly.XuongJ6.model.response.StatusResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends CrudRepository<Status, Long> {
    @Query(value = """
            select status_id as 'statusId',status_name as 'statusName' from status
            """, nativeQuery = true)
    List<StatusResponse> getAll();
}
