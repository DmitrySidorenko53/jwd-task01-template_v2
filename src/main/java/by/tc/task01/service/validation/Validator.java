package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {
        int counter = 0;
        for (Class<?> enumClass : SearchCriteria.class.getClasses()) {
            if (enumClass.getSimpleName().equals(criteria.getGroupSearchName())) {
                for (String s : criteria.getCriteria().keySet()) {
                    for (Object enumConstant : enumClass.getEnumConstants()) {
                        if (s.equals(enumConstant.toString()) && (++counter == criteria.getCriteria().size())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

