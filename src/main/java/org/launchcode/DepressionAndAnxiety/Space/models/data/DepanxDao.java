package org.launchcode.DepressionAndAnxiety.Space.models.data;

import org.launchcode.DepressionAndAnxiety.Space.models.Depanx;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DepanxDao extends CrudRepository<Depanx, Integer> {
}
