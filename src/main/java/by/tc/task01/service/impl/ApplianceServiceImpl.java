package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.bean.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.creator.*;
import by.tc.task01.service.validation.Validator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    private final DAOFactory factory = DAOFactory.getInstance();

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {
        if (!Validator.criteriaValidator(criteria)) {
            return new ArrayList<>();
        }

        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        switch (criteria.getGroupSearchName()) {
            case "Oven" -> {
                return new OvenCreator().create(applianceDAO.find(criteria));
            }
            case "Laptop" -> {
                return new LaptopCreator().create(applianceDAO.find(criteria));
            }
            case "TabletPC" -> {
                return new TabletPCCreator().create(applianceDAO.find(criteria));
            }
            case "Refrigerator" -> {
                return new RefrigeratorCreator().create(applianceDAO.find(criteria));
            }
            case "Speakers" -> {
                return new SpeakersCreator().create(applianceDAO.find(criteria));
            }
            case "VacuumCleaner" -> {
                return new VacuumCleanerCreator().create(applianceDAO.find(criteria));
            }
        }
        return new ArrayList<>();
    }

}
