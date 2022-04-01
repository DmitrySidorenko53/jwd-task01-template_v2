package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.FileAnalyse;
import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {
    private FileAnalyse fileAnalysis = new FileAnalyse();

    @Override
    public List<String> find(Criteria criteria) throws IOException {
        List<String> matches = new ArrayList<>();
        String result;
        for (Map.Entry<String, Object> critters : criteria.getCriteria().entrySet()) {
            for (String line : fileAnalysis.getLinesFromFile()) {
                for (Map.Entry<String, Object> props : fileAnalysis.findProperties(fileAnalysis.getProperties(line)).entrySet()) {
                    if (critters.getValue().equals(props.getValue()) && criteria.getGroupSearchName().equals(fileAnalysis.getClassName(line))) {
                        result = line;
                        matches.add(result);
                    }
                }
            }
        }
        return matches;
    }
}


