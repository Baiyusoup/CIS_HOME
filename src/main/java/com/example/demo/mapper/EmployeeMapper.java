package com.example.demo.mapper;

import com.example.demo.dtos.EmpDTO;
import com.example.demo.entity.Employee;
import com.example.demo.vos.emp.EmpQueryVO;

import java.util.List;

public interface EmployeeMapper {


    /**
     * 添加员工（完整员工信息）
     * @param record 完整的员工信息数据
     * @return 1 表示添加成功； 0 表示添加失败
     */
    int insert(Employee record);


    /**
     * 根据员工编号查寻某位员工信息
     * @param employeeId 员工编号
     * @return 某位员工信息
     */
    Employee selectByPrimaryKey(Integer employeeId);
    /**
     * 分页查询员工信息
     * @param query 查询条件
     * @return 指定页的员工信息数据
     */
    List<EmpDTO> listOfEmp(EmpQueryVO query);

    /**
     * 查询员工总数
     * @param queryVO
     * @return
     */
    int selectEmpAmount(EmpQueryVO queryVO);

    /**
     * 更新员工信息（选择性更新）
     * @param record 要更新的员工信息数据
     * @return 1 表示更新成功； 0 表示更新失败
     */
    int updateByPrimaryKeySelective(Employee record);

}