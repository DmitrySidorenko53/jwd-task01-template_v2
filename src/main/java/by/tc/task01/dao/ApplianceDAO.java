package by.tc.task01.dao;

import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {
    List<String> find(Criteria criteria) throws IOException;
}
