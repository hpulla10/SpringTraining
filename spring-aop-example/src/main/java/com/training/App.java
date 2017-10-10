package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.aop.EmployeeDTO;
import com.training.spring.aop.EmployeeDao;
import com.training.spring.aop.EmployeeManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeManager manager = (EmployeeManager) context.getBean("employeeManager");
        manager.getEmployeeById(10);
        EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
        dao.insert(new EmployeeDTO());
    }
}
