package by.tc.task01.service.creator;

import by.tc.task01.dao.DAOFactory;
import by.tc.task01.dao.FileAnalyse;
import by.tc.task01.entity.bean.Appliance;

import java.util.List;

public interface ApplianceCreator {
    FileAnalyse fileAnalyse = DAOFactory.getInstance().getFileAnalysis();

    List<Appliance> create(List<String> matches);
}
