/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ExaminerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kranthikumar
 */
public class ExaminerOrganization extends Organization {

    public ExaminerOrganization() {
        super(Organization.Type.Examiner.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ExaminerRole());
        return roles;
    }
}