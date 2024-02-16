package edu.pro;
/*
  @author   george
  @project   tdd-lab3
  @class  CompanyServiceImpl
  @version  1.0.0 
  @since 16.02.24 - 21.05
*/

import java.util.List;

public class CompanyServiceImpl implements ICompanyService {
    @Override
    public Company getTopLevelParent(Company child) {
        if (child == null) {
            return null;
        }
        if (child.getParent() == null) {
            return child;
        }

        return null;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        return 0;
    }
}
