package com.lzx.dao;

import com.lzx.entity.Department;
import com.lzx.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {
    //模拟数据库中的数据
    //模拟数据库中的数量
    private static Map<Integer,Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;
    static {
        employees = new HashMap<>();
        employees.put(101,new Employee(101,"AA","123@qq.com",1,new Department(101,"后勤部"),new Date()));
        employees.put(102,new Employee(102,"BB","123@qq.com",1,new Department(102,"后勤部"),new Date()));
        employees.put(103,new Employee(103,"CC","123@qq.com",1,new Department(103,"后勤部"),new Date()));
    }
    //主键自增
    private static Integer initId = 1006;
    //增加一个员工
    public void save(Employee employee){
        if (employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }

    //查询全部员工信息
    public Collection<Employee> getAll(){
        return employees.values();
    }
    //通过id查询员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }
    //删除员工
    public void delete(Integer id){
        employees.remove(id);
    }



}
