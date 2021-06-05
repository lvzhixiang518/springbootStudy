package com.lzx.dao;

import com.lzx.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class DepartmentDao {

    //模拟数据库中的数量
    private static Map<Integer,Department> departments = null;
    static {
        departments = new HashMap<>();
        departments.put(101,new Department(101,"教学部"));
        departments.put(102,new Department(101,"市场部"));
        departments.put(103,new Department(101,"教研部"));
        departments.put(104,new Department(101,"运营部"));
        departments.put(105,new Department(101,"后勤部"));
    }

    public Collection<Department> getDepartments(){
        return departments.values();
    }
    //通过id得到部门
    public Department getDepartmentById(Integer id){
        return departments.get(id);
    }

}
